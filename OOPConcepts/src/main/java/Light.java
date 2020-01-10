public class Light {
    //attributes
    public static final int MAX = 100;
    public static final int MIN = 0;
    private int step;
    private int intensitateaCurenta;
    //constructors
    public Light (int step){
        this.step = step;
        this.intensitateaCurenta = step; //pasul cu care crestem intensitatea becului
    }

    //methods
    public void on(){
        System.out.println("Intensitatea este:" + MAX);
        this.intensitateaCurenta = MAX;
    }

    public void off(){
        System.out.println("Becul este stins");
        this.step = MIN;
    }

    public void brighten() {
        if (intensitateaCurenta + step < MAX) {
            intensitateaCurenta = intensitateaCurenta + step;
            System.out.println("Intensitatea becului este: " + intensitateaCurenta);
        } else {
            System.out.println("Nu mai putem creste intensitatea");
        }
    }

    public void dimen(){
        if (intensitateaCurenta - step > MIN) {
            intensitateaCurenta = intensitateaCurenta - step;
            System.out.println("Intensitatea curenta a becului este: " + intensitateaCurenta);
        } else {
            System.out.println("Becul este stins");
        }
    }
}
