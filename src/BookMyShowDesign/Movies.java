package BookMyShowDesign;

public class Movies {

    String movieName;
    String duration;

    public Movies(String movieName, String duration) {
        this.movieName = movieName;
        this.duration = duration;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
