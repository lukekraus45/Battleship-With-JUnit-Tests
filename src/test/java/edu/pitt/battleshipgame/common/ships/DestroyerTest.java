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
public class DestroyerTest {
    
    public DestroyerTest() {
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
     * Test of getLength method, of class Destroyer.
     */
    @Test
    public void testGetLength() {
        Coordinate start = Mockito.mock(Coordinate.class);
        Coordinate end = Mockito.mock(Coordinate.class);
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        
        Destroyer instance = new Destroyer(start,end);
        int expResult = 2;
        int result = instance.getLength();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of maxAllowed method, of class Destroyer.
     */
    @Test
    public void testMaxAllowed() {
        Coordinate start = Mockito.mock(Coordinate.class);
        Coordinate end = Mockito.mock(Coordinate.class);
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        
        Destroyer instance = new Destroyer(start,end);
        int expResult = 1;
        int result = instance.maxAllowed();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Destroyer.
     */
    @Test
    public void testGetName() {
        Coordinate start = Mockito.mock(Coordinate.class);
        Coordinate end = Mockito.mock(Coordinate.class);
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        
        Destroyer instance = new Destroyer(start,end);
        String expResult = "Destroyer";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getType method, of class Destroyer.
     */
    @Test
    public void testGetType() {
        Coordinate start = Mockito.mock(Coordinate.class);
        Coordinate end = Mockito.mock(Coordinate.class);
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        
        Destroyer instance = new Destroyer(start,end);
        Ship.ShipType expResult = Ship.ShipType.DESTROYER;
        Ship.ShipType result = instance.getType();
        assertEquals(expResult, result);
    }

}
