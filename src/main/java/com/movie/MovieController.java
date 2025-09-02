package com.movie;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    // 전체 영화 목록 조회
    @GetMapping("/고쳐주세요")
    public List<Movie> getAllMovies() {
        return MovieList.getAll();
    }

    // 영화 저장
    @PostMapping("/고쳐주세요")
    public void createMovie(@RequestBody Movie movie) {
        MovieList.add(movie);
    }

    // 영화 삭제
    @DeleteMapping("/movies/{title}")
    public void deleteMovie(@PathVariable String title) {
        MovieList.removeByTitle(title);
    }
}
