package Lab_8;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,10);
        Shape circle = new Circle(7);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Rectangle Area:" +rectangle.calculateArea());
        System.out.println("Rectangle Perimeter:" +rectangle.calculatePerimeter());
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " +circle.calculatePerimeter());
        System.out.println("Triangle Area: " +triangle.calculateArea());
        System.out.println("Triangle Perimeter: " +triangle.calculatePerimeter());        

    }
}
