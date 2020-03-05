package netflixapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
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
        setTitle(movieScanner.nextLine().split(":")[1].trim());
        setRating(movieScanner.nextLine().split(":")[1].trim());
        setDescription(movieScanner.nextLine().split(":")[1].trim());
        setReleaseYear(movieScanner.nextLine().split(":")[1].trim());
        setRunTime(movieScanner.nextLine().split(":")[1].trim());
        setProductionCompany(movieScanner.nextLine().split(":")[1].trim());
        setCasting(Arrays.asList((movieScanner.nextLine().split(":")[1].trim())));

    }
    
    

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public String getRunTime() {

        return runTime;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setReleaseYear(String year) {
        releaseYear = year;
    }

    public String getReleaseYear() {
        return releaseYear;
    }
}
