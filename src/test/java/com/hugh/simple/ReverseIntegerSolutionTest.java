package com.hugh.simple;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* ReverseIntegerSolution Tester. 
* 
* @author <Authors name> 
* @since <pre>12�� 14, 2019</pre> 
* @version 1.0 
*/ 
public class ReverseIntegerSolutionTest {

private ReverseIntegerSolution revSolution;

@Before
public void before() throws Exception {
    revSolution = new ReverseIntegerSolution();

} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: reverse(int x) 
* 
*/ 
@Test
public void testReverseInteger() throws Exception {
//TODO: Test goes here...
    int rev = revSolution.reverse(123);
    Assert.assertEquals(321, rev);
}

    public void testReverseFloor() throws Exception {
//TODO: Test goes here...
        int rev = revSolution.reverse(-2<<32);
        Assert.assertEquals(0, rev);
    }

    public void testReverseMinus() throws Exception {
//TODO: Test goes here...
        int rev = revSolution.reverse(-123);
        Assert.assertEquals(-321, rev);
    }

    public void testReverseZero() throws Exception {
//TODO: Test goes here...
        int rev = revSolution.reverse(120);
        Assert.assertEquals(21, rev);
    }

    public void testReverseCeil() throws Exception {
//TODO: Test goes here...
        int rev = revSolution.reverse(2<<32);
        Assert.assertEquals(0, rev);
    }


} 
