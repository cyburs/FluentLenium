package org.fluentlenium.core;

import org.openqa.selenium.WebDriver;

/**
 * Use the Page Object Pattern to have more resilient tests.
 */
public abstract class FluentPage extends Fluent {

    public FluentPage() {
        super();
    }

    public FluentPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Url of the Page
     *
     * @return page URL
     */
    public String getUrl() {
        return null;
    }

    /**
     * Should check if the navigator is on correct page.
     * <p>
     * For example :
     * assertThat(title()).isEqualTo("Page 1");
     * assertThat("#reallyImportantField").hasSize(1);
     */
    public void isAt() {
    }

    /**
     * Go to the url defined in the page
     */
    public final void go() {
        goTo(getUrl());
    }


}
