package com.flipkart.iphoneValidation.test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IphoneValidationSteps {
	
	
	public static String mn;

     
	@Given("Skip the login alert")
	public void skip_the_login_alert() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		Hooks.driver.findElement(By.xpath("(//button[contains(@class,'')])[2]")).click();
	   
	}

	@When("user search")
	public void user_search() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement serch=Hooks.driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		serch.sendKeys(("Sony Aplha"),Keys.ENTER);
		
	    
	}

	@When("users clicks the mobile")
	public void users_clicks_the_mobile() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Robot r=new Robot();
		//Hooks.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		//r.keyPress(KeyEvent.VK_ENTER);
	   // throw new io.cucumber.java.PendingException();
	Hooks.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	Hooks.driver.findElement(By.xpath("(//div[contains(@class,'4rR')])[1]")).click();
		
	}

	@When("windowhandling")
	public void windowhandling() {
	    // Write code here that turns the phrase above into concrete actions

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
	@When("enter the pincode")
	public void enter_the_pincode() {
	WebElement pin=	Hooks.driver.findElement(By.xpath("//input[@id='pincodeInputId']"));
	pin.sendKeys(("600097"),Keys.ENTER);
	
		
	}

	@Then("I validate the mobiles")
	public void i_validate_the_mobiles() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
 WebElement cartc=Hooks.driver.findElement(By.xpath("(//button[contains(@class,'2Kp')])[1]"));
cartc.click();
	   
	}

	@Then("close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
		Hooks.driver.quit();
	   
	}
	
	@When("user search by one d list")
	public void user_search_by_one_d_list(DataTable datatable) throws Exception {
	  
	    List<String> datas=datatable.asList();
	    mn = datas.get(0);
	    WebElement serch=Hooks.driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		serch.sendKeys(mn,Keys.ENTER);	
		
	}			
		//Thread.sleep(2000);

	
	
	
}
