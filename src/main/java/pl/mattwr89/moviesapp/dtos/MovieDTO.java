package pl.mattwr89.moviesapp.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MovieDTO {


    private String title;
    private LocalDate produce;
}
