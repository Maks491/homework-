package Lesson_5.Intefaces;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(8, "red", "black");
        circle.printInfo();
        Rectangle rectangle = new Rectangle(4, 8, "blue", "black");
        rectangle.printInfo();
        Triangle triangle = new Triangle(3, 4, 5, "yellow", "green");
        triangle.printInfo();

    }
}
