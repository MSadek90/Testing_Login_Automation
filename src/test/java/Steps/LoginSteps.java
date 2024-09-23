package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import utitlies.PropertiesFileLoader;


import java.util.Objects;
import java.util.Properties;

import static utitlies.PropertiesManager.getProperty;

public class LoginSteps {

    public WebDriver driver;

    private final Properties prop = getProperty("D:\\Automation_cucumber" +
            "\\Task\\src\\main\\resources" +
            "\\Config.properties");

    private LoginPage loginPage;


    @Given("the user navigates to login page")
    public void the_User_Navigates_To_Login_Page() {
        driver = new ChromeDriver();
        driver.get(prop.getProperty("URL"));
        System.out.println(" URL: " + prop.getProperty("URL"));
        loginPage = new LoginPage(driver);
    }


    @When("the user enters a valid username in the username filed")
    public void the_User_Enter_Valid_User_In_The_User_Filed(String username,String password) {
        loginPage
                .enterUserName(username)
                        .enterPassword(password)
                                    .clickLoginButton();
    }


    @When("the user enters an Invalid username in the username field")
    public void the_User_Enter_InValid_User_In_The_User_Filed(String username,String password) {
        System.out.println(username);
        loginPage
                .enterUserName(username)
                          .enterPassword(password)
                                       .clickLoginButton();
    }


    @Then("the user should be navigated to the home page")
    public void the_User_ShouldBeNavigatedTo_The_Home_Page() {
        Assert.assertTrue(Objects.requireNonNull(driver.getCurrentUrl())
                .contains("dashboard"));
    }


}
