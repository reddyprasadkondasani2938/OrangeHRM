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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import PageFactory.AddEmployeePageFactory;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeestepdef {
	static WebDriver driver1;
    static int i = 1;

WebDriver driver;
	AddEmployeePageFactory p;
	
	
	
@Given("^User is on HomePage of OrangeHRM application$")
public void user_is_on_HomePage_of_OrangeHRM_application() throws Throwable {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver1=new ChromeDriver();
	p=new AddEmployeePageFactory(driver1);
	driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver1.get("https://opensource-demo.orangehrmlive.com");
  //p.setUsername("Admin");
	//p.setPassword("admin123");
	Properties obj=new Properties();
	FileInputStream file=new FileInputStream("E:\\project\\OrangeHRMApplication\\property.properties");
	obj.load(file);
	
	driver1.get(obj.getProperty("url"));
  p.setUsername(obj.getProperty("username"));
	p.setPassword(obj.getProperty("password"));
	p.setLoginbutton();
	String title=driver1.getTitle();
	assertEquals(title,"OrangeHRM");
	
}

@When("^User clicks on PIM Module$")
public void user_clicks_on_PIM_Module() throws Throwable {
	  p.setPimmodule();
	  
	 String a=p.setPimmoduletitle();
	 assertEquals(a,"PIM");
	 
	  
}

@When("^clicks on Add Employee$")
public void clicks_on_Add_Employee() throws Throwable {
	 WebDriverWait wait=new WebDriverWait(driver1,90);
	 driver1.navigate().refresh();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/ul/li[3]/a")));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/div[2]/ul/li[2]/ul/li[3]/a")));
	 driver1.findElement(By.linkText("Add Employee")).click();
	 String add_employee=p.setAdd_employee1();
	 assertEquals(add_employee,"Add Employee");
}

@Then("^User successfully access the Add Employee field$")
public void user_successfully_access_the_Add_Employee_field() throws Throwable {
    //Write code here that turns the phrase above into concrete act
	 String employee_title=p.setNametag();
	 screenShot();
	// assertEquals(employee_title,"Full Name");
	 driver1.quit();
}



@Given("^user is on the Add Employee Field$")
public void user_is_on_the_Add_Employee_Field() throws Throwable {
    
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver1=new ChromeDriver();
	p=new AddEmployeePageFactory(driver1);
	driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver1.get("https://opensource-demo.orangehrmlive.com");
  //p.setUsername("Admin");
	//p.setPassword("admin123");
	Properties obj=new Properties();
	FileInputStream file=new FileInputStream("E:\\project\\OrangeHRMApplication\\property.properties");
	obj.load(file);
	
	driver1.get(obj.getProperty("url"));
  p.setUsername(obj.getProperty("username"));
	p.setPassword(obj.getProperty("password"));
	p.setLoginbutton();
    p.setPimmodule();
    driver1.navigate().refresh();
   WebDriverWait wait=new WebDriverWait(driver1,90);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/ul/li[3]/a")));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/div[2]/ul/li[2]/ul/li[3]/a")));
	p.setAdd_employee();
	 
	
}
@When("^User enters the Firstname  and lastname$")
public void user_enters_the_Firstname_and_lastname(DataTable arg1) throws Throwable {
  
	
	List<List<String>> list=arg1.raw();
	 WebDriverWait wait=new WebDriverWait(driver1,60);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/ol/li[3]/input")));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/ol/li[1]/input")));
	p.setFname(list.get(0).get(0));
	p.setLname(list.get(0).get(1));
	p.setPhoto("C:\\Users\\reddy\\Pictures\\photo.jpg");
	
	
   
}

@When("^user selected the Login Details Checkbox$")
public void user_selected_the_Login_Details_Checkbox() throws Throwable {
	String logincheck=p.setLogintext();
	assertEquals(logincheck,"Create Login Details");
   p.setLogindetails();
}

@When("^User enters Username  and password and confirmpassword$")
public void user_enters_Username_and_password_and_confirmpassword(DataTable arg1) throws Throwable {
    String username=p.setUsertext();
    List<List<String>> li=arg1.raw();
    p.setUsername1(li.get(0).get(0));
    p.setUserpassword(li.get(0).get(1));
    p.setConfirmpassword(li.get(0).get(2));
    assertEquals(username,"User Name *");
}

@When("^select the Status$")
public void select_the_Status() throws Throwable {
    p.setStatus("Enabled");
}

@When("^click on Save button$")
public void click_on_Save_button() throws Throwable {
    
    p.setSavebutton();
    
}

@Then("^User navigate to My Info field$")
public void user_navigate_to_My_Info_field() throws Throwable {
   
	WebDriverWait wait=new WebDriverWait(driver1,40);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[1]/li/label")));
	 String myinfo=p.setMyinfo();
	    assertEquals(myinfo,"Personal Details");
	    screenShot();
	    driver1.quit();
   
}

@Given("^user is on the Add Employee Field of pim$")
public void user_is_on_the_Add_Employee_Field_of_pim() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver1=new ChromeDriver();
	p=new AddEmployeePageFactory(driver1);
	driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Properties obj=new Properties();
	FileInputStream file=new FileInputStream("E:\\project\\OrangeHRMApplication\\property.properties");
	obj.load(file);
	
	driver1.get(obj.getProperty("url"));
  p.setUsername(obj.getProperty("username"));
	p.setPassword(obj.getProperty("password"));
	p.setLoginbutton();
    p.setPimmodule();
    driver1.navigate().refresh();
   WebDriverWait wait=new WebDriverWait(driver1,90);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/ul/li[3]/a")));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/div[2]/ul/li[2]/ul/li[3]/a")));
	p.setAdd_employee();
}



@When("^users enters all the required fields$")
public void users_enters_all_the_required_fields(DataTable arg1) throws Throwable {
   
	List<List<String>> list1=arg1.raw();
	 WebDriverWait wait=new WebDriverWait(driver1,20);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/ol/li[3]/input")));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/ol/li[1]/input")));
  p.setFname(list1.get(0).get(0));
  p.setLname(list1.get(0).get(1));
  p.setLogindetails();
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[6]/input")));
  p.setUserpassword(list1.get(0).get(2));
  p.setConfirmpassword(list1.get(0).get(3));
  
}
@When("^user did not enter Username field$")
public void user_did_not_enter_Username_field() throws Throwable {
   p.setUsername1("");
   p.setSavebutton();
}

@Then("^error message displayed below the username field$")
public void error_message_displayed_below_the_username_field() throws Throwable {
   String usernamespan=p.setUsernamespan();
   assertEquals(usernamespan,"Should have at least 5 characters");
   screenShot();
   driver1.quit();
   
}
@Given("^user is on the Add Employee Field pim$")
public void user_is_on_the_Add_Employee_Field_pim() throws Throwable {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver1=new ChromeDriver();
	p=new AddEmployeePageFactory(driver1);
	driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver1.get("https://opensource-demo.orangehrmlive.com");
  //p.setUsername("Admin");
	//p.setPassword("admin123");
	Properties obj=new Properties();
	FileInputStream file=new FileInputStream("E:\\project\\OrangeHRMApplication\\property.properties");
	obj.load(file);
	
	driver1.get(obj.getProperty("url"));
  p.setUsername(obj.getProperty("username"));
	p.setPassword(obj.getProperty("password"));
	p.setLoginbutton();
    p.setPimmodule();
    driver1.navigate().refresh();
   WebDriverWait wait=new WebDriverWait(driver1,90);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/ul/li[3]/a")));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/div[2]/ul/li[2]/ul/li[3]/a")));
//    driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/ul/li[3]/a")).click();
	p.setAdd_employee();
}

@When("^User enters all required fields$")
public void user_enters_all_required_fields(DataTable arg1) throws Throwable {
    List<List<String>> List=arg1.raw();
    WebDriverWait wait=new WebDriverWait(driver1,20);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/ol/li[3]/input")));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/ol/li[1]/input")));
    p.setFname(List.get(0).get(0));
    p.setLname(List.get(0).get(1));
    p.setLogindetails();
    p.setUsername1(List.get(0).get(2));
}

@When("^user did not enter the password$")
public void user_did_not_enter_the_password() throws Throwable {
    p.setUserpassword("");
    p.setSavebutton();

}
@Then("^Error message displayed on password field$")
public void error_message_displayed_on_password_field() throws Throwable {
    String passwordspan=p.setPasswordspan();
    assertEquals(passwordspan,"Should have at least 8 characters");
    screenShot();
    driver1.quit();
}

@When("^User did not enter the firstname$")
public void user_did_not_enter_the_firstname() throws Throwable {
    p.setFname("");
}

@When("^user clicks on Save Button$")
public void user_clicks_on_Save_Button() throws Throwable {
   p.setSavebutton();
}

@Then("^error message displayed below the firstname field$")
public void error_message_displayed_below_the_firstname_field() throws Throwable {
	String p1=p.setFspan();
   assertEquals(p1,"Required");
    screenShot();
    driver1.quit();
}

@When("^User enter the firstname$")
public void user_enter_the_firstname() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    p.setFname("reddy");
}

@When("^user did not the lastname$")
public void user_did_not_the_lastname() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    p.setLname("");
}

@Then("^error message displayed below the lastname field$")
public void error_message_displayed_below_the_lastname_field() throws Throwable {
    p.setSavebutton();
    screenShot();
   String ltext= p.setLastnametext();
   System.out.println(ltext);
  assertEquals(ltext,"Required");
   driver1.quit();
   
}

@When("^User enters all required field$")
public void user_enters_all_required_field(DataTable arg1) throws Throwable {
   List<List<String>> list=arg1.raw();
   p.setFname(list.get(0).get(0));
   p.setLname(list.get(0).get(1));
   p.setLogindetails();
   p.setUserpassword(list.get(0).get(2));
   p.setConfirmpassword(list.get(0).get(3));
   
}

@When("^user entered the username less than five characters$")
public void user_entered_the_username_less_than_five_characters(DataTable arg1) throws Throwable {
    List<List<String>> user=arg1.raw();
    p.setUsername1(user.get(0).get(0));
}

@Then("^error message displayed$")
public void error_message_displayed() throws Throwable {
   p.setSavebutton();
   String usernamespan=p.setUsernamespan();
   assertEquals(usernamespan,"Should have at least 5 characters");
   screenShot();
   driver1.quit();
}

@When("^User entered all required fields$")
public void user_entered_all_required_fields(DataTable arg1) throws Throwable {
	List<List<String>> pass=arg1.raw();
	p.setFname(pass.get(0).get(0));
	p.setLname(pass.get(0).get(1));
	p.setLogindetails();
	p.setUsername1(pass.get(0).get(2));
	
	
}

@When("^user enters the password less than eight characters$")
public void user_enters_the_password_less_than_eight_characters(DataTable arg1) throws Throwable {
    List<List<String>> li=arg1.raw();
    p.setUserpassword(li.get(0).get(0));
}

@Then("^error message will be displayed$")
public void error_message_will_be_displayed() throws Throwable {
    p.setSavebutton();
    String passwordspan=p.setPasswordspan();
    assertEquals(passwordspan,"Should have at least 8 characters");
    screenShot();
    driver1.quit();
}




static void screenShot() throws IOException
{
    File scrFile;
    scrFile = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
    Files.copy(scrFile, new File("C:\\Users\\reddy\\Desktop\\eclipses\\step" + i + ".jpeg"));
    i++;
}
}







