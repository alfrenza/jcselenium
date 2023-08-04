package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\My Tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.demoqa.com");
        System.out.println("Open Browser, Open URL");

        driver.findElement(By.id("userName")).sendKeys("JuaraCoding");
        driver.findElement(By.id("userEmail")).sendKeys("info@juaracoding.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        js.executeAsyncScript("window.scrollBy(0,500)");//scroll vertical 500
        driver.findElement(By.id("permanentAdress   ")).sendKeys("Jakarta");
        driver.findElement(By.id("submit")).click();


        System.out.println("Input Search");
        driver.findElement(By.name("btnK")).click();
        System.out.println("Click button search");
        try{
            Thread.sleep(3000);//delay 3 detik
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Quit Browser");
    }
}