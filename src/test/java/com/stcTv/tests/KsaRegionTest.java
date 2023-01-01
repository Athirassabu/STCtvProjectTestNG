package com.stcTv.tests;


import com.stcTv.pages.KsaRegionPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class KsaRegionTest extends BaseTest {


    @Test(description="Validate the subscription package types,currency and price for KSA")
    public void validationForKSARegion()  {
        KsaRegionPage ksa =new KsaRegionPage();
        ksa.firstPlan().secondPlan().thirdPlan();
    }
}


