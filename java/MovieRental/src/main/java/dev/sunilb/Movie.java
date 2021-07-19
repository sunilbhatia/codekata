package dev.sunilb;

public class Movie {
    private int movieId;

    public Movie(int movieId) {
        loadMovie(movieId);
    }

    private void loadMovie(int movieId) {
        this.movieId = movieId;
        // Other logic to fetch from database via an aggregate
    }


    public int getMovieId() {
        return movieId;
    }
}
