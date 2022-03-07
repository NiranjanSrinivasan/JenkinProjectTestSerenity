package com.healthcare.pageobjects;

import com.healthcare.objectrepo.LoginPageLocators;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class LoginPageObject extends PageObject{

	@Step("Open and Navigate to application")
	public void open_and_navigate_to_url() {
		open();
	}
	
	@Step("Enter Username")
	public void enter_Username(String username){
		$(LoginPageLocators.LOGIN_PAGE_USERNAME).sendKeys(username);
		
	}
	
	@Step("Enter Password")
	public void enter_Password(String password){
		$(LoginPageLocators.LOGIN_PAGE_PASSWORD).sendKeys(password);
		
	}
	
	@Step("Click on Login Button")
	public void clcik_LoginButton(){
		$(LoginPageLocators.LOGIN_PAGE_LOGINBTN).click();
		
	}
}
