package steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	WebDriver driver;
	
	@Before
	public void setUp()
	{
		System.out.println("In before hook ..");
	}
	
	@After
	public void teardown()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
	
	@Given("user starts {string} browser")
	public void user_starts_browser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else  if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}

	}

	@Given("user launch app using url {string}")
	public void user_launch_app_using_url(String url) {
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

	}

	@When("user enters text {string} in textbox using xpath {string}")
	public void user_enters_text_in_textbox_using_xpath(String text, String xpath) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(text);

	}

	@When("user clicks on button using xpath {string}")
	public void user_clicks_on_button_using_xpath(String xpath) {
		
		driver.findElement(By.xpath(xpath)).click();
			
	}

	@Then("user validates title to be {string}")
	public void user_validates_title_to_be(String expTitle) {
		
		 Assert.assertTrue(driver.getTitle().equals(expTitle));
	}
	
	@When("user clicks on link using xpath {string}")
	public void user_clicks_on_link_using_xpath(String xpath) {
	    
		driver.findElement(By.xpath(xpath)).click();
	}

	@When("user enters details in registration form")
	public void user_enters_details_in_registraion_form(DataTable dataTable) {
	    
		List<List<String>>  dataList=dataTable.asLists();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(dataList.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(dataList.get(0).get(1));
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(dataList.get(0).get(2));
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(dataList.get(0).get(3));
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(dataList.get(0).get(4));
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(dataList.get(0).get(5));
		
	    
	}

	
	@When("user enters details in registration form using map")
	public void user_enters_details_in_registration_form_using_map(DataTable dataTable) {
	    
		List<Map<String, String>> dataMap=dataTable.asMaps();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(dataMap.get(0).get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(dataMap.get(0).get("password"));
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(dataMap.get(0).get("confirm password"));
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(dataMap.get(0).get("full name"));
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(dataMap.get(0).get("email"));
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(dataMap.get(0).get("captcha"));
		
	}


}
