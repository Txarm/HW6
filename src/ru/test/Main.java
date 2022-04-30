package ru.test;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateRandomArray()));
        // Task 1
        int costs = 0;
        for (int i = 0; i < generateRandomArray().length - 1; i++) {
            costs = generateRandomArray()[i] + costs;
        }
        System.out.println("Сумма трат за месяц составила " + costs + " рублей");

        // Task 2
        int maxCosts = 0;
        int minCosts = 1_000_000;
        for (int i = 0; i < generateRandomArray().length; i++) {
            if (generateRandomArray()[i] > maxCosts) {
                maxCosts = generateRandomArray()[i];
            }
            if (generateRandomArray()[i] < minCosts){
                minCosts = generateRandomArray()[i];
            }
            }
        System.out.println("Минимальная сумма трат за день составила " + minCosts + " рублей. Максимальная сумма трат за день составила " + maxCosts + " рублей.");
        // Task 3
        int allCosts = 0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            allCosts = generateRandomArray()[i] + allCosts;
        }
        float middleCosts = allCosts / 30;
        System.out.println(middleCosts);
        // Task 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] fullName = {'I', 'v', 'a', 'n', 'o', 'v', ' ', 'I', 'v', 'a', 'n'};
        for (char i = 0; i < fullName.length; i++) {
            System.out.print(fullName);
            break;
        }
    }

    int[] arr = generateRandomArray();


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}
