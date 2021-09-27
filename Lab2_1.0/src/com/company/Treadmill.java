package com.company;

public class Treadmill implements trials {
    private int dist;

    public Treadmill(int dist) { this.dist = dist; }
    public int get() { return dist; }
    public void set(int dist) { this.dist = dist; }
}
