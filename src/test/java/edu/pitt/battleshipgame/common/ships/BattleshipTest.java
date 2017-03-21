/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.battleshipgame.common.ships;

import edu.pitt.battleshipgame.common.board.Coordinate;
import edu.pitt.battleshipgame.common.ships.Ship.ShipType;
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
public class BattleshipTest {
    
    public BattleshipTest() {
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
     * Test of getLength method, of class Battleship.
     */
    @Test
    public void testGetLength() {
        Coordinate start = Mockito.mock(Coordinate.class);
        Coordinate end = Mockito.mock(Coordinate.class);
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        
        Battleship instance = new Battleship(start,end);
        int expResult = 4;
        int result = instance.getLength();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of maxAllowed method, of class Battleship.
     */
    @Test
    public void testMaxAllowed() {
        Coordinate start = Mockito.mock(Coordinate.class);
        Coordinate end = Mockito.mock(Coordinate.class);
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        
        Battleship instance = new Battleship(start,end);
        int expResult = 1;
        int result = instance.maxAllowed();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Battleship.
     */
    @Test
    public void testGetName() {
        Coordinate start = Mockito.mock(Coordinate.class);
        Coordinate end = Mockito.mock(Coordinate.class);
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        
        Battleship instance = new Battleship(start,end);
        String expResult = "Battleship";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getType method, of class Battleship.
     */
    @Test
    public void testGetType() {
        Coordinate start = Mockito.mock(Coordinate.class);
        Coordinate end = Mockito.mock(Coordinate.class);
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        
        Battleship instance = new Battleship(start,end);
        ShipType expResult = Ship.ShipType.BATTLESHIP;
        ShipType result = instance.getType();
        assertEquals(expResult, result);
    }
    
}
