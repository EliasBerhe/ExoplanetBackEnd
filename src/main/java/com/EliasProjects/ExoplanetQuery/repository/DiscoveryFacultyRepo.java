package com.EliasProjects.ExoplanetQuery.repository;

import com.EliasProjects.ExoplanetQuery.model.DiscoveryFaculty;
import com.EliasProjects.ExoplanetQuery.model.Exoplanets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscoveryFacultyRepo extends JpaRepository<DiscoveryFaculty,Integer> {
}
