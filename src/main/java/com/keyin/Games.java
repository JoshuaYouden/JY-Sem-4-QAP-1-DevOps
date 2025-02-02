package com.keyin;

public class Games {
    private String title;
    private double price;
    private String genre;
    private int amount;
    private String ageRating;

    public Games(String title, double price, String genre, int amount, String ageRating) {
        this.title = title;
        this.price = price;
        this.genre = genre;
        this.amount = amount;
        this.ageRating = ageRating;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    public int getAmount() {
        return amount;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setAgeRating(String gameRating) {
        this.ageRating = gameRating;
    }

    @Override
    public String toString() {
        return "Games{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", amount=" + amount +
                ", Age Rating='" + ageRating + '\'' +
                '}';
    }
}
