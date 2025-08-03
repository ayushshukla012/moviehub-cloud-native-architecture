package com.awslearning;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Import;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;

import java.net.URI;
import java.util.List;

import com.awslearning.domain.Genre;
import com.awslearning.dto.MovieDto;

@Import(TestcontainersConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AwsMovieServiceApplicationTests {

    private static final Logger log = (Logger) LoggerFactory.getLogger(AwsMovieServiceApplicationTests.class);

    @Autowired
    private TestRestTemplate template;

    @Test
    public void health() {
        var responseEntity = this.template.getForEntity("/actuator/health", Object.class);
        Assertions.assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
    }

    @Test
    void allMovies() {
        var movies = getMovies("/api/movies");
        Assertions.assertFalse(movies.isEmpty(), "Movies list should not be empty");
        Assertions.assertEquals(6, movies.size());
    }

    void moviesByGenre() {
        var movies = getMovies("/api/movies/ACTION");
        Assertions.assertFalse(movies.isEmpty(), "Movies list should not be empty");
        Assertions.assertEquals(3, movies.size());
        Assertions.assertTrue(movies.stream().map(MovieDto::genre).allMatch(Genre.ACTION::equals)); // Ensure all movies are of ACTION genre
    }

    private List<MovieDto> getMovies(String uri) {
        var requestEntity = new RequestEntity<>(HttpMethod.GET, URI.create(uri));
        var responseEntity = this.template.exchange(requestEntity, new ParameterizedTypeReference<List<MovieDto>>() {
        });
        log.info("response: {}" + responseEntity.getBody());
        Assertions.assertNotNull(responseEntity.getBody());
        return responseEntity.getBody();
    }

}
