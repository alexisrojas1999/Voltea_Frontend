package com.speedup.qa.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PassengerAll {

    public static final Target COOKIES_ACCEPT = Target
            .the("Accept Cookies")
            .located(org.openqa.selenium.By.id("onetrust-accept-btn-handler"));

    public static final Target PASSENGER_DROPDOWN = Target
            .the("Validate passenger quantity")
            .located(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/div/div[2]/search-flow-wrapper/volotea-sf-services-range/div/volotea-sf-clickable-wrapper/div/div/form/div[1]/volotea-sf-passenger-input"));

    public static final Target ADD_ADULT = Target
            .the("Validate passenger quantity")
            .located(By.xpath("(//*[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[1]"));

    public static final Target ADD_CHILD = Target
            .the("Validate passenger quantity")
            .located(By.xpath("(//*[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[2]"));

    public static final Target ADD_BABY = Target
            .the("Validate passenger quantity")
            .located(By.xpath("(//*[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[3]"));

}
