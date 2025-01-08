package Lesson_5.Intefaces;

public class Rectangle implements Figure {
    private double height;
    private double width;
    private String fillColor;
    private String borderColor;


    public Rectangle(double height, double width, String fillColor, String borderColor) {
        this.height = height;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double calculatePerimeter() {
        return (height + width) * 2;
    }


    public double calculateArea() {
        return height * width;
    }

    public void printInfo() {
        System.out.println("Rectangle Info:");
        System.out.println("Perimeter " + " " + calculatePerimeter());
        System.out.println("Area " + " " + calculateArea());
        System.out.println("Fill color " + " " + fillColor);
        System.out.println("Border color" + " " + borderColor);
    }
}