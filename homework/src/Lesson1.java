public class Lesson1 {
    public static void main(String[] args) {
        Exercise1 one = new Exercise1();
        one.printThreeWords();
        Exercise2 two = new Exercise2();
        two.checkSumSign();
        Exercise3 three = new Exercise3();
        three.printColor();
        Exercise4 four = new Exercise4();
        four.compareNumbers();
        Exerecise5 five = new Exerecise5();
        five.isSumTwenty(10, 6);
    }
}

class Exercise1 {
    public void printThreeWords() {
        System.out.println("Orange\nbanana\napple");
        System.out.println();
    }
}

class Exercise2 {
    public void checkSumSign() {
        int a = 40;
        int b = 7;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}

class Exercise3 {
    public void printColor() {
        System.out.println();
        int value = 109;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value < 101) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}

class Exercise4 {
    public void compareNumbers() {
        int a = 22;
        int b = 87;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}

class Exerecise5 {
    public void isSumTwenty(int a, int b) {
        int sum = a + b;
        boolean isTrue = sum >= 10 && sum <= 20;
        System.out.println(isTrue);
    }
}