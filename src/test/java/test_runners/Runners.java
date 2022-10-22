package test_runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features",
        glue = "org.final_project_software_testing_amit.step_definitions",
        tags = "@SmokeTest",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml", "rerun:target/rerun.xml"}
)
class Runners extends AbstractTestNGCucumberTests {

}
