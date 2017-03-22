/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.battleshipgame.common.ships;

import edu.pitt.battleshipgame.common.board.Coordinate;
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
public class CruiserTest {
    
    Coordinate start = Mockito.mock(Coordinate.class);
    Coordinate end = Mockito.mock(Coordinate.class);
    public CruiserTest() {
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
     * Test of getLength method, of class Cruiser. Checks to make sure that the length of Cruiser is 3
     */
    @Test
    public void testGetLength() {
  
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        Cruiser instance = new Cruiser(start,end);
        int expResult = 3;
        int result = instance.getLength();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of maxAllowed method, of class Cruiser. Checks to make sure that the max number of Cruisers on the board is 1
     */
    @Test
    public void testMaxAllowed() {
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        Cruiser instance = new Cruiser(start,end);
        int expResult = 1;
        int result = instance.maxAllowed();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Cruiser. Checks to make sure that the getName method will return "Cruiser" for this class
     */
    @Test
    public void testGetName() {
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        Cruiser instance = new Cruiser(start,end);
        String expResult = "Cruiser";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getType method, of class Cruiser. Checks to make sure that that the ShipType for the Cruiser class is CRUISER
     */
    @Test
    public void testGetType() {
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        Cruiser instance = new Cruiser(start,end);
        Ship.ShipType expResult = Ship.ShipType.CRUISER;
        Ship.ShipType result = instance.getType();
        assertEquals(expResult, result);
    }

    
}
