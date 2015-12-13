package com.universe.DAO.Registry;

import com.universe.Entity.Account;
import com.universe.Entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by boduill on 07.12.15.
 */
@Repository
public class Logining {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public Account checkLoginAndPassword(String login, String password) {
        Login loginEn = null;
        if (login.isEmpty() || password.isEmpty()) {
            return null;
        } else {
            loginEn = hibernateTemplate.get(Login.class, login);
        }
        if (loginEn.getLogin().equals(login) && loginEn.getPassword().equals(password)) {
            return loginEn.getAccount();
        }
        return null;
    }


}
