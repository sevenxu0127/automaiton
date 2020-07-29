package com.relx.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CartOperationTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.className("replace-2x img-responsive"))).moveToElement(
                driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span"))
        ).click().build().perform();
        driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span")).click();
        driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span")).click();
        driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span")).click();
        driver.findElement(By.id("email_create")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("seven880127@126.com");
        driver.findElement(By.xpath("//form[@id='login_form']/div/div[2]")).click();
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("fighting0127");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
        driver.findElement(By.xpath("//div[@id='center_column']/form/p/button/span")).click();
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.xpath("//form[@id='form']/p/button/span")).click();

        driver.quit();
    }
}
