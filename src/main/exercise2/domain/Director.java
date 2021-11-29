package main.exercise2.domain;

public class Director {
	private int id;
	private String name;
	private String imdb;

	public Director() {
	}

	public Director(int id, String name, String imdb) {
		this.id = id;
		this.name = name;
		this.imdb = imdb;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getImdb() {
		return imdb;
	}

	@Override
	public String toString() {
		return "Director [id=" + id + ", name=" + name + ", imdb=" + imdb + "]";
	}

}
