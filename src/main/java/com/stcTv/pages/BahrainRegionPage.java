package com.stcTv.pages;

import com.stcTv.config.ConfigFactory;
import com.stcTv.driver.DriverManager;
import com.stcTv.reports.ExtentLogger;
import org.openqa.selenium.By;

import static com.stcTv.utils.SeleniumUtils.click;
import static com.stcTv.utils.SeleniumUtils.getText;

public class BahrainRegionPage {
    private static final By TEXT_LITE=By.id("name-lite");
    private static final By TEXT_LITEPRICE=By.id("currency-lite");
    private static final By TEXT_CLASSIC=By.id("name-classic");
    private static final By TEXT_CLASSICPRICE=By.id("currency-classic");
    private static final By TEXT_PREMIUM=By.id("name-premium");
    private static final By TEXT_PREMIUMPRICE=By.id("currency-premium");
    private static final By BUTTON_COUNTRY=By.id("country-btn");
    private static final By BUTTON_BAHRAIN=By.id("bh-contry-flag");


    public String getBahrainPageTitle()
    {
        return DriverManager.getDriver().getTitle();
    }
    public BahrainRegionPage selectBahrain(){
        click(BUTTON_COUNTRY);
        click(BUTTON_BAHRAIN);
        return this;

    }

    public BahrainRegionPage firstPlan()
    {
        String lite=getText(TEXT_LITE);
        String expectedFirstplan=ConfigFactory.getConfig().firstPlanBahrain();
        String litePrice=getText(TEXT_LITEPRICE);
        String expectedFirstplanPrice=ConfigFactory.getConfig().firstPlanBahrainprice();
        String currency=litePrice.substring(2,5);
        String title=getBahrainPageTitle();
        String expectedTitle=ConfigFactory.getConfig().titlePage();
        String expectedCurrencyBahrain=ConfigFactory.getConfig().currencyBahrain();
        if((title.equals(expectedTitle))&&(currency.equals(expectedCurrencyBahrain))) {
            ExtentLogger.pass("Title of Bahrain region page is: " + title);
            ExtentLogger.pass("Currency for Bahrain is :"+currency);
        }
        else
            ExtentLogger.fail("Title of Bahrain region page is: " + title);
        if((lite.equals(expectedFirstplan))&&(litePrice.equals(expectedFirstplanPrice))) {
            ExtentLogger.pass("First subscription plan for Bahrain is:  " + lite + ", Price of " + lite + " is: " + litePrice);
        }
        else
            ExtentLogger.fail("First subscription plan for Bahrain is:  " + lite + ", Price of " + lite + " is: " + litePrice);
        return this;
    }

    public BahrainRegionPage secondPlan()
    {
        String classic=getText(TEXT_CLASSIC);
        String classicPrice=getText(TEXT_CLASSICPRICE);
        String expectedSecondplan=ConfigFactory.getConfig().secondPlanBahrain();
        String expectedSecondplanPrice=ConfigFactory.getConfig().secondPlanBahrainprice();
        if((classic.equals(expectedSecondplan))&&(classicPrice.equals(expectedSecondplanPrice)))
        {
            ExtentLogger.pass("Second subscription plan for Bahrain is:  "+classic+", Price of "+classic+" is: "+classicPrice);
        }
        else
            ExtentLogger.fail("Second subscription plan for Bahrain is:  "+classic+", Price of "+classic+" is: "+classicPrice);
        return this;
    }

    public BahrainRegionPage thirdPlan()
    {
        String premium=getText(TEXT_PREMIUM);
        String premiumPrice=getText(TEXT_PREMIUMPRICE);
        String expectedThirdplan=ConfigFactory.getConfig().thirdPlanBahrain();
        String expectedThirdplanPrice=ConfigFactory.getConfig().thirdPlanBahrainprice();
        if((premium.equals(expectedThirdplan))&&(premiumPrice.equals(expectedThirdplanPrice))) {
            ExtentLogger.pass("Third subscription plan for Bahrain is:  " + premium + ", Price of " + premium + " is: " + premiumPrice);
        }
        else
            ExtentLogger.fail("Third subscription plan for Bahrain is:  " + premium + ", Price of " + premium + " is: " + premiumPrice);
        return this;
    }

}




