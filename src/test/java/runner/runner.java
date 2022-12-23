package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import pages.BasePage;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps",
    tags = "@Entrevistas"
    
)
public class runner{
    @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }

}