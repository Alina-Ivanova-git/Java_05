public class CreateArray {

    /* 1. В голубой папке java создать класс CreateArray, написать в этом классе метод createIntArray(), который принимает
     * на вход 5 целых чисел,  и возвращает массив из этих же чисел.
     * Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
     * 2. Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double, и возвращает массив из этих же чисел
     * Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
     * 3. Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов
     * Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     * 4. // 4я задача только для тех, кто хочет разобраться с методом класса String split()
     * Написать метод createArrayFromText(), который принимает на вход предложение из нескольких слов и возвращает
     *  массив из этих слов.
     * Например, createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */
    public int[] createIntArray(int a, int b, int c, int d, int e){
        int[] intArray = {a, b, c, d, e};

        return intArray;
    }

    public double[] createDoubleArray(double a, double b, double c, double d, double e){
        double[] doubleArray = {a, b, c, d, e};

        return doubleArray;
    }

    public String[] createStringArray(String a, String b, String c, String d, String e){
        String[] stringArray = {a, b, c, d, e};

        return stringArray;
    }

    public String [] createArrayFromText( String a){
        return a.split(" ");
    }


}
