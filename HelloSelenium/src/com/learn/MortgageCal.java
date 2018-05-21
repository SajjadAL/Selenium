package com.learn;


import org.apache.bcel.generic.DREM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.learn.lib.SeleniumLib;

public class MortgageCal {

	public static void main(String[] args) {
		
		WebDriver driver= SeleniumLib.luanchBrowser("https://www.mortgagecalculator.org/");
		
		WebElement home = driver.findElement(By.id("homeval"));
		home.clear();
		home.sendKeys("1000");
		
		driver.findElement(By.name("param[downpayment]"));
		
		WebElement percentRadio= driver.findElement(By.xpath(".//input[@value='percent']"));
		percentRadio.submit();
				
		
		
		
	}

}
