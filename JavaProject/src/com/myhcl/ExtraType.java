package com.myhcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtraType {
	private String name;
	private Long runs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRuns() {
		return runs;
	}

	public void setRuns(Long runs) {
		this.runs = runs;
	}
}

class Main {
	public static void main(String[] args) throws IOException {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Extratype details:");
		str = br.readLine();
		System.out.print("Etratype details");
		String[] res = str.split("#");
		String name = res[0];
		Long runs = Long.parseLong(res[1]);
		System.out.println("Extra type:" + name);
		System.out.println("Runs:" + runs);

	}
}
