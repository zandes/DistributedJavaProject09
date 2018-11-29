package us.zachandes.first.controllers;

public class Movie {
    private String rating;
    private String genre;

    public Movie(String rating, String genre){
        this.rating = rating;
        this.genre = genre;
    }

    public Movie(){

    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
