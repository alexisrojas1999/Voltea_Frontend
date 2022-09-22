package com.speedup.qa.stepsdefinitions;

import com.speedup.qa.tasks.OpenBrowser;
import com.speedup.qa.tasks.Origin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;


import net.serenitybdd.screenplay.actors.OnStage;



public class originStepDefinitions {

    @Given("^The user in the search section$")
    public void theUserInTheSearchSection() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }



    @When("^The user selects the country of origin$")
    public void thisUserSelectsTheOptionCountriesOfOrigin() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Origin.origin());
    }


}
