public class MainLight {
    public static void main(String[] args) {
        System.out.println("becul 1: ");
        Light bec1 = new Light (5);
        bec1.on();
        bec1.off();
        bec1.dimen();
        bec1.brighten();

        System.out.println("Beacul 2: ");
        Light bec2 = new Light (20);
        bec1.brighten();
        bec1.brighten();
        bec1.dimen();
        bec1.dimen();


    }
}
