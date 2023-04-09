package com.alibaba.readinglist.repository;

import com.alibaba.readinglist.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingListRepository extends JpaRepository<Book,Long> {
}
