package com.wipro.fsd.springbasics.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wipro.fsd.springbasics.model.Movie;

@Configuration
public class MovieConfig {
	
	@Bean 
	   public Movie movie(){
	      return new Movie();
	   }

}
