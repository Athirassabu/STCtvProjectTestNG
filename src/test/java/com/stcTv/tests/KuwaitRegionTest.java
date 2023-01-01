package com.stcTv.tests;


import com.stcTv.pages.BahrainRegionPage;
import com.stcTv.pages.KuwaitRegionPage;
import org.testng.annotations.Test;


public class KuwaitRegionTest extends BaseTest {


    @Test(description="Validate the subscription package types,currency and price for Kuwait")
    public void validationForKuwaitRegion()  {
      KuwaitRegionPage kwd =new KuwaitRegionPage();
        kwd.selectKuwait().firstPlan().secondPlan().thirdPlan();
    }
}


