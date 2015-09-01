package me.gacl.service;

import me.gacl.model.User;

import java.io.Serializable;

public interface IUserService {
    void test();

    Serializable save(User user);
}