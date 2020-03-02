/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netflixapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * ● Release year ● Runtime ● Production Company
 */
public class Movie extends StreamingVideo {

    private String runTime;
    private String productionCompany;
    private String releaseYear;
     

    public Movie(String filePath) throws FileNotFoundException {
        File movieFile = new File(filePath);
        Scanner movieScanner = new Scanner(movieFile);
        getTitle();

    }
    
    

    public void setRunTime() {

    }

    public String getRunTime() {

        return "Formatted Runtime";
    }

    public void setProductionCompany() {

    }

    public String getProductionCompany() {
        return "prodco";
    }

    public void setReleaseYear() {
        
    }

    public String getReleaseYear() {
        return "year";
    }
}
