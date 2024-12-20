/*
/ Contributor: Samuel Vaughn
/ Date: 12/3/2024
/ Class: C211 Final Project
/Description: Stub for the Game class, representing individual game objects in the library.
/
 */
package com.c211docoolstuff.c211finalproject2; 


public class Game {

    // Attributes
    private String title;
    private String genre;
    private String console;
    private int yearAwarded;
    private int numAvail;
    private int numRented;
    private double price;
    public ImageObject coverImage;

    // Basic constructor to initialize the game with all fields
    public Game(String title, String genre, String console, int yearAwarded, int numAvail, int numRented,
            double price, ImageObject cover) {
        this.title = title;
        this.genre = genre;
        this.console = console;
        this.yearAwarded = yearAwarded;
        this.numAvail = numAvail;
        this.numRented = numRented;
        this.price = price;
        this.coverImage = cover;
    }

    // Default constructor to create a game with default values
    public Game() {
        this.title = "Unknown";
        this.genre = "Unknown";
        this.console = "Unknown";
        this.yearAwarded = 0;
        this.numAvail = 0;
        this.numRented = 0;
        this.price = 0.0;
        this.coverImage = null;
    }

    // Getter and Setter methods
    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for genre
    public String getGenre() {
        return genre;
    }

    // Setter for genre
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Getter for console
    public String getConsole() {
        return console;
    }

    // Setter for console
    public void setConsole(String console) {
        this.console = console;
    }

    // Getter for yearPublished
    public int getYearAwarded() {
        return yearAwarded;
    }

    // Setter for yearPublished
    public void setYearAwardedd(int yearAwarded) {
        this.yearAwarded = yearAwarded;
    }

    // Getter for numAvail
    public int getNumAvail() {
        return numAvail;
    }

    // Setter for numAvail
    public void setNumAvail(int numAvail) {
        this.numAvail = numAvail;
    }

    // Getter for numRented
    public int getNumRented() {
        return numRented;
    }

    // Setter for numRented
    public void setNumRented(int numRented) {
        this.numRented = numRented;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        String output = "Game Title: " + this.title + "\n";
        output += "Genre: " + this.genre + "\n";
        output += "Console: " + this.console + "\n";
        output += "Year Awarded: " + this.yearAwarded + "\n";
        output += "Number of Copies Available: " + this.numAvail + "\n";
        output += "Number of Copies Rented: " + this.numRented + "\n";
        output += "Price: $" + this.price + "\n";
        return output;
    }

} // close class
