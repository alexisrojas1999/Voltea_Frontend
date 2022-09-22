package com.speedup.qa.stepsdefinitions;

import com.speedup.qa.tasks.PassengerAll;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class passengerAllStepDefinitions {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Alexis Rojas");

    }

    @When("^the user selects one of each option$")
    public void theUserSelectsOneAdultPassenger() {
        OnStage.theActorInTheSpotlight().wasAbleTo(PassengerAll.passengerAll());
    }



}
