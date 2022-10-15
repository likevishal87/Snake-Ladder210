package com.bridgelabz;

public class Rollthedie {

	public static void main(String[] args) {
		final int POSITION = 0;
		final int ROLL_DICE = 0;

		System.out.println("Welcome to Snake & Ladder Simulator!");
		System.out.println("The Player starts from 0 rolls the die to get a number between 1 to 6");
		System.out.println("Let's begin the game.....");
		System.out.println("Initial position is Square Zero");
		System.out.println("Position : Square " + POSITION);

		int rollDice = 0;

		rollDice = (int) ((Math.random() * 6) + 1);
		System.out.println("Rolled Dice Value :" + rollDice);
	}

}
