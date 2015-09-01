package me.gacl.dao;

import me.gacl.model.User;

import java.io.Serializable;

public interface IUserDao {

    /**
     * 保存用户
     *
     * @param user
     * @return
     */
    Serializable save(User user);
}