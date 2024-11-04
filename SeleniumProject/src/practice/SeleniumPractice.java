package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class SeleniumPractice {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://tutorialsninja.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'https://tutorialsninja.com/demo')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[contains(text(), 'Login')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("input-email")).sendKeys("automated@test.com");
        driver.findElement(By.id("input-password")).sendKeys("Test@123");
        driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')] ")).click();
        driver.findElement(By.xpath("//input[contains(@name, 'search')]")).sendKeys("MAC");
        driver.findElement(By.cssSelector("div#search span button")).click();
        driver.findElement(By.linkText("MacBook Air")).click();
        WebElement quantity = driver.findElement(By.xpath("//input[@id='input-quantity']"));
        quantity.clear();
        quantity.sendKeys("2");
        driver.findElement(By.xpath("//div[@id='product']//button[@id='button-cart']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement successStatus = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(successStatus.getText());
        System.out.println(successStatus.isDisplayed());
        driver.findElement(By.linkText("shopping cart")).click();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-primary']")));
        element.click();
        Thread.sleep(3000);
        
       }
}
