package pl.mattwr89.moviesapp.services.impl;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.mattwr89.moviesapp.domain.entities.Movie;
import pl.mattwr89.moviesapp.domain.repositories.MovieRepository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Optional;

@Service
@Transactional
public class DefaultMovieService {

    private final MovieRepository movieRepository;

    public DefaultMovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    public Optional<Movie> findById (Long id) {
        return movieRepository.findById(id);

    }

    public Iterable<Movie> findAll () {
        return movieRepository.findAll();

    }

    public Movie save (Movie movie) {
        return movieRepository.save(movie);

    }

    public void deleteById (Long id) {
        movieRepository.deleteById(id);

    }

    @EventListener(ApplicationReadyEvent.class)
    public void updateDB(){
        save(new Movie(1L,"Django", LocalDate.of(2012,5,17)));
        save(new Movie(2L,"John Wick", LocalDate.of(2014,9,21)));

    }

}
