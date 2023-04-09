package com.alibaba.readinglist.controller;

import com.alibaba.readinglist.entity.Book;
import com.alibaba.readinglist.entity.Reader;
import com.alibaba.readinglist.repository.ReadingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReadingListController {

    @Autowired
    ReadingListRepository readingListRepository;
    @RequestMapping(method= RequestMethod.POST)
    public String addToReadingList(Book book, Reader reader) {
        book.setReader(String.valueOf(reader));
        readingListRepository.save(book);
        return "redirect:/readingList";
    }
}
