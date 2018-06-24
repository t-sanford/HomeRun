package com.tylersanford;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Player {
	private String firstName;
	private String lastName;
	private String playerNum;
	private String homeRuns;
	
	public Player(String firstName, String lastName, String playerNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.playerNum = playerNum;
	}
	
	public String getHomeRuns() {
		try {
			Document doc = Jsoup.connect("http://m.mlb.com/player/" + this.playerNum + "/").get();
			homeRuns = doc.select(".player-stats-summary-large").select("td").get(4).ownText();
			return homeRuns;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
