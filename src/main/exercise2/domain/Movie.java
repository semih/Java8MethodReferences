package main.exercise2.domain;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private int id;
	private String title;
	private int year;
	private String imdb;
	private List<Genre> genres;
	private List<Director> directors;
	{
		genres = new ArrayList<>();
		directors = new ArrayList<>();
	}

	public Movie() {
	}

	public Movie(int id, String title, int year, String imdb) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.imdb = imdb;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	public String getImdb() {
		return imdb;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public List<Director> getDirectors() {
		return directors;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", year=" + year + "]";
	}

}