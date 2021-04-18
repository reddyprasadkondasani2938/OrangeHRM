package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePageFactory {
	WebDriver driver;
@FindBy(name="txtUsername")
WebElement username;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/label")
WebElement nametag;

@FindBy(how=How.NAME,using="txtPassword")
WebElement password;

@FindBy(how=How.NAME, using="Submit")
WebElement loginbutton;

@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[2]/a/b")
WebElement pimmodule;

@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[2]/a/b")
WebElement pimmodule1;

@FindBy(how=How.ID, using="menu_pim_addEmployee")
WebElement add_employee;
@FindBy(how=How.ID, using="menu_pim_addEmployee")
WebElement add_employee1;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/ol/li[1]/input")
WebElement fname;
@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/ol/li[1]/input")
WebElement fname1;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[1]/h1")
WebElement addEmployeetitle;

@FindBy(how=How.ID, using="middleName")
WebElement mname;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/ol/li[3]/input")
WebElement lname;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/div[1]/h1")
WebElement myinfo;

@FindBy(how=How.ID, using="employeeId")
WebElement eid;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/ol/li[1]/span")
@CacheLookup
WebElement spantext;


@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[3]/input")
WebElement photo;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/p/input")
WebElement savebutton;
@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/p/input")
WebElement savebutton1;

@FindBy(how=How.NAME, using="chkLogin")
WebElement logindetails;

@FindBy(how=How.ID, using="user_name")
WebElement username1;

@FindBy(how=How.NAME, using="user_password")
WebElement userpassword;

@FindBy(how=How.NAME, using="re_password")
WebElement confirmpassword;

@FindBy(how=How.ID, using="status")
WebElement status;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[6]/label")
WebElement passwordtext;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[7]/label")
WebElement confirmtext;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[5]/span")
WebElement usernamespan;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[6]/span")
WebElement passwordspan;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[5]/label")
WebElement usertext;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/ol/li[3]/span")
WebElement lspan;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/ol/li[1]/span")
WebElement fspan;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[4]/label")
WebElement logintext;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[5]/label")
WebElement usernametext;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/ol/li[1]/span")
WebElement firstnametext;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/ol/li[3]/span")
WebElement lastnametext;

@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[7]/span")
WebElement confirmspan;

public AddEmployeePageFactory(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
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

public void setAdd_employee() {
	add_employee.click();
}
public void setMname(String mName) {
	mname.sendKeys(mName);
}
public WebElement getMname() {
	return mname;
}
public void setFname(String lastname) {
	fname.sendKeys(lastname);
}
public WebElement getFname() {
	return fname;
}
public void setLname(String lName) {
	lname.sendKeys(lName);
}
public WebElement getLname() {
	return lname;
}
public void setEid(String num) {
	eid.clear();
	eid.sendKeys(num);
}
public WebElement getEid() {
	return eid;
}
public void setSavebutton() {
	savebutton.click();
}
public void setLogindetails() {
	logindetails.click();
}
public void setUsername1(String username) {
	username1.sendKeys(username);
}
public WebElement getUsername1() {
	return username1;
}
public void setUserpassword(String pass) {
	userpassword.sendKeys(pass);
}
public WebElement getUserpassword() {
	return userpassword;
}
public void setConfirmpassword(String confirm) {
	confirmpassword.sendKeys(confirm);
}
public WebElement getConfirmpassword() {
	return confirmpassword;
}
public void setStatus(String s) {
	status.sendKeys(s);
}
public WebElement getStatus() {
	return status;
}


public String setAddEmployeetitle() {
	return (addEmployeetitle.getText());
}
public String setPimmoduletitle() {
	return (pimmodule1.getText());
}
public String setAdd_employee1() {
	return (add_employee1.getText());
}
public void setPhoto(String s) {
	photo.sendKeys(s);
}
public WebElement getPhoto() {
	return photo;
}
public String setSavebutton1() {
	return (savebutton1.getText());
}
public String setMyinfo() {
	return (myinfo.getText());
}
public String setLspan() {
	return (lspan.getText());
}
public String setFspan() {
	return (fspan.getText());
}
public String setLogintext() {
	return (logintext.getText());
}
public String setFirstnametext() {
	return (firstnametext.getText());
}
public String setLastnametext() {
	return (lastnametext.getText());
}
public String setUsertext() {
	return (usertext.getText());
}
public String setPasswordtext() {
	return (passwordtext.getText());
}
public String setConfirmtext() {
	return (confirmtext.getText());
}
public String setUsernamespan() {
	return (usernamespan.getText());
}
public String setPasswordspan() {
	return (passwordspan.getText());
}
public String setConfirmspan() {
	return (confirmspan.getText());
}
public String setNametag() {
	return (nametag.getText());
}
}
