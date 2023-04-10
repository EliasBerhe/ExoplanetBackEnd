package com.EliasProjects.ExoplanetQuery.model;


import jakarta.persistence.*;

@Entity
public class HostName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String hostName;


    public HostName(){

    }

    public HostName(String hostName) {
        this.hostName = hostName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
}
