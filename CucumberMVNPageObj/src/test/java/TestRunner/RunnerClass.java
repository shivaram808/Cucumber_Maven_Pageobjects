package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(plugin = {"html:target/cucumber-html-report"},features=".\\src\\test\\resources\\features", glue = {"stepDefinition"})
public class RunnerClass extends AbstractTestNGCucumberTests{


}