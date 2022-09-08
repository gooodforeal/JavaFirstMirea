package ru.mirea.task3;


class Book {
    private String name;
    private String author;
    private int year;
    private int pages;

    Book(String argName, String argAuthor, int argYear, int argPages) {
        name = argName;
        author = argAuthor;
        year = argYear;
        pages = argPages;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Book: name=" + name + ", year=" + year + ", author=" + author + ", pages=" + pages;
    }
}


public class BookTest {
    public static void main(String[] args) {
        Book objectBook = new Book("Том Соер", "Иван", 1900, 1000);
        objectBook.setAuthor("Марк Твен");
        objectBook.setYear(1876);
        System.out.println("Книга " + objectBook.getName());
        System.out.println(objectBook.toString());
    }
}
