package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="./RavinderPOM/src/test/java/features"
,glue={"StepDefinition"})	


public class TestRunner 				
{		

}