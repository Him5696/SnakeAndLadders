package com.bridgelabz.snakeAndLadder;

import java.util.Random;

public class SnakeAndLadder {

        private static int getDieRoll() {
            Random random = new Random();
            int roll = random.nextInt(6) + 1;
            System.out.println(roll);
            return roll;
        }
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game");
        int position = 0;
        System.out.println("game played at start position:" + position);
        int dieNumber = getDieRoll();
    }
}
