package com.speedup.qa.stepsdefinitions;

import com.speedup.qa.tasks.PassengerAdult;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class PassengerAdultStep {



    @When("^the user selects only two adults as passengers$")
    public void theUserSelectsOneAdultPassenger() {
        OnStage.theActorInTheSpotlight().wasAbleTo(PassengerAdult.passengerAdult());
    }


}
