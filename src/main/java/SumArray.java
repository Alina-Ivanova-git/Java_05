import project_utils.Utils;

public class SumArray {

    /* Написать алгоритм SumArray, который возвращает сумму всех чисел массива
     */

    public int sumArray (int[] array) {
        if (Utils.checkForEmptyArrayInt(array)) {
            int countNumbers = 0;
            for (int i = 0; i < array.length; i++) {
                countNumbers += array[i];
            }
            return countNumbers;
        }

        return 0;
    }
}
