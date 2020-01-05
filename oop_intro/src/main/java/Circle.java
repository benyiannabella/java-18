public class Circle {
    //variabile de instanta
    public static final double PI = 3.14;
    double radius;
    String color;

    //constructor explicit
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //behaviour, methods
    public double getAria() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    //@Override
    //public String toString() {
    //   return "Circle with radius: " + this.radius + " color " + this.color;
    // }
    //create automatically - right click generate

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
