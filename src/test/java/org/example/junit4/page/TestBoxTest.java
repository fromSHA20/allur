package org.example.junit4.page;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class TestBoxTest {

    TestBoxPage testBoxPage;


    @BeforeEach
    public void beforEach() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-debugging-port=9222");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--disable-gpu");

        testBoxPage = new TestBoxPage(new EdgeDriver(options));
    }

    @Test
    @DisplayName("Вывести данные 'loginUser'")
    public void runWeb() {

        testBoxPage.driver.get("https://demoqa.com/text-box");
        testBoxPage.driver.manage().window().maximize();
        testBoxPage.userNameLocator("Королев Валерий Шурец");
        testBoxPage.emailLocator("koroleVSh");
        testBoxPage.addresLocator("г.Мурманск, ул. Темирязева 123, п1 кв44");
        testBoxPage.permanentAdrLocator("г.Мурманск, ул. Темирязева 123, п1 кв100");


    }


}
