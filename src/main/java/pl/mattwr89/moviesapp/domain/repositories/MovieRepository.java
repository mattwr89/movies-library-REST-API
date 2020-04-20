package pl.mattwr89.moviesapp.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mattwr89.moviesapp.domain.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
