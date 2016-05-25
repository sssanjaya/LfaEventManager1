/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.service.impl;

import com.leapfrog.springhibernate.dao.CareerCounsellingDAO;
import com.leapfrog.springhibernate.entity.CareerCounselling;
import com.leapfrog.springhibernate.service.CareerCounsellingService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class CareerCounsellingServiceImpl implements CareerCounsellingService {

    @Autowired
    private CareerCounsellingDAO careerCounsellingDAO;

    @Override
    public void insert(CareerCounselling cc) {
        careerCounsellingDAO.insert(cc);
    }

    @Override
    public void update(CareerCounselling cc) {
        careerCounsellingDAO.update(cc);
    }

    @Override
    public void delete(int id) {
        careerCounsellingDAO.delete(id);
    }

    @Override
    public List<CareerCounselling> getAll() {
        return careerCounsellingDAO.getAll();
    }

    @Override
    public CareerCounselling getById(int id) {
        return careerCounsellingDAO.getById(id);
    }

}
