package com.bridgelabz;

public class PlayerReachedWinningPosition {

	public static void main(String[] args) {
		int rollDice = 0;
		int dice = 0;
		int playOption = 0;
		int POSITION = 0;

		System.out.println("Welcome to Snake & Ladder Simulator!");
		System.out.println("The Player starts from 0 rolls the die to get a number between 1 to 6");
        System.out.println("Let's begin the game...");
		System.out.println("Initial position is Square Zero");
		System.out.println("Position : Square " + POSITION);

		for (dice = 1; POSITION < 100; dice++) {

			System.out.println();
			rollDice = (int) ((Math.random() * 6) + 1);
			System.out.println("Rolled Dice Value : " + rollDice);

			playOption = (int) Math.floor(Math.random() * 10) % 3;

			switch (playOption) {
			case 0:
				System.out.println("You encountered a LADDER!");
				System.out.println("You can move " + rollDice + " places ahead.");
				POSITION += rollDice;
				break;

			case 1:
				System.out.println("You encountered a SNAKE!");
				System.out.println("You will move " + rollDice + " places back.");
				POSITION -= rollDice;
				break;

			case 2:
				System.out.println("You got NO PLAY");
				System.out.println("You will have to skip your turn.");

			}

			if (POSITION < 0)
				POSITION = 0;

			System.out.println("Current Position : Square " + POSITION);

		}
	}
}
