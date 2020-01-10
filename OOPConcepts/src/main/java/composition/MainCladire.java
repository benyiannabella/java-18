package composition;

public class MainCladire {
    public static void main(String[] args) {
        Cladire cladireA =  new Cladire("CBC");
        cladireA.setMarimeCamera(100);
        cladireA.setCuloareCamera("Rosu");

        System.out.println(cladireA.getNume() + " are o camera de culoarea: " + cladireA.getCamera().getCuloare());
    }
}
