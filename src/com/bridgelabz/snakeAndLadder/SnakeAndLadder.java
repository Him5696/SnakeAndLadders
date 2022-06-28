package com.bridgelabz.snakeAndLadder;

import java.util.Random;

public class SnakeAndLadder {

    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static void main(String[] args) {
        int playerPosition = 0;
        System.out.println("Initial position of player is : " +playerPosition);

        while(playerPosition<100) {
            int numberOnDie = RandomDie();
            System.out.println("Number on Die is : " +numberOnDie);
            int option = RandomOption();

            switch(option) {
                case LADDER :
                    System.out.println("Player takes Ladder " +LADDER );
                    playerPosition += numberOnDie;
                    if (playerPosition > 100)
                        playerPosition = 100;
                    break;
                case SNAKE:
                    System.out.println("Player Takes Snake " +SNAKE);
                    playerPosition -= numberOnDie;
                    if (playerPosition < 0)
                        playerPosition = 0;
                    break;
                default:
                    System.out.println("No play");
            }
            System.out.println("Current Position of Player :  "+playerPosition);
        }
    }

    private static int RandomOption() {
        Random random = new Random();
        int options = random.nextInt(3);
        return options;
    }

    private static int RandomDie() {
        Random random = new Random();
        int dieNum = random.nextInt(6) + 1;
        return dieNum;
    }
}
