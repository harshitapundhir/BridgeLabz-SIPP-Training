package Workshop;

import java.util.*;

public class CinemaTimeManager {
    private List<String> movieTitles;
    private List<String> movieTimes;

    public CinemaTimeManager() {
        movieTitles = new ArrayList<>();
        movieTimes = new ArrayList<>();
    }

    public void addMovie(String title, String time){
        movieTitles.add(title);
        movieTimes.add(time);
        System.out.println("Movie added: " + title + " at " + time);
    }

    private boolean isValidTime(String time) {
        String[] parts = time.split(":");
        if (parts.length != 2) return false;
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        return (hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59);
    }

    public void searchMovie(String keyword) {
        System.out.println("Searching for movies with keyword: " + keyword);
        boolean found = false;
        for (int i = 0; i < movieTitles.size(); i++) {
            String title = movieTitles.get(i);
            if (title.toLowerCase().contains(keyword.toLowerCase())) {
                String formatted = String.format("Index %d: Movie: %s | Time: %s", i, title, movieTimes.get(i));
                System.out.println(formatted);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching movies found.");
        }
    }

    public void displayAllMovies() {
        System.out.println("All Scheduled Movies:");
        for (int i = 0; i < movieTitles.size(); i++) {
            String formatted = String.format("Index %d: Movie: %s | Time: %s", i, movieTitles.get(i), movieTimes.get(i));
            System.out.println(formatted);
        }
    }

    public void generateReport() {
        String[] titlesArray = movieTitles.toArray(new String[0]);
        String[] timesArray = movieTimes.toArray(new String[0]);

        System.out.println("=== Cinema Movie Report ===");
        for (int i = 0; i < titlesArray.length; i++) {
            String reportLine = "Movie: " + titlesArray[i] + " | Showtime: " + timesArray[i];
            System.out.println(reportLine);
        }
    }

    public void displayMovieByIndex(int index) {
        String title = movieTitles.get(index);
        String time = movieTimes.get(index);
        System.out.println("Movie at index " + index + ": " + title + " | Time: " + time);
    }

    public static void main(String[] args) {
        CinemaTimeManager manager = new CinemaTimeManager();
        manager.addMovie("Avengers: Endgame", "18:30");
        manager.addMovie("Inception", "21:00");
        manager.addMovie("The Matrix", "20:45");

        manager.displayAllMovies();

        System.out.println();
        
        manager.searchMovie("inception");
        manager.searchMovie("the");

        System.out.println();

        manager.displayMovieByIndex(1);

        System.out.println();
        
        manager.generateReport();
    }
}