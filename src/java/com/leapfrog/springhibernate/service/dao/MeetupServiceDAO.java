/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.service.dao;

import com.leapfrog.springhibernate.entity.Meetup;
import java.util.List;

/**
 *
 * @author root
 */
public interface MeetupServiceDAO {

    void insert(Meetup m);

    void update(Meetup m);

    void delete(int id);

    List<Meetup> getAll();

    Meetup getById(int id);
}
