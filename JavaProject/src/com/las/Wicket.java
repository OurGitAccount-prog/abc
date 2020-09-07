package com.las;

public class Wicket {

	private Long over;
	private Long ball;
	private String wicket;
	private String playername;
	private String bowlername;

	public Wicket() {

	}

	public Wicket(Long over, Long ball, String wicket, String playername, String bowlername) {
		super();
		this.over = over;
		this.ball = ball;
		this.wicket = wicket;
		this.playername = playername;
		this.bowlername = bowlername;
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

	public String getWicket() {
		return wicket;
	}

	public void setWicket(String wicket) {
		this.wicket = wicket;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public String getBowlername() {
		return bowlername;
	}

	public void setBowlername(String bowlername) {
		this.bowlername = bowlername;
	}
}
