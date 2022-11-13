package com.intellitech.com.comparatorandcomparable;

import java.util.Comparator;

public class NameComaparator implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		return m1.getName().compareToIgnoreCase(m2.getName());
	}
}