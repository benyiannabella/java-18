public class MainDreptunghi {
    public static void main(String[] args) {
        Dreptunghi dreptunghiA = new Dreptunghi(20, 10);
        System.out.println("Aria obiect dreptunghiA este: " + dreptunghiA.getAria());
        System.out.println("Perimetrul obiect dreptunghiA este: " + dreptunghiA.getPerimetru());

        Dreptunghi dreptunghiB = new Dreptunghi(40, 40);
        System.out.println("Aria obiect dreptunghiB este: " + dreptunghiB.getAria());
        System.out.println("Perimetrul obiect dreptunghiB este: " + dreptunghiB.getPerimetru());
        System.out.println("Diagonala obiect dreptunghiB este: " + dreptunghiB.getDiagonala());
    }
}
