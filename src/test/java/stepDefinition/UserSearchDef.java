package stepDefinition;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AdminLoginPage;
import pageObjects.UserSearchPage;

public class UserSearchDef extends TestBase {
	public static WebDriver driver;
	AdminLoginPage lp;
	UserSearchPage usp;
	public static Logger logger;

	//Using Hooks
	@Before
	public void setup() {
		System.out.println("Launch chrome Browser");
	}
	//Using Hooks
	@After
	public void teardown() {
		System.out.println("Close Browser");
	}
	@Given("^User launch chrome browser$")
	public void user_launch_chrome_browser()  {
		
		 System.setProperty("webdriver.chrome.driver","E:\\OXYGENWORKSPACE\\CucumberTest\\Drivers\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
	}

	@When("^Admin open url \"([^\"]*)\"$")
	public void admin_open_url(String url)  {
	    driver.get(url);
	   
	}

	@When("^Admin enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void admin_enters_username_as_and_password_as(String user_id, String pass_id)  {
		lp=new AdminLoginPage(driver);
		lp.enteruserName(user_id);
		lp.enteruserPassword(pass_id);
		
	}

	@When("^Click login$")
	public void click_login() {
		lp=new AdminLoginPage(driver);
	   lp.clickButton();
	}

	@Then("^Admin can view dashboard$")
	public void admin_can_view_dashboard() {
	   String title=driver.getTitle();
	   System.out.println(title);
	}

	@When("^Admin click on admintab$")
	public void admin_click_on_admintab()  {
	   usp=new UserSearchPage(driver);
	   usp.clickAdmintab();
	}

	@Then("^Admin search username \"([^\"]*)\"$")
	public void admin_search_username(String user_nm) {
	   usp.searchUser(user_nm);
	}

	@Then("^Click search$")
	public void click_search()  {
	    usp.clickSearchbutton();
	}

	@Then("^Admin can view desired username in list$")
	public void admin_can_view_desired_username_in_list()  {
	    
	}

}
