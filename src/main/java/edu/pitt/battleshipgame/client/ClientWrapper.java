package edu.pitt.battleshipgame.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.util.ArrayList;

import edu.pitt.battleshipgame.common.Serializer;
import edu.pitt.battleshipgame.common.board.*;
import edu.pitt.battleshipgame.common.*;

public class ClientWrapper implements GameInterface {
    ServerInterface serverInterface = null;
    int myPlayerID;

    private static ServerInterface getServer(String address) {
        URL url = null;
        try {
            url = new URL("http://" + address + ":9999/battleship?wsdl");
        } catch (MalformedURLException e) {
            System.err.println(e);
        }
        QName qname = new QName("http://server.battleshipgame.pitt.edu/", "ServerWrapperService");
        Service service = Service.create(url, qname);
        return service.getPort(ServerInterface.class);
    }
    
    public ClientWrapper(String address) {
        serverInterface = getServer(address);
    }
    
    @Override
    public int registerPlayer() throws TooManyPlayersException {
        return serverInterface.registerPlayer();
    }
    
    @Override
    public void wait(int playerID) {
        serverInterface.wait(playerID);
    }
    
    @Override
    public void setBoards(ArrayList<Board> boards) {
        serverInterface.setBoards(Serializer.toByteArray(boards));
    }
    
    /**
     * Client side wrapper around the 
     * @return 
     */
    @Override
    public ArrayList<Board> getBoards() {
        return (ArrayList<Board>) Serializer.fromByteArray(serverInterface.getBoards());
    }
    
    public boolean isGameOver() {
        return serverInterface.isGameOver();
    }
    
    public boolean bothUsersConnected() {
        return serverInterface.bothUsersConnected();
    }
    
    public void player_leave() {
        serverInterface.player_leave();
    }
    
    public void beatHeart(int id)
    {
        serverInterface.beatHeart(id);
    }
    
    public boolean hasBeatingHeart(int id)
    {
        return serverInterface.hasBeatingHeart(id);
    }
}