package BookMyShowDesign;

import java.util.Arrays;
import java.util.List;

public class BookMyShow {

    static TheatreController theatreController;
    static MovieController movieController;

    public BookMyShow() {
        initialize();
    }

    public static void main(String[] args) {

        System.out.println("Please let us know, which movie you want to watch, and in which city");
        CreateBooking createBooking = new CreateBooking();
        String str = createBooking.bookTicket("Avenger", "Bangaluru",movieController, theatreController);

    }

    public void initialize() {
          movieController = new  MovieController();
         Movies movie1 = new Movies("Bahubali", "3:00");
         Movies movie2 = new Movies("Aveneger", "3:00");
         List<Movies> movies = Arrays.asList(movie1, movie2);
         City city = new City("Bangaluru");
         movieController.movieControllerlist.put(city, movies);

        //TheatreController theatreController = new TheatreController();
        initializeTheatre();

    }

    public void initializeTheatre() {

         theatreController = new TheatreController();
        City city = new City("Bangaluru");

        Movies movie1 = new Movies("Bahubali", "3:00");
        Movies movie2 = new Movies("Aveneger", "3:00");
        Screen screen1 = new Screen(1, movie1, 30);
        Screen screen2 = new Screen(2,movie2, 30);
        Show show1 = new Show(1, screen1, 0);
        Show show2 = new Show(2, screen2, 0);
        Theatre  theatre = new Theatre();
        theatre.showList.add(show1);
        theatre.showList.add(show2);
        theatre.screenList.add(screen1);
        theatre.screenList.add(screen2);
        List<Theatre>theatreList = Arrays.asList(theatre);
        theatreController.theatreController.put(city, theatreList);


    }
}
