package BookMyShowDesign;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    private int screenId;

    private Movies movies;

    List<Seat> seatList = new ArrayList<>();

    public Screen(int screenId, Movies movies, int seats) {
        this.screenId = screenId;
        this.movies = movies;

    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public Movies getMovies() {
        return movies;
    }

    public void setMovies(Movies movies) {
        this.movies = movies;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
}
