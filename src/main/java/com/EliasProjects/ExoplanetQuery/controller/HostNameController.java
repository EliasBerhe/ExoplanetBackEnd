package com.EliasProjects.ExoplanetQuery.controller;


import com.EliasProjects.ExoplanetQuery.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HostNameController {

    @Autowired
    private HostService service;

    @GetMapping("/hostNames")
    public String setUp(){
        service.getAllName();
        return "<3";
    }


}
