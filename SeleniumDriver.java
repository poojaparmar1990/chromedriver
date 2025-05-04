package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pookr\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
       driver.get("https://demo.nopcommerce.com/");
        System.out.println("the url is"+" "+driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        //driver.navigate().back();
        String ExpectedTitle="nopCommerce demo store. Home page title";
        if(ExpectedTitle.equals(driver.getTitle())){
            System.out.println("correct tile");}
            else{
                System.out.println("Incorrect title");

            }
        }



        }




