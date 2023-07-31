package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Login {
    static WebDriverWait wait;
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("https://sso-uat-nsws.investindia.gov.in/auth/realms/madhyam/protocol/openid-connect/auth?client_id=portal-stage&redirect_uri=https%3A%2F%2Fuat-nsws.investindia.gov.in%2Fportal%2Flogin&state=fb9af69b-e698-4066-8b1d-92d98397762b&response_mode=fragment&response_type=code&scope=openid&nonce=435aa9ad-d3cd-4797-9504-5c6a1ddd9f8b&code_challenge=2tgi8K5KDMMgiHkx7tJuNykb0a9NyaGVmmo9p7ZQW8I&code_challenge_method=S256");
        Actions a =new Actions(driver);

        driver.get("https://uat-nsws.investindia.gov.in/");

       // wait = new WebDriverWait(driver,20);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          List<WebElement> loginMenu = driver.findElements(By.xpath("//ul[@class='header-login-menu']/li"));
    a.moveToElement(loginMenu.get(0)).click().build().perform();

     //   Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("shwetaadmin@fmail.com");
        // Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Test@123");
       // Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class=\"signin-btn-wrapper\"]")).click();
    }
}
