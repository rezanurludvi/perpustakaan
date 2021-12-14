package com.sinaukoding.perpustakaan.service;

import com.sinaukoding.perpustakaan.dao.BaseDAO;
import com.sinaukoding.perpustakaan.dao.UserDAO;
import com.sinaukoding.perpustakaan.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User> {

    @Autowired
    private UserDAO dao;

    @Override
    protected BaseDAO<User> getDAO() {
        return dao;
    }
}
