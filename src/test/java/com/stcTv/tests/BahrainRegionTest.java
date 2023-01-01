package com.stcTv.tests;


import com.stcTv.pages.BahrainRegionPage;
import com.stcTv.pages.KsaRegionPage;
import org.testng.annotations.Test;


public class BahrainRegionTest extends BaseTest {


    @Test(description="Validate the subscription package types,currency and price for Bahrain")
    public void validationForBahrainRegion()  {
        BahrainRegionPage bha =new BahrainRegionPage();
        bha.selectBahrain().firstPlan().secondPlan().thirdPlan();
    }
}


