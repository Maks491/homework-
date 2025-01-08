package Lesson_5.Intefaces;

public interface Figure {
    default double calculatePerimeter() {
        return 0.0;
    }


    double calculateArea();
}
