package com.aca.rest.model;

public class Movie {
	
	private String eidr;
	private String title;
	private Genre genre;
	private int releaseYear;
	
	
	public Movie(String title, Genre genre, int releaseYear, String eidr) {
		this.eidr = eidr;
		this.title = title;
		this.genre = genre;
		this.releaseYear = releaseYear;
	}
	
	public Movie() {
		
	}

	public String getEidr() {
		return eidr;
	}

	public void setEidr(String eidr) {
		this.eidr = eidr;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}


	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("eidr: " + getEidr());
		stringBuffer.append(", title: " + getTitle());
		stringBuffer.append(", genre: " + getGenre());
		stringBuffer.append(", releaseYear: " + getReleaseYear());
		return stringBuffer.toString();
		
	}




	



}
