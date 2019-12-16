package com.hugh.simple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 杜浩
 */
public class PalindromeTest {
    private PalindromeNumber palindromeNumber;
    @Before
    public void init(){
        palindromeNumber = new PalindromeNumber();
    }

    /**
     * 奇数回文数
     */
    @Test
    public void testOdds(){
        boolean palindrome = palindromeNumber.isPalindrome(12121);
        Assert.assertTrue(palindrome);
    }


    @Test
    public void testNegative(){
        boolean palindrome = palindromeNumber.isPalindrome(-12121);
        Assert.assertFalse(palindrome);
    }

    @Test
    public void testEven(){
        boolean palindrome = palindromeNumber.isPalindrome(1221);
        Assert.assertTrue(palindrome);
    }
}
