/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.service.dao;

import com.leapfrog.springhibernate.entity.Student;
import java.util.List;

/**
 *
 * @author root
 */
public interface StudentServiceDAO {

    void insert(Student s);

    void update(Student s);

    void delete(int id);

    List<Student> getAll();

    Student getById(int id);
}
