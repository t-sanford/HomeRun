package com.tylersanford;

import java.util.ArrayList;

public class HomeRun {

	public static void main(String[] args) {
		Player lindor = new Player("Francisco", "Lindor", "596019");
		Player trout = new Player("Mike", "Trout", "545361");
		
		ArrayList<Player> players = new ArrayList<>();
		players.add(lindor);
		players.add(trout);
		
		for(Player player : players) {
			System.out.println(player.getFirstName() + " " + player.getLastName() + " : " + player.getHomeRuns());
		}
	}

}
