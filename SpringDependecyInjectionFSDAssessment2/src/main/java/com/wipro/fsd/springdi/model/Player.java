package com.wipro.fsd.springdi.model;

import java.io.Serializable;

public class Player implements Serializable {

	private static final long serialVersionUID = 2246324778199549313L;

	private String playerId;
	private String playerName;
	private Country country;

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", country=" + country + "]";
	}

}
