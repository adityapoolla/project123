import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MoviesService {

  constructor(private http: HttpClient) { }

  BASE_URL = "http://localhost:8080/api";

  getAllMovies(){
    return this.http.get(this.BASE_URL + "/movies");
  }
}
