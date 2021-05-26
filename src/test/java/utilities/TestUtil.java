package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestUtil {
public static WebDriver driver;

//Screen shot utility
	public  static void takeScreenshot(WebDriver driver) throws IOException { 
	File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    String currentDir = System.getProperty("user.dir");
    FileUtils.copyFile(srcfile, new File(currentDir + "/Screenshots/" + System.currentTimeMillis() + ".png"));
	}
	
	//Element Highlighter
	 public static void highLightElement(WebDriver driver, WebElement element)
	    {
	        JavascriptExecutor js=(JavascriptExecutor)driver;

	        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

	        try
	        {
	            Thread.sleep(500);
	        }
	        catch (InterruptedException e) {

	            System.out.println(e.getMessage());
	        }

	        js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

	    }

	
	
	 
	
	}
