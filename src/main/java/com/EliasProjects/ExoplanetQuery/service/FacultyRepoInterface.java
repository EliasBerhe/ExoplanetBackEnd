package com.EliasProjects.ExoplanetQuery.service;

import com.EliasProjects.ExoplanetQuery.model.DiscoveryFaculty;

import java.util.List;

public interface FacultyRepoInterface {

    public void addFaculty(DiscoveryFaculty disFac);

    public List<DiscoveryFaculty> getAllFaculty();

}
