package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Signup / Login")).click();

        driver.findElement(By.name("email")).sendKeys("test@example.com");
        driver.findElement(By.name("password")).sendKeys("123456");

        driver.findElement(By.xpath("//button[text()='Login']")).click();

        driver.quit();
    }
}
