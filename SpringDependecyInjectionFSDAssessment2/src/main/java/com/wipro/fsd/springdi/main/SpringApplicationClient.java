package com.wipro.fsd.springdi.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.fsd.springdi.config.PlayerConfig;
import com.wipro.fsd.springdi.model.Player;

public class SpringApplicationClient {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PlayerConfig.class);
		Player player1 = (Player) context.getBean("player1");
		Player player2 = (Player) context.getBean("player2");
		Player player3 = (Player) context.getBean("player3");
		Player player4 = (Player) context.getBean("player4");
		Player player5 = (Player) context.getBean("player5");
		System.out.println("player1: "+player1);
		System.out.println("player2: "+player2);
		System.out.println("player3: "+player3);
		System.out.println("player4: "+player4);
		System.out.println("player5: "+player5);

	}
}
