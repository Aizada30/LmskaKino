package models.service;

import models.Movie;

import java.util.List;

public interface SortAble {

    void sortByMovieName(List<Movie>movies);
    void sortByMovieYear(List<Movie>movies);
    void sortByDirektor(List<Movie>movies);
}
