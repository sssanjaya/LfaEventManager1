/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.service.dao;

import com.leapfrog.springhibernate.entity.Workshop;
import java.util.List;

/**
 *
 * @author root
 */
public interface WorkshopServiceDAO {

    void insert(Workshop w);

    void update(Workshop w);

    void delete(int id);

    List<Workshop> getAll();

    Workshop getById(int id);
}
