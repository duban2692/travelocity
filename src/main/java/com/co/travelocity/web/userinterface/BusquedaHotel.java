package com.co.travelocity.web.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusquedaHotel {

    public static final Target TXT_HOTEL = Target.the("Ingrese el hotel que desea buscar").located(By.xpath("//button[@class ='uitk-faux-input' and button[contains(text(),'Going to')]"));

    public static final Target TXT = Target.the("Ingrese el hotel que desea buscar").located(By.id("location-field-destination"));


  //
    public static final Target BTN_CHECK_IN = Target.the("Realizar check-in de hotel").located(By.id("d1-bt"));
    public static final Target BTN_CHECK_OUT = Target.the("Realizar check-out de hotel").located(By.id("d2-btn"));
    public static final Target BTN_COMPRA = Target.the(" Finaliza la compra").located(By.xpath("(//button[@class='btn btn-primary'])[3]"));

}
