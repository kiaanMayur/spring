package com.capgemini.advancecollection;

//class to implement the details of Movies
public class MovieDetails {
	
	private String movieName;
	private String leadActor;
	private String leadActress;
	private String genre;
	
	public MovieDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public MovieDetails(String movieName, String leadActor, String leadActress, String genre) {
		super();
		this.movieName = movieName;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.genre = genre;
	}

	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	public String getLeadActress() {
		return leadActress;
	}

	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "\nMovieDetails\n------------------------------------------\nmovieName= " + movieName + "\nleadActor= " + leadActor + "\nleadActress= " + leadActress
				+ "\ngenre= " + genre;
	}

	
}
