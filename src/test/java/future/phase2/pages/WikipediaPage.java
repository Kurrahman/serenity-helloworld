package future.phase2.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class WikipediaPage extends PageObject {
    @FindBy(tagName = "body")
    WebElementFacade bodyText;

    public String getText(){
        return bodyText.getText();
    }

}
