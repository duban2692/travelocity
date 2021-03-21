package com.co.travelocity.web.stepdefinition;

import com.co.travelocity.web.task.InicioWeb;
import com.co.travelocity.web.userinterface.BusquedaHotel;
import com.co.travelocity.web.task.ReservarHotel;
import com.co.travelocity.web.userinterface.UrlInicioWeb;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ReservaHotel {

    @Before
    public void prepareStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("^ana ingresa al portal web travelocity$")
    public void anaIngresaAlPortalWebTravelocity() {
        theActorCalled("Ana").attemptsTo(
                InicioWeb.openUrl(UrlInicioWeb.UrlInicio));
    }

    @Cuando("^visualiza el Rionegro procede a realizar el check-in y check-out$")
    public void visualizaElRionegroProcedeARealizarElCheckInYCheckOut(String hotel) {

        theActorInTheSpotlight().attemptsTo(ReservarHotel.hotel(hotel));

    }


    @Entonces("^verifica el hotel que se reservo$")
    public void verificaElHotelQueSeReservo() {


    }
}
