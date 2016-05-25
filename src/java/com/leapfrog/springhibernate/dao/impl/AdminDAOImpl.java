/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.dao.impl;

import com.leapfrog.springhibernate.dao.AdminDAO;
import com.leapfrog.springhibernate.entity.Admin;
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
@Repository(value = "AdminDAO")
public class AdminDAOImpl implements AdminDAO {

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;

    @Override
    public void insert(Admin a) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.save(a);
        trans.commit();
        session.close();
    }

    @Override
    public void update(Admin a) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.saveOrUpdate(a);
        trans.commit();
        session.close();
    }

    @Override
    public void delete(int id) {
        session=sessionFactory.openSession();
        trans=session.beginTransaction();
        session.delete(getById(id));
        trans.commit();
        session.close();
    }

    @Override
    public List<Admin> getAll() {
        session=sessionFactory.openSession();
        List<Admin> adminList = session.getNamedQuery("Admin.findAll").list();
        session.close();
        return adminList;
    }

    @Override
    public Admin getById(int id) {
       session=sessionFactory.openSession();
       Admin admin = (Admin) session.get(Admin.class, id);
       return admin;
    }

}
