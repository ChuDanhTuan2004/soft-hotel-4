package com.example.softhotel4.controller;

import com.example.softhotel4.service.impl.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping("")
    public ModelAndView getAllRooms(){
        ModelAndView modelAndView = new ModelAndView("room/list");
        modelAndView.addObject("rooms", roomService.getAllRooms());
        return modelAndView;
    }
}
