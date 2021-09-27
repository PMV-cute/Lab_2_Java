package com.company;

public enum Dist {
    SHORT(30), MEDIUM (70), LONG(100);
    private int let;
    Dist(int let) {
        this.let = let;
    }
    public int get() { return let; }
}
