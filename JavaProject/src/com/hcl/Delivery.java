package com.hcl;

import java.util.Scanner;

public class Delivery {
	Long over;
	Long ball;
	Long runs;
	String batsman;
	String bowler;
	String nonstriker;

	public void displayDeliveryDetails() {

		System.out.println("Delivery Details:");
		System.out.println("over:" + over);
		System.out.println("ball:" + ball);
		System.out.println("runs:" + runs);
		System.out.println("Batsman:" + batsman);
		System.out.println("bowler:" + bowler);
		System.out.println("Non striker:" + nonstriker);

	}

}

class Maincls {
	public static void main(String[] args) {
		Delivery dl = new Delivery();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the over:");
		dl.over = sc.nextLong();
		System.out.println("Enter the ball:");
		dl.ball = sc.nextLong();
		System.out.println("Enter the runs:");
		dl.runs = sc.nextLong();

		System.out.println("Enter the Batsman:");
		dl.batsman = sc.next();

		System.out.println("Enter the Bowler:");
		dl.bowler = sc.next();

		System.out.println("Enter the Non striker:");
		dl.nonstriker = sc.next();

		dl.displayDeliveryDetails();

	}
}
