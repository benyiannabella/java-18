package composition;

public class Cladire {
    private String nume;
    private Room camera;

    public Cladire(String nume) {
        this.nume = nume;
        this.camera = new Room();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Room getCamera() {
        return camera;
    }

    public void setCuloareCamera(String culoare) {
        this.camera.setCuloare(culoare);
    }

    public void setMarimeCamera(int marime) {
        this.camera.setMarime(marime);
    }
}
