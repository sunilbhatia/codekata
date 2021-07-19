package dev.sunilb;


import org.testng.annotations.Test;

import static org.mockito.Mockito.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RentMovieTest {

    /*Rent a movie assuming that it is available*/
    @Test
    public void rentMovieWhenAvailable() {
        int movieId = 1;
        MovieRentalReceipt movieRentalReceipt = MovieLibrary.rentMovie(movieId);
        assertTrue(movieRentalReceipt.getReceiptId() > 0);
        assertEquals(movieRentalReceipt.getMovieId(), 1);
    }

    /*Rent a movie when it is not available*/
    /*Rent a movie when it is available given age restrictions*/

}
