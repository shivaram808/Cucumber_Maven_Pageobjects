package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features=".\\src\\test\\resources\\TsRtcScripts", glue = {"TestScripts"})
public class RunnerClass extends AbstractTestNGCucumberTests{


}

