package com.las;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Wicket details:");
		String str = br.readLine();
		System.out.println("Enter  first Wicket details:");
		String[] res = str.split(",");
		Long l = Long.parseLong(res[0]);

		System.out.println("Enter second Wicket details:");
		String str1 = br.readLine();
		System.out.print("Etratype details");
		String[] res = str.split("#");
		System.out.println("Wicket details:");
		Long l = Long.parseLong(res[0]);
	}

}
