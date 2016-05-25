/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.dao.impl;

import com.leapfrog.springhibernate.dao.MeetupDAO;
import com.leapfrog.springhibernate.entity.Meetup;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author root
 */
public class MeetupDAOImpl implements MeetupDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;
    
    @Override
    public void insert(Meetup m) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.save(m);
        trans.commit();
        session.close();
    }
    
    @Override
    public void update(Meetup m) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.saveOrUpdate(m);
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
    public List<Meetup> getAll() {
       session=sessionFactory.openSession();
       List<Meetup> meetupList = session.getNamedQuery("Meetup.findAll").list();
       return meetupList;
    }
    
    @Override
    public Meetup getById(int id) {
        session = sessionFactory.openSession();
        Meetup meetup = (Meetup) session.get(Meetup.class, id);
        return meetup;
    }
    
}
