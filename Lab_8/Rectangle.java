package Lab_8;

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle (double legth, double width)
    {
        this.length = legth;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length*width;
    }

    @Override
    double calculatePerimeter() {
        return 2*(length + width);
    }
}
