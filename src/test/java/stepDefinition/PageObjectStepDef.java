package stepDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AdminLoginPage;

public class PageObjectStepDef {
	public static WebDriver driver;
	AdminLoginPage lp;
	@Given("^Open chromebrowser and launch application$")
	public void open_chromebrowser_and_launch_application() {
		 System.setProperty("webdriver.chrome.driver","E:\\OXYGENWORKSPACE\\CucumberTest\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
	}

	@When("^I enter correct \"([^\"]*)\" and correct \"([^\"]*)\"$")
	public void i_enter_correct_and_correct(String userid,String passwrd)  {
		 lp=new AdminLoginPage(driver);
		 lp.enteruserName("Admin");
		 System.out.println("########Username Entered########");
		 lp.enteruserPassword("admin123");
		 System.out.println("########Password Entered########");
		 lp.clickButton();
		 System.out.println("########Login Successfull########");
	}

	@Then("^Desired Page title OrangeHRM$")
	public void Desired_page_title() {
	    String title=driver.getTitle();
	    if(title.equals("OrangeHRM")) {
	    	System.out.println("Title verified successfully");
	    }
	    
	}

	@Then("^Browser tear down$")
	public void Browser_tear_down()  {
	    driver.close();
	}
}
