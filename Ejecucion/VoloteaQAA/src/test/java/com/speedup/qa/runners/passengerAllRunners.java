package com.speedup.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/passengerAll.feature"
        , glue = "com/speedup/qa/stepsdefinitions"
        , snippets = SnippetType.CAMELCASE)

public class passengerAllRunners {
}
