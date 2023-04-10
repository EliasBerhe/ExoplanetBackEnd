package com.EliasProjects.ExoplanetQuery.controller;

import com.EliasProjects.ExoplanetQuery.model.Exoplanets;
import com.EliasProjects.ExoplanetQuery.service.ExoplanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExoplanetsController {


    @Autowired
    private ExoplanetService service;


    @GetMapping("/table")
    public List<Exoplanets> getTable(){
        return service.getAllExoplantes();
    }



}
