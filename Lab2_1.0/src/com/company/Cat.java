package com.company;

public class Cat implements Team {
    private String name;
    private int maxRange;
    private int maxJump;
    private int k = 0;

    public int getI() {
        return k;
    }
    public Cat(String name, int maxRange, int maxJump) {
        this.name = name;
        this.maxRange = maxRange;
        this.maxJump = maxJump;
    }

    public void RunJump(trials[] trials1) {
        for(int i = 0; i<trials1.length; i++){
            if (trials1[i] instanceof Treadmill) {
                if (trials1[i].get() <= maxRange )
                    System.out.println("Кот " + name + " пробежал " + trials1[i].get() + " метров" );
                else {
                    System.out.println("Кот " + name + " не смог пробежать " + trials1[i].get() + " метров");
                    k++;
                }
            }
            if (trials1[i] instanceof Wall) {
                if (trials1[i].get() <= maxJump)
                    System.out.println("Кот " + name + " смог перепрыгнуть препятствие высотой " + trials1[i].get() + "м");
                else {
                    k++;
                    System.out.println("Кот " + name + " не смог перепрыгнуть препятствие высотой " + trials1[i].get() + "м");
                }
            }
        }
    }
}