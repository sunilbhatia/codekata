package dev.sunilb;

public class MovieRentalReceipt {

    private int receiptId;
    private int movieId;


    public int getReceiptId() {
        return this.receiptId;
    }

    public int getMovieId() {
        return this.movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
    }
}
