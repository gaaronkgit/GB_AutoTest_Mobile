package ru.gb.tests.main;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.Base.BaseTest;
import ru.gb.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckScreenshotTest extends BaseTest
{
    @Test
    @Description("Проверка скрина UI главной страницы Pixel_1")
    public void CheckMainPageScreenshot()
    {
        openApp("Pixel_1").checkScreenshot();
    }
}
