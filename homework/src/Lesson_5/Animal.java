package Lesson_5;

public class Animal {
    static int countAnimal;

    public Animal() {
        countAnimal++;
    }

    public void run(int distance) {
        System.out.println("animal have run" + distance + "m");

    }

    public void swim(int distance) {
        System.out.println("animal have swim" + distance + "m");
    }

    public void getCountAnimal() {
        System.out.println("number of animals" + " " + " " + countAnimal);

    }


}

