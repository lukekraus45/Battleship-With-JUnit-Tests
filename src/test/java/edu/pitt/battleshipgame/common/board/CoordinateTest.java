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
     * Test of setCoordinates method, of class Coordinate.
     */
    @Test
    public void testSetCoordinates() {
       
        Coordinate instance = new Coordinate(0,0);
        
        Coordinate test = new Coordinate(2,2);
        test.setCoordinates("a:1");
        //System.out.println("test " + test.toString() + "instance " + instance.toString());
        assertEquals(test.toString(),instance.toString());
       
    }

    /**
     * Test of setCol method, of class Coordinate.
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
     * Test of setRow method, of class Coordinate.
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
     * Test of getRow method, of class Coordinate.
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
     * Test of getCol method, of class Coordinate.
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
