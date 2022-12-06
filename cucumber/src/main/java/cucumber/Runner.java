package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = {"src/main/java/feature/sample.feature"},
dryRun = !true,
glue = {"functions","hooks"},
monochrome = true,
snippets = SnippetType.CAMELCASE
//plugin = {"pretty","report:html"},

//tags = "@positive"

)
public class Runner extends AbstractTestNGCucumberTests{

	
	
	
}
