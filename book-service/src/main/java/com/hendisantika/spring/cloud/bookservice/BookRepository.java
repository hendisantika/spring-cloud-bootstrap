package com.hendisantika.spring.cloud.bookservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-cloud-bootstrap
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 31/10/17
 * Time: 07.34
 * To change this template use File | Settings | File Templates.
 */
public interface BookRepository extends JpaRepository<Book, Long>{
}
