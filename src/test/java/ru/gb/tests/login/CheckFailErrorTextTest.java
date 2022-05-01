package ru.gb.tests.login;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import ru.gb.Base.BaseTest;

public class CheckFailErrorTextTest extends BaseTest
{
    public static final String VALID_EMAIL_ADDRESS = "Please enter a valid email address";

    @Test
    @Description("Проверяем поведения теста при падении проверки сообщения об ошибке валидного email на Pixel_1")
    public void CheckFailEmptyEmailPixel_1() {
        openApp("Pixel_1")
                .clickLoginMenuButton()
                .checkLoginErrorText(VALID_EMAIL_ADDRESS);
    }
}

