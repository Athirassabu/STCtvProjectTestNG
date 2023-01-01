package com.stcTv.pages;
import com.stcTv.config.ConfigFactory;
import com.stcTv.driver.DriverManager;
import com.stcTv.reports.ExtentLogger;
import org.openqa.selenium.By;

import static com.stcTv.utils.SeleniumUtils.*;

public class KsaRegionPage {
    private static final By TEXT_LITE=By.id("name-lite");
    private static final By TEXT_LITEPRICE=By.id("currency-lite");
    private static final By TEXT_CLASSIC=By.id("name-classic");
    private static final By TEXT_CLASSICPRICE=By.id("currency-classic");
    private static final By TEXT_PREMIUM=By.id("name-premium");
    private static final By TEXT_PREMIUMPRICE=By.id("currency-premium");


    public String getHomePageTitle()
    {
        return DriverManager.getDriver().getTitle();
    }

    public KsaRegionPage firstPlan()
    {
        String lite=getText(TEXT_LITE);
        String expectedFirstplan=ConfigFactory.getConfig().firstPlanKSA();
        String litePrice=getText(TEXT_LITEPRICE);
        String expectedFirstplanPrice=ConfigFactory.getConfig().firstPlanKSAprice();
        String currency=litePrice.substring(3,6);
        String title=getHomePageTitle();
        String expectedTitle=ConfigFactory.getConfig().titlePage();
        String expectedCurrencyKSA=ConfigFactory.getConfig().currencyKSA();
        if((title.equals(expectedTitle))&&(currency.equals(expectedCurrencyKSA))) {
            ExtentLogger.pass("Title of KSA region page is: " + title);
            ExtentLogger.pass("Currency for KSA is :"+currency);
        }
        else
            ExtentLogger.fail("Title of KSA region page is: " + title);
        if((lite.equals(expectedFirstplan))&&(litePrice.equals(expectedFirstplanPrice))) {
            ExtentLogger.pass("First subscription plan for KSA is:  " + lite + ", Price of " + lite + " is: " + litePrice);
        }
        else
            ExtentLogger.fail("First subscription plan for KSA is:  " + lite + ", Price of " + lite + " is: " + litePrice);
        return this;
    }

    public KsaRegionPage secondPlan()
    {
        String classic=getText(TEXT_CLASSIC);
        String classicPrice=getText(TEXT_CLASSICPRICE);
        String expectedSecondplan=ConfigFactory.getConfig().secondPlanKSA();
        String expectedSecondplanPrice=ConfigFactory.getConfig().secondPlanKSAprice();
        if((classic.equals(expectedSecondplan))&&(classicPrice.equals(expectedSecondplanPrice)))
        {
            ExtentLogger.pass("Second subscription plan for KSA is:  "+classic+", Price of "+classic+" is: "+classicPrice);
        }
        else
            ExtentLogger.fail("Second subscription plan for KSA is:  "+classic+", Price of "+classic+" is: "+classicPrice);
        return this;
    }

    public KsaRegionPage thirdPlan()
    {
        String premium=getText(TEXT_PREMIUM);
        String premiumPrice=getText(TEXT_PREMIUMPRICE);
        String expectedThirdplan=ConfigFactory.getConfig().thirdPlanKSA();
        String expectedThirdplanPrice=ConfigFactory.getConfig().thirdPlanKSAprice();
        if((premium.equals(expectedThirdplan))&&(premiumPrice.equals(expectedThirdplanPrice))) {
            ExtentLogger.pass("Third subscription plan for KSA is:  " + premium + ", Price of " + premium + " is: " + premiumPrice);
        }
        else
            ExtentLogger.fail("Third subscription plan for KSA is:  " + premium + ", Price of " + premium + " is: " + premiumPrice);
        return this;
    }

}




