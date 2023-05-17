package com.PageObject.Model;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Create {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@data-test='@web/OverlayModal']/descendant::a[@data-test='accountNav-signIn']/child::span[@class='styles__ListItemText-sc-diphzn-1 eOhzvD']")
	private WebElement sign_In;
	
	@FindBy(xpath="//div[@data-test='@web/OverlayModal']/descendant::a[@data-test='accountNav-createAccount']/child::span[@class='styles__ListItemText-sc-diphzn-1 eOhzvD']")
	private WebElement create_Account;
	
	@FindBy(xpath="//div[@data-test='@web/OverlayModal']/descendant::a[@data-test='accountNav-orders']/child::span[@class='styles__ListItemText-sc-diphzn-1 eOhzvD']")
	private WebElement order;
	
	@FindBy(xpath="//div[@data-test='@web/OverlayModal']/descendant::a[@data-test='accountNav-orders']/child::span[@class='styles__ListItemSecondaryText-sc-diphzn-0 bZnqlX h-text-bs h-text-grayDark']")
    private WebElement track_Manage;
	
	@FindBy(xpath="//ul[@class='styles__ListUl-sc-diphzn-4 bsCiWX']/child::li[@id='listaccountNav-red']/descendant::span[@class='styles__ListItemText-sc-diphzn-1 eOhzvD']")
	private WebElement circle;
	
	@FindBy(xpath="//ul[@class='styles__ListUl-sc-diphzn-4 bsCiWX']/child::li[@id='listaccountNav-giftCards']/descendant::span[@class='styles__ListItemText-sc-diphzn-1 eOhzvD']")
    private WebElement gift_Card;
	
	@FindBy(xpath="//ul[@class='styles__ListUl-sc-diphzn-4 bsCiWX']/child::li[@id='listaccountNav-giftCards']/descendant::span[text()='Check balances']")
	private WebElement check_Balance;
	
	@FindBy(xpath="//ul[@class='styles__ListUl-sc-diphzn-4 bsCiWX']/child::li[@id='listaccountNav-redCard']/descendant::span[text()='RedCard']")
	private WebElement red_Card;
	
	@FindBy(xpath="//ul[@class='styles__ListUl-sc-diphzn-4 bsCiWX']/child::li[@id='listaccountNav-redCard']/descendant::span[text()='Apply now']")
	private WebElement apply_now;
	
	@FindBy(xpath="//ul[@class='styles__ListUl-sc-diphzn-4 bsCiWX']/child::li[@id='listaccountNav-registries']/descendant::span[text()='Registry']")
	private WebElement registry;
	
	@FindBy(xpath="//ul[@class='styles__ListUl-sc-diphzn-4 bsCiWX']/child::li[@id='listaccountNav-registries']/descendant::span[text()='Create a registry']")
	private WebElement create_Registry;
	
	@FindBy(xpath="//ul[@class='styles__ListUl-sc-diphzn-4 bsCiWX']/child::li[@id='listaccountNav-myStore']/descendant::span[text()='My Store']")
	private WebElement my_Store;
	
	@FindBy(xpath="//ul[@class='styles__ListUl-sc-diphzn-4 bsCiWX']/child::li[@id='listaccountNav-myStore']/descendant::span[text()='Fort Smith']")
	private WebElement for_smith;
	
	@FindBy(xpath="//div[@data-test='@web/OverlayModal']/descendant::button[@class='styles__IconButtonStyles-sc-18jd2v4-0 jRsnIE styles__StyledBaseIconButton-sc-136p0tp-0 blKXTC']")
	private WebElement close_button;
	
	public Account_Create(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getSign_In() {
		return sign_In;
	}

	public WebElement getCreate_Account() {
		return create_Account;
	}

	public WebElement getOrder() {
		return order;
	}

	public WebElement getTrack_Manage() {
		return track_Manage;
	}

	public WebElement getCircle() {
		return circle;
	}

	public WebElement getGift_Card() {
		return gift_Card;
	}

	public WebElement getCheck_Balance() {
		return check_Balance;
	}

	public WebElement getRed_Card() {
		return red_Card;
	}

	public WebElement getApply_now() {
		return apply_now;
	}

	public WebElement getRegistry() {
		return registry;
	}

	public WebElement getCreate_Registry() {
		return create_Registry;
	}

	public WebElement getMy_Store() {
		return my_Store;
	}

	public WebElement getFor_smith() {
		return for_smith;
	}

	public WebElement getClose_button() {
		return close_button;
	}
	
}
