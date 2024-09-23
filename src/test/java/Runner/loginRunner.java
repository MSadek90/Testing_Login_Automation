package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "D:\\Automation_cucumber\\Task\\src\\main\\resources\\features",
        glue = {"Steps"}
)

public class loginRunner extends AbstractTestNGCucumberTests {

}
