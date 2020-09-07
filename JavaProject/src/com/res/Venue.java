package com.res;

import java.util.Scanner;

public class Venue {
	private String name;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter venue name");
		String name = sc.nextLine();
		System.out.println("Enter city name");
		String city = sc.nextLine();

	}

}
