package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static modules.Hooks.driver;
import static org.junit.Assert.assertTrue;

public class GoogleSearchStepDefinition {

    @Given("I open google search page")
    public void iOpenGoogleSearchPage() {
        driver.get("https://www.google.com/");
    }

    @When("I lookup the word {string}")
    public void iLookupTheWord(String arg0) {
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(arg0);
        driver.findElement(By.name("btnK")).click();
    }

    @Then("search results display the word {string}")
    public void searchResultsDisplayTheWord(String arg0) {
        assertTrue(driver.getTitle().contains(arg0));
    }
}
