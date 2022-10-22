package project_utils;

public class Utils {
    public static boolean checkForEmptyArrayInt(int[] array){
        if (array.length != 0 ){

            return true;
        } else {

            return false;
        }
    }

    public static boolean checkForEmptyArrayDouble (double [] array){
        if (array.length != 0){

            return true;
        } else {

            return false;
        }
    }

    public static int lengthArray(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            count++;
        }

        return count;
    }

    public static int lengthArray (double[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            count++;
        }

        return count;
    }
}
