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
     * Test of newShipFromType method, of class ShipFactory.  Creates a new battleship from the shipfactory. Tests the start value to make sure it is properly setting this value
     */
    @Test
    public void testNewShipFromTypeBattleship_start() {
        when(start.getCol()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship.ShipType type = Ship.ShipType.BATTLESHIP;
        Ship expResult = new Battleship(start,end);
        Ship result = ShipFactory.newShipFromType(type, start, end);
        assertEquals(expResult.start, result.start);
        
    }
    /**
     * Test of newShipFromType method, of class ShipFactory.  Creates a new Carrier from the shipfactory. Tests the start value to make sure it is properly setting this value
     */
     @Test
      public void testNewShipFromTypeCarrier_start() {
        when(start.getCol()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship.ShipType type = Ship.ShipType.CARRIER;
        Ship expResult = new Carrier(start,end);
        Ship result = ShipFactory.newShipFromType(type, start, end);
        assertEquals(expResult.start, result.start);
        
    }
      /**
     * Test of newShipFromType method, of class ShipFactory.  Creates a new Cruiser from the shipfactory. Tests the start value to make sure it is properly setting this value
     */
       @Test
        public void testNewShipFromTypeCruiser_start() {
        when(start.getCol()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship.ShipType type = Ship.ShipType.CRUISER;
        Ship expResult = new Cruiser(start,end);
        Ship result = ShipFactory.newShipFromType(type, start, end);
        assertEquals(expResult.start, result.start);
        
    }
        /**
     * Test of newShipFromType method, of class ShipFactory.  Creates a new Destroyer from the shipfactory. Tests the start value to make sure it is properly setting this value
     */
       @Test  
      public void testNewShipFromTypeDestroyer_start() {
        when(start.getCol()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship.ShipType type = Ship.ShipType.DESTROYER;
        Ship expResult = new Destroyer(start,end);
        Ship result = ShipFactory.newShipFromType(type, start, end);
        assertEquals(expResult.start, result.start);
        
    }
      /**
     * Test of newShipFromType method, of class ShipFactory.  Creates a new Destroyer from the shipfactory. Tests the start value to make sure it is properly setting this value
     */
         @Test  
        public void testNewShipFromTypeSubmarine_start() {
        when(start.getCol()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship.ShipType type = Ship.ShipType.SUBMARINE;
        Ship expResult = new Submarine(start,end);
        Ship result = ShipFactory.newShipFromType(type, start, end);
        assertEquals(expResult.start, result.start);
        
    }

    /**
     * Test of newShipFromType method, of class ShipFactory.  Creates a new battleship from the shipfactory. Tests the ebd value to make sure it is properly setting this value
     */    
    @Test
    public void testNewShipFromTypeBattleship_end() {
        when(start.getCol()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship.ShipType type = Ship.ShipType.BATTLESHIP;
        Ship expResult = new Battleship(start,end);
        Ship result = ShipFactory.newShipFromType(type, start, end);
        assertEquals(expResult.end, result.end);
        
    }
        /**
     * Test of newShipFromType method, of class ShipFactory.  Creates a new Carrier from the shipfactory. Tests the ebd value to make sure it is properly setting this value
     */    
     @Test
      public void testNewShipFromTypeCarrier_end() {
        when(start.getCol()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship.ShipType type = Ship.ShipType.CARRIER;
        Ship expResult = new Carrier(start,end);
        Ship result = ShipFactory.newShipFromType(type, start, end);
        assertEquals(expResult.end, result.end);
        
    }
          /**
     * Test of newShipFromType method, of class ShipFactory.  Creates a new Cruiser from the shipfactory. Tests the ebd value to make sure it is properly setting this value
     */    
       @Test
        public void testNewShipFromTypeCruiser_end() {
        when(start.getCol()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship.ShipType type = Ship.ShipType.CRUISER;
        Ship expResult = new Cruiser(start,end);
        Ship result = ShipFactory.newShipFromType(type, start, end);
        assertEquals(expResult.end, result.end);
        
    }
            /**
     * Test of newShipFromType method, of class ShipFactory.  Creates a new Destroyer from the shipfactory. Tests the ebd value to make sure it is properly setting this value
     */    
       @Test  
      public void testNewShipFromTypeDestroyer_end() {
        when(start.getCol()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship.ShipType type = Ship.ShipType.DESTROYER;
        Ship expResult = new Destroyer(start,end);
        Ship result = ShipFactory.newShipFromType(type, start, end);
        assertEquals(expResult.end, result.end);
        
    }
          /**
     * Test of newShipFromType method, of class ShipFactory.  Creates a new Submarine from the shipfactory. Tests the ebd value to make sure it is properly setting this value
     */    
         @Test  
        public void testNewShipFromTypeSubmarine_end() {
        when(start.getCol()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship.ShipType type = Ship.ShipType.SUBMARINE;
        Ship expResult = new Submarine(start,end);
        Ship result = ShipFactory.newShipFromType(type, start, end);
        assertEquals(expResult.end, result.end);
        
    }
        
            /**
     * Test of newShipFromType method, of class ShipFactory.  Creates a new battleship from the shipfactory. Tests the name value to make sure it is properly setting this value
     */    
         @Test
    public void testNewShipFromTypeBattleship_name() {
        when(start.getCol()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship.ShipType type = Ship.ShipType.BATTLESHIP;
        Ship expResult = new Battleship(start,end);
        Ship result = ShipFactory.newShipFromType(type, start, end);
        assertEquals(expResult.getName(), result.getName());
        
    }
             /**
     * Test of newShipFromType method, of class ShipFactory.  Creates a new Carrier from the shipfactory. Tests the name value to make sure it is properly setting this value
     */   
     @Test
      public void testNewShipFromTypeCarrier_name() {
        when(start.getCol()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship.ShipType type = Ship.ShipType.CARRIER;
        Ship expResult = new Carrier(start,end);
        Ship result = ShipFactory.newShipFromType(type, start, end);
        assertEquals(expResult.getName(), result.getName());
        
    }
               /**
     * Test of newShipFromType method, of class ShipFactory.  Creates a new Cruiser from the shipfactory. Tests the name value to make sure it is properly setting this value
     */   
       @Test
        public void testNewShipFromTypeCruiser_name() {
        when(start.getCol()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship.ShipType type = Ship.ShipType.CRUISER;
        Ship expResult = new Cruiser(start,end);
        Ship result = ShipFactory.newShipFromType(type, start, end);
        assertEquals(expResult.getName(), result.getName());
        
    }
                 /**
     * Test of newShipFromType method, of class ShipFactory.  Creates a new Destroyer from the shipfactory. Tests the name value to make sure it is properly setting this value
     */   
       @Test  
      public void testNewShipFromTypeDestroyer_name() {
        when(start.getCol()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship.ShipType type = Ship.ShipType.DESTROYER;
        Ship expResult = new Destroyer(start,end);
        Ship result = ShipFactory.newShipFromType(type, start, end);
        assertEquals(expResult.getName(), result.getName());
        
    }
               /**
     * Test of newShipFromType method, of class ShipFactory.  Creates a new Submarine from the shipfactory. Tests the name value to make sure it is properly setting this value
     */   
         @Test  
        public void testNewShipFromTypeSubmarine_name() {
        when(start.getCol()).thenReturn(5);
        when(end.getCol()).thenReturn(5);
        Ship.ShipType type = Ship.ShipType.SUBMARINE;
        Ship expResult = new Submarine(start,end);
        Ship result = ShipFactory.newShipFromType(type, start, end);
        assertEquals(expResult.getName(), result.getName());
        
    }
        
        
        
        
    /**
     * Test of maxAllowedFromType method, of class ShipFactory. Tests the max number of battleships that are allowed 
     */
    @Test
    public void testMaxAllowedFromTypeBattleship() {
        //System.out.println("maxAllowedFromType");
        Ship.ShipType type = Ship.ShipType.BATTLESHIP;
        int expResult = 1;
        int result = ShipFactory.maxAllowedFromType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        /**
     * Test of maxAllowedFromType method, of class ShipFactory. Tests the max number of carriers that are allowed 
     */
     @Test
    public void testMaxAllowedFromTypeCarrier() {
        //System.out.println("maxAllowedFromType");
        Ship.ShipType type = Ship.ShipType.CARRIER;
        int expResult = 1;
        int result = ShipFactory.maxAllowedFromType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        /**
     * Test of maxAllowedFromType method, of class ShipFactory. Tests the max number of Cruiser that are allowed 
     */
     @Test
    public void testMaxAllowedFromTypeCruiser() {
        //System.out.println("maxAllowedFromType");
        Ship.ShipType type = Ship.ShipType.CRUISER;
        int expResult = 1;
        int result = ShipFactory.maxAllowedFromType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        /**
     * Test of maxAllowedFromType method, of class ShipFactory. Tests the max number of Destroyer that are allowed 
     */
     @Test
    public void testMaxAllowedFromTypeDestroyer() {
        //System.out.println("maxAllowedFromType");
        Ship.ShipType type = Ship.ShipType.DESTROYER;
        int expResult = 1;
        int result = ShipFactory.maxAllowedFromType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        /**
     * Test of maxAllowedFromType method, of class ShipFactory. Tests the max number of Submarine that are allowed 
     */
     @Test
    public void testMaxAllowedFromTypeSubmarine() {
        //System.out.println("maxAllowedFromType");
        Ship.ShipType type = Ship.ShipType.SUBMARINE;
        int expResult = 1;
        int result = ShipFactory.maxAllowedFromType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNameFromType method, of class ShipFactory. Tests the get name for Battleship. 
     */
    @Test
    public void testGetNameFromTypeBattlship() {
        Ship.ShipType type = Ship.ShipType.BATTLESHIP;
        String expResult = "Battleship";
        String result = ShipFactory.getNameFromType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
       /**
     * Test of getNameFromType method, of class ShipFactory. Tests the get name for Carrier. 
     */
      @Test
    public void testGetNameFromTypeCarrier() {
        Ship.ShipType type = Ship.ShipType.CARRIER;
        String expResult = "Carrier";
        String result = ShipFactory.getNameFromType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
       /**
     * Test of getNameFromType method, of class ShipFactory. Tests the get name for Cruiser. 
     */
      @Test
    public void testGetNameFromTypeCruiser() {
        Ship.ShipType type = Ship.ShipType.CRUISER;
        String expResult = "Cruiser";
        String result = ShipFactory.getNameFromType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
       /**
     * Test of getNameFromType method, of class ShipFactory. Tests the get name for Destroyer. 
     */
      @Test
    public void testGetNameFromTypeDestroyer() {
        Ship.ShipType type = Ship.ShipType.DESTROYER;
        String expResult = "Destroyer";
        String result = ShipFactory.getNameFromType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
       /**
     * Test of getNameFromType method, of class ShipFactory. Tests the get name for Submarine. 
     */
      @Test
    public void testGetNameFromTypeSubmarine() {
        Ship.ShipType type = Ship.ShipType.SUBMARINE;
        String expResult = "Submarine";
        String result = ShipFactory.getNameFromType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
