package com.EliasProjects.ExoplanetQuery.service;


import com.EliasProjects.ExoplanetQuery.model.HostName;

import java.util.List;

public interface HostRepoInterface {

    public void addHostName(HostName name);

    public List<HostName> getAllName();
}
