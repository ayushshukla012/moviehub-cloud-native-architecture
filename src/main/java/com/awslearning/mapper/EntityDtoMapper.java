package com.awslearning.mapper;

import com.awslearning.dto.MovieDto;
import com.awslearning.entity.Movie;

public class EntityDtoMapper {

    public static MovieDto toDto(Movie movie) {
        return new MovieDto(
                movie.getId(),
                movie.getTitle(),
                movie.getReleaseYear(),
                movie.getGenre()
        );
    }
}
