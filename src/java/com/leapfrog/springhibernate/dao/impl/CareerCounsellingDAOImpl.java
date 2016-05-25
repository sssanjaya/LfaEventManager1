/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.dao.impl;

import com.leapfrog.springhibernate.dao.CareerCounsellingDAO;
import com.leapfrog.springhibernate.entity.CareerCounselling;
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
@Repository(value = "CareerCounsellingDAO")
public class CareerCounsellingDAOImpl implements CareerCounsellingDAO {

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;

    @Override
    public void insert(CareerCounselling cc) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.save(cc);
        trans.commit();
        session.close();
    }

    @Override
    public void update(CareerCounselling cc) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.saveOrUpdate(cc);
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
    public List<CareerCounselling> getAll() {
        session=sessionFactory.openSession();
        List<CareerCounselling> careerList=session.getNamedQuery("CareerCounselling.findAll").list();
        return careerList;
    }

    @Override
    public CareerCounselling getById(int id) {
        session = sessionFactory.openSession();
        CareerCounselling career = (CareerCounselling) session.get(CareerCounselling.class, id);
        return career;
    }

}
