package com.alibaba.readinglist.repository;

import com.alibaba.readinglist.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader, Long> {
}
