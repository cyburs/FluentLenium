package org.fluentlenium.cucumber.step;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.cucumber.adapter.FluentCucumberTest;
import org.fluentlenium.cucumber.adapter.util.SharedDriver;
import org.fluentlenium.cucumber.page.LocalPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@SharedDriver(type = SharedDriver.SharedType.PER_SCENARIO)
public class SimpleScenarioMultiStep1 extends FluentCucumberTest {

    @Page
    LocalPage page;

    @Override
    public WebDriver getDefaultDriver() {
        return new HtmlUnitDriver();
    }

    @Given(value = "scenario multi1 I am on the first page")
    public void step1() {
        this.initFluent();
        this.initTest();
        goTo(page);
    }

    @After
    public void after() {
        this.quit();
    }

}
