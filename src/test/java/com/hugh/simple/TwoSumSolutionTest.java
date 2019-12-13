package com.hugh.simple;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
* TwoSumSolution Tester. 
* 
* @author <Authors name> 
* @since <pre>12�� 14, 2019</pre> 
* @version 1.0 
*/ 
public class TwoSumSolutionTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: twoSum(int[] nums, int target) 
* 
*/ 
@Test
public void testTwoSum() throws Exception {
    TwoSumSolution solution = new TwoSumSolution();
    int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
    Assert.assertArrayEquals(new int[]{0, 1}, result);

} 


} 
