package ru.test;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        // Task 1
        int costs = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            costs = arr[i] + costs;
        }
        System.out.println("Сумма трат за месяц составила " + costs + " рублей");

        // Task 2
        int maxCosts = 0;
        int minCosts = 1_000_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCosts) {
                maxCosts = arr[i];
            }
            if (arr[i] < minCosts){
                minCosts = arr[i];
            }
            }
        System.out.println("Минимальная сумма трат за день составила " + minCosts + " рублей. Максимальная сумма трат за день составила " + maxCosts + " рублей.");
        // Task 3
        int allCosts = 0;
        for (int i = 0; i < arr.length; i++) {
            allCosts = arr[i] + allCosts;
        }
        float middleCosts = allCosts / 30;
        System.out.println(middleCosts);
        // Task 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}
