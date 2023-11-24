package cz.filipvojtech.classes_from_michelle;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }

    public static Book parse(String text){
        String [] components = text.split("%%");
        if(components.length == 3) {
            String title = components[0];
            String author = components[1];
            int pageCount;
            try{
                 pageCount = Integer.parseInt(components[2]);
            }catch(NumberFormatException e){
                System.out.println("Invalid page count information supplied for " + title + " by " + author + ".");
                pageCount = 0;
            }
            return new Book(title, author, pageCount);
        }
        return null;
    }

    @Override
    public int compareTo(Book o) {
        int comparison = this.title.compareTo(o.title);
        if(comparison == 0){
            return this.author.compareTo(o.author);
        }
        return comparison;
    }
}
