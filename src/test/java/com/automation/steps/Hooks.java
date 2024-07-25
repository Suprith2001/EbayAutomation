package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp()
    {
        DriverManager.initDriver();
        ConfigReader.initConfigReader();
    }

    @After
    public void breakDown()
    {

        DriverManager.getDriver().quit();
    }
}
