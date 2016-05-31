/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.controller;

import com.leapfrog.springhibernate.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author User
 */
@Controller
public class StudentController {

//    @RequestMapping(value = "save", method = RequestMethod.GET)
//    public ModelAndView student() {
//        return new ModelAndView("student", "Student", new Student());
//    }
//
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public String insert(@ModelAttribute("std") Student student, ModelMap model) {
//        model.addAttribute("id", student.getId());
//        model.addAttribute("name", student.getName());
//        model.addAttribute("address", student.getAddress());
//        model.addAttribute("email", student.getEmail());
//        model.addAttribute("college", student.getCollege());
//        model.addAttribute("status", student.getStatus());
//        return "index";
//    }
}
