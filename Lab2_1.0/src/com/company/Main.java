package com.company;

public class Main {
        public static void main(String[] args) {
        int Stage = 0;

        Team[] team = {
                new Cat("Howard",1100, 5),
                new Man("Vlad",3500, 3),
                new Robot("GoodWin",32000, 15)
        };
        trials[] trials1 = {
                new Treadmill(Dist.MEDIUM.get()),
                new Wall(Height.SHORT.get()),
                new Treadmill(Dist.LONG.get()),
                new Wall(Height.MEDIUM.get())
        };

        Games game1 = new Games(team, trials1, 5);
        game1.game();
    }
}
