package com.EliasProjects.ExoplanetQuery.repository;

import com.EliasProjects.ExoplanetQuery.model.DiscoveryYear;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscoveryYearRepo extends JpaRepository<DiscoveryYear,Integer> {
}
