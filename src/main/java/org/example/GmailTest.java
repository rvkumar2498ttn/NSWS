package org.example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailTest {
    public static WebDriver driver;

    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gmail.com");

        int i;
        for (i = 0; i <= 15; i++) {
            if (i == 15) {
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ravi.gupta@tothenew.com");
                driver.findElement(By.xpath("//span[text()='Next']")).click();
                Thread.sleep(4000);
                driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kratikaa");
                driver.findElement(By.xpath("//span[text()='Next']")).click();

            } else {
                System.out.println("String2");
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ravi.gupta@tothenew.com");
                driver.findElement(By.xpath("//span[text()='Next']")).click();
                Thread.sleep(4000);
                driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Check1");
                driver.findElement(By.xpath("//span[text()='Next']")).click();
                Thread.sleep(2000);
                driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1041056233%3A1689318232427421&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AeDOFXjGOkRFIgKcFATLRuoccBu_InSV0ZwKNBvEUvvFnBtoXNsoBbQRnSCot_81XUnCmDm9yjYjZw&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

            }
        }
    }
}