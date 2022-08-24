package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/Features",glue= {"com.stepdefinition"},tags="@PIMRelatedDropDown",monochrome=true )
public class TestRunner extends AbstractTestNGCucumberTests {
	 
}
