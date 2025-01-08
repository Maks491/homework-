package Lesson_5.Intefaces;


public class Circle implements Figure {
    private String fillColor;
    private String borderColor;
    private double radius;

    public Circle(double radius, String fillColor, String borderColor) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void printInfo() {
        System.out.println("Circle Info:");
        System.out.println("Perimeter " + " " + calculatePerimeter());
        System.out.println("Area " + " " + calculateArea());
        System.out.println("Fill color " + " " + fillColor);
        System.out.println("Border color" + " " + borderColor);
    }


}
