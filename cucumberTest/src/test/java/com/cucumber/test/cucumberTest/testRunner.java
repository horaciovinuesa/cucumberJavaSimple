package com.cucumber.test.cucumberTest;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format= {"pretty", "html:reports/test-reports"},tags= "@smoke")

public class testRunner {

}
