package com.example.demo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.dao.ActorRepository;
import com.example.demo.dao.MovieRepository;
import com.example.demo.dao.RatingRepository;
import com.example.demo.model.Actor;
import com.example.demo.model.Movie;
import com.example.demo.model.Rating;

@Configuration
public class InitializeData implements ApplicationRunner{

	ActorRepository actorRepo;
	MovieRepository movieRepo;
	RatingRepository ratingRepo;
	public InitializeData(	ActorRepository actorRepo,
			MovieRepository movieRepo,
			RatingRepository ratingRepo) {
		this.actorRepo = actorRepo;
		this.movieRepo = movieRepo;
		this.ratingRepo = ratingRepo;
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Rating rating = new Rating();
		rating.setRating(4);
		this.ratingRepo.save(rating);
		
		Actor actor1 = new Actor();
		actor1.setName("NTR");
		actor1.setRoleType("Hero");
		this.actorRepo.save(actor1);
		
		Actor actor2 = new Actor();
		actor2.setName("Ram Charan");
		actor2.setRoleType("hero");
		this.actorRepo.save(actor2);
		
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
		movie.setDirector("Rajamouli");
		movie.setWriter("V. Vijayendra Prasad");
		movie.setProducer("D. V. V. Danayya");
		
		movieRepo.save(movie);
		
		
		Rating r = new Rating();
		r.setRating(4);
		this.ratingRepo.save(r);
		
		Actor a1 = new Actor();
		a1.setName("Mahesh");
		a1.setRoleType("Hero");
		this.actorRepo.save(a1);
		
		Actor a2 = new Actor();
		a2.setName("Keerthi Suresh");
		a2.setRoleType("Heroine");
		this.actorRepo.save(a2);
		
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
		movie.setDirector("Parasuram");
		movie.setWriter("Parasuram");
		movie.setProducer("Gopichand");
		movieRepo.save(movie2);
		
	}
}
