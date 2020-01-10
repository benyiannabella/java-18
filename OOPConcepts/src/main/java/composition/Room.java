package composition;

public class Room {
    private String culoare;
    private int marime;

    public Room() {
        this.culoare = "alb";
        this.marime = 10;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setMarime(int marime) {
        this.marime = marime;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getMarime() {
        return marime;
    }
}
