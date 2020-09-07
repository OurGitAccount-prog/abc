package com.hcl;

import java.util.Scanner;

public class Player {
	String name;
	String country;
	String skill;
}

class Main {
	public static void main(String[] args) {
		Player p = new Player();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name:");
		p.name = sc.nextLine();
		System.out.println("Enter the player country:");
		p.country = sc.nextLine();
		System.out.println("Enter the player skill:");
		p.skill = sc.nextLine();
		System.out.println("player details:");
		System.out.println("player name:" + p.name);
		System.out.println("player country:" + p.country);
		System.out.println("player skill:" + p.skill);
	}
}
