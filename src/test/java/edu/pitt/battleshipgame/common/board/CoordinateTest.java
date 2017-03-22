/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.battleshipgame.common.board;

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
public class CoordinateTest {
    
    public CoordinateTest() {
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
     * Test of setCoordinates method, of class Coordinate. Creates a new coordinate that is 2,2. It then sets its coordinates to a:1 (0,0). It then tests to see if this change
     * worked properly. If it did the test will pass. 
     */
    @Test
    public void testSetCoordinates() {
       
        Coordinate instance = new Coordinate(0,0);
        Coordinate test = new Coordinate(2,2);
        test.setCoordinates("a:1");
        assertEquals(test.toString(),instance.toString());
       
    }

    /**
     * Test of setCol method, of class Coordinate. Creates a new coordinate 5,5. Sets the col to 0. If the column is set to 0 then return true else return false. If it is true we know 
     * it is working, else the test will fail. 
     */
    @Test
    public void testSetCol() {
        
        int _col = 0;
        Coordinate instance = new Coordinate(5,5);
        instance.setCol(_col);
        boolean working = false;
        if(instance.getCol() == 0){
        working = true;
        }
        assertTrue(working);
    }

    /**
     * Test of setRow method, of class Coordinate. Same as setCol except for row. 
     */
    @Test
    public void testSetRow() {
        int _row = 0;
        Coordinate instance = new Coordinate(5,5);
        instance.setRow(_row);
        boolean working = false;
        if(instance.getRow() == 0){
        working = true;
        }
        assertTrue(working);
    }

    /**
     * Test of getRow method, of class Coordinate. Creates a new coordinate with a row value of 4. If the row is 4 when getRow is called the test passes.
     */
    @Test
    public void testGetRow() {
        
        Coordinate instance = new Coordinate(4,5);
        
        boolean working = false;
        if(instance.getRow() == 4){
        working = true;
        }
        assertTrue(working);
    }

    /**
     * Test of getCol method, of class Coordinate. Same as getRow except for Col
     */
    @Test
    public void testGetCol() {
         Coordinate instance = new Coordinate(4,5);
        
        boolean working = false;
        if(instance.getCol() == 5){
        working = true;
        }
        assertTrue(working);
    }

    /*
    
    DONT NEED COLUMN LOOKUP OR TO STRING BECUASE WE ARE USING A GUI
    */
    
}
