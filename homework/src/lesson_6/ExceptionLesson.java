package lesson_6;


public class ExceptionLesson {
    int sum;
    public void checkArray (String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен иметь размер 4х4 ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Массив должен иметь размер 4х4 ");
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный символ в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        System.out.println("Сумма всех элементов массива "+sum);
    }
}