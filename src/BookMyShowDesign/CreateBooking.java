package BookMyShowDesign;

import java.util.List;

public class CreateBooking {

    private Movies interestedMovie = null;
    public String bookTicket(String movie, String city, MovieController movieController, TheatreController theatreController) {

        List<Movies> moviesList = movieController.movieControllerlist.get(city);

        moviesList.forEach(movies -> {
            if (movies.movieName.equals(movie)) {
                interestedMovie = movies;
            }
        });
        if (interestedMovie != null) {
             List<Theatre> theatreList = theatreController.theatreController.get(city);
             theatreList.forEach(theatre -> {
                 theatre.showList.forEach(show -> {
                     if (show.getScreen().getMovies().movieName.equals(movie)) {
                         System.out.println("PLease let us know, which seat u want to book");
                     }
                 });
             });
        }
        else {
            return "Try different movie";
        }
        return "";
    }
}
