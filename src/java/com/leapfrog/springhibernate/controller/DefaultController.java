/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.controller;

import com.leapfrog.springhibernate.entity.Student;
import com.leapfrog.springhibernate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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

   @RequestMapping(method = RequestMethod.GET)
   public String Dashboard(){
       return "dashboard";
   }
}
