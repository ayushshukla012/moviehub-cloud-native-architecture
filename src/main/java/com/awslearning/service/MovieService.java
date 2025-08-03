package com.awslearning.service;

import com.awslearning.domain.Genre;
import com.awslearning.dto.MovieDto;
import com.awslearning.mapper.EntityDtoMapper;
import com.awslearning.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDto> getAll() {
        return this.movieRepository.findAll()
                .stream()
                .map(EntityDtoMapper::toDto)
                .toList();
    }

    public List<MovieDto> getAll(Genre genre) {
        return this.movieRepository.findByGenre(genre)
                .stream()
                .map(EntityDtoMapper::toDto)
                .toList();
    }
}
