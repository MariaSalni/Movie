package ru.netology;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class MovieManager {

    private int defaultMovieLength = 10;
    private Movie[] movies = new Movie[0];


    public MovieManager(int customMovieLength) {
        if (customMovieLength > 0) {
            defaultMovieLength = customMovieLength;
        }
    }

    public void add (Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        //System.arraycopy(items, 0, tmp, 0, items.length);
        int lastMovie = tmp.length - 1;
        tmp[lastMovie] = movie;
        movies = tmp;
    }


    public Movie[] getLastAdd() {
        int moviesLength = movies.length;
        if (moviesLength < defaultMovieLength) {
            defaultMovieLength = moviesLength;
        }
        Movie[] customFilm = new Movie[defaultMovieLength];
        for (int i = 0; i < customFilm.length; i++) {
            int result = moviesLength - i - 1;
            customFilm[i] = movies [result];

        }
        return customFilm;
    }


}
