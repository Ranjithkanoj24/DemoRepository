package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Path of the feature file"
,glue={"name of the package of stepDefinition"}
,format={"pretty","html:html-outpur","json:json-output/Cucumber.json","junit:junit-output/Cucumber.xml"}
,dryRun=true
,monochrome=true
,strict=true)
public class RunnerClass {

}
