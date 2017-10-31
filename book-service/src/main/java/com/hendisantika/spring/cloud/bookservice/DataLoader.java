package com.hendisantika.spring.cloud.bookservice;

import com.hendisantika.spring.cloud.bookservice.book.Book;
import com.hendisantika.spring.cloud.bookservice.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-cloud-bootstrap
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 31/10/17
 * Time: 07.40
 * To change this template use File | Settings | File Templates.
 */

@Component
public class DataLoader implements ApplicationRunner{
    private BookService bookService;

    @Autowired
    public DataLoader(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        this.bookService.createBook(new Book("Hendi Santika", "Dasar-dasar Pemrograman Java"));
        this.bookService.createBook(new Book("Endy Muhardin", "Microservices dengan Spring Cloud"));
    }
}
