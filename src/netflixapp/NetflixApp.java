
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import netflixapp.Movie;
import netflixapp.Season;
import netflixapp.StreamingVideo;
import netflixapp.TVShow;

public class NetflixApp {

    public static void main(String[] args) {
        new NetflixApp();
    }

    public NetflixApp() {
// reading all movies and tv series from text file (simulating a database)
        List<StreamingVideo> listOfStreamingVideos = readStreamVideoDatabase();
        showMainMenu(listOfStreamingVideos);
    }

    private List<StreamingVideo> readStreamVideoDatabase() {
        List<StreamingVideo> streamVideoList = new ArrayList();
        File databaseFile = new File("C:\\Users\\Zed\\Documents\\NetBeansProjects\\NetflixApp\\src\\netflixapp\\StreamingVideoDatabase.txt");
        try {
            Scanner fileScanner = new Scanner(databaseFile);
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String[] items = line.trim().split("=");
                if (items[0].trim().equalsIgnoreCase("tv_show")) {
                    streamVideoList.add(new TVShow(items[1].trim()));
                } else {
                    streamVideoList.add(new Movie(items[1].trim()));
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NetflixApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return streamVideoList;
    }

    private void showMainMenu(List<StreamingVideo> listOfStreamingVideos) {
// implement your code here (use the toString method when possible)
    }

    private void showMoviesMenu(List<StreamingVideo> listOfStreamingVideos) {
// implement your code here (use the toString method when possible)
    }

    private void showSpecificMovieInfo(Movie movie) {
// implement your code here (use the toString method when possible)
    }

    private void showTVShowMenu(List<StreamingVideo> listOfStreamingVideos) {
// implement your code here (use the toString method when possible)
    }

    private void showSpecificTVShowMenu(TVShow tvShow) {
// implement your code here (use the toString method when possible)
    }

    private void showSpecificTVShowSeason(Season tvShowSeason) {
// implement your code here (use the toString method when possible)
    }

//    private void showSpecificTVShowSeasonEpisode(Episode episode) {
//        JOptionPane.showMessageDialog(null, episode);
//
//    }
}
