package com.Shop_Datadriven;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.Base.Class.Base_Cls;
import com.PageObject.Manager.Target_Comm;

public class Run_With extends Base_Cls{
	
	public static WebDriver driver = Base_Cls.get_Browser("chrome");
	
	public static Target_Comm tc = new Target_Comm(driver);
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		get_Url("https://www.target.com/");
		
		click_Button(tc.getEm().getSign_Button());
		
		//click_Button(tc.getAc().getCreate_Account());
		
		implicit_Wait(30);
		
		//Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", tc.getAc().getCreate_Account());
		
		send_Keys(tc.getLt().getMail(),get_Particular_Data(0, 0, 0));
		
		send_Keys(tc.getLt().getFirstname(), get_Particular_Data(0, 1, 1));
		
		send_Keys(tc.getLt().getLastname(), get_Particular_Data(0, 2, 0));
		
		send_Keys(tc.getLt().getPhone(), get_Particular_Data(0, 3, 1));
				
		send_Keys(tc.getLt().getPassword(), get_Particular_Data(0, 4, 0));
		
		System.out.println("done");
		
		
	}
	
	

}
