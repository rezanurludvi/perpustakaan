package com.sinaukoding.perpustakaan.common;

public interface StatusCode {

    String SAVE_SUCCESS = "201";
    String SAVE_FAILED = "401";
    String UPDATE_SUCCESS = "201";
    String UPDATE_FAILED = "401";
    String DELETE_SUCCESS = "202";
    String DELETE_FAILED = "401";

    String OPERATION_SUCCESS = "200";
    String OPERATION_FAILED = "400";

    String PASSWORD_OR_USER_NOT_REGISTERED = "415";
    String LOGIN_SUCCESS = "211";
    String LOGIN_FAILED = "212";
}
