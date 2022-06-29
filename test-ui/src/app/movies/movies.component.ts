import { Component, OnInit } from '@angular/core';
import { MoviesService } from '../movies.service';
import { Movie, Rating } from '../models/models';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {

  constructor(private moviesService: MoviesService) { }

  movies: Movie[];

  ngOnInit(): void {
    this.moviesService.getAllMovies().subscribe((movies: Movie[]) => {
      this.movies = movies;
      console.log(this.movies[0].actors[0].name);
    })
  }

  getRating(ratings: Rating[]): number {
    let rating = 0;
    ratings.forEach(r => rating+=r.rating);
    return rating / ratings.length;
  }
}
