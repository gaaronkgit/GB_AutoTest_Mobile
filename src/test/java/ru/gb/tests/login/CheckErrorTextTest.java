package ru.gb.tests.login;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import ru.gb.Base.BaseTest;

public class CheckErrorTextTest extends BaseTest
{
    public static final String VALID_EMAIL_ADDRESS = "Please enter a valid email address";

    @Test
    @Description("Проверяем сообщение об ошибке при невалидной email на Pixel_1")
    public void CheckEmptyEmailPixel1() {
        openApp("Pixel_1")
                .clickLoginMenuButton()
                .clickLoginButton()
                .checkLoginErrorText(VALID_EMAIL_ADDRESS);
    }

    @Test
    @Description("Проверяем сообщение об ошибке при невалидной email на Pixel_2")
    public void CheckEmptyEmailPixel2() {
        openApp("Pixel_2")
                .clickLoginMenuButton()
                .clickLoginButton()
                .checkLoginErrorText(VALID_EMAIL_ADDRESS);
    }
}
