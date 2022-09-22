package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userInterfaces.Origin.*;


public class Origin implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(COOKIES_ACCEPT));
        actor.attemptsTo(Click.on(ENTER_ORIGIN));
        actor.attemptsTo(Click.on(SELECT_COUNTRY));
        actor.attemptsTo(Click.on(SELECT_CITY));
        actor.attemptsTo(Click.on(SELECT_DATE_GO));
        actor.attemptsTo(Click.on(SELECT_DATE_RETURN));
        actor.attemptsTo(Click.on(CHOOSE_FLIGHT));

    }

    public static Origin origin() {
        return Tasks.instrumented(Origin.class);
    }
}
