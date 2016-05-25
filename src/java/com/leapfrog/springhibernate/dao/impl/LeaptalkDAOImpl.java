/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.dao.impl;

import com.leapfrog.springhibernate.dao.LeaptalkDAO;
import com.leapfrog.springhibernate.entity.Leaptalk;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author root
 */
public class LeaptalkDAOImpl implements LeaptalkDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;
    
    @Override
    public void insert(Leaptalk l) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.save(l);
        trans.commit();
        session.close();
    }
    
    @Override
    public void update(Leaptalk l) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.saveOrUpdate(l);
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
    public List<Leaptalk> getAll() {
        session=sessionFactory.openSession();
        List<Leaptalk> leaptalkList = session.getNamedQuery("Leaptalk.findAll").list();
        return leaptalkList;
    }
    
    @Override
    public Leaptalk getById(int id) {
        session = sessionFactory.openSession();
        Leaptalk leaptalk = (Leaptalk) session.get(Leaptalk.class, id);
        return leaptalk;
    }
    
}
