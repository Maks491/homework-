package Lesson_5;

public class Test {
    public static void main(String[] args) {

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Julik", 10, false);
        cats[1] = new Cat("Boris", 5, false);
        cats[2] = new Cat("Simon", 5, false);
        cats[3] = new Cat("Murzik", 10, false);

        Plate plateOfFood = new Plate(20);
        for (int i = 0; i < cats.length; i++) {
            if (!cats[i].satiety && cats[i].appetite <= plateOfFood.food) {
                cats[i].eat(plateOfFood);
                cats[i].satiety = true;


                System.out.println("cat" + " " + cats[i].name + " " + "ate");
            } else {

                System.out.println("cat" + " " + cats[i].name + " " + "is hungry");
            }

        }


    }


}


