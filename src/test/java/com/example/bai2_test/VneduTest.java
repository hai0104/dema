package com.example.bai2_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class VneduTest {
//    @Test
//    public void testRegisterAndLogin() throws InterruptedException {
//
//
//        WebDriverManager.chromedriver().setup();  // Tự động tải ChromeDriver
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//
//        driver.get("https://vitimex.com.vn/");
//
//        // Click vào nút Đăng ký
//        driver.findElement(By.linkText("Đăng ký tài khoản mới")).click();
//        Thread.sleep(2000);
//
//
//        driver.findElement(By.id("name")).sendKeys("Nguyen");
//        driver.findElement(By.id("phone")).sendKeys("An");
//        String email = "test" + System.currentTimeMillis() + "@gmail.com";
//        driver.findElement(By.id("email")).sendKeys(email);
//        driver.findElement(By.id("pass-regis")).sendKeys("Test@1234");
//        driver.findElement(By.id("pass-confirm")).sendKeys("Test@1234");
//
//
//        driver.findElement(By.id("register-btn")).click();
//        Thread.sleep(3000);
//        Assertions.assertTrue(driver.getCurrentUrl().contains("account"));
//
//
//        driver.findElement(By.linkText("Đăng xuất")).click();
//        Thread.sleep(2000);
//
//
//        driver.findElement(By.linkText("Đăng nhập")).click();
//        Thread.sleep(2000);
//
//        // Đăng nhập lại bằng tài khoản vừa tạo
//        driver.findElement(By.id("email")).sendKeys(email);
//        driver.findElement(By.id("password")).sendKeys("Test@1234");
//        driver.findElement(By.id("loginButton")).click();
//        Thread.sleep(3000);
//
//        // Xác nhận đăng nhập thành công
//        Assertions.assertTrue(driver.getCurrentUrl().contains("account"));
//
//
//        driver.quit();
//    }

}