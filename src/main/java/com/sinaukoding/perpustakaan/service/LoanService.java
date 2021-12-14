package com.sinaukoding.perpustakaan.service;

import com.sinaukoding.perpustakaan.dao.BaseDAO;
import com.sinaukoding.perpustakaan.dao.LoanDAO;
import com.sinaukoding.perpustakaan.entity.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService extends BaseService<Loan> {

    @Autowired
    private LoanDAO dao;

    @Override
    protected BaseDAO<Loan> getDAO() {
        return dao;
    }
}
