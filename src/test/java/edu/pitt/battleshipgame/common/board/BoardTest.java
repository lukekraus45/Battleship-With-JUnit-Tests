/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.battleshipgame.common.board;

import edu.pitt.battleshipgame.common.ships.Ship;
import static org.mockito.Mockito.*;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
//tests
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
    public void testAddShip() {
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

    /**
     * Test of makeMove method, of class Board.
     */
    @Test
    public void testMakeMove() {
        System.out.println("makeMove");
        Coordinate move = null;
        Board instance = null;
        Ship expResult = null;
        Ship result = instance.makeMove(move);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canShipFit method, of class Board.
     */
    @Test
    public void testCanShipFit() {
        System.out.println("canShipFit");
        Ship ship = null;
        Board instance = null;
        boolean expResult = false;
        boolean result = instance.canShipFit(ship);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShipList method, of class Board.
     */
    @Test
    public void testGetShipList() {
        System.out.println("getShipList");
        Board instance = null;
        List<Ship> expResult = null;
        List<Ship> result = instance.getShipList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of areAllShipsSunk method, of class Board.
     */
    @Test
    public void testAreAllShipsSunk() {
        System.out.println("areAllShipsSunk");
        Board instance = null;
        boolean expResult = false;
        boolean result = instance.areAllShipsSunk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Board.
     */
    @Test
    public void testToString_0args() {
        System.out.println("toString");
        Board instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Board.
     */
    @Test
    public void testToString_boolean() {
        System.out.println("toString");
        boolean showShips = false;
        Board instance = null;
        String expResult = "";
        String result = instance.toString(showShips);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
