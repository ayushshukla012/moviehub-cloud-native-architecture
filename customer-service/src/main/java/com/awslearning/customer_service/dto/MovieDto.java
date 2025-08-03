package com.awslearning.customer_service.dto;


import com.awslearning.customer_service.domain.Genre;

public record MovieDto(Integer id,
                       String title,
                       Integer releaseYear,
                       Genre genre) {
}
