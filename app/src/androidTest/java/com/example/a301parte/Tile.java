package com.example.a301parte;

/**
 *@authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmstede
 * */

public class Tile {
    public int colorNum;
    public int tileNum;

    public Tile(){
        super();
        this.colorNum = 0;
        this.tileNum = 0;
    }
    /*
    public Tile(int initColor, int initTileNum) {
        this.color = initColor;
        this.tileNum = initTileNum;
    }
    */

    
    public Tile(Tile orig) {
        this.colorNum = orig.colorNum;
        this.tileNum = orig.tileNum;
    }

    @Override
    public String toString() {
        return colorNum + " " + tileNum;
    }
}