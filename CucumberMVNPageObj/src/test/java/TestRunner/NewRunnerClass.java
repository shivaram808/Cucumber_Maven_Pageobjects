package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features=".\\src\\test\\resources\\TsRtcScripts",tags ="@MyAccount", glue = {"TestScripts"})
public class NewRunnerClass extends AbstractTestNGCucumberTests{


}

