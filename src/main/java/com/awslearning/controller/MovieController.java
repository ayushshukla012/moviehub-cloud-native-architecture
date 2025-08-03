package com.awslearning.controller;

import com.awslearning.domain.Genre;
import com.awslearning.dto.MovieDto;
import com.awslearning.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService service) {
        this.movieService = service;
    }

    @GetMapping
    public List<MovieDto> getAll() {
        return this.movieService.getAll();
    }


    @GetMapping("{genre}")
    public List<MovieDto> getAllByGenre(@PathVariable Genre genre) {
        return this.movieService.getAll(genre);
    }

}
