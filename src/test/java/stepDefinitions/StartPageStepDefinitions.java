package stepDefinitions;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import exceptions.PropertyReaderException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import readerUtils.ReaderInterface;
import readerUtils.RyanairReaderInterface;
import readerUtils.impl.Reader;
import readerUtils.impl.RyanairReader;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class StartPageStepDefinitions {

    Reader reader;
    RyanairReader ryanairReader;

    @Given("is a start page with a flight search form")
    public void isAStartPageWithAFlightSearchForm() throws PropertyReaderException {
        this.reader = ReaderInterface.createReader();
        this.ryanairReader = RyanairReaderInterface.createRyanairReader();

        open(this.reader.getBaseUrl());
    }

    @When("the passenger accept all cookies")
    public void thePassengerAcceptAllCookies() {
        $(By.xpath(this.ryanairReader.getAcceptAllCookiesButton())).click();
    }

    @When("the passenger selects Cologne as departure")
    public void thePassengerSelectsDeparture() {
        Selenide.sleep(this.reader.getStandardWaitTime());
        $(By.xpath(this.ryanairReader.getInputFieldDeparture())).click();

        $(By.xpath(this.ryanairReader.getDepartureContextMenuCologne())).click();
    }

    @When("the passenger selects {string} as destination")
    public void thePassengerSelectsDestination(String destination) {
        $(By.xpath(this.ryanairReader.getInputFieldDestination())).sendKeys(destination);
    }

    @When("the passenger clicks the search button")
    public void thePassengerClicksTheSearchButton() {
        $(By.xpath(this.ryanairReader.getSearchButton())).click();
    }

    @Then("a result page is loaded and contains text {string}")
    public void aResultPageIsLoadedAndContainsText(String text) {
        Assert.assertTrue(
                $(By.xpath(this.ryanairReader.getText(text)))
                        .isDisplayed()
        );
    }

}
