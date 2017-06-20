package com.bufoon.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class Test {

	static List<Movie> movies = new ArrayList<Movie>(); 
	public static void convert_list_to_map_with_java () {  
	    long start = System.currentTimeMillis();  
	    Map<Integer, Movie> mappedMovies = new HashMap<Integer, Movie>();  
	    for (Movie movie : movies) {  
	        mappedMovies.put(movie.getRank(), movie);  
	    }  
	    System.out.println("普通： " + (System.currentTimeMillis()-start) + " ,sizez: " + mappedMovies.entrySet().size());
	}  
	
	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			 movies.add(new Movie(i, "h" + i));  
		}
		Test.convert_list_to_map_with_java();
		Test.convert_list_to_map_with_java8_lambda();
		Test.convert_list_to_map_with_guava();
		
	}
	
	public static void convert_list_to_map_with_java8_lambda () {  
		long start = System.currentTimeMillis();    
	    Map<Integer, Movie> mappedMovies = movies.stream().collect(  
	            Collectors.toMap(Movie::getRank, (p) -> p));  
	    System.out.println("stream： " + (System.currentTimeMillis()-start));
	} 
	
	public static void convert_list_to_map_with_guava () {  
		  
		long start = System.currentTimeMillis();    
	    Map<Integer,Movie> mappedMovies = Maps.uniqueIndex(movies, new Function <Movie,Integer> () {  
	          public Integer apply(Movie from) {  
	            return from.getRank();   
	    }});  
	    System.out.println("guava： " + (System.currentTimeMillis()-start));  
	} 
	
}
