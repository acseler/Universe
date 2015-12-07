package com.universe.DAO.Registry;

import com.universe.Entity.Account;
import com.universe.Entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by boduill on 07.12.15.
 */
@Repository
public class Logining {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public Account checkLoginAndPassword(String login, String password) {
        Login loginEn = hibernateTemplate.get(Login.class, login);
        if (loginEn.equals(login) && loginEn.equals(password)) {
            return loginEn.getAccount();
        }
        return null;
    }
}
