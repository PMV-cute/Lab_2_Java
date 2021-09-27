package com.company;

public class Wall implements trials{
    private int Height;

    public Wall(int height) {
        this.Height = height;
    }
    public int get() { return Height; }
    public void set(int height) { this.Height = height; }
}

