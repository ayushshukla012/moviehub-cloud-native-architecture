package com.awslearning.customer_service.dto;

import com.awslearning.customer_service.domain.Genre;

public record GenreUpdateRequest(Genre favoriteGenre) {
}