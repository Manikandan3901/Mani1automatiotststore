package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="featurefiles/login.feature",
glue ="stepdefintion",monochrome = true ,
plugin = {"pretty","html:Report/html_report",
		"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Reports/Extent.html"
		})
public class Automationteststore_run {

}
