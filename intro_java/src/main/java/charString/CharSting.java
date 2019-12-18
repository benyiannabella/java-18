package charString;

public class CharSting {
    public static void main(String[] args) {
        String propozitie = "Ana are mere";
        char[] arrayCaractere = propozitie.toCharArray();
        int nrVocale = 0;
        //afisare caractere unui string
        for (char element : arrayCaractere) {
            System.out.println(element);
            if (element == 'a' || element == 'e' || element == 'i' || element == 'o' || element == 'U'){
                nrVocale++;
            }

        }
        System.out.println("Nr vocale din string e: " + nrVocale);
    }
}

