package Collections;

public class Book {

    String author;
    String name;
    int year;

    public Book(String author, String name, int year) {
        this.author=author;
        this.name=name;
        this.year=year;
    }

    String doReadBook(){
        return "книга прочитана " + author + ". " + name + ", " + year;
    }




}
