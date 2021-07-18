package dev.sunilb;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RentMovieTest {

    /*Rent a movie assuming that it is available*/

    @Test
    public void rentMovieWhenAvailable() {
        Movie movie = new Movie();
        MovieRentalReceipt movieRentalReceipt = MovieLibrary.rentMovie(movie);
        assertEquals(movieRentalReceipt.getReceiptId(), 1);
        assertEquals(movieRentalReceipt.getMovieId(), 100);
    }

    /*Rent a movie when it is not available*/
    /*Rent a movie when it is available given age restrictions*/

}
