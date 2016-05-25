/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.dao.impl;

import com.leapfrog.springhibernate.dao.StudentDAO;
import com.leapfrog.springhibernate.entity.Student;
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
@Repository(value="StudentDAO")
public class StudentDAOImpl implements StudentDAO{
    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;
    @Override
    public void insert(Student s) {
       session = sessionFactory.openSession();
       trans=session.beginTransaction();
       session.save(s);
       trans.commit();
       session.close();
    }

    @Override
    public void update(Student s) {
       session = sessionFactory.openSession();
       trans=session.beginTransaction();
       session.saveOrUpdate(s);
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
    public List<Student> getAll() {
        session=sessionFactory.openSession();
       List<Student> studentList= session.getNamedQuery("Student.findAll").list();
       return studentList;
    }
 
    @Override
    public Student getById(int id) {
        session=sessionFactory.openSession();
        Student student=(Student) session.get(Student.class, id);
       // session.close();
        return student;
    }
    
}
