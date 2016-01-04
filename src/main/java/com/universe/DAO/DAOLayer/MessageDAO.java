package com.universe.DAO.DAOLayer;

import com.universe.Entity.Account;
import com.universe.Entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by boduill on 04.01.16.
 */
@Repository
public class MessageDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public List<Message> getMessages(Account account) {
        return (List<Message>) hibernateTemplate.find("FROM Message WHERE to_user = ?", account.getId());
    }
}
