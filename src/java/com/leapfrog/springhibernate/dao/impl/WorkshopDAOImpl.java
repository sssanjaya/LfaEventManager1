/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.dao.impl;

import com.leapfrog.springhibernate.dao.WorkshopDAO;
import com.leapfrog.springhibernate.entity.Workshop;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author root
 */
public class WorkshopDAOImpl implements WorkshopDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;
    
    @Override
    public void insert(Workshop w) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.save(w);
        trans.commit();
        session.close();
    }
    
    @Override
    public void update(Workshop w) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.saveOrUpdate(w);
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
    public List<Workshop> getAll() {
      session=sessionFactory.openSession();
      List<Workshop> workshopList = session.getNamedQuery("Workshop.findAll").list();
      return workshopList;
    }
    
    @Override
    public Workshop getById(int id) {
        session = sessionFactory.openSession();
        Workshop workshop = (Workshop) session.get(Workshop.class, id);
        return workshop;
    }
    
}
