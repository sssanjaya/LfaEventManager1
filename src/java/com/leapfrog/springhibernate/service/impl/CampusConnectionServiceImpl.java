/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.service.impl;

import com.leapfrog.springhibernate.dao.CampusConnectionDAO;
import com.leapfrog.springhibernate.entity.CampusConnection;
import com.leapfrog.springhibernate.service.CampusConnectionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class CampusConnectionServiceImpl implements CampusConnectionService {

    @Autowired
    private CampusConnectionDAO campusConnectionDAO;

    @Override
    public void insert(CampusConnection c) {
        campusConnectionDAO.insert(c);
    }

    @Override
    public void update(CampusConnection c) {
        campusConnectionDAO.update(c);
    }

    @Override
    public void delete(int id) {
        campusConnectionDAO.delete(id);
    }

    @Override
    public List<CampusConnection> getAll() {
        return campusConnectionDAO.getAll();
    }

    @Override
    public CampusConnection getById(int id) {
        return campusConnectionDAO.getById(id);
    }

}
