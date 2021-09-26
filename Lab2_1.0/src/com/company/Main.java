package com.company;

public class Main {

    public static void main(String[] args) {
        int Stage = 0;

        Team[] team = new Team[3];
        team[0] = new Cat("Morris",700, 5);
        team[1] = new Man("Oleg",3000, 3);
        team[2] = new Robot("iHorse",30000, 15);

        Treadmill dist = new Treadmill(400);
        Wall height = new Wall(2);

        playMarathon(team, dist, height);
    }


    public static void playMarathon(Team[] team, Treadmill dist, Wall height) {
        int Stage;
        do {
            for ( Stage = 1; Stage <=3 ; Stage++) {
                dist.setRange(dist.getRange()*Stage);
                height.setHeight(height.getHeight()*Stage);
                for (int i = 0; i < 3; i++) {
                    if(team[i].getI() > 0 ) {
                        continue;
                    }
                    team[i].runTreadmill(dist);
                }
                for (int j = 0; j < 3; j++) {
                    if(team[j].getI() > 0 ) {
                        continue;
                    }
                    team[j].jumpWall(height);
                }
                System.out.println("\n" + Stage + " этап окончен" + "\n");
            }
        } while (Stage == 3);
    }
}