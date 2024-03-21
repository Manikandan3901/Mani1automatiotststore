package com.automationteststore;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base extends Pom_login{
	public static WebDriver driver;
	public static String value;

	public static void getDriver(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\git\\Mani1automatiotststore\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\git\\Mani1automatiotststore\\Driver\\msedgedriver.exe");
			
			driver = new EdgeDriver();
		}

	}

	public static void webpage(String url) {
		driver.get(url);
	}

	public static void thread(long value) throws InterruptedException {
		Thread.sleep(value);

	}

	public static void clear(WebElement element) {
		element.clear();

	}

	public static void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}

	public static void winmax() {
		driver.manage().window().maximize();
	}

	public static void back() {
		driver.navigate().back();
	}

	public static void clicks(WebElement element) {
		highlightelements(element);
		element.click();
	}
	
	public static void actionsclicks(WebElement element) {
	Actions ac = new Actions(driver);
	highlightelements(element);
	ac.moveToElement(element).click().build().perform();
	}
	
	
	public static void highlightelements(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='3px solid red'", element);
        	}
		
	
	

	public static void sendkeys(WebElement element, String value) {
		
		element.sendKeys(value);
	}

		public static void dropdown(WebElement element, Integer value) {
		Select down = new Select(element);
		down.selectByIndex(value);
		
	}
		
	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Lenovo\\git\\Mani1automatiotststore\\Screenshot\\" + name + ".png");
		FileHandler.copy(source, destination);
	}

	public static void scrolltoelement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public static void scrolltoendpage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
	}

	public static void scrollview() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

	public static void implicitwait(long value) {
		driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);
	}

	public static void explicitwiat(WebElement element, long value) {
		WebDriverWait wait = new WebDriverWait(driver, value);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static String properties(String val) throws IOException {
		FileInputStream f = new FileInputStream(
				"C:\\Users\\Lenovo\\git\\Mani1automatiotststore\\properties\\config.properties");
		Properties p = new Properties();
		p.load(f);
		if (val.equals("chromebrowser")) {
			value = p.getProperty("browser1");
			return value;
		}
		if (val.equals("edgebrowser")) {
			value = p.getProperty("browser2");
			return value;
		} else if (val.equals("url")) {
			value = p.getProperty("url1");

			return value;
		} else if (val.equals("address1")) {

			value = p.getProperty("address1");

			return value;

		} else if (val.equals("city")) {
			value = p.getProperty("city");
			return value;

		} else if (val.equals("firstname")) {
			value = p.getProperty("First_name");
			return value;

		} else if (val.equals("lastname")) {
			value = p.getProperty("last_name");
			return value;

		}
		else if (val.equals("zipcode")) {
			value = p.getProperty("zipcode");
			return value;

		}
		if (val.equals("email")) {
			value= p.getProperty("email");
			return value;
			
		}
		
		if (val.equals("login_name")) {
			value= p.getProperty("login_name");
			return value;
			
		}
		if (val.equals("password")) {
			value= p.getProperty("password");
			return value;
			
		}
		

		return value;

	}
}
