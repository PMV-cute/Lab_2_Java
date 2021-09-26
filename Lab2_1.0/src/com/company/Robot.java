package com.company;

public class Robot implements Team {
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
    public Robot(String name, int maxRange, int maxJump) {
        this.name = name;
        this.maxRange = maxRange;
        this.maxJump = maxJump;
    }

    public void runTreadmill(Treadmill dist) {
        if (dist.getRange() <= maxRange)
            System.out.println("Робот " + name + " пробежал " + dist.getRange() + " метров" );
        else {
            i++;
            System.out.println("Робот " + name + " не смог пробежать " + dist.getRange() + " метров");
        }
    }

    public void jumpWall(Wall height) {
        if (height.getHeight() <= maxJump)
            System.out.println("Робот " + name + " смог перепрыгнуть препятствие высотой " + height.getHeight() + "м");
        else {
            i++;
            System.out.println("Робот " + name + " не смог перепрыгнуть препятствие высотой  " + height.getHeight() + "м");
        }
    }
}
