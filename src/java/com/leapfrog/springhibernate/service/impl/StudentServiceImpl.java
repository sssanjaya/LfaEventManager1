/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.service.impl;

import com.leapfrog.springhibernate.dao.StudentDAO;
import com.leapfrog.springhibernate.entity.Student;
import com.leapfrog.springhibernate.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service("StudentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public void insert(Student s) {
        studentDAO.insert(s);
    }

    @Override
    public void update(Student s) {
        studentDAO.update(s);
    }

    @Override
    public void delete(int id) {
        studentDAO.delete(id);
    }

    @Override
    public List<Student> getAll() {
        return studentDAO.getAll();
    }

    @Override
    public Student getById(int id) {
        return studentDAO.getById(id);
    }

}
