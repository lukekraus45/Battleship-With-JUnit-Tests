/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.battleshipgame.common.board;

import edu.pitt.battleshipgame.common.ships.Ship;
import java.util.LinkedList;
import static org.mockito.Mockito.*;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

/**
 *
 * @author Luke
 */
public class BoardTest {
   
    
    Coordinate start = Mockito.mock(Coordinate.class);
    Coordinate end = Mockito.mock(Coordinate.class);
    Ship ship = Mockito.mock(Ship.class);
    public BoardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLastMove method, of class Board.
     */
    
    /*
    Tests get last move for the Board test. This is done by adding a mock of the coordinate and then making that move on the board. 
    Then it is compared to the result of actually making the move. If they are equal then the test passes
    */
    @Test
    public void testGetLastMove() {
        
        Board instance = new Board("test");
        Coordinate coord = start;
        instance.makeMove(coord);
        Coordinate result = instance.getLastMove();     
        assertEquals(result, coord );
        
       
    }

    /**
     * Test of getName method, of class Board. Creates a new board with a name. Then calls the getName method and if they are equal it passes 
     
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Board instance = new Board("TEST");
        String expResult = "TEST";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMoves method, of class Board. Creates a new board and returns a list of all of its moves. Then a 2D array is created. These 2 are 
     * compared with each other making sure that they are equal. If every value is the same then return true
     */
    @Test
    public void testGetMoves() {
        //System.out.println("getMoves");
        Board instance = new Board("test");
        boolean[][] expResult = new boolean[10][10];
        //expResult[1][1] = true;
        //expResult[7][4] = true;
        boolean check_equals = true;
        boolean[][] result = instance.getMoves();
    for (int i = 0; check_equals && i < 10; ++i) {
        for(int j = 0; check_equals && j < 10; ++j){
        check_equals = (!expResult[i][j] && !result[i][j]);
        }
    }
        
        assertTrue(check_equals);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addShip method, of class Board. Creates a new board and then uses a fake to create a Battleship object. This is then added to the board. If the shiplist is false 
     * then it should pass, as there is now a ship in the list
     */
    @Test
    public void testAddBattleShip() {
        //System.out.println("addShip");
        Board instance = new Board("test");
        
        when(ship.getType()).thenReturn(Ship.ShipType.BATTLESHIP);
        when(ship.maxAllowed()).thenReturn(1);
        instance.addShip(ship);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertFalse(instance.getShipList().isEmpty());
    }

    
    /**
     * Test of addShip method, of class Board. Creates a new board and then uses a fake to create a Carrier object. This is then added to the board. If the shiplist is false 
     * then it should pass, as there is now a ship in the list
     */
        @Test
    public void testAddCarrier() {
        //System.out.println("addShip");
        Board instance = new Board("test");
        
        when(ship.getType()).thenReturn(Ship.ShipType.CARRIER);
        when(ship.maxAllowed()).thenReturn(1);
        instance.addShip(ship);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertFalse(instance.getShipList().isEmpty());
    }
    
    /**
     * Test of addShip method, of class Board. Creates a new board and then uses a fake to create a Cruiser object. This is then added to the board. If the shiplist is false 
     * then it should pass, as there is now a ship in the list
     */
    
        @Test
    public void testAddCruiser() {
        //System.out.println("addShip");
        Board instance = new Board("test");
        
        when(ship.getType()).thenReturn(Ship.ShipType.CRUISER);
        when(ship.maxAllowed()).thenReturn(1);
        instance.addShip(ship);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertFalse(instance.getShipList().isEmpty());
    }
    
    /**
     * Test of addShip method, of class Board. Creates a new board and then uses a fake to create a Destroyer object. This is then added to the board. If the shiplist is false 
     * then it should pass, as there is now a ship in the list
     */
        @Test
    public void testAddDestroyer() {
        Board instance = new Board("test");
        when(ship.getType()).thenReturn(Ship.ShipType.DESTROYER);
        when(ship.maxAllowed()).thenReturn(1);
        instance.addShip(ship);
        assertFalse(instance.getShipList().isEmpty());
    }
    
    /**
     * Test of addShip method, of class Board. Creates a new board and then uses a fake to create a Submarine object. This is then added to the board. If the shiplist is false 
     * then it should pass, as there is now a ship in the list
     */
    
        @Test
    public void testAddSubmarine() {

        Board instance = new Board("test");
        when(ship.getType()).thenReturn(Ship.ShipType.SUBMARINE);
        when(ship.maxAllowed()).thenReturn(1);
        instance.addShip(ship);
        assertFalse(instance.getShipList().isEmpty());
    }
    /**
     * Test of makeMove method, of class Board. Creates a mock of coordinate and then fakes its method for getRow and Col. The board then adds the moves .If the location of the 
     * array is true, then the test will pass. 
     */
    @Test
    public void testMakeMove() {
        Coordinate move = Mockito.mock(Coordinate.class);
        Board instance = new Board("test");
        when(move.getRow()).thenReturn(1);
        when(move.getCol()).thenReturn(1);
        instance.makeMove(move);
        boolean[][] moves = instance.getMoves();
        assertTrue(moves[1][1]);
        
    }

    /**
     * Test of canShipFit method, of class Board. Creates a new board and fakes the ship method to create a submarine. It will then run the CanShip method to see if 
     * it can fit. If it returns true the test will pass. 
     */
    @Test
    public void testCanShipFit() {
     
        Board instance = new Board("test");
        when(ship.getType()).thenReturn(Ship.ShipType.SUBMARINE);
        when(ship.maxAllowed()).thenReturn(1);
        boolean can_fit = instance.canShipFit(ship);
        assertTrue(can_fit);
        
    }

    /**
     * Test of getShipList method, of class Board. Creates a new board and then adds a ship. If the ship list is not null then there will be something in the shiplist so it will pass
     */
    @Test
    public void testGetShipList() {
        
        Board instance = new Board("test");
        when(ship.getType()).thenReturn(Ship.ShipType.SUBMARINE);
        when(ship.maxAllowed()).thenReturn(1);
        instance.addShip(ship);
        List<Ship> result = instance.getShipList();
        assertNotNull(result);
        
    }

    /**
     * Test of areAllShipsSunk method, of class Board. This tests the false version of seeing if all ships are sunk. It creates a new board and then adds a cruiser to the board.
     * Then it sees if all ships are sunk (which will be false). If it is false, then it will pass
     */
    @Test
    public void testAreAllShipsSunkFalse() {
        //System.out.println("areAllShipsSunk");
        Board instance = new Board("test");
        
        when(ship.getType()).thenReturn(Ship.ShipType.CRUISER);
        when(ship.maxAllowed()).thenReturn(1);
        instance.addShip(ship);
        when(ship.isSunk()).thenReturn(false);
        boolean expResult = false;
        boolean result = instance.areAllShipsSunk();
        assertEquals(expResult, result);
       
    }
    /**
     * Tests to see if all ships are sunk true. Creates a fake method in the ship method that says it is sunk. If this works then the test will pass because the cruiser that 
     * was added is now sunk (which is our only ship) 
     */
    @Test
    public void testAreAllShipsSunkTrue() {
        //System.out.println("areAllShipsSunk");
        Board instance = new Board("test");
        when(ship.getType()).thenReturn(Ship.ShipType.CRUISER);
        when(ship.maxAllowed()).thenReturn(1);
        instance.addShip(ship);
        when(ship.isSunk()).thenReturn(true);
        boolean expResult = true;
        boolean result = instance.areAllShipsSunk();
        assertEquals(expResult, result);
        
    }

    /*
    
    GUI IS USED SO TO STRING IS NOT NEEDED TO BE TESTED 
    
    */

    
    
}
