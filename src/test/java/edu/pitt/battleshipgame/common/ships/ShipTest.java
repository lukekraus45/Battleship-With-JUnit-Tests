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

/**
 *
 * @author Luke
 */
public class ShipTest {
    
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
        System.out.println("getCoordinates");
        Ship instance = null;
        List<Coordinate> expResult = null;
        List<Coordinate> result = instance.getCoordinates();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStart method, of class Ship.
     */
    @Test
    public void testGetStart() {
        System.out.println("getStart");
        Ship instance = null;
        Coordinate expResult = null;
        Coordinate result = instance.getStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnd method, of class Ship.
     */
    @Test
    public void testGetEnd() {
        System.out.println("getEnd");
        Ship instance = null;
        Coordinate expResult = null;
        Coordinate result = instance.getEnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSunk method, of class Ship.
     */
    @Test
    public void testIsSunk() {
        System.out.println("isSunk");
        Ship instance = null;
        boolean expResult = false;
        boolean result = instance.isSunk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBoard method, of class Ship.
     */
    @Test
    public void testAddBoard() {
        System.out.println("addBoard");
        Board board = null;
        Ship instance = null;
        instance.addBoard(board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerHit method, of class Ship.
     */
    @Test
    public void testRegisterHit() {
        System.out.println("registerHit");
        Ship instance = null;
        instance.registerHit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class Ship.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        Ship instance = null;
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLength method, of class Ship.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Ship instance = null;
        int expResult = 0;
        int result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maxAllowed method, of class Ship.
     */
    @Test
    public void testMaxAllowed() {
        System.out.println("maxAllowed");
        Ship instance = null;
        int expResult = 0;
        int result = instance.maxAllowed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Ship.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Ship instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Ship.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Ship instance = null;
        Ship.ShipType expResult = null;
        Ship.ShipType result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
