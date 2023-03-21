package Runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",
        features ={"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = "html:target/site/cucumber-pretty.html"
)
public class _06_RunnerWithPlugin {

    //https://cucumber.io/docs/cucumber/reporting/?sbsearch=reports&lang=java
}
