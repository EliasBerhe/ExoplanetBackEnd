package com.EliasProjects.ExoplanetQuery.repository;

import com.EliasProjects.ExoplanetQuery.model.Exoplanets;
import com.EliasProjects.ExoplanetQuery.model.HostName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostNameRepo extends JpaRepository<HostName,Integer> {
}
