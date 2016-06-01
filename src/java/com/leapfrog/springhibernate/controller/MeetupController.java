/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springhibernate.controller;

import com.leapfrog.springhibernate.entity.Meetup;
import com.leapfrog.springhibernate.service.MeetupService;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author User
 */
@Controller
@RequestMapping(value = "meetup")
public class MeetupController {

    @Autowired
    private MeetupService meetupService;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView index() {
        ModelAndView mv = new ModelAndView("meetup/index");
        mv.addObject("meetupList", meetupService.getAll());
        return mv;
    }

    @RequestMapping(value = "addMeetup", method = RequestMethod.GET)
    public ModelAndView add(@ModelAttribute(value="meetup")Meetup meetup) {
        return new ModelAndView("meetup/addMeetup", "command", new Meetup());
    }
    
    @RequestMapping(value="save",method = RequestMethod.POST)
        public String save(@ModelAttribute(value="meetup")Meetup meetup){
            meetupService.insert(meetup);
            return "redirect:/meetup/index";
        }
    
   @RequestMapping(value="delete",method = RequestMethod.GET)  
   public String delete(@ModelAttribute(value = "meetup")Meetup meetup, @Context HttpServletRequest request){
       int id = Integer.parseInt(request.getParameter("id"));
       meetupService.delete(id);
       return "redirect:/meetup/index";
   }
   
   @RequestMapping(value = "editMeetup",method = RequestMethod.GET)
   public ModelAndView edit(@ModelAttribute("meetup")Meetup meetup, @Context HttpServletRequest request){
       ModelAndView mv =null;
       int id = Integer.parseInt(request.getParameter("id"));
        meetup = meetupService.getById(id);
       if(meetup!=null){
           mv= new ModelAndView("meetup/editMeetup");
           mv.addObject("meetups", meetup);
       }
       return mv;
   }
}
