/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.battleshipgame.common.ships;

import edu.pitt.battleshipgame.common.board.Board;
import edu.pitt.battleshipgame.common.board.Coordinate;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

/**
 *
 * @author Luke
 */
public class ShipTest {
    
    
    Coordinate start = Mockito.mock(Coordinate.class);
    Coordinate end = Mockito.mock(Coordinate.class);
    public ShipTest() {
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
     * Test of getCoordinates method, of class Ship.
     */
    @Test
    public void testGetCoordinates() {
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(2);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        Ship instance = new Battleship(start,end);
        String expResult = "[f:3, f:4, f:5, f:6]";
        List<Coordinate> result = instance.getCoordinates();
        assertEquals(expResult, result.toString());
        
    }

    /**
     * Test of getStart method, of class Ship.
     */
    @Test
    public void testGetStart() {
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(start.toString()).thenReturn("[5,5]");
                
        Ship instance = new Battleship(start,end);
        String expResult = "[5,5]";
        
        Coordinate result = instance.getStart();
        assertEquals(expResult, result.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEnd method, of class Ship.
     */
    @Test
    public void testGetEnd() {
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        when(end.toString()).thenReturn("[5,5]");
                
        Ship instance = new Battleship(start,end);
        String expResult = "[5,5]";
        

    
        Coordinate result = instance.getEnd();
        assertEquals(expResult, result.toString());
    }

    /**
     * Test of isSunk method, of class Ship.
     */
    @Test
    public void testIsSunkFalse() {                                                                                        
        when(start.getRow()).thenReturn(5);
        when(start.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        
        Ship instance = new Battleship(start, end);
         
        boolean expResult = false;
        boolean result = instance.isSunk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
  @Test   
  public void testIsSunkTrue() {                                                                                        
        when(start.getRow()).thenReturn(5);
        when(start.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        
        Ship instance = new Battleship(start, end);
        for(int i = 0; i < 4; i++){
           instance.registerHit(); 
        }
        boolean expResult = true;
        boolean result = instance.isSunk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of addBoard method, of class Ship.
     */
    @Test
    public void testAddBoard() {
        Board board = Mockito.mock(Board.class);
        when(start.getRow()).thenReturn(5);
        when(start.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        
        
        Ship instance = new Battleship(start,end);
        instance.addBoard(board);
        assertNotNull(instance.getBoard());
        
        
    }

    /**
     * Test of registerHit method, of class Ship.
     */
    @Test
    public void testRegisterHit() {
        when(start.getRow()).thenReturn(5);
        when(start.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship instance = new Battleship(start,end);
        instance.registerHit();
        
        assertEquals(instance.getHitCount(), 1);
    }

    /**
     * Test of isValid method, of class Ship.
     */
    @Test
    public void testIsValidFalse() {
        when(start.getRow()).thenReturn(5);
        when(start.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship instance = new Battleship(start,end);
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testIsValidTrue() {
        when(start.getRow()).thenReturn(5);
        when(start.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(2);
        Ship instance = new Battleship(start,end);
        boolean expResult = true;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        
    }
    /**
     * Test of getLength method, of class Ship.
     */
    @Test
    public void testGetLength() {
        
        Ship instance = new Battleship(start,end);
        int expResult = 4;
        int result = instance.getLength();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of maxAllowed method, of class Ship.
     */
    @Test
    public void testMaxAllowed() {

        Ship instance = new Battleship(start,end);
        int expResult = 1;
        int result = instance.maxAllowed();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getName method, of class Ship.
     */
    @Test
    public void testGetName() {
        
        Ship instance = new Battleship(start,end);
        String expResult = "Battleship";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getType method, of class Ship.
     */
    @Test
    public void testGetType() {

        Ship instance = new Battleship(start, end);
        Ship.ShipType expResult = Ship.ShipType.BATTLESHIP;
        Ship.ShipType result = instance.getType();
        assertEquals(expResult, result);
        
    }

    public class ShipImpl extends Ship {

        public ShipImpl() {
            super(null, null);
        }

        public int getLength() {
            return 0;
        }

        public int maxAllowed() {
            return 0;
        }

        public String getName() {
            return "";
        }

        public ShipType getType() {
            return null;
        }
    }
    
}
