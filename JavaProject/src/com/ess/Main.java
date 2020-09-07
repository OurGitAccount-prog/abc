package com.ess;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Long over;
		Long ball;
		Long runs;
		String batsman;
		String bowler;
		String nonstriker;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the over");
		over = sc.nextLong();
		System.out.println("Enter the ball:");
		ball = sc.nextLong();
		System.out.println("Enter the runs:");
		runs = sc.nextLong();

		System.out.println("Enter the Batsman:");
		batsman = sc.next();

		System.out.println("Enter the Bowler:");
		bowler = sc.next();

		System.out.println("Enter the Non striker:");
		nonstriker = sc.next();
		Delivery d = new Delivery(over, ball, runs, batsman, bowler, nonstriker);

		d.display();

	}
}