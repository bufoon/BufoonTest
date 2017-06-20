package com.bufoon.test;

public class Movie {
	private Integer rank;
	private String description;

	public Movie(Integer rank, String description) {
		super();
		this.rank = rank;
		this.description = description;
	}

	public Integer getRank() {
		return rank;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return this.rank + "|" + this.description;
	}
}
