package com.wipro.fsd.springbasics.model;

import java.io.Serializable;

public class Movie implements Serializable {

	private static final long serialVersionUID = -1902389058290492357L;

	private String movieId;
	private String movieName;
	private String movieActor;

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieActor() {
		return movieActor;
	}

	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}

}
