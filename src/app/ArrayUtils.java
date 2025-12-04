package app;

import app.MethodInfo;
import app.Author;

public class ArrayUtils {

    @MethodInfo(
            methodName = "findMax",
            returnType = "int",
            description = "Возвращает максимальное значения масива"
    )
    @Author(name = "Nikolay", surname = "Krasnov")
    public static int findMax(int[] arr) {
       int max = arr[0];
       for (int i = 1; i < arr.length; i++) {
           if (arr[i] > max) {
               max = arr[i];
           }
       }
       System.out.println("Максимальный элемент масива: "+max);
       return max;

    }

    @MethodInfo(
            methodName = "sum",
            returnType = "int",
            description = "Вычисляет сумму элементов масива"
    )
    @Author(name = "Nikolay", surname = "Krasnov")
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма єлементов масива: "+sum);
        return sum;
    }
}
