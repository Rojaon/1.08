package d4.VideoStreamingService;

public class Movie extends Video{

    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getInfo(){
        return "\nVideo title: " + title + "\nVideo duration: " + duration + "\nRating: " + rating;
    }
}
