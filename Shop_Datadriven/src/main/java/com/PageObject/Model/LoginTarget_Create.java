package com.PageObject.Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTarget_Create {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@class='styles__GspForm-sc-1ltb4ye-0 gCkVZU']/descendant::input[@id='username']")
	private WebElement mail;
	
	@FindBy(xpath = "//div[@class='styles__GspForm-sc-1ltb4ye-0 gCkVZU']/descendant::input[@id='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath = "//div[@class='styles__GspForm-sc-1ltb4ye-0 gCkVZU']/descendant::input[@id='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath = "//div[@class='styles__GspForm-sc-1ltb4ye-0 gCkVZU']/descendant::input[@id='phone']")
	private WebElement phone;
	
	@FindBy(xpath = "//div[@class='styles__GspForm-sc-1ltb4ye-0 gCkVZU']/descendant::input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//div[@class='styles__GspForm-sc-1ltb4ye-0 gCkVZU']/descendant::button[text()='show']")
	private WebElement show;
	
	@FindBy(xpath = "//div[@class='styles__GspForm-sc-1ltb4ye-0 gCkVZU']/descendant::input[@id='keepMeSignedIn']")
	private WebElement chechbox;
	
	@FindBy(xpath="//div[@class='styles__GspForm-sc-1ltb4ye-0 gCkVZU']/descendant::button[@id='createAccount']")
	private WebElement create_acount;

	public LoginTarget_Create(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getShow() {
		return show;
	}

	public WebElement getChechbox() {
		return chechbox;
	}

	public WebElement getCreate_acount() {
		return create_acount;
	}

}
