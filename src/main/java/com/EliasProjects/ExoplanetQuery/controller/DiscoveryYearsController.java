package com.EliasProjects.ExoplanetQuery.controller;


import com.EliasProjects.ExoplanetQuery.model.DiscoveryYear;
import com.EliasProjects.ExoplanetQuery.service.YearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscoveryYearsController {

    @Autowired
    private YearService service;

    @GetMapping("/years")

    public List<DiscoveryYear> setUp(){
        return service.getAllYear();

    }
}
