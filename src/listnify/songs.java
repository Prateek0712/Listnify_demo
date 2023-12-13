package listnify;

public class songs {
    private String title;
    private double duration;
    songs(String title,double duration)
    {
        this.title=title;
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "songs{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

    public double getDuration() {
        return duration;
    }
}
