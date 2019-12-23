package com.hugh.simple;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* BracketValid Tester. 
* 
* @author <Authors name> 
* @since <pre>12�� 17, 2019</pre> 
* @version 1.0 
*/ 
public class BracketValidTest { 
    private BracketValid bracketValid;
    @Before
    public void before() throws Exception {
        bracketValid = new BracketValid();

    }

    @After
    public void after() throws Exception {

    }

    /**
    *
    * Method: isValid(String s)
    *
    */
    @Test
    public void testIsValid1() throws Exception {
    //TODO: Test goes here...
        boolean valid = bracketValid.isValid("()");
        Assert.assertTrue(valid);

    }

    @Test
    public void testIsValid2() throws Exception {
        //TODO: Test goes here...
        boolean valid = bracketValid.isValid("(#)");
        Assert.assertTrue(valid);

    }

    @Test
    public void testIsValid3() throws Exception {
        //TODO: Test goes here...
        boolean valid = bracketValid.isValid("((#)");
        Assert.assertFalse(valid);

    }


} 
