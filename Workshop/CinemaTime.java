package Workshop;

import java.util.*;

public class CinemaTime{
    List <String> moviesTitles = new ArrayList<>();
    List <String> ShowTimes = new ArrayList<>();

    public void addMovies(String title , String Time){
        moviesTitles.add(title);
        ShowTimes.add(Time);
    }
    public void SearchMovies(String keyword){
                for (int i = 0; i < movieTitles.size(); i++) {
            if (movieTitles.get(i).contains(keyword)) {
                System.out.println(movieTitles.get(i) + " at " + ShowTimes.get(i));
            }
        }
       
        }
    }
    public void DisplayAllMovies(){
        for(int i=0; i<=moviesTitles.size(); i++){
            System.out.println((i+1) + "." + moviesTitles.get(i)+ "at " + ShowTimes.get(i));        
        }

    }
    public static void main(String[] args){
        CinemaTime manager = new CinemaTime();
        try {
            manager.addMovies("Inception", "19:00");
            manager.addMovies("Avengers", "14:30");
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }

        manager.DisplayAllMovies();
        manager.SearchMovies("Inception");
    }
}

