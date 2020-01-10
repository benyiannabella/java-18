package agregation;

public class MainMasina {
    public static void main(String[] args) {
        //masina VW de culoare alba cu motor capacitate 1 si putere 75
        Motor motorVW = new Motor();
        motorVW.setCapacitate(1);
        motorVW.setPuter(75);

        System.out.println("MotorVW are puterea: " + motorVW.getPutere());
        System.out.println("MotorVW are capacitatea: " + motorVW.getCapacitate());

        Masina masinaVW = new Masina(motorVW, "VW");
        masinaVW.setCuloare("alb");

        System.out.println("Masina " + masinaVW.getNume()
                + " are culoarea " + masinaVW.getCuloare()
                + " si motorul de putere " + masinaVW.getMotor().getPutere()
                + " si motorul de capacitate " + masinaVW.getMotor().getCapacitate());

        masinaVW = null;

        //chiar daca masina a fost distrusa motorul exista
    }

}
