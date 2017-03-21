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
import static org.mockito.Mockito.*;

/**
 *
 * @author Luke
 */
public class ShipFactoryTest {
    Coordinate start = Mockito.mock(Coordinate.class);
    Coordinate end = Mockito.mock(Coordinate.class);
    public ShipFactoryTest() {
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
     * Test of newShipFromType method, of class ShipFactory.
     */
    @Test
    public void testNewShipFromType() {
        when(start.getCol()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        
        Ship.ShipType type = Ship.ShipType.BATTLESHIP;
        Ship expResult = new Battleship(start,end);
        Ship result = ShipFactory.newShipFromType(type, start, end);
        assertEquals(expResult.toString(), result.toString());
        
    }

    /**
     * Test of maxAllowedFromType method, of class ShipFactory.
     */
    @Test
    public void testMaxAllowedFromType() {
        System.out.println("maxAllowedFromType");
        Ship.ShipType type = null;
        int expResult = 0;
        int result = ShipFactory.maxAllowedFromType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNameFromType method, of class ShipFactory.
     */
    @Test
    public void testGetNameFromType() {
        System.out.println("getNameFromType");
        Ship.ShipType type = null;
        String expResult = "";
        String result = ShipFactory.getNameFromType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
