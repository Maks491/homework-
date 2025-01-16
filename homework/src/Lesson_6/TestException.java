package Lesson_6;

import java.lang.Exception;

public class TestException {
    public static void main(String[] args) {
        ExceptionLesson arr = new ExceptionLesson();
        String[][] array = {
                {"5", "8", "33", "1"},
                {"35", "99", "1", "7"},
                {"14", "22", "3", "6"},
                {"4", "10", "7", "4"}

        };
        try {
            arr.checkArray(array);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }

    }
}