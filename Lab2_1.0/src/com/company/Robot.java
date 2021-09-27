package com.company;

public class Robot implements Team {
    private String name;
    private int maxRange;
    private int maxJump;
    private int k = 0;

    public int getI() {
        return k;
    }
    public Robot(String name, int maxRange, int maxJump) {
        this.name = name;
        this.maxRange = maxRange;
        this.maxJump = maxJump;
    }

    public void RunJump(trials[] trials1) {
        for(int i = 0; i<trials1.length; i++){
            if (trials1[i] instanceof Treadmill) {
                if (trials1[i].get() <= maxRange)
                    System.out.println("Робот " + name + " пробежал " + trials1[i].get() + " метров" );
                else {
                    k++;
                    System.out.println("Робот " + name + " не смог пробежать " + trials1[i].get() + " метров");
                }
            }
            if (trials1[i] instanceof Wall) {
                if (trials1[i].get() <= maxJump)
                    System.out.println("Робот " + name + " смог перепрыгнуть препятствие высотой " + trials1[i].get() + "м");
                else {
                    k++;
                    System.out.println("Робот " + name + " не смог перепрыгнуть препятствие высотой  " + trials1[i].get() + "м");
                }
            }
        }
    }
}
