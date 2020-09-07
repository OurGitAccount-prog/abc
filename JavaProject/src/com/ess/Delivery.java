package com.ess;

public class Delivery {

	private Long over;
	private Long ball;
	private Long runs;
	private String batsman;
	private String bowler;
	private String nonstriker;

	public Delivery() {
	}

	public Delivery(Long over, Long ball, Long runs, String batsman, String bowler, String nonstriker) {
		super();
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonstriker = nonstriker;
	}

	public Long getOver() {
		return over;
	}

	public void setOver(Long over) {
		this.over = over;
	}

	public Long getBall() {
		return ball;
	}

	public void setBall(Long ball) {
		this.ball = ball;
	}

	public Long getRuns() {
		return runs;
	}

	public void setRuns(Long runs) {
		this.runs = runs;
	}

	public String getBatsman() {
		return batsman;
	}

	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}

	public String getBowler() {
		return bowler;
	}

	public void setBowler(String bowler) {
		this.bowler = bowler;
	}

	public String getNonstriker() {
		return nonstriker;
	}

	public void setNonstriker(String nonstriker) {
		this.nonstriker = nonstriker;
	}

	public void display() {
		System.out.println("Delivery Details:");
		System.out.println("over:" + over);
		System.out.println("ball:" + ball);
		System.out.println("runs:" + runs);
		System.out.println("Batsman:" + batsman);
		System.out.println("bowler:" + bowler);
		System.out.println("Non striker:" + nonstriker);

	}

}
