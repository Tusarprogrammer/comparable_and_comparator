package com.intellitech.com.comparatorandcomparable;

import java.util.Comparator;

public class IdComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		if(m1.getYear()==m2.getYear()) {
    		return m1.getName().compareToIgnoreCase(m2.getName());
    	} else if(m1.getYear() > m2.getYear()) {
    		return 1;
    	}else {
    		return -1;
    	}
	}

}
