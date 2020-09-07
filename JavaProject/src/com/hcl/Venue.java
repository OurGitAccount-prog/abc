package com.hcl;

import java.util.Scanner;

public class Venue {
	String name;
	String city;

}

class Mainclass {
	public static void main(String[] args) {
		Venue v = new Venue();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter venue name:");
		v.name = sc.nextLine();
		System.out.println("Enter venue city:");
		v.city = sc.nextLine();
		System.out.println("Venue details:");
		System.out.println("venue name:" + v.name);
		System.out.println("venue city:" + v.city);
	}

}
