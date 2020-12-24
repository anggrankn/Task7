package ru.vsu.cs.console;

import ru.vsu.cs.ArrayUtil;
import ru.vsu.cs.logic.CalculatorTheNumberOfElements;


public class Main {

    public static void main(String[] args) {
        int[] array = ArrayUtil.readIntArrayFromConsole();
        System.out.println(CalculatorTheNumberOfElements.getFirstCondition(array));
        System.out.println(CalculatorTheNumberOfElements.getSecondCondition(array));
    }
}
