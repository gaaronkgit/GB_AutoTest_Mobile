package ru.gb.tests.main;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.Base.BaseTest;
import ru.gb.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckFailScreenshotTest extends BaseTest
{
    @Test
    @Description("Проверка скрина UI")
    public void CheckFailMainPageScreenshot()
    {
        openApp("Pixel_1").checkFailScreenshot();
    }
}
