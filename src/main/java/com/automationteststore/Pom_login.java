package com.automationteststore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Pom_login {
	//login page
	private static Pom_login logininstance;
//	private  Pom_login() {

	//}

	public static Pom_login getinstance() {
		if (logininstance == null) {
			logininstance = new Pom_login();
		}
		return logininstance;
	}
	

	@FindBy(xpath ="//input[@id=\"AccountFrm_firstname\"]")
	public static WebElement first_name;

	@FindBy(xpath ="//input[@id='AccountFrm_lastname']")
	public static WebElement last_name;
	
	@FindBy(xpath="//input[@id='AccountFrm_email']")
			public static WebElement e_mail;
	
	@FindBy(xpath ="//input[@id=\"AccountFrm_address_1\"]")
	public static WebElement Address;
	@FindBy(xpath ="//input[@id='AccountFrm_city']")
	public static WebElement city;
	@FindBy(xpath ="//select[@id='AccountFrm_zone_id']")
	public static WebElement state;
	@FindBy(xpath ="//input[@id=\"AccountFrm_postcode\"]")
	public static WebElement zipcode;
	@FindBy(xpath ="//input[@id='AccountFrm_loginname']")
	public static WebElement loginname;
	@FindBy(xpath ="//input[@id='AccountFrm_password']")
	public static WebElement password;
	@FindBy(xpath ="//input[@id='AccountFrm_confirm']")
	public static WebElement psswordconfirm;
	@FindBy(xpath ="//input[@name=\"agree\"]")
	public static WebElement agree;
	
	@FindBy(xpath ="//a[@title='Continue']")
	public static WebElement continueelement;
	
	
	
	@FindBy(xpath ="//input[@id=\"filter_keyword\"]")
	public static WebElement filtersearch;
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	

}
