package BookMyShowDesign;

import java.util.ArrayList;
import java.util.List;

public class Show {

    private int showId;

    private Screen screen;

    List<Integer> bookedSets = new ArrayList<>();

    int bookedSetscount;

    public Show(int showId, Screen screen, int bookedSets) {
        this.showId = showId;
        this.screen = screen;
       this.bookedSetscount = bookedSets;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public List<Integer> getBookedSets() {
        return bookedSets;
    }

    public void setBookedSets(List<Integer> bookedSets) {
        this.bookedSets = bookedSets;
    }

    public int getBookedSetscount() {
        return bookedSetscount;
    }

    public void setBookedSetscount(int bookedSetscount) {
        this.bookedSetscount = bookedSetscount;
    }
}
