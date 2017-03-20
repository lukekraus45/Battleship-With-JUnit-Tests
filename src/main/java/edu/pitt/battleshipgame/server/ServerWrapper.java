package edu.pitt.battleshipgame.server;

import javax.jws.WebService;
import java.util.ArrayList;

import edu.pitt.battleshipgame.common.board.Board;
import edu.pitt.battleshipgame.common.Serializer;
import edu.pitt.battleshipgame.common.GameTracker;
import edu.pitt.battleshipgame.common.ServerInterface;
import edu.pitt.battleshipgame.common.TooManyPlayersException;

//Service Implementation
@WebService(endpointInterface = "edu.pitt.battleshipgame.common.ServerInterface")
/**
 * This Wrapper exists to translate network requests to API compatible requests
 */
public class ServerWrapper implements ServerInterface {
    // We have a pseudo singleton around the Server object.
    private static GameTracker tracker = null;

    public ServerWrapper() {
        tracker = getInstance();
    }
    
    public static GameTracker getInstance() {
        if(tracker == null) {
            tracker = new GameTracker();
        }
        return tracker;
    }

    /**
     * @see Server.registerPlayer
     * 
     * @return The id of the registered player.
     */
    @Override
    public int registerPlayer() throws TooManyPlayersException {
        return tracker.registerPlayer();
    }

    /**
     * @see Server.waitForPlayers
     * 
     * @param playerID The ID of the player that is waiting.
     */
    @Override
    public void wait(int playerID) {
        tracker.wait(playerID);
    }
    
    /**
     * The Network version of @see Server.getBoards will convert the array list
     * to a byte array.
     * 
     * @return The serialized version of the boards array. 
     */
    @Override
    public byte [] getBoards() {
        return Serializer.toByteArray(new ArrayList<Board>(tracker.getBoards()));
    }
    
    /**
     * The Network version of @see Server.registerBoard. It will convert the
     * byte [] board to a Board object to be passed to the Server.
     * 
     */
    @Override
    public void setBoards(byte [] boards) {
        tracker.setBoards((ArrayList<Board>)Serializer.fromByteArray(boards));
    }
    
    public boolean isGameOver(){
        return tracker.isGameOver();
    }
    
    public void player_leave(){
        tracker.player_leave();
    }
    
    public boolean bothUsersConnected(){
        return tracker.bothUsersConnected();
    }
    
    public void beatHeart(int id)
    {
        tracker.beatHeart(id);
    }
    
    public boolean hasBeatingHeart(int id)
    {
        return tracker.hasBeatingHeart(id);
    }
}