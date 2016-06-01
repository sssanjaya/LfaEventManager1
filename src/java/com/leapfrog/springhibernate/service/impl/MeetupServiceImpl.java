/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.service.impl;

import com.leapfrog.springhibernate.dao.MeetupDAO;
import com.leapfrog.springhibernate.entity.Meetup;
import com.leapfrog.springhibernate.service.MeetupService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Service(value = "MeetupService")
public class MeetupServiceImpl implements MeetupService{

    @Autowired
    private MeetupDAO meetupDAO;
    
    @Override
    @Transactional
    public void insert(Meetup t) {
        meetupDAO.insert(t);
    }

    @Override
    public void update(Meetup t) {
       meetupDAO.update(t);
    }

    @Override
    public void delete(int id) {
       meetupDAO.delete(id);
    }

    @Override
    public List<Meetup> getAll() {
        return meetupDAO.getAll();
    }

    @Override
    public Meetup getById(int id) {
       return meetupDAO.getById(id);
    }
    
}
