package com.flipkart.iphoneValidation.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature Files",
            glue="com.flipkart.iphoneValidation.test",
            plugin="html:target",
            monochrome=true,
            dryRun=false
                      
                                                        
		
		
		                                                 )
public class TestRunner {
	

}
