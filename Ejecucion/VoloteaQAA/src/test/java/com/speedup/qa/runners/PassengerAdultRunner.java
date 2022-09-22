package com.speedup.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/PassengerAdult.feature"
        , glue = "com/speedup/qa/stepsdefinitions"
        , snippets = SnippetType.CAMELCASE)


public class PassengerAdultRunner {
}
