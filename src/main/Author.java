package main;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Author {

    private String name;
    private String dateOfBirth;
    private String countryOfBirth;
    private Book bestBook;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public Book getBestBook() {
        return bestBook;
    }

    public void setBestBook(Book bestBook) {
        this.bestBook = bestBook;
    }

    public Author(String name, String dateOfBirth, String countryOfBirth, Book bestBook) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.countryOfBirth = countryOfBirth;
        this.bestBook = bestBook;
    }

    public Author() {}

    public String toString(){
        return ("name: " + name + ", dateOfBirth: " + dateOfBirth + ", countryOfBirth: " + countryOfBirth + ", bestBook: " + bestBook.getName());
    }

    public int HowOldAuthor(){
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.MM.yyyy");
//        LocalDate LocalDateOfBirth = LocalDate.parse(dateOfBirth, formatter);
//        return Period.between(LocalDateOfBirth ,LocalDate.now()).getYears();

        return Period.between(LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("d.MM.yyyy")) ,LocalDate.now()).getYears();
    }


}
