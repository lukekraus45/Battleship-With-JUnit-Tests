package edu.pitt.battleshipgame.common.board;

import java.util.HashMap;
import java.io.Serializable;

public class Coordinate implements Serializable {
    public static final int MAX_DIM = 10;
    private int row, col;
    private static final String formattingRules = "Coordinate format must be <A-J>:<0-9>";
    // Support for mapping from letters to numbers...
    private static final HashMap<Character,Integer> columnMap = new HashMap<Character, Integer>(){{
            put('a',0);
            put('b',1);
            put('c',2);
            put('d',3);
            put('e',4);
            put('f',5);
            put('g',6);
            put('h',7);
            put('i',8);
            put('j',9);
        }
    };

    // Support for mapping from numbers to letters
    private static final char [] reverseColumnMap =
        { 'a','b','c','d','e','f','g','h','i','j'};
    
    /**
     * A simple constructor that calls setCoordinates below.
     */
    public Coordinate (String coord) throws IllegalArgumentException {
        setCoordinates(coord);
    }
    
    public Coordinate (int _row, int _col) {
        setRow(_row);
        setCol(_col);
    }

    /**
     * This function will parse and set the coordinates for the board.
     * This allows any parsing errors to be detected on the client side
     * before it gets to the server.
     */
    public void setCoordinates(String coord) throws IllegalArgumentException {
        if (coord.length() != 3) {
            

            throw new IllegalArgumentException(formattingRules);
        }
        
        int _col = 0;
        String [] coordinates = coord.split(":");
        if (columnMap.keySet().contains(coordinates[0].charAt(0))) {
            _col = columnMap.get(coordinates[0].charAt(0));
        } else {
            throw new IllegalArgumentException(formattingRules);
        }

        int _row = 0;
        try {
            _row = Integer.parseInt(coordinates[1]) - 1;
        } catch (NumberFormatException e){
            throw new IllegalArgumentException(formattingRules);
        }

        // At this point we have passed all tests and we can initialize the coordinate.
        setCol(_col);
        setRow(_row);
    }

    public void setCol(int _col) {
        col = _col;
    }

    public void setRow(int _row) {
        row = _row;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
    
    public static int columnLookup(char colName) {
        return columnMap.get(colName);
    }
    
    public static char reverseColumnLookup(int col) {
        return reverseColumnMap[col];
    }
    
    public String toString() {
        return reverseColumnLookup(col) + ":" + (row+1);
    }
}