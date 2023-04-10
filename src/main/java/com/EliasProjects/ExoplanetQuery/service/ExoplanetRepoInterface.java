package com.EliasProjects.ExoplanetQuery.service;

import com.EliasProjects.ExoplanetQuery.model.Exoplanets;

import java.util.List;

public interface ExoplanetRepoInterface {

    public  void  addExoplanet(Exoplanets exoplanet);

    public  List<Exoplanets> getAllExoplantes();
}
