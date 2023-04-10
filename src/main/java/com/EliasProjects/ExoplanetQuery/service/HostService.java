package com.EliasProjects.ExoplanetQuery.service;

import com.EliasProjects.ExoplanetQuery.model.DiscoveryFaculty;
import com.EliasProjects.ExoplanetQuery.model.HostName;
import com.EliasProjects.ExoplanetQuery.repository.HostNameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
@Service
public class HostService implements HostRepoInterface {

    @Autowired
    private HostNameRepo nameRepo;
    private HashSet<String> set;
    @Override
    public void addHostName(HostName name) {
        nameRepo.save(name);

    }

    @Override
    public List<HostName> getAllName() {
        return nameRepo.findAll();
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
                    HostName name = new HostName("");
                    name.setHostName(row[1]);
                    if(!set.contains(row[1])){
                        set.add(row[1]);
                        addHostName(name);
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
