package com.peoplentech.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

    public static void main(String[] args) throws InterruptedException {
        // set up database chrome driver needs
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver_win32/chromedriver.exe");
        // create object for chrome driver
        WebDriver driver = new ChromeDriver();

        //tell chrome driver to go to url...
        driver.get("https://www.google.com");
        // wait 5 sec
        Thread.sleep(5000);
        // close chrome
        driver.close();


    }
}
