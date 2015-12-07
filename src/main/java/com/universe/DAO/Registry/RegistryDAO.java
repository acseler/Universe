package com.universe.DAO.Registry;

import com.universe.DAO.tools.TableIdHelper;
import com.universe.Entity.Account;
import com.universe.Entity.Login;
import com.universe.Entity.Universe;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by boduill on 23.09.15.
 */
@Repository
public class RegistryDAO {

    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private TableIdHelper tableIdHelper;
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public void createAccount(Account account, Login login) {
        hibernateTemplate.persist(login);
    }
}
