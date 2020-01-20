package future.phase2.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.duckduckgo.com")
public class DuckduckgoPage extends PageObject {
    @FindBy(name = "q")
    private WebElementFacade searchBox;

    @FindBy(linkText = "https://id.wikipedia.org/wiki/Blibli.com")
    private WebElementFacade searchResult;

    public void searching(String keyword){
        searchBox.typeAndEnter(keyword);
    }

    public void clickResult(){
        searchResult.waitUntilVisible().click();
    }
}
