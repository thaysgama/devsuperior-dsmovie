package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MovieDto {

    private Long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;

    public MovieDto(Movie movie) {
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.score = movie.getScore();
        this.count = movie.getCount();
        this.image = movie.getImage();
    }
}
