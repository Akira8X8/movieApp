/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netflixapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 *
 * ● Number of Seasons ● For each Season: ○ Overall Series Episode ○ Season
 * Episode ○ Episode Title ○ Original Released Year
 *
 */
public class TVShow extends StreamingVideo {

    private int numberOfSeasons;
    private List<Season> listOfSeasons;

    public TVShow(String filePath) throws FileNotFoundException {
        File tvFile = new File(filePath);
        Scanner tvScanner = new Scanner(tvFile);
        setTitle(tvScanner.nextLine().split(":")[1].trim());
        setRating(tvScanner.nextLine().split(":")[1].trim());
        setDescription(tvScanner.nextLine().split(":")[1].trim());
        setCasting(Arrays.asList((tvScanner.nextLine().split(":")[1].trim())));
        setNumberOfSeasons(Integer.parseInt(tvScanner.nextLine().split(":")[1].trim()));
        setListOfSeasons(listOfSeasons);
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public List<Season> getListOfSeasons() {
        return listOfSeasons;
    }

    public void setListOfSeasons(List<Season> listOfSeasons) {
        this.listOfSeasons = listOfSeasons;
    }

}
