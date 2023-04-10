package com.EliasProjects.ExoplanetQuery.service;

import com.EliasProjects.ExoplanetQuery.model.DiscoveryFaculty;
import com.EliasProjects.ExoplanetQuery.model.Exoplanets;
import com.EliasProjects.ExoplanetQuery.repository.DiscoveryFacultyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

@Service
public class FacultyService implements FacultyRepoInterface {

    @Autowired
    private DiscoveryFacultyRepo facultyRepo;
    private HashSet set;

    @Override
    public void addFaculty(DiscoveryFaculty disFac) {
        facultyRepo.save(disFac);
    }

    @Override
    public List<DiscoveryFaculty> getAllFaculty() {
       return  facultyRepo.findAll();
    }
    public void decodeCSV() {
        this.set = new HashSet();
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
                   DiscoveryFaculty faculty =  new DiscoveryFaculty("");
                   faculty.setDiscFaculty(row[7]);

                   if(!set.contains(row[7])){
                       set.add(row[7]);
                       addFaculty(faculty);
                   }



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
}
