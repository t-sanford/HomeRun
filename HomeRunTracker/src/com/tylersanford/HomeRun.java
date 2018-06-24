package com.tylersanford;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;

public class HomeRun {

	public static void main(String[] args) {
		Map<String, ArrayList<Player>> pool = new HashMap<String, ArrayList<Player>>();
		pool.put("Tyler", getTeamTyler());
		pool.put("Ken", getTeamKen());
		pool.put("Ryan", getTeamRyan());
		pool.put("Chris", getTeamChris());
		pool.put("Jason", getTeamJason());
		
		for(String team : pool.keySet()) {
			System.out.println("\nTeam " + team);
			System.out.println("----------");
			for(int i = 0; i < pool.get(team).size(); i++) {
				System.out.println(pool.get(team).get(i).getFirstName() + " "
								 + pool.get(team).get(i).getLastName() + ": "
								 + pool.get(team).get(i).getHomeRuns());
			}
			System.out.println(team + "'s total Home Runs: " + getTeamHomeRunTotal(pool.get(team)));
		}
	}
	
	public static Integer getTeamHomeRunTotal(ArrayList<Player> team) {
		int homeRuns = 0;
		for(Player player : team) {
			homeRuns = homeRuns + Integer.parseInt(player.getHomeRuns());
		}
		return homeRuns;
	}
	
	private static ArrayList<Player> getTeamTyler() {
		ArrayList<Player> temp = new ArrayList<>();
		Player lindor = new Player("Francisco", "Lindor", "596019");
		Player davis = new Player("Khris", "Davis", "501981");
		Player encarnacion = new Player("Edwin", "Encarnacion", "429665");
		Player moustakas = new Player("Mike", "Moustakas", "519058");
		Player smoak = new Player("Justin", "Smoak", "475253");
		Player ozuna = new Player("Marcell", "Ozuna", "542303");
		temp.add(lindor);
		temp.add(davis);
		temp.add(encarnacion);
		temp.add(moustakas);
		temp.add(smoak);
		temp.add(ozuna);
		return temp;
	}

	private static ArrayList<Player> getTeamKen() {
		ArrayList<Player> temp = new ArrayList<>();
		Player cruz = new Player("Nelson", "Cruz", "443558");
		Player trout = new Player("Mike", "Trout", "545361");
		Player bryant = new Player("Kris", "Bryant", "592178");
		Player donaldson = new Player("Josh", "Donaldson", "518626");
		Player dozier = new Player("Brian", "Dozier", "572821");
		Player blackmon = new Player("Charlie", "Blackmon", "453568");
		temp.add(cruz);
		temp.add(trout);
		temp.add(bryant);
		temp.add(donaldson);
		temp.add(dozier);
		temp.add(blackmon);
		return temp;
	}
	
	private static ArrayList<Player> getTeamRyan() {
		ArrayList<Player> temp = new ArrayList<>();
		Player stanton = new Player("Giancarlo", "Stanton", "519317");
		Player harper = new Player("Bryce", "Harper", "547180");
		Player goldschmidt = new Player("Paul", "Goldschmidt", "502671");
		Player rizzo = new Player("Anthony", "Rizzo", "519203");
		Player freeman = new Player("Freddie", "Freeman", "518692");
		Player betts = new Player("Mookie", "Betts", "605141");
		temp.add(stanton);
		temp.add(harper);
		temp.add(goldschmidt);
		temp.add(rizzo);
		temp.add(freeman);
		temp.add(betts);
		return temp;
	}
	
	private static ArrayList<Player> getTeamChris() {
		ArrayList<Player> temp = new ArrayList<>();
		Player judge = new Player("Aaron", "Judge", "592450");
		Player bellinger = new Player("Cody", "Bellinger", "641355");
		Player machado = new Player("Manny", "Machado", "592518");
		Player sanchez = new Player("Gary", "Sanchez", "596142");
		Player upton = new Player("Justin", "Upton", "457708");
		Player votto = new Player("Joey", "Votto", "458015");
		temp.add(judge);
		temp.add(bellinger);
		temp.add(machado);
		temp.add(sanchez);
		temp.add(upton);
		temp.add(votto);
		return temp;
	}
	
	private static ArrayList<Player> getTeamJason() {
		ArrayList<Player> temp = new ArrayList<>();
		Player arenado = new Player("Nolan", "Arenado", "571448");
		Player martinez = new Player("J.D.", "Martinez", "502110");
		Player gallo = new Player("Joey", "Gallo", "608336");
		Player hoskins = new Player("Rhys", "Hoskins", "656555");
		Player sano = new Player("Miguel", "Sano", "593934");
		Player olson = new Player("Matt", "Olson", "621566");
		temp.add(arenado);
		temp.add(martinez);
		temp.add(gallo);
		temp.add(hoskins);
		temp.add(sano);
		temp.add(olson);
		return temp;
	}
}
