package seleniumBasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegieterFormChrome {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.findElement(By.xpath("//label[@for='gender-female']")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Pooja");
        driver.findElement(By.id("LastName")).sendKeys("Parmar");
        driver.findElement(By.id("Email")).sendKeys("pookru@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("123456");
        driver.findElement(By.id("register-button")).click();
    }
    }

