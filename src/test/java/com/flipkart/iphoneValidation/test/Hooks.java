package com.flipkart.iphoneValidation.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {  
	
public static WebDriver driver; 

	@Before
	public void launch() {
	
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    String link =("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    driver.get(link);
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    String title=driver.getTitle();
	    System.out.println(title);
	}
	@After
	public void exitBrow() {
		driver.quit();

	}
	
	
	
}

