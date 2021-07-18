package dev.sunilb;

public class MovieLibrary {

    public static MovieRentalReceipt rentMovie(Movie movie) {

        MovieRentalReceipt movieRentalReceipt = new MovieRentalReceipt();
        movieRentalReceipt.setReceiptId(1);
        movieRentalReceipt.setMovieId(100);

        return movieRentalReceipt;

    }
}
