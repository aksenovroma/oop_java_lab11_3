package by.bntu.fitr.povt.noname.lab11.model.logic;

import by.bntu.fitr.povt.noname.lab11.model.entity.Vector;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Vector vector1;
    private Vector vector2;
    private Vector vector3;
    private Vector vector4;

    @BeforeTest
    public void setVector(){
        int[] array = {};
        vector1 = new Vector(4, 0, 5, 2, 3, 0, 4, 0, 1);
        vector2 = new Vector(null);
        vector3 = new Vector(array);
        vector4 = null;
    }

    @Test
    public void testProdOfEvenElem(){
        int expected1 = 240;
        int actual1 = Calculator.prodOfEvenElem(vector1);

        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void testProdOfEvenElemNullArray(){
        int expected2 = 1;
        int actual2 = Calculator.prodOfEvenElem(vector2);

        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testProdOfEvenElemEmptyArray(){
        int expected3 = 1;
        int actual3 = Calculator.prodOfEvenElem(vector3);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testProdOfEvenElemNullVector(){
        int expected3 = 1;
        int actual3 = Calculator.prodOfEvenElem(vector4);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testSumOfElemBetweenFirstAndLastZero(){
        int expected1 = 14;
        int actual1 = Calculator.sumOfElemBetweenFirstAndLastZero(vector1);

        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void testSumOfElemBetweenFirstAndLastZeroNullArray(){
        int expected2 = 0;
        int actual2 = Calculator.sumOfElemBetweenFirstAndLastZero(vector2);

        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testSumOfElemBetweenFirstAndLastZeroEmptyArray(){
        int expected3 = 0;
        int actual3 = Calculator.sumOfElemBetweenFirstAndLastZero(vector3);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testSumOfElemBetweenFirstAndLastZeroNullVector(){
        int expected3 = 0;
        int actual3 = Calculator.sumOfElemBetweenFirstAndLastZero(vector4);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testIndexOfFirstZero(){
        int expected1 = 1;
        int actual1 = Calculator.indexOfFirstZero(vector1);

        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void testIndexOfFirstZeroNullArray(){
        int expected2 = -1;
        int actual2 = Calculator.indexOfFirstZero(vector2);

        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testIndexOfFirstZeroEmptyArray(){
        int expected3 = -1;
        int actual3 = Calculator.indexOfFirstZero(vector3);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testIndexOfFirstZeroNullVector(){
        int expected3 = -1;
        int actual3 = Calculator.indexOfFirstZero(vector4);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testIndexOfLastZero(){
        int expected1 = 7;
        int actual1 = Calculator.indexOfLastZero(vector1);

        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void testIndexOfLastZeroNullArray(){
        int expected2 = -1;
        int actual2 = Calculator.indexOfLastZero(vector2);

        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testIndexOfLastZeroEmptyArray(){
        int expected3 = -1;
        int actual3 = Calculator.indexOfLastZero(vector3);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testIndexOfLastZeroNullVector(){
        int expected3 = -1;
        int actual3 = Calculator.indexOfLastZero(vector4);

        Assert.assertEquals(expected3, actual3);
    }
}
