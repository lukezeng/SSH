package me.gacl.dao;

import me.gacl.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/9/2.
 */
@Repository("baseDao")
public interface IBaseDao<T> {
    Serializable save(T o);
}
