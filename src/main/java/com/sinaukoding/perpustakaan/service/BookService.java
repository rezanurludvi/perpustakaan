package com.sinaukoding.perpustakaan.service;

import com.sinaukoding.perpustakaan.dao.BaseDAO;
import com.sinaukoding.perpustakaan.dao.BookDAO;
import com.sinaukoding.perpustakaan.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService extends BaseService<Book> {

    @Autowired
    private BookDAO dao;

    @Override
    protected BaseDAO<Book> getDAO() {
        return dao;
    }
}
