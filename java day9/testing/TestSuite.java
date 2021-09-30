package com.Day9.testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CalculatorTest.class,
        ChangeStringCaseTest.class
})
public class TestSuite {
}
