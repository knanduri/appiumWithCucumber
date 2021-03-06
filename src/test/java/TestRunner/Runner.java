package TestRunner;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import org.testng.annotations.Test;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue={"stepDefinitions"}, tags = {"~@run","@test","~@ignore"}
)


@Test
public class Runner extends AbstractTestNGCucumberTests {

}