package com.EliasProjects.ExoplanetQuery.service;

import com.EliasProjects.ExoplanetQuery.model.DiscoveryYear;

import java.util.List;

public interface YearRepoInterface {

    public void addYear(DiscoveryYear year);


    public List<DiscoveryYear> getAllYear();
}
