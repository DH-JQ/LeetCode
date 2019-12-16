package com.hugh.simple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 杜浩
 */
public class RomanToIntTest {
    private RomanToInt romanToInt;
    @Before
    public void init(){
        romanToInt = new RomanToInt();
    }

    /**
     * 测试空字符串
     */
    @Test
    public void testNull() {
        int i = romanToInt.romanToInt("");
        Assert.assertEquals(0, i);
    }

    /**
     * 测试空字符串
     */
    @Test
    public void testThree() {
        int i = romanToInt.romanToInt("III");
        Assert.assertEquals(3, i);
    }

    /**
     * 测试空字符串
     */
    @Test
    public void testIllegal() {
        try {

            int i = romanToInt.romanToInt("ABCd");
        } catch (IllegalArgumentException e) {
            Assert.assertNotNull(e);
        }

    }


}
