package netflixapp;
        
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
        String input = JOptionPane.showInputDialog("NetFlix App\n\n1) Movies\n2) TV Series\n3) Exit\n\nPlease select one option:\n\n");
        if (input.equals("1")){
            showMoviesMenu(listOfStreamingVideos);
        }else if (input.equals("2")){
            showTVShowMenu(listOfStreamingVideos);
        }System.exit(0);
    }

    private void showMoviesMenu(List<StreamingVideo> listOfStreamingVideos) {
        try {
            Movie beauty = new Movie("C:\\Users\\Zed\\Documents\\NetBeansProjects\\NetflixApp\\src\\netflixapp\\BeautyAndTheBeast.txt");
            String input = JOptionPane.showInputDialog("List of Movies:\n\n1) Beauty and the Beast\n2) The Matrix\n3) Exit\n\nPlease select one option:\n\n");
            Movie matrix = new Movie("C:\\Users\\Zed\\Documents\\NetBeansProjects\\NetflixApp\\src\\netflixapp\\TheMatrix.txt");
            if (input.equals("1")){
                showSpecificMovieInfo(beauty);
            }else if (input.equals("2")){
                showSpecificMovieInfo(matrix);
            }else if (input.equals("3")){showMainMenu(listOfStreamingVideos);
            }
            System.exit(0);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NetflixApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showSpecificMovieInfo(Movie movie) {
        StringBuilder movieInfo = new StringBuilder();
        movieInfo.append("Title: ").append(movie.getTitle()).append("\n");
        movieInfo.append("Viewer Rating: ").append(movie.getRating()).append("\n");
        movieInfo.append("Description: ").append(movie.getDescription()).append("\n");
        movieInfo.append("Released: ").append(movie.getReleaseYear()).append("\n");
        movieInfo.append("Runtime: ").append(movie.getRunTime()).append("\n");
        movieInfo.append("Production Company: ").append(movie.getProductionCompany()).append("\n");
        movieInfo.append("Casting: ").append(movie.getCasting()).append("\n");
        JOptionPane.showInputDialog(movieInfo);
    }

    private void showTVShowMenu(List<StreamingVideo> listOfStreamingVideos) {
        try {
        TVShow bad = new TVShow("C:\\Users\\Zed\\Documents\\NetBeansProjects\\NetflixApp\\src\\netflixapp\\BreakingBad.txt");
            TVShow office = new TVShow("C:\\Users\\Zed\\Documents\\NetBeansProjects\\NetflixApp\\src\\netflixapp\\TheOffice.txt");
        String input = JOptionPane.showInputDialog("List of Shows:\n\n1) Breaking Bad\n2) The Office\n3) Exit\n\nPlease select one option:\n\n");
        if (input.equals("1")){
            showSpecificTVShowMenu(bad);
        }else if (input.equals("2")){
            showSpecificTVShowMenu(office);
        }else if (input.equals("3")){showMainMenu(listOfStreamingVideos);
            }System.exit(0);
    }catch (FileNotFoundException ex) {
            Logger.getLogger(NetflixApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showSpecificTVShowMenu(TVShow tvShow) {
        StringBuilder showInfo = new StringBuilder();
        showInfo.append("Title: ").append(tvShow.getTitle()).append("\n");
        showInfo.append("Viewer Rating: ").append(tvShow.getRating()).append("\n");
        showInfo.append("Description: ").append(tvShow.getDescription()).append("\n");
        showInfo.append("Cast: ").append(tvShow.getCasting()).append("\n");
        JOptionPane.showInputDialog(showInfo);
    }

    private void showSpecificTVShowSeason(Season tvShowSeason) {
// implement your code here (use the toString method when possible)
    }

//    private void showSpecificTVShowSeasonEpisode(Episode episode) {
//        JOptionPane.showMessageDialog(null, episode);
//
//    }
}
