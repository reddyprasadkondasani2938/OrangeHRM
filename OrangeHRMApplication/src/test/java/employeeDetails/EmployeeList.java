package employeeDetails;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import PageFactory.EmployeeListPageFactory;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployeeList {
	static WebDriver driver;
	static int i=1;
	EmployeeListPageFactory p2;
	
	@Given("^User is on Home Page of OrangeHRM application$")
	public void user_is_on_Home_Page_of_OrangeHRM_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		p2=new EmployeeListPageFactory(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://opensource-demo.orangehrmlive.com");
	//p2.setUsername("Admin");
		//p2.setPassword("admin123");
		Properties obj=new Properties();
		FileInputStream file=new FileInputStream("E:\\project\\OrangeHRMApplication\\property.properties");
		obj.load(file);
		
		driver.get(obj.getProperty("url"));
	  p2.setUsername(obj.getProperty("username"));
		p2.setPassword(obj.getProperty("password"));
		WebDriverWait wait=new WebDriverWait(driver,40);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")));
		p2.setLoginbutton();
		String title=driver.getTitle();
		assertEquals(title,"OrangeHRM");
		
		
	}

	@When("^user clicks on PIM Module$")
	public void user_clicks_on_PIM_Module() throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")));
	    p2.setPimmodule();
	    String pim=p2.setPimmoduletext();
	    assertEquals(pim,"PIM");
	    
	}

	@When("^user clicks on Employee List$")
	public void user_clicks_on_Employee_List() throws Throwable {
	   
	  p2.setEmplist();
	  
	}

	@Then("^User is successfully access the Employee List field$")
	public void user_is_successfully_access_the_Employee_List_field() throws Throwable {
	   String empname=p2.setEmployeenametext();
	  assertEquals(empname,"Employee Name");
	  screenShot();
	   driver.quit();
	}

	@Given("^User is on Employee List field$")
	public void user_is_on_Employee_List_field() throws Throwable {
		//WebDriverWait wait=new WebDriverWait(driver,40);
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")));
		//p1.setLoginbutton();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		p2=new EmployeeListPageFactory(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Properties obj=new Properties();
		FileInputStream file=new FileInputStream("E:\\project\\OrangeHRMApplication\\property.properties");
		obj.load(file);
		
		driver.get(obj.getProperty("url"));
	  p2.setUsername(obj.getProperty("username"));
		p2.setPassword(obj.getProperty("password"));
	//	driver.get("https://opensource-demo.orangehrmlive.com");
	//p2.setUsername("Admin");
	//p2.setPassword("admin123");
	p2.setLoginbutton();
		WebDriverWait wait=new WebDriverWait(driver,90);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")));
		 p2.setPimmodule();
		 p2.setEmplist();
		 String title=driver.getTitle();
			assertEquals(title,"OrangeHRM");
	
	
	}

	@When("^User provides the required details$")
	public void user_provides_the_required_details(DataTable arg1) throws Throwable {
	  List<List<String>> li=arg1.raw();
	  WebDriverWait wait=new WebDriverWait(driver,40);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[1]/input[1]")));
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[1]/input[1]")));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[2]/input")));
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[3]/select")));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[5]/input")));
	// p2.setEmployee_name(li.get(0).get(0));
p2.setEmployee_id(li.get(0).get(1));
	//   p2.setEmployeestatus(li.get(0).get(2));
	  
	   String empname=p2.setEmployeenametext();
		  assertEquals(empname,"Employee Name");
	    
	}

	@When("^click on Search button$")
	public void click_on_Search_button() throws Throwable {
	    p2.setSearchbutton();
	
	}

	@Then("^user information is displayed$")
	public void user_information_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//	Boolean b=p2.setDispaly();
		screenShot();
		//assertEquals(b,true);
		driver.quit();
	    
	}
	static void screenShot() throws IOException
	{
	    File scrFile;
	    scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    Files.copy(scrFile, new File("C:\\Users\\reddy\\Desktop\\screen\\step" + i + ".jpeg"));
	    i++;
	}



}