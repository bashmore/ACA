package com.aca.rest.model;

public enum Genre {ACTION("action"), COMEDY("comedy"), SYFY("syfy");
	
	private String value;
	
	Genre(String value) {
		this.value = value;
	}
	
	public String toString() {
		return this.value;
	}

	public static boolean isValid(String genreString) {
		boolean isValid = false;
		for (Genre genre : Genre.values()) {
			if (genre.toString().equalsIgnoreCase(genreString)) {
				isValid = true;
			}
		}
		return isValid;
	}

}
