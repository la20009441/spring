package com.wipro.fsd.springbasics.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.fsd.springbasics.model.Movie;

public class SpringApplicationClient {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("movie.xml");
		Movie movie = (Movie) context.getBean("movie");
		System.out.println("movie id : " + movie.getMovieId());
		System.out.println("movie actor : " + movie.getMovieActor());
		System.out.println("movie name : " + movie.getMovieName());

	}
}
