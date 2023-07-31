package org.example;

        import java.util.List;
        import java.util.concurrent.TimeUnit;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.Select;

        import io.github.bonigarcia.wdm.WebDriverManager;

public class SkillMatrix {
    public static WebDriver driver;

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravi Kumar Gupta\\Desktop\\java\\Udemy Course\\src\\main\\resources\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://skill-matrix.qa2.tothenew.net/");
        driver .manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[text()=' Sign in with Google ']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ravi.gupta@tothenew.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kratikaa");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href='/admin-matrix']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//select[@class='competency form-control ng-pristine ng-invalid ng-touched']")).click();
        List<WebElement> compentencyDropdown = driver.findElements(By.xpath("//select[@class='competency form-control ng-pristine ng-invalid ng-touched']/option"));
        System.out.println(compentencyDropdown.size());
        for(int i=0;i<compentencyDropdown.size();i++) {
            if(compentencyDropdown.get(i).getText().equalsIgnoreCase(" Quality Engineering ")) {
                compentencyDropdown.get(i).click();
            }

        }
        //driver.findElement(By.)
        //System.out.println(driver.getTitle());

    }

}



