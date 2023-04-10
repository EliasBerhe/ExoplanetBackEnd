package com.EliasProjects.ExoplanetQuery.controller;


import com.EliasProjects.ExoplanetQuery.model.DiscoveryFaculty;
import com.EliasProjects.ExoplanetQuery.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscoveryFacultyController {
    @Autowired
    private FacultyService service;

    @GetMapping("/faculties")
    public List<DiscoveryFaculty> setUp(){
       return service.getAllFaculty();

    }
}
