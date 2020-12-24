package ru.vsu.cs.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.logic.CalculatorTheNumberOfElements;

public class CalculatorTheNumberOfElementsTest {

    @Test
    public void test1FirstCondition() {
        int array = CalculatorTheNumberOfElements.getFirstCondition(new int[]{1,2,3,4,5,6});
        int result = 3;
        Assert.assertEquals(result, array);
    }
    @Test
    public void test1SecondCondition() {
        int array = CalculatorTheNumberOfElements.getSecondCondition(new int[]{1,2,3,4,5,6});
        int result = 3;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test2FirstCondition() {
        int array = CalculatorTheNumberOfElements.getFirstCondition(new int[]{1,2,3,0,1,2});
        int result = 2;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test2SecondCondition() {
        int array = CalculatorTheNumberOfElements.getSecondCondition(new int[]{1,2,3,0,1,2});
        int result = 0;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test3FirstCondition() {
        int array = CalculatorTheNumberOfElements.getFirstCondition(new int[]{4,6,5,0,1,2});
        int result = 0;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test3SecondCondition() {
        int array = CalculatorTheNumberOfElements.getSecondCondition(new int[]{4,6,5,0,1,2});
        int result = 0;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test4FirstCondition() {
        int array = CalculatorTheNumberOfElements.getFirstCondition(new int[]{1,2,4,5,0,4});
        int result = 2;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test4SecondCondition() {
        int array = CalculatorTheNumberOfElements.getSecondCondition(new int[]{1,2,4,5,0,4});
        int result = 2;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test5FirstCondition() {
        int array = CalculatorTheNumberOfElements.getFirstCondition(new int[]{1,0,1,0,2,0,0});
        int result = 3;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test5SecondCondition() {
        int array = CalculatorTheNumberOfElements.getSecondCondition(new int[]{1,0,1,0,2,0,0});
        int result = 1;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test6FirstCondition() {
        int array = CalculatorTheNumberOfElements.getFirstCondition(new int[]{5,11,17,10,8,9,2});
        int result = 2;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test6SecondCondition() {
        int array = CalculatorTheNumberOfElements.getSecondCondition(new int[]{5,11,17,10,8,9,2});
        int result = 0;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test7FirstCondition() {
        int array = CalculatorTheNumberOfElements.getFirstCondition(new int[]{8,20,100,1,0,5,101});
        int result = 2;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test7SecondCondition() {
        int array = CalculatorTheNumberOfElements.getSecondCondition(new int[]{8,20,100,1,0,5,101});
        int result = 1;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test8FirstCondition() {
        int array = CalculatorTheNumberOfElements.getFirstCondition(new int[]{1,2,3,4,5,6,7});
        int result = 3;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test8SecondCondition() {
        int array = CalculatorTheNumberOfElements.getSecondCondition(new int[]{1,2,3,4,5,6,7});
        int result = 3;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test9FirstCondition() {
        int array = CalculatorTheNumberOfElements.getFirstCondition(new int[]{0,1,0,1,0,1,0,1,0});
        int result = 4;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test9SecondCondition() {
        int array = CalculatorTheNumberOfElements.getSecondCondition(new int[]{0,1,0,1,0,1,0,1,0});
        int result = 2;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test10FirstCondition() {
        int array = CalculatorTheNumberOfElements.getFirstCondition(new int[]{8,9,10,7,6,5,10,7,11});
        int result = 3;
        Assert.assertEquals(result, array);
    }

    @Test
    public void test10SecondCondition() {
        int array = CalculatorTheNumberOfElements.getSecondCondition(new int[]{8,9,10,7,6,5,10,7,11});
        int result = 2;
        Assert.assertEquals(result, array);
    }


}