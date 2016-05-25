/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.controller;

import com.leapfrog.springhibernate.entity.Student;
import com.leapfrog.springhibernate.service.StudentService;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author root
 */
@Controller
@RequestMapping("/")
public class DefaultController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {
        // studentService.insert(new Student(0, "abc", "Kathmandu", "abc@gmail.com", "leapfrog", false));
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("students", studentService.getAll());
        return mv;
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public ModelAndView add(@ModelAttribute("Student") Student student) {
        ModelAndView mv = new ModelAndView("add");
        mv.addObject("student", studentService.getAll());
        return mv;
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(@ModelAttribute("Student") Student student, @Context HttpServletRequest request) {
        student.setName(request.getParameter("name"));
        student.setAddress(request.getParameter("address"));
        student.setEmail(request.getParameter("email"));
        student.setCollege(request.getParameter("college"));
        student.setStatus(request.getParameter("status") != null);
        studentService.insert(student);
        return "redirect:/";
    }

    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public ModelAndView edit(@ModelAttribute("Student") Student student, @Context HttpServletRequest request) {
        ModelAndView mv = null;
        int id = Integer.parseInt(request.getParameter("id"));
        student = studentService.getById(id);
        if (student != null) {
            mv = new ModelAndView("edit");
            mv.addObject("students", student);
        }
        return mv;
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(@ModelAttribute("Student") Student student, @Context HttpServletRequest request) {
        student.setId(Integer.parseInt(request.getParameter("id")));
        studentService.update(student);
        return "redirect:/";
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public String delete(@ModelAttribute("Student") Student student, @Context HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        studentService.delete(id);
        return "redirect:/";
    }
}
