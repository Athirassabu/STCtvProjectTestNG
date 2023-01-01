package com.stcTv.config;

import org.aeonbits.owner.Config;
@Config.Sources(value="file:${user.dir}/src/test/resources/config/config.properties")
public interface FrameworkConfig extends Config {

    long timeout();
    String url();
    String browser();
    String titlePage();
    String firstPlanKSA();
    String secondPlanKSA();
    String thirdPlanKSA();
    String firstPlanKSAprice();
    String secondPlanKSAprice();
    String thirdPlanKSAprice();
    String currencyKSA();

    String firstPlanBahrain();
    String secondPlanBahrain();
    String thirdPlanBahrain();
    String firstPlanBahrainprice();
    String secondPlanBahrainprice();
    String thirdPlanBahrainprice();
    String currencyBahrain();

    String firstPlanKuwait();
    String secondPlanKuwait();
    String thirdPlanKuwait();
    String firstPlanKuwaitprice();
    String secondPlanKuwaitprice();
    String thirdPlanKuwaitprice();
    String currencyKuwait();
}
