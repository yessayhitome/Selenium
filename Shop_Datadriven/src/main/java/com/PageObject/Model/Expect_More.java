package com.PageObject.Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expect_More {
	
	public WebDriver driver;
  
	@FindBy(xpath = "//nav[@id='headerPrimary']/child::a[@aria-label='Account, sign in']/descendant::span[text()='Sign in']")
    private WebElement sign_Button;
	
	public Expect_More(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	 public WebElement getSign_Button() {
			return sign_Button;
		}

}
