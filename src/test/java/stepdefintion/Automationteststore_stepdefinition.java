package stepdefintion;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.PageFactory;

import com.automationteststore.Base;
import com.automationteststore.Pom_login;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automationteststore_stepdefinition extends Base{
	Logger log = Logger.getLogger(Automationteststore_stepdefinition.class);
	
	@Before("@login")
	public void driverlaunch() throws IOException, InterruptedException {

		BasicConfigurator.configure();
		getDriver(properties("chromebrowser"));
		log.info("driver launched");
		winmax();
		log.info("window maximised");

	}
	
	@Given("^user on the login page$")
	public void user_on_the_login_page() throws Throwable {
		webpage(properties("url"));
		log.info("Automationteststore webpage opened");
		thread(4000);

	}

	@When("^i click a login or register$")
	public void i_click_a_login_or_register_enter_my_details() throws Throwable {
		WebElement loginele = driver.findElement(By.xpath("//a[text()='Login or register']"));
		thread(4000);
        actionsclicks(loginele);
		implicitwait(15);
		log.info("login clicked");
	        WebElement continueele = driver.findElement(By.xpath("(//button[@class=\"btn btn-orange pull-right\"])[1]"));
		actionsclicks(continueele);
		implicitwait(15);
		log.info("Continue clicked ");
		
	}
	
	@And("^enter my details submit the registation form$")
	public void enter_my_details_submit_the_registation_form() throws Throwable {
		
		PageFactory.initElements(driver, Pom_login.class);
		sendkeys(first_name, properties("firstname"));
		log.info("Firstname entered");
		sendkeys(last_name, properties("lastname"));
		log.info("lastname entered");
		sendkeys(e_mail, properties("email"));
		log.info("email entered");
		sendkeys(Address, properties("address1"));
		log.info("Address entred");
		sendkeys(city, properties("city"));
		log.info("city entered");
		dropdown(state, 2);
		log.info("state selected");
		sendkeys(zipcode, properties("zipcode"));
		log.info("zipcode entered");
		sendkeys(loginname, properties("login_name"));
		log.info("loginname entered");
		sendkeys(password, properties("password"));
		log.info("password entered");
		sendkeys(psswordconfirm, properties("password"));
		log.info("Re password  entered");
		clicks(agree);
		log.info("checkbox clicked");
		thread(4000);
		WebElement continueele = driver.findElement(By.xpath("//button[@class=\"btn btn-orange pull-right lock-on-click\"]"));
		actionsclicks(continueele);
		log.info("continue clicked");
	
	}	
	@Then("i see a success message$")
	public void i_see_a_success_message() throws Throwable {
	
	WebElement acccreated = driver.findElement(By.xpath("//span[text()=' Your Account Has Been Created!']"));
	if (acccreated.isDisplayed()) {
		log.info("Account created successfully");
		
	}else {
		log.info("Account not created successfully");
	}
	
	
	}
	
	@Given("^user on the account created page click continue$")
	public void user_on_the_account_created_page_click_continue() throws Throwable {
		
		continueelement.click();
		log.info("continue clicked");
	  
	}

	@When("^valid name and surname$")
	public void valid_name_and_surname() throws Throwable {
		WebElement customername = driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[2]"));
		highlightelements(customername);
		String strcustomername = customername.getText();
		FileInputStream f = new FileInputStream(
				System.getProperty("user.dir") + "\\properties\\config.properties");
		Properties prop = new Properties();
		prop.load(f);
		String strfirstname = prop.getProperty("First_name");
		if (strcustomername.equalsIgnoreCase(strfirstname)) {
			log.info("Names are correct");
		}else {
			log.info("Names not correct");
		}
	   	}

	@Then("^click home to add products$")
	public void click_home_to_add_products() throws Throwable {
		WebElement home = driver.findElement(By.xpath("//a[@class=\"active menu_home\"]"));
	highlightelements(home);
		clicks(home);
		log.info("home clicked");
		
	    	}

	@Given("^user search the products$")
	public void user_search_the_products() throws Throwable {
		sendkeys(filtersearch, "skincare");
		log.info("search entered");
		
		WebElement filterenter = driver.findElement(By.xpath("//i[@class=\"fa fa-search\"]"));
		filterenter.click();
		log.info("Enter clicked");
		
	   	}

	@When("^products add to cart$")
	public void products_add_to_cart() throws Throwable {
		WebElement addcart = driver.findElement(By.xpath("//a[@class=\"cart\"]"));
		addcart.click();
		log.info("Addcart clicked");
		
	    	}

	@Then("^proceed to check out$")
	public void proceed_to_check_out() throws Throwable {
	        WebElement checkout = driver.findElement(By.xpath("//a[@id=\"cart_checkout1\"]"));
	        checkout.click();
	        log.info("Chekout clicked");
	        
	}

	@Given("^user verify the details$")
	public void user_verify_the_details() throws Throwable {
	  WebElement customername = driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/div[2]/table[1]/tbody/tr/td[1]"));
	  highlightelements(customername);
	  String strcustomername = customername.getText();
	  FileInputStream f = new FileInputStream(
			  System.getProperty("user.dir") + "\\properties\\config.properties");
		Properties prop = new Properties();
		prop.load(f);
		String strames = prop.getProperty("First_name", "last_name");
		System.out.println(strames);
	  if (strcustomername.equalsIgnoreCase(strames)) {
		log.info("Name verified and correct");
	}
	  WebElement address = driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/div[2]/table[1]/tbody/tr/td[2]"));
	  highlightelements(address);
	   String straddress = address.getText();
	   String strcustomeradd = prop.getProperty("address1" , "city");
	   System.out.println(strcustomeradd);
	   if (straddress.contains(strcustomeradd)) {
		   log.info("Address verified and correct");
		   screenshot("automationstore");
		   
	}
	}

	@When("^details are correct click confirm$")
	public void details_are_correct_click_confirm() throws Throwable {
		WebElement confirmorder = driver.findElement(By.xpath("//button[@title=\"Confirm Order\"]"));
		highlightelements(confirmorder);
		confirmorder.click();
		log.info("Confirmorder clicked");
	    	}

	@When("^successfull order message take scrrenshot of the order$")
	public void successfull_order_message_take_scrrenshot_of_the_order() throws Throwable {
		WebElement orderprocessed = driver.findElement(By.xpath("//span[text()=' Your Order Has Been Processed!']"));
		highlightelements(orderprocessed);
		if (orderprocessed.isDisplayed()) {
			log.info("order processed successfully");
			
		}else {
			log.info("order not processed successfully");
		}
		 screenshot("automationstoreorderconfirm");
		
	    	}

	@Then("^click continue button see home page$")
	public void click_continue_button_see_home_page() throws Throwable {
		continueelement.click();
		String title = driver.getTitle();
		title.equalsIgnoreCase("A place to practice your automation skills!");
		
	}

	@After("@logout")
	public void driverquit() throws InterruptedException {
		thread(6000);
		quit();
		log.info("driver closed");
	}

}
