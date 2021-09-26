package com.company;

public class Man implements Team {
    private String name;
    private int maxRange;
    private int maxJump;
    private int i = 0;

    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    public Man(String name, int maxRange, int maxJump) {
        this.name = name;
        this.maxRange = maxRange;
        this.maxJump = maxJump;
    }

    public void runTreadmill(Treadmill dist) {
        if (dist.getRange() <= maxRange )
            System.out.println("Человек " + name + " пробежал " + dist.getRange() + " метров" );
        else {
            System.out.println("Человек " + name + " не смог пробежать " + dist.getRange() + " метров");
            i++;
        }
    }

    public void jumpWall(Wall height) {
        if (height.getHeight() <= maxJump)
            System.out.println("Человек " + name + " смог перепрыгнуть препятствие высотой " + height.getHeight() + "м");
        else {
            System.out.println("Человек " + name + " не смог перепрыгнуть препятствие " + height.getHeight() + "м");
            i++;
        }
    }
}