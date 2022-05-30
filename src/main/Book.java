package main;

public class Book {

    private int quantityOfPages;
    private Genre genre;
    private String name;
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(String name) {
        this.name = name;
    }

    public Book(int quantityOfPages, Genre genre) {
        this.quantityOfPages = quantityOfPages;
        this.genre = genre;
    }

    public Book() {}

    public Book(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

    public String toString(){
        //return "Book \"" + name + "\" have " + quantityOfPages + " pages (" + genre + ").";
        return ("name: " + name + ", quantityOfPages: " + quantityOfPages + ", genre: " + genre + ", author: " + author.getName());
    }

    public void timeOfReeding () {
        double doubleQuantityOfPages = quantityOfPages;
        int quantityOfDays = (int) Math.ceil(doubleQuantityOfPages / 300);
        if (quantityOfDays == 1)
            System.out.println(quantityOfDays + " day");
        else
            System.out.println(quantityOfDays + " days");
    }

}
