package com.wipro.fsd.springbasics.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.fsd.springbasics.config.MovieConfig;
import com.wipro.fsd.springbasics.model.Movie;

public class SpringAnnotationApplicationClient {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MovieConfig.class);
		   
		   Movie movie = ctx.getBean(Movie.class);
		   movie.setMovieId("M002");
		   movie.setMovieName("Titanic");
		   movie.setMovieActor("Tom Cruise");
		   System.out.println("movie Id : "+movie.getMovieId());
		   System.out.println("movie Name : "+movie.getMovieName());
		   System.out.println("movie Actor : "+movie.getMovieActor());

	}
}
