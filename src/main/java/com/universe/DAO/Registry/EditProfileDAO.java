package com.universe.DAO.Registry;

import com.universe.Entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by boduill on 14.12.15.
 */
@Repository
public class EditProfileDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public void changeUserProfile(Account account) {
        hibernateTemplate.update(account);
    }
}