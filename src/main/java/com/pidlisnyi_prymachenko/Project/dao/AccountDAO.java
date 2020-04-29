package com.pidlisnyi_prymachenko.Project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.pidlisnyi_prymachenko.Project.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class AccountDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Account findAccount(String userName) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.find(Account.class, userName);
    }

}