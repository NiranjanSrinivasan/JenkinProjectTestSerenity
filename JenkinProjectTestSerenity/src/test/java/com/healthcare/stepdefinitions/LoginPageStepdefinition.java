package com.healthcare.stepdefinitions;

import com.healthcare.pageobjects.LoginPageObject;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class LoginPageStepdefinition {

	@Steps
	LoginPageObject loginpage;
	
	@Given("Open Browser and enter Url")
	public void open_browser_and_enter_url() {
	    loginpage.open_and_navigate_to_url();
	}

	@Then("Enter Username {string}")
	public void enter_username(String string) {
		loginpage.enter_Username(string);
	}

	@Then("Enter Password {string}")
	public void enter_password(String string) {
		loginpage.enter_Password(string);
	}

	@And("Click Login")
	public void click_login() {
		loginpage.clcik_LoginButton();
	}
}
