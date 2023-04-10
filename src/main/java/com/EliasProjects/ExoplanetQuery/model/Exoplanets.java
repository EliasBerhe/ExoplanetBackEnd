package com.EliasProjects.ExoplanetQuery.model;

import com.EliasProjects.ExoplanetQuery.repository.ExoplanetRepo;
import jakarta.persistence.*;

@Entity
public class Exoplanets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String planet;

    @Column
    private String hostName;

    @Column
    private String discoverYear;

    @Column
    private String discoveryFaculty;

    @Column
    private String numOfStars;

    @Column
    private String numOfPlanets;



    @Column
    private String discoveryMethod;





    public Exoplanets(){


    }

    public Exoplanets(String planet, String hostName, String discoverYear,String discoveryFaculty,String numOfStars,String numOfPlanets, String discoveryMethod   ){


        this.planet = planet;
        this.hostName= hostName;
        this.discoverYear = discoverYear;
        this.discoveryFaculty = discoveryFaculty;
        this.numOfStars = numOfStars;
        this.numOfPlanets =numOfPlanets;

        this.discoveryMethod = discoveryMethod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getDiscoverYear() {
        return discoverYear;
    }

    public void setDiscoverYear(String discoverYear) {
        this.discoverYear = discoverYear;
    }

    public String getDiscoveryFaculty() {
        return discoveryFaculty;
    }

    public void setDiscoveryFaculty(String discoveryFaculty) {
        this.discoveryFaculty = discoveryFaculty;
    }

    public String getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(String numOfStars) {
        this.numOfStars = numOfStars;
    }

    public String getNumOfPlanets() {
        return numOfPlanets;
    }

    public void setNumOfPlanets(String numOfPlanets) {
        this.numOfPlanets = numOfPlanets;
    }




    public String getDiscoveryMethod() {
        return discoveryMethod;
    }

    public void setDiscoveryMethod(String discoveryMethod) {
        this.discoveryMethod = discoveryMethod;
    }

    public String toString(){

        return "planet: " + this.planet + "_" + "Host: " + this.hostName + "_" + "Year: " + this.discoverYear;

    }
}
