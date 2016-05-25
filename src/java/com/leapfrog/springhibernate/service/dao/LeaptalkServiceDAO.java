/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.service.dao;

import com.leapfrog.springhibernate.entity.Leaptalk;
import java.util.List;

/**
 *
 * @author root
 */
public interface LeaptalkServiceDAO {

    void insert(Leaptalk l);

    void update(Leaptalk l);

    void delete(int id);

    List<Leaptalk> getAll();

    Leaptalk getById(int id);
}
