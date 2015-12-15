package com.universe.DAO.Registry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by boduill on 15.12.15.
 */
@Repository
public class FriendsDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public void addFriend() {

    }
}
