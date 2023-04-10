package com.EliasProjects.ExoplanetQuery.service;


import com.EliasProjects.ExoplanetQuery.model.Exoplanets;
import com.EliasProjects.ExoplanetQuery.repository.ExoplanetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExoplanetService implements ExoplanetRepoInterface {

    @Autowired
    private ExoplanetRepo repo;
    private List<String> discoveryYear;
    private List<String> hostName;
    private List<String> discoveryFaculty;

    public List<String> getDiscoveryYear() {
        return discoveryYear;
    }

    public List<String> getHostName() {
        return hostName;
    }

    public List<String> getDiscoveryFaculty() {
        return discoveryFaculty;
    }

    public ExoplanetService(){
        this.discoveryYear  =new ArrayList<>();
        this.discoveryFaculty  =new ArrayList<>();
        this.hostName  =new ArrayList<>();

        }
    @Override
    public  void addExoplanet(Exoplanets exoplanet) {
        repo.save(exoplanet);
    }

    @Override
    public  List<Exoplanets> getAllExoplantes() {

       return repo.findAll();




    }

    public void decodeCSV() {

        String file ="C:\\Users\\elias\\OneDrive\\Desktop\\Projects\\ExoplanetQuery\\src\\main\\java\\com\\EliasProjects\\ExoplanetQuery\\model\\file\\planets.csv";

        BufferedReader reader = null;

        String line="";
        String delimeter= ",";

        try{
            reader = new BufferedReader(new FileReader(file));
            int rowNumber=0;
            while((line=reader.readLine())!=null){
                if(rowNumber!=0){
                    String[] row = line.split(delimeter);
                    Exoplanets exoplanet = new Exoplanets("","","","","","","");
                    int count=0;
                    for(String index: row){

                        if(count==0){
                            exoplanet.setPlanet(index);
                        }
                        else if(count==1){
                            this.hostName.add(index);
                            exoplanet.setHostName(index);
                        }
                        else if(count==3){
                            exoplanet.setNumOfStars(index);

                        }

                        else if(count==4){
                            exoplanet.setNumOfPlanets(index);
                        }
                        else if(count==5){
                            exoplanet.setDiscoveryMethod(index);
                        }

                        else if(count==6){
                            this.discoveryYear.add(index);
                            exoplanet.setDiscoverYear(index);
                        }
                        else if(count==7){
                            this.discoveryFaculty.add(index);
                            exoplanet.setDiscoveryFaculty(index);

                        }

                        count ++;

                    }
                   // System.out.println(exoplanet);
                    addExoplanet(exoplanet);


                }
                rowNumber++;

            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                reader.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }

        }
    }

    public static void main(String args[]){
            ExoplanetService x = new ExoplanetService();



    }
}
