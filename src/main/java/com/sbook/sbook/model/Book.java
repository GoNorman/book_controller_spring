package com.sbook.sbook.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)

    private Integer id;

    String nameOfBook;

    private String author;

    private String genre;

    private LocalDate year;

    Boolean read;

    private Book() {

    }

     public Book(String nameOfBook, String author, String genre, LocalDate year, Boolean read) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.read = read;
    }

    public Integer getId() {
        return this.id;
    }

    public Boolean getRead() {
        return read;
    }

    public LocalDate getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

}
