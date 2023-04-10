package com.EliasProjects.ExoplanetQuery.controller;

import com.EliasProjects.ExoplanetQuery.service.ExoplanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExoplanetsController {


    @Autowired
    private ExoplanetService service;





}
