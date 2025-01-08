package Lesson_5.Intefaces;

public class Triangle implements Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));

    }

    public void printInfo() {
        System.out.println("Triangle Info:");
        System.out.println("Perimeter " + " " + calculatePerimeter());
        System.out.println("Area " + " " + calculateArea());
        System.out.println("Fill color " + " " + fillColor);
        System.out.println("Border color" + " " + borderColor);
    }
}