package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles",glue="stepDefinitions",plugin={"html:target/cucumber-reports","com.cucumber.listener.ExtentCucumberFormatter:Reports/myreport.html"},tags={"@tag3"},dryRun=false)
public class LoginTestRunner {

}
