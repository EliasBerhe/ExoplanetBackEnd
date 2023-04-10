package com.EliasProjects.ExoplanetQuery.model;

import jakarta.persistence.*;

@Entity
public class DiscoveryFaculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String discFaculty;


    public DiscoveryFaculty(){

    }

    public DiscoveryFaculty(String discFaculty) {
        this.discFaculty = discFaculty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiscFaculty() {
        return discFaculty;
    }

    public void setDiscFaculty(String discFaculty) {
        this.discFaculty = discFaculty;
    }
}
