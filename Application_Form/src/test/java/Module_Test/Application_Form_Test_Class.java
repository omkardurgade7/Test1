package Module_Test;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Base_Class;
import Library_Files.Utility_Class;
import Module.Application_Form;

public class Application_Form_Test_Class extends Base_Class
{
	Application_Form reg;
	
	@BeforeClass
	public void openBrowser()
	{
		initializeBrowser();
		
		reg=new Application_Form(driver);
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("Login");
	}
	@Test
	public void registration() throws EncryptedDocumentException, IOException
	{
		reg.enterfirstname(Utility_Class.getDATAFROMEXCELsheet(0, 0));
		reg.enterlastname(Utility_Class.getDATAFROMEXCELsheet(1, 0));
		reg.enterorganization(Utility_Class.getDATAFROMEXCELsheet(3, 0));
		reg.entertitle(Utility_Class.getDATAFROMEXCELsheet(5, 0));
		reg.enteremail(Utility_Class.getDATAFROMEXCELsheet(6, 0));
		reg.enterphone(Utility_Class.getDATAFROMEXCELsheet(7, 0));
		reg.enteraddress(Utility_Class.getDATAFROMEXCELsheet(8, 0));
		reg.enteraddress2(Utility_Class.getDATAFROMEXCELsheet(9, 0));
		reg.entercity(Utility_Class.getDATAFROMEXCELsheet(10, 0));
		reg.enterstate(Utility_Class.getDATAFROMEXCELsheet(0, 1));
		reg.enterpostalcode(Utility_Class.getDATAFROMEXCELsheet(11, 0));
		reg.selectCountry(Utility_Class.getDATAFROMEXCELsheet(12, 0));
		reg.selectrevenue(Utility_Class.getDATAFROMEXCELsheet(13, 0));
		reg.enterabout(Utility_Class.getDATAFROMEXCELsheet(14, 0));
		reg.selectcheckbox();
		reg.enterorderid(Utility_Class.getDATAFROMEXCELsheet(15, 0));
		
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout");
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	
}
