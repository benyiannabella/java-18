public class InversareNumar {
    public static void main(String[] args) {

        int numar = 1501;
        inversareNumar(numar);

    }

    public static void inversareNumar(int numar){
        int numarInversat = 0;

        while (numar > 0) {
            numarInversat = numarInversat * 10 + numar %10;
            numar = numar / 10;
        }
        System.out.println("Numarul inversat este: " + numarInversat);
    }
}

