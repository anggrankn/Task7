package ru.vsu.cs.logic;

public class CalculatorTheNumberOfElements {
    private static int testEvenAndOddArrayLength(int[] arr) {
        int i = 0;
        if (arr.length % 2 != 1) {
            i = (arr.length + 1) / 2;
        } else {
            i = arr.length / 2 + 1;
        }
        return i;
    }

    public static int getFirstCondition(int[] arr) { // какой-либо элемент в левой половине массива
        int counter = 0;
        int enteredLength = 0;
        int middleLength = testEvenAndOddArrayLength(arr);
        for (int i = testEvenAndOddArrayLength(arr); i < arr.length; i++) {
            while (enteredLength < middleLength) {
                if (arr[i] >= arr[enteredLength]) {
                    counter++;
                    break;
                } else {
                    enteredLength++;
                }
            }
            enteredLength = 0;
        }
        return counter;
    }


    public static int getSecondCondition(int[] arr) { // все элементы в левой половине массива
        int counter = 0;
        int enteredLength = 0;
        int middleLength = testEvenAndOddArrayLength(arr);
        for (int i = testEvenAndOddArrayLength(arr); i < arr.length; i++) {
            while (enteredLength < middleLength) {
                if (arr[i] >= arr[enteredLength]) {
                    enteredLength++;
                    if (enteredLength == middleLength) {
                        counter++;
                    }
                } else {
                    break;
                }
            }
            enteredLength = 0;
        }
        return counter;
    }
}
