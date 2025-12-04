package app;

import java.lang.reflect.Method;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Class<?> clazz = ArrayUtils.class;

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo info = method.getAnnotation(MethodInfo.class);
                System.out.println("Метод: " + info.methodName());
                System.out.println("Тип возвращаемых данных: " + info.returnType());
                System.out.println("Описание: " + info.description());
            }

            if (method.isAnnotationPresent(Author.class)) {
                Author author = method.getAnnotation(Author.class);
                System.out.println("Автор: " + author.name() + " " + author.surname());
            }

            System.out.println("----------------------------------");
        }

        int arrLength = (int)(Math.random()*(16)+5);
        int[] array = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            array[i] = (int)(Math.random() * (80) + 1);
        }

        System.out.println(Arrays.toString(array));


        ArrayUtils.findMax(array);

        ArrayUtils.sum(array);

    }
}