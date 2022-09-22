package com.speedup.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Origin {

    public static final Target COOKIES_ACCEPT = Target
            .the("Accept Cookies")
            .located(By.id("onetrust-accept-btn-handler"));

    public static final Target ENTER_ORIGIN = Target
            .the("Select Origin")
            .located(By.id("input-text_sf-origin"));


    public static final Target SELECT_COUNTRY = Target
            .the("Select a country")
            .located(By.xpath("(//div[@class='v7-card__box']//ul[@class='v7-card__data'])[1]"));


    public static final Target SELECT_CITY = Target
            .the("Select a city")
            .located(By.xpath("(//div[@class='v7-card__box']//ul[@class='v7-card__data'])[4]"));



    public static final Target SELECT_DATE_GO = Target
            .the("Select date")
            .located(By.xpath("//*[@id=\"vol-month-8\"]/div/sf-calendar-day[26]"));

    public static final Target SELECT_DATE_RETURN = Target
            .the("Select date")
            .located(By.xpath("//*[@id=\"vol-month-8\"]/div/sf-calendar-day[26]"));

    public static final Target CHOOSE_FLIGHT = Target
            .the("Select date")
            .located(By.xpath("//span[@class='v7-btn__text v7-btn__text--icon ng-star-inserted']"));

}