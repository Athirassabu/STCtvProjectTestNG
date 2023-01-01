package com.stcTv.pages;

import com.stcTv.config.ConfigFactory;
import com.stcTv.driver.DriverManager;
import com.stcTv.reports.ExtentLogger;
import org.openqa.selenium.By;

import static com.stcTv.utils.SeleniumUtils.click;
import static com.stcTv.utils.SeleniumUtils.getText;

public class KuwaitRegionPage {
    private static final By TEXT_LITE=By.id("name-lite");
    private static final By TEXT_LITEPRICE=By.id("currency-lite");
    private static final By TEXT_CLASSIC=By.id("name-classic");
    private static final By TEXT_CLASSICPRICE=By.id("currency-classic");
    private static final By TEXT_PREMIUM=By.id("name-premium");
    private static final By TEXT_PREMIUMPRICE=By.id("currency-premium");
    private static final By BUTTON_COUNTRY=By.id("country-btn");
    private static final By BUTTON_KUWAIT=By.id("kw-contry-flag");


    public String getKuwaitPageTitle()
    {
        return DriverManager.getDriver().getTitle();
    }
    public KuwaitRegionPage selectKuwait(){
        click(BUTTON_COUNTRY);
        click(BUTTON_KUWAIT);
        return this;

    }

    public KuwaitRegionPage firstPlan()
    {
        String lite=getText(TEXT_LITE);
        String expectedFirstplan=ConfigFactory.getConfig().firstPlanKuwait();
        String litePrice=getText(TEXT_LITEPRICE);
        String expectedFirstplanPrice=ConfigFactory.getConfig().firstPlanKuwaitprice();
        String currency=litePrice.substring(4,7);
        String title=getKuwaitPageTitle();
        String expectedTitle=ConfigFactory.getConfig().titlePage();
        String expectedCurrencyKuwait=ConfigFactory.getConfig().currencyKuwait();
        if((title.equals(expectedTitle))&&(currency.equals(expectedCurrencyKuwait))) {
            ExtentLogger.pass("Title of Kuwait region page is: " + title);
            ExtentLogger.pass("Currency for Kuwait is :"+currency);
        }
        else
            ExtentLogger.fail("Title of Kuwait region page is: " + title);
        if((lite.equals(expectedFirstplan))&&(litePrice.equals(expectedFirstplanPrice))) {
            ExtentLogger.pass("First subscription plan for Kuwait is:  " + lite + ", Price of " + lite + " is: " + litePrice);
        }
        else
            ExtentLogger.fail("First subscription plan for Kuwait is:  " + lite + ", Price of " + lite + " is: " + litePrice);
        return this;
    }

    public KuwaitRegionPage secondPlan()
    {
        String classic=getText(TEXT_CLASSIC);
        String classicPrice=getText(TEXT_CLASSICPRICE);
        String expectedSecondplan=ConfigFactory.getConfig().secondPlanKuwait();
        String expectedSecondplanPrice=ConfigFactory.getConfig().secondPlanKuwaitprice();
        if((classic.equals(expectedSecondplan))&&(classicPrice.equals(expectedSecondplanPrice)))
        {
            ExtentLogger.pass("Second subscription plan for Kuwait is:  "+classic+", Price of "+classic+" is: "+classicPrice);
        }
        else
            ExtentLogger.fail("Second subscription plan for Kuwait is:  "+classic+", Price of "+classic+" is: "+classicPrice);
        return this;
    }

    public KuwaitRegionPage thirdPlan()
    {
        String premium=getText(TEXT_PREMIUM);
        String premiumPrice=getText(TEXT_PREMIUMPRICE);
        String expectedThirdplan=ConfigFactory.getConfig().thirdPlanKuwait();
        String expectedThirdplanPrice=ConfigFactory.getConfig().thirdPlanKuwaitprice();
        if((premium.equals(expectedThirdplan))&&(premiumPrice.equals(expectedThirdplanPrice))) {
            ExtentLogger.pass("Third subscription plan for Kuwait is:  " + premium + ", Price of " + premium + " is: " + premiumPrice);
        }
        else
            ExtentLogger.fail("Third subscription plan for Kuwait is:  " + premium + ", Price of " + premium + " is: " + premiumPrice);
        return this;
    }

}




