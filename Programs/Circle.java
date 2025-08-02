public class Circle 
{
    private double radius;
    private double pi;

    // Constructor to initialize radius
    public Circle(double radius)
     {
       pi=3.14;
        this.radius = radius;
    }

    // Method to calculate area
    public double Area()
     {
        return pi * radius * radius;
    }

    public static void main(String[] args) {
        // Create a Circle object with radius 5
        Circle obj = new Circle(5);

        // Calculate and prdouble area
        double area = obj.Area();
        System.out.println("Area of the circle: " +area);
    }
}