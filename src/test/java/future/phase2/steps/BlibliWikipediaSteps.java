package future.phase2.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import future.phase2.pages.DuckduckgoPage;
import future.phase2.pages.WikipediaPage;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class BlibliWikipediaSteps {
    private DuckduckgoPage duckduckgoPage;
    private WikipediaPage wikipediaPage;

    @Given("^User open duckduckgo homepage$")
    public void userOpenDuckduckgoHomepage() {
        duckduckgoPage.open();
    }

    @When("^User type \"([^\"]*)\" on the search box$")
    public void userTypeOnTheSearchBox(String keyword) throws Throwable {
       duckduckgoPage.searching(keyword);
    }

    @And("^User click the Wikipedia link$")
    public void userClickTheWikipediaLink() {
        duckduckgoPage.clickResult();
    }

    @Then("^User should be able to see \"([^\"]*)\"$")
    public void userShouldBeAbleToSee(String expected) throws Throwable {
        MatcherAssert.assertThat(
                "Wikipedia is not open",
                wikipediaPage.getText(),
                Matchers.containsString(expected));
    }
}
