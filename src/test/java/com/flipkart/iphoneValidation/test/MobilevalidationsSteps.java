package com.flipkart.iphoneValidation.test;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilevalidationsSteps {

	public static String mn="iPhone";
	

	@Given("Skiping the login alert")
	public void skiping_the_login_alert() throws Exception {
		Thread.sleep(3000);
		Hooks.driver.findElement(By.xpath("(//button[contains(@class,'')])[2]")).click();
	    
	}

	@When("user searches")
	public void user_searches() {
		
		
		WebElement serch=Hooks.driver.findElement(By.xpath("//input[contains(@name,'q')]"));
		serch.sendKeys((mn),Keys.ENTER);
	    
	}

	@When("user clicks the mobile")
	public void user_clicks_the_mobile() throws Exception {
		Thread.sleep(3000);
		Hooks.driver.findElement(By.xpath("(//div[contains(text(),'"+mn+"')])[2]")).click();
		
		
		
	    
	} 

	@When("windowhandlings")
	public void windowhandlings() {
		String pWin=Hooks.driver.getWindowHandle();
		Set<String> cWin=Hooks.driver.getWindowHandles();
		
		for(String x:cWin)
		{
			if(!pWin.equals(x));
			Hooks.driver.switchTo().window(x);
			
			String title1=Hooks.driver.getTitle();
			System.out.println(title1);
		}
	}

	@When("enter pincode")
	public void enter_pincode() {
		WebElement pin=	Hooks.driver.findElement(By.xpath("//input[@id='pincodeInputId']"));
		pin.sendKeys(("600097"),Keys.ENTER);
	}

	@Then("validate the mobiles")
	public void validate_the_mobiles() {
		 WebElement cartc=Hooks.driver.findElement(By.xpath("(//button[contains(@class,'2Kp')])[1]"));
		 cartc.click();
		
	}

	@Then("closing browser")
	public void closing_browser() {
		Hooks.driver.quit();
	} 
	@When("user search by one d map")
	public void user_search_by_one_d_map(DataTable datatables)  {

      Map<String , String> adata = datatables.asMap(String.class, String.class);
	 WebElement serch=Hooks.driver.findElement(By.xpath("(//input[contains(@name,'q')])"));
	serch.sendKeys(adata.get("1"),Keys.ENTER);
		
	}
	@When("user searches {string}")
	public void user_searches(String phone) {
		
		   mn=phone;
		   WebElement serch=Hooks.driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			serch.sendKeys(phone,Keys.ENTER);	
			
}

}
	
	
	


