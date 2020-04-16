package pl.mattwr89.moviesapp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import pl.mattwr89.moviesapp.domain.entities.Movie;
import pl.mattwr89.moviesapp.services.impl.DefaultMovieService;


import java.util.Optional;

@RestController
@RequestMapping("/api/movies") @Slf4j
public class MovieApiController {

    private DefaultMovieService defaultMovieService;

    public MovieApiController(DefaultMovieService defaultMovieService) {
        this.defaultMovieService = defaultMovieService;
    }

    @GetMapping("/all")
    public Iterable<Movie> getAll(){
        return  defaultMovieService.findAll();

    }

    @GetMapping
    public Optional <Movie> getById(@RequestParam Long index){

        return defaultMovieService.findById(index);

    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie){
        return defaultMovieService.save(movie);

    }

    @PutMapping
    public Movie updateMovie(@RequestBody Movie movie){
        return defaultMovieService.save(movie);

    }

    @DeleteMapping
    public void deleteMovie(@RequestParam Long index){
       defaultMovieService.deleteById(index);

    }
}


