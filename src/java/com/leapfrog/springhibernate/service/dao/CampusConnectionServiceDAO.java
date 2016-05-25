/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.service.dao;

import com.leapfrog.springhibernate.entity.CampusConnection;
import java.util.List;

/**
 *
 * @author root
 */
public interface CampusConnectionServiceDAO {

    void insert(CampusConnection c);

    void update(CampusConnection c);

    void delete(int id);

    List<CampusConnection> getAll();

    CampusConnection getById(int id);
}
