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
public class CarrierTest {
    
    Coordinate start = Mockito.mock(Coordinate.class);
    Coordinate end = Mockito.mock(Coordinate.class);
    
    public CarrierTest() {
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
     * Test of getLength method, of class Carrier. Checks to make sure that the length of the carrier is 5. If it is then the test will pass
     */
    @Test
    public void testGetLength() {
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        Carrier instance = new Carrier(start,end);
        int expResult = 5;
        int result = instance.getLength();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of maxAllowed method, of class Carrier. Checks to make sure that the max allowed of carrier is 1
     */
    @Test
    public void testMaxAllowed() {
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        Carrier instance = new Carrier(start,end);
        int expResult = 1;
        int result = instance.maxAllowed();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Carrier. Tests to make sure that the getName method of Carrier will return "Carrier". 
     */
    @Test
    public void testGetName() {
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        Carrier instance = new Carrier(start,end);
        String expResult = "Carrier";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getType method, of class Carrier. Checks that the ShipType will return CARRIER
     */
    @Test
    public void testGetType() {
        when(start.getCol()).thenReturn(5);
        when(start.getRow()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        when(end.getRow()).thenReturn(5);
        Carrier instance = new Carrier(start,end);
        Ship.ShipType expResult = Ship.ShipType.CARRIER;
        Ship.ShipType result = instance.getType();
        assertEquals(expResult, result);
    }

}
