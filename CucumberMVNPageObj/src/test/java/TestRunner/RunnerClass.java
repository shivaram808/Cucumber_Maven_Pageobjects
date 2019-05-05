package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(plugin = {"html:target/CucumberReports","json:target/cucumber.json",
"pretty:target/cucumber-pretty.txt","junit:target/cucumber-results.xml"},
features=".\\src\\test\\resources\\features", glue = {"stepDefinition"})
public class RunnerClass extends AbstractTestNGCucumberTests{


}