package pl.mattwr89.moviesapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.mattwr89.moviesapp.model.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movies/")
public class MovieApiController {

    private  List<Movie> movies;


    public MovieApiController() {
       movies = new ArrayList<>();
       movies.add(new Movie(1L,"John Wick", LocalDate.of(2014,1,5)));
       movies.add(new Movie(1L,"Django", LocalDate.of(2012,5,17)));
       movies.add(new Movie(1L,"Rambo", LocalDate.of(1982,11,3)));
    }

    @GetMapping("/all")
    public List<Movie> getAll(){
        return movies;

    }

    @GetMapping
    public Movie getById(@RequestParam int index){
        Optional<Movie> first = movies.stream().
                filter(element -> element.getId() == index).findFirst();
        return first.get();

    }
}
