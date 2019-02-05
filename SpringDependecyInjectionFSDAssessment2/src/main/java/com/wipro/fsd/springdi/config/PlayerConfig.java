package com.wipro.fsd.springdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.wipro.fsd.springdi.model.Country;
import com.wipro.fsd.springdi.model.Player;

@Configuration
@Import(CountryConfig.class)
public class PlayerConfig {

	@Bean
	public Player player1(Country india){
		Player player = new Player();
		player.setPlayerId("P001");
		player.setPlayerName("Scahin Tendulkar");
		player.setCountry(india);
		return player;
	}
	
	@Bean
	public Player player2(Country england){
		Player player = new Player();
		player.setPlayerId("P002");
		player.setPlayerName("Joe Root");
		player.setCountry(england);
		return player;
	}
	
	@Bean
	public Player player3(Country india){
		Player player = new Player();
		player.setPlayerId("P003");
		player.setPlayerName("Virat Kohli");
		player.setCountry(india);
		return player;
	}
	@Bean
	public Player player4(Country england){
		Player player = new Player();
		player.setPlayerId("P004");
		player.setPlayerName("Eion Morgan");
		player.setCountry(england);
		return player;
	}
	
	@Bean
	public Player player5(Country england){
		Player player = new Player();
		player.setPlayerId("P005");
		player.setPlayerName("James Anderson");
		player.setCountry(england);
		return player;
	}
}
