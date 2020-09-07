package com.rev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {
	String name;
	String country;
	String skill;

}

class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter player details:");
		String str = br.readLine();
		String[] res = str.split(",");
		String name = res[0];
		String country = res[1];
		String skill = res[2];
		System.out.println("name:" + name);
		System.out.println("country:" + country);
		System.out.println("skill:" + skill);
	}

}
