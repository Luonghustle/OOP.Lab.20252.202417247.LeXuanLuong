package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    private static int nbDigitalVideoDiscs = 0;
    private int id;
    // Constructor 1: create by title
    public DigitalVideoDisc(String title) {
        this.id = ++ nbDigitalVideoDiscs;
        this.title = title;
    }

    // Constructor 2: create by title, category, cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this.id = ++ nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Constructor 3: create by title, category, director, cost
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.id = ++ nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    // Constructor 4: create by all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.id = ++ nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public static int getnbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
    }

    public boolean isMatch(String title) {
        return this.title != null && this.title.equalsIgnoreCase(title);
    }
}