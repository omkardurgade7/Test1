package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Application_Form {
	  @FindBy(xpath="//*[@name='q45_fullName45[first]']") private WebElement FIRSTNAME;
	  @FindBy(xpath="//*[@name='q45_fullName45[last]']") private WebElement LASTNAME;
	  @FindBy(xpath="//div[@id='cid_11']//input") private WebElement ORGANIZATION;
	  @FindBy(xpath="//div[@id='cid_12']//input") private WebElement TITLE;
	  @FindBy(xpath="//div[@id='cid_2']//input") private WebElement EMAIL;
	  @FindBy(xpath="//div[@id='cid_42']//input") private WebElement PHONE;
	  @FindBy(xpath="//input[@name='q44_address44[addr_line1]']") private WebElement ADDRESS;
	  @FindBy(xpath="//input[@name='q44_address44[addr_line2]']") private WebElement ADDRESSLINE;
	  @FindBy(xpath="//input[@name='q44_address[city]']") private WebElement CITY;
	  @FindBy(xpath="//input[@name='q44_address44[state]']") private WebElement STATE;
	  @FindBy(xpath="//input[@name='q44_address44[postal]']") private WebElement POSTALCODE;
	  @FindBy(xpath="//select[@fdprocessedid='iyfqkf']") private WebElement COUNTRY;
	  @FindBy(xpath="//select[@fdprocessedid='lb8gs']") private WebElement REVENUE;
	  @FindBy(xpath="//div[@id='cid_43']//textarea") private WebElement DETAILS;
	  @FindBy(xpath="(//span[@style='clear:left']//label)[3]") private WebElement CHECKBOX;
	  @FindBy(xpath="//div[@id='cid_31']//input") private WebElement PURCHASEORDER;
	  
	  public Application_Form(WebDriver driver)
	  {
		PageFactory.initElements(driver, this);  
	  }
	  
	  public void enterfirstname(String fn)
	  {
		  FIRSTNAME.sendKeys(fn);
	  }
	  public void enterlastname(String ln)
	  {
		LASTNAME.sendKeys(ln); 
	  }
	  public void enterorganization(String og)
	  {
		 ORGANIZATION.sendKeys(og);
	  }
	  public void entertitle(String title)
	  {
		 TITLE.sendKeys(title);
	  }
	  public void enteremail(String email)
	  {
		 EMAIL.sendKeys(email);
	  }
	  public void enterphone(String ph)
	  {
		PHONE.sendKeys(ph); 
	  }
	  public void enteraddress(String address)
	  {
		ADDRESS.sendKeys(address); 
	  }
	  public void enteraddress2(String address2)
	  {
		ADDRESS.sendKeys(address2); 
	  }
	  public void entercity(String city)
	  {
		 CITY.sendKeys(city);
	  }
	  public void enterstate(String state)
	  {
		 STATE.sendKeys(state);
	  }
	  public void enterpostalcode(String pincode)
	  {
		 POSTALCODE.sendKeys(pincode);
	  }
	  public void selectCountry(String country)
	  {
		 Select cntry=new Select(COUNTRY);
		 cntry.selectByVisibleText(country);
	  }
	  public void selectrevenue(String revenue)
	  {
		Select rvn=new Select(REVENUE);
		rvn.selectByVisibleText(revenue);
	  }
	  public void enterabout(String abt)
	  {
		 DETAILS.sendKeys(abt);
	  }
	  public void selectcheckbox()
	  {
		 CHECKBOX.click();
	  }
	  public void enterorderid(String ordr)
	  {
		 PURCHASEORDER.sendKeys(ordr);
	  }
	  
	  
}
