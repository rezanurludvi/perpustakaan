package com.sinaukoding.perpustakaan.controller;

import com.sinaukoding.perpustakaan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("loans")
public class LoanController extends BaseController {

    @Autowired
    private LoanService service;
}
