/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.service.dao;

import com.leapfrog.springhibernate.entity.CareerCounselling;
import java.util.List;

/**
 *
 * @author root
 */
public interface CareerCounsellingServiceDAO {

    void insert(CareerCounselling cc);

    void update(CareerCounselling cc);

    void delete(int id);

    List<CareerCounselling> getAll();

    CareerCounselling getById(int id);
}
