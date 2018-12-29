package com.cucumber.test.cucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import junit.framework.Assert;


public class googleSearch {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	
	@Given("^I am on google homepage$")
	public void givenStatement() {
		driver.get("http://www.google.com");
		System.out.println("Given statement executed");
	}
	@When("^I type in a search with the keyword google$")
	public void whenStatement() {
		driver.findElement(By.xpath("//*[@type=\"text\"]")).sendKeys("Google");
		System.out.println("When statement executed");
	}
	@When("^I click on search$")
	public void andStatement() {
		driver.findElement(By.xpath("//*/div[2]/div/div[3]/center/input[1]")).click();
		System.out.println("When statement executed");
	}
	@Then("^I get my results$")
	public void thenStatement() {
		String expectedRes = driver.findElement(By.xpath("//*[text()='https://www.google.com/']")).getText();
		Assert.assertTrue(expectedRes.contains( "google.com"));
		System.out.println("Given statement executed");
		driver.quit();
	}
}
