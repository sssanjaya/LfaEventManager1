/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.dao.impl;

import com.leapfrog.springhibernate.dao.CampusConnectionDAO;
import com.leapfrog.springhibernate.entity.CampusConnection;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author root
 */
@Repository(value = "CampusConnectoinDAO")
public class CampusConnectionDAOImpl implements CampusConnectionDAO {

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;

    @Override
    public void insert(CampusConnection c) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.save(c);
        trans.commit();
        session.close();
    }

    @Override
    public void update(CampusConnection c) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.saveOrUpdate(c);
        trans.commit();
        session.close();
    }

    @Override
    public void delete(int id) {
        session=sessionFactory.openSession();
        session.delete(getById(id));
        session.close();
    }

    @Override
    public List<CampusConnection> getAll() {
       session=sessionFactory.openSession();
       List<CampusConnection> campList = session.getNamedQuery("CampusConnection.findAll").list();
       return campList;
    }

    @Override
    public CampusConnection getById(int id) {
       session = sessionFactory.openSession();
       CampusConnection camp = (CampusConnection) session.get(CampusConnection.class, id);
       return camp;
    }

}
