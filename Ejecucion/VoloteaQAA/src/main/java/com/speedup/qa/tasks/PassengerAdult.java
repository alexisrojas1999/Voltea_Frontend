package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userInterfaces.PassengerAll.*;

public class PassengerAdult implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(COOKIES_ACCEPT));
        actor.attemptsTo(Click.on(PASSENGER_DROPDOWN));
        actor.attemptsTo(Click.on(ADD_ADULT));
        actor.attemptsTo(Click.on(ADD_ADULT));

    }

    public static PassengerAdult passengerAdult() {
        return Tasks.instrumented(PassengerAdult.class);
    }

}
