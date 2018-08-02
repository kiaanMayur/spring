package com.capgemini.advancecollection;

import java.util.*;
import java.util.function.*;

//class to implement the method to add, delete, find and display the treeset objects
public class MovieDetailsList{
	
	Comparator<MovieDetails> comparator = (arg0, arg1) -> arg0.getMovieName().compareTo(arg1.getMovieName());
	Set<MovieDetails> movie = new TreeSet<>(comparator);
	//Iterator<MovieDetails> itr = movie.iterator();


	//method to add the object to the treeset
	public void addMovie(MovieDetails movieName) {
		movie.add(movieName);
		System.out.println(movieName.getMovieName() + " added");
	}
	
	//method to remove movie by movie name
	public void removeMovie(String movieName) {
		Predicate<MovieDetails> delMovie = MovieDetails -> MovieDetails.getMovieName().equals(movieName);
		movie.removeIf(delMovie);
	}
	
	//method to delete all the objects from treeset
	public void removeAll() {
		movie.clear();
		System.out.println("All movies are gone.");
	}
	
	//method to find the movie by name
	public boolean findByName(String movieName) {
		
		Predicate<MovieDetails> checkMovieByName = MovieDetails -> (MovieDetails.getMovieName().equals(movieName));
		return movie.stream().anyMatch(checkMovieByName);
	}
	
	//method to find movie by genre
	public boolean findByGenre(String genre) {
		Predicate<MovieDetails> checkMovieByGenre = MovieDetails -> (MovieDetails.getGenre().equals(genre));
		return movie.stream().anyMatch(checkMovieByGenre);
	}

	//method to display the values of treeset
	public void display() {
		
		Consumer<MovieDetails> disp = System.out :: println;
		movie.stream().forEach(disp);
	}
	
	public void delete() {
		
	}

}
