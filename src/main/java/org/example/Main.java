package org.example;

import Conf.Conf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        Library library = context.getBean(Library.class);

        // Добавляем еще книги
        library.addBook(new Book("Abay zholy", "Muhtar Ayezov"));
        library.addBook(new Book("Magya utra", "Khel Elrod"));

        System.out.println(library);
    }
}
