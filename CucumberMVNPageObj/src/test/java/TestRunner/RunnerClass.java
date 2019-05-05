package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features=".\\src\\test\\resources\\features", glue = {"stepDefinition"})
public class RunnerClass extends AbstractTestNGCucumberTests{


}