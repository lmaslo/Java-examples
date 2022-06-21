package Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintBooks {

    public static void main(String[] arg) {
        Book war = new Book("Лев Толстой", "Война и мир", 1865);
        Book stupid = new Book("Федор Достоевский", "Идиот", 1868);
        Book master = new Book("Михаил Булгаков", "Мастер и Маргарита", 1928);
        Book remark = new Book("Эрих Мария Ремарк", "Три товарища", 1932);


        Book[] bookArray = new Book[]{war, stupid, master, remark};

        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i].doReadBook());
        }

        int index = 0;
        while (index < bookArray.length) {
            System.out.println("book " + bookArray[index].doReadBook());
            index++;
        }

         index = 0;
        do {
            System.out.println("book " + bookArray[index].doReadBook());
            index++;
        } while (index < bookArray.length);




        System.out.println("----------------------");

        List<Book> bookList = List.of(war, stupid, master, remark);

        for (Book book : bookList) {
            System.out.println(book.doReadBook());
        }

        System.out.println("----------------------");
        Set<Book> bookSet = Set.of(war, stupid, master, remark);

        for (Book book : bookSet) {
            System.out.println(book.doReadBook());
        }

        System.out.println("----------------------");
        Map<Integer, Book> booksMap = new HashMap<>() {{
            put(1, war);
            put(2, stupid);
            put(3, master);
            put(4, remark);
        }};

        for (Book value : booksMap.values()) {
            System.out.println(value.doReadBook());
        }

    }

}
