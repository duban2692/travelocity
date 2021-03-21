package com.co.travelocity.web.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import com.co.travelocity.web.userinterface.UrlInicioWeb;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class InicioWeb implements Task {

    private UrlInicioWeb urlHome;

    public InicioWeb(UrlInicioWeb urlHome) {
        this.urlHome = urlHome;
    }

    @Override
    @Step("{0} ingresa al inicio de travelocity ")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.url(urlHome.Url()));

    }

    public static Performable openUrl(UrlInicioWeb urlHome) {
        return Tasks.instrumented(InicioWeb.class, urlHome);
    }
}
