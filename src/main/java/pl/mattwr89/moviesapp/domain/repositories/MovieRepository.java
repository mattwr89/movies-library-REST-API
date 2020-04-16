package pl.mattwr89.moviesapp.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mattwr89.moviesapp.domain.entities.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
