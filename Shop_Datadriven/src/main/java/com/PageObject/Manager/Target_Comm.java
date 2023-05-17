package com.PageObject.Manager;

import org.openqa.selenium.WebDriver;

import com.PageObject.Model.Account_Create;
import com.PageObject.Model.Expect_More;
import com.PageObject.Model.LoginTarget_Create;

public class Target_Comm {
	
	public WebDriver driver;
	
    private Expect_More em;
	
	private Account_Create ac;
	
	private LoginTarget_Create lt;
	
	
	
	public Target_Comm(WebDriver driver) {
		
		this.driver = driver;
	}

	public Expect_More getEm() {
		
		if (em==null) {
			
			em = new Expect_More(driver);
		}
		return em;
	}

	public Account_Create getAc() {
		
		if (ac==null) {
			
			ac = new Account_Create(driver);
		}
		return ac;
	}

	public LoginTarget_Create getLt() {
		
		if (lt==null) {
			
			lt = new LoginTarget_Create(driver);
			
		}
		return lt;
	}

	
}
