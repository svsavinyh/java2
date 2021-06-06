package ru.savinykh.java.core;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"Apple", "Grape", "Pineapple", "Orange", "Strawberry"};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Введите поочередно номера элементов массива, которые хотите поменять местами (от 1 до 5) :");
        int number1 = sc.nextInt() - 1;
        int number2 = sc.nextInt() - 1;
        swap(arr, number1, number2);

        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();

        System.out.println("Введите поочередно количество фруктов в коробках (первые 2 коробки - апельсины; 3,4 - яблоки) :");
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();
        int number5 = sc.nextInt();
        int number6 = sc.nextInt();
        orangeBox.addFruit(new Orange(), number3);
        orangeBox1.addFruit(new Orange(), number4);
        appleBox.addFruit(new Apple(), number5);
        appleBox1.addFruit(new Apple(), number6);

        System.out.println("Вес первой коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("Вес второй коробки с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Вес первой коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес второй коробки с яблоками: " + appleBox1.getWeight());
        System.out.println("Сравнение: ");
        System.out.println("Коробки с апельсинами одинаковы по весу: " + orangeBox.compare(orangeBox1));
        System.out.println("Первая коробка с апельсинами равна по весу первой коробке с яблоками: " + orangeBox.compare(appleBox));
        System.out.println("Первая коробка с апельсинами равна по весу второй коробке с яблоками: " + orangeBox.compare(appleBox1));
        System.out.println("Вторая коробка с апельсинами равна по весу первой коробке с яблоками:: " + orangeBox1.compare(appleBox));
        System.out.println("Вторая коробка с апельсинами равна по весу второй коробке с яблоками: " + orangeBox1.compare(appleBox1));
        System.out.println("Коробки с яблоками одинаковы по весу: " + appleBox.compare(appleBox1));
        //System.out.println("Пересыпем все апельсины из первой коробки во вторую, все яблоки из первой - во вторую ");
        System.out.println("Введите номер коробки из которой надо пересыпать все апельсины (1 или 2) :");
        int number7 = sc.nextInt();
        if (number7 == 1) orangeBox.pourTo(orangeBox1);
        else orangeBox1.pourTo(orangeBox);
        System.out.println("Введите номер коробки из которой надо пересыпать все яблоки (3 или 4) :");
        int number8 = sc.nextInt();
        if (number8 == 3) appleBox.pourTo(appleBox1);
        else appleBox1.pourTo(appleBox);

        System.out.println("Вес коробок с яблоками и апельсинами измениться следующим образом: ");
        System.out.println("Первая коробка с апельсинами: " + orangeBox.getWeight());
        System.out.println("Вторая коробка с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Первая коробка с яблоками: " + appleBox.getWeight());
        System.out.println("Вторая коробка с яблоками: " + appleBox1.getWeight());
    }

    public static void swap(Object[] arr, int n1, int n2) {
        Object sw;
        sw = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = sw;
        System.out.println("Массив после перестановки двух элементов: " + Arrays.toString(arr));
    }
}
