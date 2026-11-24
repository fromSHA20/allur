package org.example.junit4.page;

import io.qameta.allure.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Epic("Авторизация пользователя")
@Feature("Проверка анкеты для авторизации пользователя")
public class TestBoxPage {
    WebDriver driver;
    WebDriverWait time;

    private By userNameLocator = By.xpath("//input[@id='userName']");
    private By emailLocator = By.xpath("//input[@id='userEmail']");
    private By addresLocator = By.xpath("//textarea[@placeholder='Current Address']");
    private By permanentAdrLocator = By.xpath("//textarea[@id='permanentAddress']");

    @Story("Ввод логина и емаил")
    public void loginUser(String userName, String userEmail){
        userNameLocator(userName);
        emailLocator(userEmail);
    }

    public TestBoxPage(WebDriver driver) {
        this.driver = driver;

        this.time = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    //шаг который отображается в Allure
    @Step("Указать полное имя пользователя")
    public void userNameLocator(String nameUser) {
        driver.findElement(userNameLocator).sendKeys(nameUser);
    }

    @Step("Указать почту @mail пользователя")
    public void emailLocator(String emailUser) {
        driver.findElement(emailLocator).sendKeys(emailUser);
    }

    @Step("Указать адрес пользователя")
    public void addresLocator(String adress) {
        driver.findElement(addresLocator).sendKeys(adress);
    }

    @Step("Указать подолнительный адрес пользователя")
    public void permanentAdrLocator(String permAdres) {
        driver.findElement(permanentAdrLocator).sendKeys(permAdres);
    }


}
