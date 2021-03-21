package com.co.travelocity.web.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/reservar_hotel.feature",
        glue = "com.co.travelocity.web.stepdefinition",
        snippets = SnippetType.CAMELCASE


)
public class ReservaHotel {
}
