package dev.sunilb;

public class MovieLibrary {

    public static MovieRentalReceipt rentMovie(int movieId) {
        Movie movie = getMovieById(movieId);
        MovieRentalReceipt movieRentalReceipt = new MovieRentalReceipt(movie);
        return movieRentalReceipt;
    }

    private static Movie getMovieById(int movieId) {
        Movie movie = new Movie(movieId);
        return movie;
    }

}
