package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailFlooding {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        int i;
      //  String arr1[] = {"rvkumar2498@gmail.com"};
        for (i = 0; i<100; i++) {
            // driver.get("https://sso-uat-nsws.investindia.gov.in/auth/realms/madhyam/login-actions/reset-credentials?client_id=portal-stage&tab_id=XrK2mBE02Lw");
            driver.get("https://www.ppe.nsws.gov.in/auth/realms/madhyam/login-actions/reset-credentials?client_id=portal-ppe&tab_id=npYtxtvJgqI");
             //driver.get("https://www.nsws.gov.in/auth/realms/madhyam/login-actions/reset-credentials?client_id=portal-prod&tab_id=MNyPLU2GGZk");

            driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rvkumar2498@gmail.com");
            driver.findElement(By.xpath("//button[@id='kc-reset-password-form']")).click();
            Thread.sleep(2000);

                }
        //driver.get("https://www.nsws.gov.in/auth/realms/madhyam/login-actions/reset-credentials?client_id=portal-prod&tab_id=MNyPLU2GGZk");

                driver.navigate().to("https://www.ppe.nsws.gov.in/auth/realms/madhyam/login-actions/reset-credentials?client_id=portal-ppe&tab_id=npYtxtvJgqI");
                 // driver.navigate().to("https://sso-uat-nsws.investindia.gov.in/auth/realms/madhyam/login-actions/reset-credentials?client_id=portal-stage&tab_id=XrK2mBE02Lw");

            }
        }
