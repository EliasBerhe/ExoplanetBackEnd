package com.EliasProjects.ExoplanetQuery.service;

import com.EliasProjects.ExoplanetQuery.model.DiscoveryFaculty;
import com.EliasProjects.ExoplanetQuery.model.DiscoveryYear;
import com.EliasProjects.ExoplanetQuery.repository.DiscoveryYearRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

@Service
public class YearService implements YearRepoInterface {
    @Autowired
    private DiscoveryYearRepo yearRepo;
    private HashSet<String> set;
    @Override
    public void addYear(DiscoveryYear year) {
        yearRepo.save(year);

    }

    @Override
    public List<DiscoveryYear> getAllYear() {
        return yearRepo.findAll();
    }

    public void decodeCSV() {
        this.set = new HashSet<>();

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
                    DiscoveryYear year = new DiscoveryYear("");
                    year.setDiscYear(row[6]);
                    if(!set.contains(row[6])){
                        set.add(row[6]);
                        addYear(year);
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
