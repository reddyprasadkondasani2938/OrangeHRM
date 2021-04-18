package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPageFactory {
WebDriver driver;
	
	@FindBy(name="txtUsername")
	WebElement username;

	@FindBy(how=How.NAME,using="txtPassword")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[1]/label")
	WebElement employeenametext;

	@FindBy(how=How.NAME, using="Submit")
	WebElement loginbutton;

	@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[2]/a/b")
	WebElement pimmodule;
	@FindBy(how=How.ID, using="menu_pim_viewEmployeeList")
	WebElement emplist;

	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr/td[1]/input")
	WebElement display;
	@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[2]/a/b")
	WebElement pimmoduletext;
	@FindBy(how=How.ID, using="empsearch_employee_name_empName")
	WebElement employee_name;

	@FindBy(xpath="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[2]/input")
	WebElement employee_id;

@FindBy(xpath="/html/body/div[1]/div[3]/div[1]/a")
WebElement empinfotext;
	@FindBy(how=How.ID,using="empsearch_employee_status")
	WebElement employeestatus;

	@FindBy(how=How.ID, using="empsearch_termination")
	WebElement include;

	@FindBy(how=How.ID, using="empsearch_supervisor_name")
	WebElement supervisor;

	@FindBy(how=How.ID, using="empsearch_job_title")
	WebElement jobtitle;

	@FindBy(how=How.ID,using="empsearch_sub_unit")
	WebElement subunit;

	@FindBy(how=How.ID,using="searchBtn")
	WebElement searchbutton;

	public EmployeeListPageFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void setEmplist() {
		emplist.click();
	}
	public void setEmployee_name(String ename) {
		employee_name.sendKeys(ename);
	}
	public WebElement getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_id(String id) {
		employee_id.sendKeys(id);
	}
	public WebElement getEmployee_id() {
		return employee_id;
	}
	public void setEmployeestatus(String status) {
		employeestatus.sendKeys(status);
	}
	public WebElement getEmployeestatus() {
		return employeestatus;
	}
	public void setInclude(String incl) {
		include.sendKeys(incl);
	}
	public WebElement getInclude() {
		return include;
	}
	public void setSupervisor(String sup) {
		supervisor.sendKeys(sup);
	}
	public WebElement getSupervisor() {
		return supervisor;
	}
	public void setJobtitle(String job) {
		jobtitle.sendKeys(job);
	}
	public WebElement getJobtitle() {
		return jobtitle;
	}
	public void setSubunit(String sub) {
		subunit.sendKeys(sub);
	}
	public WebElement getSubunit() {
		return subunit;
	}
	public void setSearchbutton() {
		searchbutton.click();
	}
	public void setUsername(String n) {
		username.sendKeys(n);
	}
	public WebElement getUsername() {
		return username;
	}
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	public WebElement getPassword() {
		return password;
	}
	public void setLoginbutton() {
		loginbutton.click();
	}

	public void setPimmodule() {
		pimmodule.click();
	}
	public String setPimmoduletext() {
		return (pimmoduletext.getText());
	}
	
	public String setEmpinfotext() {
		return (empinfotext.getText());
		
	}
	public Boolean setDispaly() {
		return (display.isDisplayed());
	}
	public String setEmployeenametext() {
		return (employeenametext.getText());
	}

}
