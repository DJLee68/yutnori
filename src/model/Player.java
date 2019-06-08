package model;

import java.util.ArrayList;

public class Player {
	private int player;
	private int horseNum;
	private int throwChance;
	private ArrayList<HorseSet> horseSets = new ArrayList<HorseSet>();
	
	public Player() {}
	
	public Player(int player) {
		this.player = player;
		throwChance = 1;
	}
	
	public Player(int player, int num) {
		this.player = player;
		throwChance = 1;
		horseNum = num;
	}
	
	public void setHorseNum(int num) {
		horseNum = num;
	}
	
	public void decreaseHorseNum() {
		horseNum--;
	}
	public int getHorseNum() {
		return horseNum;
	}
	public void putHorseSet() {
		horseSets.add(new HorseSet(player));
	}
	
	public int getPlayer() {
		return this.player;
	}
	
	public ArrayList<HorseSet> getHorseSets() {
		return this.horseSets;
	}
}