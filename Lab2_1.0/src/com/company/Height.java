package com.company;

public enum Height {
    SHORT(1), MEDIUM (2), LONG(3);
    private int let;
    Height(int let) {
        this.let = let;
    }
    public int get() { return let; }
}
