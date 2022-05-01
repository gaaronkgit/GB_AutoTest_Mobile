package ru.gb.tests;

import io.appium.java_client.MobileBy;
import org.testng.annotations.Test;
import ru.gb.Base.BaseTest;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class ScreenshotHelper extends BaseTest
{
    @Test
    public void createScreen()
    {
        openApp("Pixel_1");
        File actualScreenshot = $(MobileBy.AccessibilityId("Home-screen")).screenshot();
    }
}
