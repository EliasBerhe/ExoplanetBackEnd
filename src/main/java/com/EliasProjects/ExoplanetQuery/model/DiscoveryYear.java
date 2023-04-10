package com.EliasProjects.ExoplanetQuery.model;

import jakarta.persistence.*;

@Entity
public class DiscoveryYear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String discYear;

    public DiscoveryYear(){

    }

    public DiscoveryYear(String discYear) {
        this.discYear = discYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiscYear() {
        return discYear;
    }

    public void setDiscYear(String discYear) {
        this.discYear = discYear;
    }
}
