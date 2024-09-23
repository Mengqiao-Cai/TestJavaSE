package com.cmq.test;

import com.cmq.calculator.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author: cmq
 * @date: 9/22/2024 - 09 - 22 - 7:05 PM
 * @version: 1.0
 */
public class CalculatorTest {
    @Before
    public void init() {
        System.out.println("method test starts");
    }
    @After
    public void close() {
        System.out.println("method test ends");
    }
    @Test
    public void testAdd() {
        //System.out.println("test add");
        Calculator cal = new Calculator();
        int res = cal.add(10, 30);
        //System.out.println(res);
        Assert.assertEquals(40, res);
    }
    @Test
    public void testSub() {
        //System.out.println("test sub");
        Calculator cal = new Calculator();
        int res = cal.add(10, 30);
        System.out.println(res);
    }
}
