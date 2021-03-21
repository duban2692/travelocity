package com.co.travelocity.web.task;

import com.co.travelocity.web.userinterface.BusquedaHotel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class ReservarHotel implements Task {

    private String hotel;

    public ReservarHotel(String hotel) {
        this.hotel = hotel;
    }

    @Override
    @Step("{0} busca el hotel y lo agrega")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BusquedaHotel.TXT_HOTEL),
                Click.on(BusquedaHotel.TXT_HOTEL.of(hotel)));

    }

    public static Performable hotel(String hotel) {
        return Tasks.instrumented(ReservarHotel.class, hotel);
    }
}
