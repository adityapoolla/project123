package com.example.demo.util;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Actor;
import com.example.demo.model.Movie;
import com.example.demo.model.Rating;

public class TestDummy {

	public static List<Movie> getMovies() {
		Rating rating = new Rating();
		rating.setRating(4);
		Actor actor1 = new Actor();
		actor1.setName("NTR");
		actor1.setRoleType("Hero");
		Actor actor2 = new Actor();
		actor2.setName("Ram Charan");
		actor2.setRoleType("hero");
		List<Rating> ratings = new ArrayList<>();
		ratings.add(rating);
		List<Actor> actors = new ArrayList<>();
		actors.add(actor1);
		actors.add(actor2);
		Movie movie = new Movie();
		movie.setTitle("RRR");
		movie.setGenre("Action");
		movie.setRatings(ratings);
		movie.setActors(actors);
		movie.setStoryLine("some good story line....");
		Rating r = new Rating();
		r.setRating(4);
		Actor a1 = new Actor();
		a1.setName("Mahesh");
		a1.setRoleType("Hero");
		Actor a2 = new Actor();
		a2.setName("Keerthi Suresh");
		a2.setRoleType("Heroine");
		List<Rating> ratings2 = new ArrayList<>();
		ratings2.add(r);
		List<Actor> actors2 = new ArrayList<>();
		actors2.add(a1);
		actors2.add(a2);
		
		Movie movie2 = new Movie();
		movie2.setTitle("Sarkaru Vari Pata");
		movie2.setGenre("Action");
		movie2.setRatings(ratings2);
		movie2.setActors(actors2);
		movie2.setStoryLine("some good story line....");
		
		List<Movie> movies = new ArrayList<>();
		movies.add(movie);
		movies.add(movie2);
		return movies;
		
	}
}
