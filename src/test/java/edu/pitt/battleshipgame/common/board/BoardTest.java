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
    @Test
    public void testGetLastMove() {
        
        Board instance = new Board("test");
        Coordinate coord = new Coordinate(5,5);
        instance.makeMove(coord);
        Coordinate result = instance.getLastMove();     
        assertEquals(result, coord );
        
       
    }

    /**
     * Test of getName method, of class Board.
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
     * Test of getMoves method, of class Board.
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
     * Test of addShip method, of class Board.
     */
    @Test
    public void testAddBattleShip() {
        //System.out.println("addShip");
        Ship ship = Mockito.mock(Ship.class);
        Board instance = new Board("test");
        
        when(ship.getType()).thenReturn(Ship.ShipType.BATTLESHIP);
        when(ship.maxAllowed()).thenReturn(1);
        instance.addShip(ship);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertFalse(instance.getShipList().isEmpty());
    }

        @Test
    public void testAddCarrier() {
        //System.out.println("addShip");
        Ship ship = Mockito.mock(Ship.class);
        Board instance = new Board("test");
        
        when(ship.getType()).thenReturn(Ship.ShipType.CARRIER);
        when(ship.maxAllowed()).thenReturn(1);
        instance.addShip(ship);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertFalse(instance.getShipList().isEmpty());
    }
    
        @Test
    public void testAddCruiser() {
        //System.out.println("addShip");
        Ship ship = Mockito.mock(Ship.class);
        Board instance = new Board("test");
        
        when(ship.getType()).thenReturn(Ship.ShipType.CRUISER);
        when(ship.maxAllowed()).thenReturn(1);
        instance.addShip(ship);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertFalse(instance.getShipList().isEmpty());
    }
    
        @Test
    public void testAddDestroyer() {
        //System.out.println("addShip");
        Ship ship = Mockito.mock(Ship.class);
        Board instance = new Board("test");
        
        when(ship.getType()).thenReturn(Ship.ShipType.DESTROYER);
        when(ship.maxAllowed()).thenReturn(1);
        instance.addShip(ship);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertFalse(instance.getShipList().isEmpty());
    }
    
        @Test
    public void testAddSubmarine() {
        //System.out.println("addShip");
        Ship ship = Mockito.mock(Ship.class);
        Board instance = new Board("test");
        
        when(ship.getType()).thenReturn(Ship.ShipType.SUBMARINE);
        when(ship.maxAllowed()).thenReturn(1);
        instance.addShip(ship);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertFalse(instance.getShipList().isEmpty());
    }
    /**
     * Test of makeMove method, of class Board.
     */
    @Test
    public void testMakeMove() {
        //System.out.println("makeMove");
        Coordinate move = Mockito.mock(Coordinate.class);
        Board instance = new Board("test");
        
        when(move.getRow()).thenReturn(1);
        when(move.getCol()).thenReturn(1);
        instance.makeMove(move);
        boolean[][] moves = instance.getMoves();
        assertTrue(moves[1][1]);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of canShipFit method, of class Board.
     */
    @Test
    public void testCanShipFit() {
        //System.out.println("canShipFit");
        Ship ship = Mockito.mock(Ship.class);
        Board instance = new Board("test");
        
        when(ship.getType()).thenReturn(Ship.ShipType.SUBMARINE);
        when(ship.maxAllowed()).thenReturn(1);
        boolean can_fit = instance.canShipFit(ship);
        assertTrue(can_fit);
        
        
        
        
        
    }

    /**
     * Test of getShipList method, of class Board.
     */
    @Test
    public void testGetShipList() {
        
        Board instance = new Board("test");
        //List<Ship> expResult = null;
        Ship ship = Mockito.mock(Ship.class);
        when(ship.getType()).thenReturn(Ship.ShipType.SUBMARINE);
        when(ship.maxAllowed()).thenReturn(1);
        instance.addShip(ship);
        List<Ship> result = instance.getShipList();
        System.out.println("RESULT!!!! " + result.toString());
        assertNotNull(result);
        
    }

    /**
     * Test of areAllShipsSunk method, of class Board.
     */
    @Test
    public void testAreAllShipsSunkFalse() {
        //System.out.println("areAllShipsSunk");
        Board instance = new Board("test");
        Ship ship = Mockito.mock(Ship.class);
        when(ship.getType()).thenReturn(Ship.ShipType.CRUISER);
        when(ship.maxAllowed()).thenReturn(1);
        instance.addShip(ship);
        when(ship.isSunk()).thenReturn(false);
        boolean expResult = false;
        boolean result = instance.areAllShipsSunk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAreAllShipsSunkTrue() {
        //System.out.println("areAllShipsSunk");
        Board instance = new Board("test");
        Ship ship = Mockito.mock(Ship.class);
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
