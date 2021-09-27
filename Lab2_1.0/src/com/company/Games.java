package com.company;

public class Games  {
    Team[] team;
    trials[] trials1;
    int Stages;

    public Games (Team[] team, trials[] trials1, int Stages) {
        this.team = team;
        this.trials1 = trials1;
        this.Stages = Stages;
    }
    public void game () {
        int Stage;
        for ( Stage = 1; Stage <=Stages ; Stage++) {
            for (int i = 0; i < trials1.length; i++) {
                trials1[i].set(trials1[i].get()*Stage);
            }
            for (int i = 0; i < team.length; i++) {
                if(team[i].getI() > 0 ) {
                    continue;
                }
                team[i].RunJump(trials1);
            }
            System.out.println("\n" + Stage + " этап окончен " + "\n");


        }
    }
}
