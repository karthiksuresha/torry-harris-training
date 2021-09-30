package com.Day9.testing;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChangeStringCaseTest {

    ChangeStringCase StringCase;
    @Before
    public void setUp() throws Exception {
        System.out.println("Before test Case");
        StringCase=new ChangeStringCase();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After test Case");
    }

    @Test
    public void toCapitalLetters() {
        Assert.assertEquals("ABCD",StringCase.toCapitalLetters("abcd"));
    }

    @Test
    public void toSmallLetters() {
        Assert.assertEquals("india",StringCase.toSmallLetters("INDIA"));
    }
}