public class Calculator {
    public static void main(String[] args) {
        //args - 1 * 2

        if (args.length < 3) {
            System.out.println("Trebuie sa avem o sintaxa ca in exemplul: 1 * 2");
        } else {
            int numar1 = Integer.parseInt(args[0]);
            int numar2 = Integer.parseInt(args[2]);
            String operator = args[1];

            calculeaza(numar1, numar2, operator);
        }
    }

    /**
     * Metoda ce returneaza un calcul matematic
     * @param numar1 - o variabila de tip int
     * @param numar2
     * @param operator - care poate fi *, +, -, /
     */

    private static void calculeaza(int numar1, int numar2, String operator) {
        switch (operator.charAt(0)) {
            case '-' :
                int rez = numar1 - numar2;
                System.out.println(rez);
                break;
            case '+' :
                int rez1 = numar1 + numar2;
                System.out.println(rez1);
                break;

            case '*' :
                int rez2 = numar1 * numar2;
                System.out.println(rez2);
                break;

            case '/' :
                int rez3 = numar1 / numar2;
                System.out.println(rez3);
                break;

            default :
                System.out.println("Nu ati introdus +, -, /, *");
        }

    }
}

