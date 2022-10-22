import project_utils.Utils;

import java.util.Arrays;

public class OddIndices {
    /* Написать алгоритм OddIndices, который принимает массив целых чисел,  и возвращает массив значений нечетных индексов
     */

    public int[] oddIndices(int[] list) {
        if (Utils.checkForEmptyArrayInt(list))
//        (list != null && list.length > 0)
    {            int count = 0;
            int[] arrayOddIndices = new int[list.length / 2];
            for (int i = 1; i < list.length; i += 2) {
                arrayOddIndices[count] = list[i];
                count++;
            }

            return arrayOddIndices;
        }

        return new int[0];
    }
}