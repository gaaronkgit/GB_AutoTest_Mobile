package ru.gb;

import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.gb.Base.BaseTest;

public class Lesson2Test extends BaseTest
{
    @Test
    public void CheckEmptyEmail()  {

        /*openApp()

        MobileElement loginMenuButton = (MobileElement) driver.findElementByAccessibilityId("Login");
        loginMenuButton.click();
        Thread.sleep(2000);
//      Нажимаем Login на странице логин/пароль.
        MobileElement loginButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup");
        loginButton.click();
        Thread.sleep(2000);
//      Проверяем текст ошибки.
        MobileElement errorText = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
        Assert.assertEquals(errorText.getText(), "Please enter a valid email address");*/
    }
}
