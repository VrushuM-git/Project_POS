package POS;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class Jenkins2 {
	public String baseUrl ="http://localhost/Logic_Invoice/upload/admin/";
	String driverPath = "c:\\chromedriver.exe";
	public WebDriver driver;
  @Test
  public void A_launchBrowser() {
	  	System.out.println("launching chrome browser");
	  	System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe" );
	  	driver = new ChromeDriver();
	  	driver.get(baseUrl);
	  	String expectedTitle = "Administration Login";
	  	String actualTitle = driver.getTitle();
	  	AssertJUnit.assertEquals(expectedTitle, actualTitle);
  }
  @Test
  		public void B_close(){
	  	driver.close();
}
}