public class Person {
    public static final double PI = 3.14; //constant value, doesn't chnage
    String name; //attribute or instance variable
    int age = 10;

    //constructor implicit
    public Person() {
        System.out.println("Constructorul implicit a fost apelat");
        this.name = "no name";
    }

    //constructor explicit
    public Person(String name) {
        System.out.println("Constructor explicit cu 1 parametru a fost apelat");
        this.name = name;
        displayHello();
    }

    public void displayHello() {
        System.out.println("Hello " + this.name);
    }
}
