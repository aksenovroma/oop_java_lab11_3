package by.bntu.fitr.povt.noname.lab11.model.logic;

import by.bntu.fitr.povt.noname.lab11.model.entity.Vector;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Vector vector1;
    private Vector vector2;
    private Vector vector3;
    private int[] intArray1 = {4, 0, 5, 2, 3, 0, 4, 0, 1};
    private int[] intArray2 = null;
    private int[] intArray3 = {};

    @BeforeTest
    public void setVector(){
        vector1 = new Vector(intArray1);
        vector2 = new Vector(intArray2);
        vector3 = new Vector(intArray3);
    }

    @Test
    public void prodOfEvenElemTest(){
        int expected1 = 240;
        int actual1 = Calculator.prodOfEvenElem(vector1);

        int expected2 = 1;
        int actual2 = Calculator.prodOfEvenElem(vector2);

        int expected3 = 1;
        int actual3 = Calculator.prodOfEvenElem(vector3);

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void sumOfElemBetweenFirstAndLastZeroTest(){
        int expected1 = 14;
        int actual1 = Calculator.sumOfElemBetweenFirstAndLastZero(vector1);

        int expected2 = 0;
        int actual2 = Calculator.sumOfElemBetweenFirstAndLastZero(vector2);

        int expected3 = 0;
        int actual3 = Calculator.sumOfElemBetweenFirstAndLastZero(vector3);

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void indexOfFirstZeroTest(){
        int expected1 = 1;
        int actual1 = Calculator.indexOfFirstZero(vector1);

        int expected2 = -1;
        int actual2 = Calculator.indexOfFirstZero(vector2);

        int expected3 = -1;
        int actual3 = Calculator.indexOfFirstZero(vector3);

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void indexOfLastZeroTest(){
        int expected1 = 7;
        int actual1 = Calculator.indexOfLastZero(vector1);

        int expected2 = -1;
        int actual2 = Calculator.indexOfLastZero(vector2);

        int expected3 = -1;
        int actual3 = Calculator.indexOfLastZero(vector3);

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }
}
