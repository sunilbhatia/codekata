package dev.sunilb;

public class MovieRentalReceipt {

    private int receiptId;
    private Movie movie;

    public MovieRentalReceipt(Movie movie) {
        this.setReceiptId(1);
        this.movie = movie;
    }

    public int getReceiptId() {
        return this.receiptId;
    }

    public int getMovieId() {
        return this.movie.getMovieId();
    }

    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
    }
}
