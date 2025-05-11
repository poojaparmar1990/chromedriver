package seleniumBasic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver","C:\\Users\\pookr\\Downloads\\IEDriverServer_Win32_4.14.0\\IEDriverServer.exe");
        WebDriver driver=new InternetExplorerDriver();
        driver.get("https://demo.nopcommerce.com/");
        System.out.println("the url is"+" "+driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
      driver.navigate().back();
       String ExpectedTitle="nopCommerce demo store. Home page title";
       if(ExpectedTitle.equals(driver.getTitle())){
           System.out.println("correct tile");}
       else{
           System.out.println("Incorrect title");
        }
    }


    }

