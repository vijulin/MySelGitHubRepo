package com.nk.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.bcel.verifier.exc.VerificationException;
import org.apache.log4j.Logger;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.nk.common.NKConstants;



public class HomePage 
{
	
	WebDriver uiDriver;
	String pageTitle=null;
	
	public HomePage(WebDriver driver)
	{
		this.uiDriver=driver;
	}
	
/*
	public HomePage(WebDriver uiDriver2) {
		// TODO Auto-generated constructor stub
	}*/
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	
	/* UI ELEMENTS Initialization*/
	
	By siteLogo= By.xpath("//div/a[@class='nLogo fl']/img");
	By userName=By.id("eLogin");
	By HeaderLinksNames=By.xpath("//div[@class='headGNB cloneCont wrap']//ul[1]/li/a/div");
	By EmployerZone=By.linkText("Employer Zone");
	By Buyonline= By.xpath("//li/a[@title='Buy Online- RESDEX and Vacancy Listings']/div");
	By BuyonlineLinks=By.xpath("//li[2]/div[@class='subMenu']/ul/li/a");
	By AllJobsheadlinks=By.xpath("//div[@class='wrap']/ul/li/a");
	By SkillsTextbox=By.xpath("//div[@id='skill']//input[@class='sugInp']");    //By.xpath("//div[@id='skill']/div/div[2]/input[1]");
	By locationTextbox=By.xpath("//div[@id='location']//input[@class='sugInp w135']");   //By.xpath("//div/div[2]/input[1]");
	By Experiencedropdown=By.xpath("//div[@id='exp_dd']//input[1]");//By.xpath("//div[@id='exp_dd']/div/input[1]");
	By ExperiencedropdownValue=By.xpath("//div[@id='exp_dd']//ul/li[text()='3']");//By.xpath("//div[@id='exp_dd']/div/input[1]");
	By Salarydropdown=By.xpath("//div[@id='salary_dd']/div/input[1]");
	By Searchhomebutton=By.id("qsbFormBtn");
	By advancesearchlink=By.partialLinkText("Advanced Search");
	By EmailidText=By.id("emailId");
	By CreatePassword=By.id("pwd");
	By IagreeTermsConditions=By.xpath("//form[@id='formpZero']/div[3]");
	By TermsandConditionslink=By.linkText("Terms and Conditions");
	By PostyourCVbutton= By.id("p0submit");
	By getbestmactchedjobsPara= By.xpath("//div[@class='center_large_title']");
	By CreateJobAlertbutton= By.id("cjaMain");
	By naukriFastForwardlinkimage= By.xpath("//div/a/h3");
	By knowyourresumescorelink=By.partialLinkText("Know your resume score");
	By GetYourFreeText=By.xpath("//ul[@class='p0L10']/li[1]/p[contains(text(),'Get your FREE')]");
	By resumefeebackResport=By.partialLinkText("resume feedback report");
	By notGettingEnoughProfilesViews=By.partialLinkText("Not getting enough profile views?");
	By get3to4TimesMoreProfiles=By.xpath("//ul[@class='p0L10']/li[2]/p");
	By Tollfreetext=By.xpath("//div[contains(text(),'(Toll-Free)')]");
	By searchallcurrentandwalkinjobs=By.xpath("//div[@class='wgtCont']/h3");
	By searchwalkingjobsbutton=By.xpath("//div[@class='wgtCont']/a/button");
	By careernavigatiorimagelink=By.xpath("//div/h3[1][@class='cnLogo']");
	By Salarytrendstext=By.xpath("//div/h3[2][@class='noBorder_center_large_title']");
	By viewSalarybutton=By.xpath("//div/a[@title='View Salaries']/button");
	By connecttoRecruiterstext=By.xpath("//div[@class='viewRecruiter wgtCont']/p");
	By viewRecruitersbutton=By.xpath("//div/a[@title='View Recruiters']/button");
	By serviceforrecruiters=By.xpath("//div/h3[text()='Services for Recruiters']");
	By naukricallslink=By.partialLinkText("Naukri Calls");
	By FastestRecruitersvechileText=By.xpath("//div/ul/li[1]/p[text()='Fastest Recruiter Vehicle']");
	By searchcvforforfreelink=By.partialLinkText("Search CVs for Free now");
	By findtherightcandidatetext=By.xpath("//li[2]/p[text()='Find the right candidate']");
	By hrzonelink=By.partialLinkText("HR Zone");
	By getupdatedonthelatestHRnews=By.xpath("//li[3]/p[text()='Get updated on the latest HR news']");
	By compusHiringsolutionslink=By.partialLinkText("Campus Hiring Solutions");
	By optimizeyourfresherHiring=By.xpath("//li[4]/p[text()='Optimize your Fresher Hiring']");
	By naukriJobSpeakText=By.xpath("//div/h3[text()='Naukri JobSpeak']");
	By monthlyJobIndexText=By.xpath("//div/p[contains(text(),'A monthly Job Index that provides insight')]");
	By viewlatestadditionLink=By.partialLinkText("View the latest edition");
	By jobsbyLocationsText=By.xpath("//div[8]/h4");
	By jobsByLocationsLinksList=By.xpath(" //div[8]/ul/li/a[@target='_blank']");
	By viewalllocationslink=By.partialLinkText("View all Locations");
	By jobsbycategorytext=By.xpath("//div[9]/h5");
	By jobsbycategorylinsList=By.xpath("//div[9]/ul/li/a");
	By viewallcategorieslink=By.xpath("View all Categories");
	By Foot_informationText=By.xpath("//div[1][@class='column ']/ul/li[@class='header']/a");
	By Foot_informationLinks=By.xpath("//div/div[@class='wrap']/div[1]/ul[1]/li/a[@title[contains(text(),*)]]");
	By Foot_jobseekerText=By.xpath("//div/div[@class='wrap']/div[2]/ul[1]/li[1][@class='header']/a");
	By foot_jobseekerlinks=By.xpath("//div/div[@class='wrap']/div[2]/ul[1]/li[position()<=8]/a[@title[contains(text(),*)]]");
	By foot_browsejostext=By.xpath("//div/div[@class='wrap']/div[3]/ul[1]/li[@class='header']/a");
	By foot_browsejobslink=By.xpath("//div/div[@class='wrap']/div[3]/ul[1]/li/a[@title[contains(text(),*)]]");
	By Foot_employersText=By.xpath("//div/div[@class='wrap']/div[4]/div/ul[1]/li[@class='header']/a");
	By Foot_employerslinks=By.xpath("//div/div[@class='wrap']/div[4]/div/ul[1]/li/a[@title[contains(text(),*)]]");
	By Foot_FastForwardText=By.xpath("//div/div[@class='wrap']/div[2]/ul[1]/li[9][@class='header']/a");
	By Foot_Fastforwardlinks=By.xpath("//div/div[@class='wrap']/div[2]/ul[1]/li[position()>9]/a[@title[contains(text(),*)]]");
	By Foot_followustext=By.xpath("//div[@class='fl column last-child']/div[2]/a[text()='Follow Us']");
	By Foot_followusLinks=By.xpath("//div[@class='fl column last-child']/div[2]/a[@title[contains(text(),*)]]");
	By loginlink=By.xpath("//div/ul[1]/li[6]/a/div");
	By searchBlrLayer = By.xpath("//div[@class='blrLyr dspN']");
	By ddExperience = By.xpath("//div/div/div[1]/ul/li[contains(.,'5')]");
	By expArrow = By.xpath("//div[@id='exp_dd']//span[@class='smArw']");
	By registerLink = By.xpath("//div[@class='row txtC']/a[contains(.,'Register Now')]");
	
	
	
	/* Varibales*/
	boolean flag=false;
	String BASE_URL="http://www.naukri.com/";
	public int exps;
	
	
	


	public void getHomePageTitle() throws Exception
	 {
	  Log.info("getting the on page titles");
	  try 
	  {
	   pageTitle=uiDriver.getTitle().trim();
	   Assert.assertEquals(pageTitle, NKConstants.PAGETITLE_HOMEPAGE, "Home Page title is not matching or displayed as expected");
	  } 
	  catch (Exception e) {
	   
	   throw new Exception("FAILED CLICKON SITE " + "\nclickOnSiteLogo " +e.getLocalizedMessage());
	  }
	 }

	
	/***************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return void
	 * This method will click on the Site Logo
	 */
	public HomePage clickOnSiteLogo() throws Exception
	{
		Log.info("Clicking on Sitelogu Image");
		try 
		{
			//flag=uiDriver.findElement(siteLogo).isDisplayed();
			//Assert.assertTrue(flag,"Sitelogo is not displayed");
			verifySiteLogo();
			uiDriver.findElement(siteLogo).click();
		} 
		catch (Exception e) {
			
			throw new Exception("FAILED CLICKON SITE " + "\nclickOnSiteLogo " +e.getLocalizedMessage());
		}
		return new HomePage(uiDriver);
	}
/**********************************************************************************************************************/	
	/**
	 * @author manjunathr
	 * @return boolean
	 * This method will verify whether Site logo is displayed on the Page and Returns boolean Value
	 */
	public boolean verifySiteLogo() throws Exception
	{
	Log.info("Verifying Site Logo");
		try 
		{
			flag=uiDriver.findElement(siteLogo).isDisplayed();
			Assert.assertTrue(flag,"Sitelogo is not displayed");
			return flag;
		} catch (Exception e)
		{
			throw new Exception("FAILED VERIFY SITE LOGO " + " \n verifySiteLogo " + e.getLocalizedMessage());
		}
		
	}
/*****************************************************************************************************************************************************/	
	/**
	 * @author manjunathr
	 * @param uname
	 * @return void
	 * * This Method will Enter the Username
	 */
	public void enterUsername(String uname) throws Exception
	{
		Log.info("Entering User name " + uname);
		try 
		{
			uiDriver.findElement(userName).sendKeys(uname);
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED USERNAME VERIFYING THE OBJECT "  +  " \n enterUsername(String uname) "  + e.getLocalizedMessage());
		}
	}
	/*****************************************************************************************************************************************************/	
	public List<String> getJobsByLocations()
	{
		List<WebElement> li= uiDriver.findElements(By.xpath("ole"));
		
		List<String>arrlst= new ArrayList<String>();
		
		for (WebElement welist : li)
		{
			
			arrlst.add(welist.getText());
		}
		
		return arrlst;
	}
	/*****************************************************************************************************************************************************/	
	/**
	 * @author manjunathr
	 * @return ArrayList
	 * @throws Exception
	 * This method will get all the header list links and get the text of the links and stores in ArrayList
	 */

	public List<String> getHeaderLinksName() throws Exception
	{
		Log.info("Getting Header Links Text");
		try 
		{
			List<WebElement> Headlinks= uiDriver.findElements(HeaderLinksNames);
			
			List<String> HeadArrList=  new ArrayList<String>();
			
			for (WebElement linksname : Headlinks) 
			{
				HeadArrList.add(linksname.getText());
			}
			return HeadArrList;	
		} catch (Exception e)
		{
			throw new Exception("FAILED GET HEADER LINKS " + "\n getHeaderLinksName " +e.getLocalizedMessage());
		}
	}
	/*****************************************************************************************************************************************************/		
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This Method weill check Employerzone Element is displayed or not
	 */
	public boolean verifyEmplyerZone() throws Exception
	{
		Log.info("Verify the Employerzone link");
		try 
		{
			flag=uiDriver.findElement(EmployerZone).isDisplayed();
			Assert.assertTrue(flag, "Employerzone Image is not displayed");
			return flag;
			
		}
		catch (Exception e) 
		{
			throw new Exception("FAILED VERIFYING THE EMPLOYERZONE LINK " + "\n verifyEmplyerZone " +e.getLocalizedMessage());
		}
	}
	/*****************************************************************************************************************************************************/	
	/**
	 * @author manjunathr
	 * @return void
	 * @throws Exception
	 * This Method will click on Employerzone Link
	 */
	public void clickEmployerZone() throws Exception
	{
		Log.info("employerZoneClick - USer is going to click on Employerzone Link");
		try 
		{
			verifyEmplyerZone();
			uiDriver.findElement(EmployerZone).click();
			
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON EMPLOYER LINK " + "\n clickEmployerZone " + e.getLocalizedMessage());
		}
	}
	/*****************************************************************************************************************************************************/	
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 */
	public boolean verifyBuyOnline() throws Exception
	{
		Log.info("Verifying Buyonline Text is displayed on the Screen");
		try 
		{
			flag=uiDriver.findElement(Buyonline).isDisplayed();
			Assert.assertTrue(flag, "BuyOnline link is Missing");
			return flag;
			
		} 
		catch (Exception e) 
		{
			throw new Exception(" FAILED WHILE VERIFYING THE BUYONLINE LINK " + " \n verifyBuyOnline " +e.getLocalizedMessage());
		}
	}
	/*****************************************************************************************************************************************************/	
	/**
	 * @author manjunathr
	 * @return ArraybuyOnLIne
	 * @throws Exception
	 * This method method will explain to user Verify the links are available and get the text of the links.
	 */
	
	public List<String> getBuyOnLineLinks() throws Exception
	{
		Log.info("Verifying the Buyonline Links avialble");
		try 
		{
			List<WebElement> buyOnLineLnk= uiDriver.findElements(BuyonlineLinks);
			
			List<String> ArraybuyOnLIne= new ArrayList<String>();
			
			for (WebElement buyLinksName : buyOnLineLnk) 
			{
				ArraybuyOnLIne.add(buyLinksName.getText());
			}
			return ArraybuyOnLIne;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE BUYONLINE LINKS " + "\n getBuyOnLineLinks " +e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return arrayJobsList
	 * @throws Exception
	 * This Method will Gets the all Links of JObs and get the Text of Each Link and Stores in Array
	 */
	
	public List<String> getallJobsLinks() throws Exception
	{
		Log.info("Verify all the Job Links are displayed");
		
		try 
		{
			List<WebElement> allJobsLinksList= uiDriver.findElements(AllJobsheadlinks);
			
			List<String> arrayJobsList= new ArrayList<String>();
			
			for (WebElement allJobsName : allJobsLinksList) 
			{
				arrayJobsList.add(allJobsName.getText());
			}
			return arrayJobsList;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING ALL JOBS LINK " + "\n allJobsLinks " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * this Method will check Skilltextbox is displayed on the page.
	 */
	public boolean verifySkillTextBox() throws Exception
	{
		Log.info("Verify the Skills textbox is Present");
		
		try 
		{
			flag= uiDriver.findElement(SkillsTextbox).isDisplayed();
			Assert.assertTrue(flag, "Skills Textbox is Missing");
			return flag;
		} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFYING SKILLSTEXTBOX " + "\n verifySkillTextBox " + e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	/**@author manjunathr
	 * @return skil
	 * This method will enter the SkillText into the skilltext text box
	 */
	
	public void enterSkillEntry(String skil) throws Exception
	{
		Log.info("Entering the skill Text :" + skil);
		
		try 
		{
			verifySkillTextBox();
			uiDriver.findElement(SkillsTextbox).sendKeys(skil);
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE ENTERING THE SKILLL TEXT ENTRY " + " enterSkillEntry(String skil) " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will verify location Text box is displayed on Page.
	 */
	
	public boolean verifyLocationTextBox() throws Exception
	{
		Log.info("Verification of location textbox");
		try 
		{
			flag=uiDriver.findElement(locationTextbox).isDisplayed();
			Assert.assertTrue(flag, "Location Textbox is Not Dispalyed");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE LOCATION TEXTBOX " + "\n verifyLocationTextBox " +e.getLocalizedMessage());
		}
	}

	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @param Locat
	 * @throws Exception
	 * This method will enter the Location Text 
	 */
	public void enterLocation(String Locat) throws Exception
	{
		Log.info("Entering the Location Entry");
		try 
		{
			verifyLocationTextBox();
			uiDriver.findElement(locationTextbox).sendKeys(Locat);
			
		} catch (Exception e) 
		{
		throw new Exception("FAILED WHILE ENTERING THE LOCATION TEXT BOX "+ "\n enterLocation(String Locat) "+e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will verify the Experiencedropdown get displayed on the Page.
	 */
	public boolean verifyExperiencedropdown() throws Exception
	{
		Log.info("Verification of Experiencedropsown");
		try 
		{
			flag= uiDriver.findElement(Experiencedropdown).isDisplayed();
			Assert.assertTrue(flag, "Experience Dropdown is missing");
			return flag;
			
		} catch (Exception e) 
		{
		throw new Exception("FAILED WHILE VERIFYING THE EXPERINECE DROPDOWN " + "\n verifyExperiencedropdown" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * This method is to select value from the Expecrience dropdown
	 * @param selectval
	 * @return
	 * @throws Exception
	 */
	public int selectExperienceDropdown() throws Exception
	{
		Log.info("Selecting the Value from dropdown");
		
		try 
		{
			verifyExperiencedropdown();
			uiDriver.findElement(Experiencedropdown).click();
			Thread.sleep(1000);
			uiDriver.findElement(ddExperience).click();
			Thread.sleep(1000);
			WebElement expp = uiDriver.findElement(Experiencedropdown);
			String expDetail = expp.getText();
			exps = Integer.parseInt(expDetail);
			return exps;
						
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE SELECTING THE EXPERIENCE DROPDOWN " + "\n selectExperienceDropdown " +e.getLocalizedMessage());
		}
		
	}
	
	public void SelectExperience() throws InterruptedException{
		uiDriver.findElement(Experiencedropdown).click();
		Thread.sleep(3000);
		 uiDriver.findElement(ExperiencedropdownValue).click();
		Thread.sleep(3000);
	}
	
	public int getSelectedYrsExp(){
		WebElement element = uiDriver.findElement(ExperiencedropdownValue);
		String value = element.getAttribute("value").trim();
		int val = Integer.parseInt(value);
		return val;
		
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * this method will verify the Salary dropdown is displayed on the Page
	 */
	public boolean verifySalaryDropdown() throws Exception
	{
		Log.info("Verification of Salary dropdown");
		try {
			flag= uiDriver.findElement(Salarydropdown).isDisplayed();
			Assert.assertTrue(flag, "Salary Dropdown is Missing on the screen");
			
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE Verifying THE SALARY FROM THE DROPDOWN " +" \n verifySalaryDropdown " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @param selValue
	 * @return saldrpdown
	 * @throws Exception
	 * This Method will Select the Value from the Salary Dropdown
	 */
	public Select selectSalaryDropDown(String selValue) throws Exception
	{
		Log.info("VSelection of salry dropdown");
		try {
			Select saldrpdown= new Select(uiDriver.findElement(Salarydropdown));
			saldrpdown.selectByVisibleText(selValue);
			return saldrpdown;
			
		} catch (Exception e)
		{
			throw new  Exception("FAILED WHILE SELECTING THE SALARY DROPDOWN " + "\n selectSalaryDropDown(String selValue)" +e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will verify the Searchbutton is existing on the Page
	 */
	public boolean verifySearchButton() throws Exception
	{
		Log.info("Verification of Search button");
		try 
		{
			flag=uiDriver.findElement(Searchhomebutton).isDisplayed();
			Assert.assertTrue(flag, "Search button is Missing on the Page");
			return flag;
		} catch (Exception e) 
		{
	
			throw new Exception("FAILED WHILE VERIFYING THE SEARCH BUTTON " + "\n verifySearchButton " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	public SearchResultPage clickOnSearchButton() throws Exception
	{
		Log.info("Verifying the Click on Search button");
		try
		{ 
			verifySearchButton();
			uiDriver.findElement(Searchhomebutton).click();
						
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CLICK ON SEARCH BUTTON " + "\n clickOnSearchButton" +e.getLocalizedMessage());
		}
		
		return new SearchResultPage(uiDriver);
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyAdvanceSearchLink() throws Exception
	{
		Log.info("Verifying the advance searchlink");
		
		try 
		{
			flag=uiDriver.findElement(advancesearchlink).isDisplayed();
			Assert.assertTrue(flag, "Advance Search button is Missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIYING THE ADVANCE SEARCH LINK" + " \n verifyAdvanceSearchLink" +e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public void clickOnAdvanceSearchLink() throws Exception
	{
		Log.info("Verifying the Advance Search Click option");
		
		try 
		{
			clickOnAdvanceSearchLink();
			uiDriver.findElement(advancesearchlink).click();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON ADVANCE SEARCH LINK " + "\n clickOnAdvanceSearchLink" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyEnterEmailText() throws Exception
	{
		Log.info("Verifying the EmailText displayed");
		try 
		{
			flag= uiDriver.findElement(EmailidText).isDisplayed();
			Assert.assertTrue(flag, "Emailid Text box is Missing");
			return flag;
		} 
		catch (Exception e) 
		{

			throw new Exception("FAILED WHILE VERIFYING THE ENTER EMAILID TEXT VERIFICATION " + " \n verifyEnterEmailText" +e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public void enterEmailText(String emailid) throws Exception
	{
		Log.info("Verification of Entering on Email Text");
		try
		{
			verifyEnterEmailText();
			uiDriver.findElement(EmailidText).sendKeys(emailid);
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE ENTERING ON EMAILID TEXT BOX" +"\n enterEmailText(String emailid) " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyCreatePassword() throws Exception
	{
		Log.info("Verification of CreatePassword");
		try 
		{
			flag=uiDriver.findElement(CreatePassword).isDisplayed();
			Assert.assertTrue(flag, "Create Password Textbox is Missing");
			return flag;
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CreatePassword Textbox " + " \n verifyCreatePassword " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void enterCreatePassword(String password) throws Exception
	{
		Log.info("Verification for Entering the Password on create Textbox");
		try 
		{
			verifyCreatePassword();
			uiDriver.findElement(CreatePassword).sendKeys(password);
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE ENTERING ON CREATE PASSWORD TEXTBOX " + "\n enterCreatePassword(String password) " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyIagreeTermsAndConditionsPara() throws Exception
	{
		Log.info("Verification of Text of Iagree Terms and condition");
		try 
		{
			flag=uiDriver.findElement(IagreeTermsConditions).isDisplayed();
			Assert.assertTrue(flag, "I agree Terms and condition Links are Missing");
			return flag;
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFYING THE I AGREE TERMS AND CONDITIONS " +"\n verifyIagreeTermsAndConditionsPara " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyTermsAndConditionsLink() throws Exception
	{
		Log.info("Verification Terms and Conditions Link");
		
		try
		{
			flag=uiDriver.findElement(TermsandConditionslink).isDisplayed();
			Assert.assertTrue(flag, "Terms And Conditions Links is Missing");
			return flag;
			
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFING THE TERMS AND CONDITIONS LINK "+ "\n verifyTermsAndConditionsLink" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnTermsAndConditionsLink() throws Exception
	{
		Log.info("Verification for click even on Terms and conditions Link");
		try 
		{
			verifyTermsAndConditionsLink();
			uiDriver.findElement(TermsandConditionslink).click();
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON TERMS AND CONDITIONS LINK" + "\n clickOnTermsAndConditionsLink " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	public boolean verifyPostYourCV() throws Exception
	{
		Log.info("Verification for Post Your CV Button");
		try 
		{
			flag=uiDriver.findElement(PostyourCVbutton).isDisplayed();
			Assert.assertTrue(flag, "Post Your CV Object is Missing");
			return flag;
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFING THE POST YOUR CV ELEMENT" + "\n verifyPostYourCV "+e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnPostYourCV() throws Exception
	{
		Log.info("Verification of Click operation for PostYour CV");
		
		try
		{
			verifyPostYourCV();
			uiDriver.findElement(PostyourCVbutton).click();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON POSTYOUR CV BUTTON "+ "\nclickOnPostYourCV " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	public boolean verifyGetMatchedJobsPara() throws Exception
	{
		Log.info("Verification of Getmatched jobs text");
		try 
		{
			flag=uiDriver.findElement(getbestmactchedjobsPara).isDisplayed();
			Assert.assertTrue(flag, "Get Matched Jobs Email id object is Missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE GETMATCHEDHOBSPARAGRAPGH " + "\n VerifyGetMatchedJobsPara" + e.getLocalizedMessage());

		}
	}
	/********************************************************************************************************************************************************/
	public boolean verifyCreateJobAlertButton() throws Exception
	{
		Log.info("Verification of Create job alert button is displayed");
		try 
		{
			flag=uiDriver.findElement(CreateJobAlertbutton).isDisplayed();
			Assert.assertTrue(flag, "Create Job alert button is Missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CREATEJOBALERTBUTTON " + "\n verifyCreateJobAlertbutton " +e.getLocalizedMessage());

		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickonCreateJobAlertButton() throws Exception
	{
		Log.info("Clciking on the Create job alert button");
		
		try 
		{
			verifyCreateJobAlertButton();
			uiDriver.findElement(CreateJobAlertbutton).click();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON THE CREATE JOB ALERT BUTTON " + "clickonCreateJobAlertButton "+ e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public boolean verifyNaukriFastForwardImageLink() throws Exception
	{
		Log.info("Verification of Naukri Fast forward image Link");
		try
		{
			flag=uiDriver.findElement(naukriFastForwardlinkimage).isDisplayed();
			Assert.assertTrue(flag, "Naukri Fast Forward Image link is Missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE NAUKRIFASTFORWARDIMAGE LINK " + "\n verifyNaukriFastForwardImage" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnNaukriFastForwardImageLink() throws Exception
	{
		Log.info("Verification of Click opertion for Fast forward Link");
		try 
		{
			verifyNaukriFastForwardImageLink();
			uiDriver.findElement(naukriFastForwardlinkimage).click();
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON NAUKRI FAST FORWARD LINK IMAGE " + "\n clickOnNaukriFastForwardImageLink " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyKnowYourResumeScoreLink() throws Exception
	{
		Log.info("Verification of know your resume score link");
		try
		{
			flag= uiDriver.findElement(knowyourresumescorelink).isDisplayed();
			Assert.assertTrue(flag, "Know your Resume Score link object is missing");
			return flag;
			
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFYING THE KNOW YOUR SCORE LINK" + "\n verifyKnowYourResumeScoreLink " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	
	public void clickOnKnowYourResumeScoreLink() throws Exception
	{
		Log.info("clicking on know your resume Link");
		
		try 
		{
			verifyKnowYourResumeScoreLink();
			uiDriver.findElement(knowyourresumescorelink).click();
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON THE KNOW YOUR RESUME SCORE LINK" + "\n clickOnKnowYourResumeScoreLink" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyGetYourFreeText() throws Exception
	{
		Log.info("Verification of get your Free text ");
		
		try 
		{
			flag=uiDriver.findElement(GetYourFreeText).isDisplayed();
			Assert.assertTrue(flag, "Get your Free Text object is Missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE GET FREE TEXT" + "\n verifyGetYourFreeText" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	
	public boolean verifyResumeFeedbackReportLink() throws Exception
	{
		Log.info("Verification of Resume Feedback Report Link");
		try 
		{
			flag=uiDriver.findElement(resumefeebackResport).isDisplayed();
			Assert.assertTrue(flag, "Resume Feedback Report object is missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFING THE RESUME FEEDBACK LINK " + "\n verifyResumeFeedbackReportLink " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	
	public void clickOnResumeFeedbackReportLink() throws Exception
	{
		Log.info("Clicking on ResumeFeedbackReportLink");
		try 
		{
			verifyResumeFeedbackReportLink();
			uiDriver.findElement(resumefeebackResport).click();
			
		} catch (Exception e) 
		{
		throw new Exception("FAILED WHILE CLICKING ON RESUME FEEDBACK REPORT LINK " + "\n ResumeFeedbackReportLink "+e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	
	public boolean verifyNotGettingEnoughProfilesLink() throws Exception
	{
		Log.info("Verification of not getting enough profile links");
		
		try 
		{
			flag=uiDriver.findElement(notGettingEnoughProfilesViews).isDisplayed();
			Assert.assertTrue(flag, "Not getting enough profiles links object is missing");
			return flag;
			
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFYING THE NOT GETTING ENOUGH PROFILES LINKS" + "\nverifyNotGettingEnoughProfilesLink " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnNotGettingEnoughProfilesLink() throws Exception
	{
		Log.info("Clicking on not getting enough profiles link");
		
		try
		{
			verifyNotGettingEnoughProfilesLink();
			uiDriver.findElement(notGettingEnoughProfilesViews).click();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON THE NOT GETTING ENOUGH PROFLIES LINKS " + "\nclickOnNotGettingEnoughProfilesLink " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyGet3to4MoreTimesProfilesText() throws Exception
	{
		Log.info("Verification of get 3- 4 more times profiles text");
		
		try
		{
			flag=uiDriver.findElement(get3to4TimesMoreProfiles).isDisplayed();
			Assert.assertTrue(flag, "get 3-4 more times profiles text is missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception ("FAILED WHILE VERIFYING THE GET 3-4 TIMES PROFILES TEXT " + "\n verifyGet3to4MoreTimesProfilesText " + e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public boolean verifyTollFreeNumber() throws Exception
	{
		Log.info("Verification for Tollfree number");
		
		try 
		{
			flag=uiDriver.findElement(Tollfreetext).isDisplayed();
			Assert.assertTrue(flag, "Verifcation of Toll free number");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFING THE TOLLFREE NUMBER" + "\n verifyTollFreeNumber" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean VerifySearchForAllCurrentandWalkingjobs() throws Exception
	{
		Log.info("Verification of VerifySearchForAllCurrentandWalkingjobs");
		
		try 
		{
			flag= uiDriver.findElement(searchallcurrentandwalkinjobs).isDisplayed();
			Assert.assertTrue(flag, "VerifySearchForAllCurrentandWalkingjobs object is missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE VERIFY SEARCH FOR ALL CURRENT AND WALKIN JOBS" + "\nVerifySearchForAllCurrentandWalkingjobs " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifySearchWalkinJobsButton() throws Exception
	{
		Log.info("Verifcation of search walkin jobs button");
		
		try 
		{
			flag= uiDriver.findElement(searchwalkingjobsbutton).isDisplayed();
			Assert.assertTrue(flag, "SearchWalkinJObsButton object is missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE SEARCH WALKIN JOBS BUTTON " + "\n verifySearchWalkinJObsButton "+e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnSearchWalkinJobsButton() throws Exception
	{
		Log.info("Verification of Click on Search walking jobs button");
		
		try
		{ 
			verifySearchWalkinJobsButton();
		uiDriver.findElement(searchwalkingjobsbutton).click();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CLICK ON SEARCH JOBS BUTTON" + "\n clickOnSearchWalkinJobsButton " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyNaukriCareerNavigatorimageLink() throws Exception
	{
		Log.info("Verification of Career navigator image link");
		
		try
		{
			flag=uiDriver.findElement(careernavigatiorimagelink).isDisplayed();
			Assert.assertTrue(flag, "Career navigator image link is not displaying");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CAREER NAVIGATOR IMAGE LINK" + "\nverifyNaukriCareerNavigatorimageLink " +e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public void clickOnNaukriCareerNavigatorimageLink() throws Exception
	{
		Log.info("Verification of click opertaion of naukri career navigator image link");
		try 
		{
			verifyNaukriCareerNavigatorimageLink();
			uiDriver.findElement(careernavigatiorimagelink).click();
			
			
		} catch (Exception e)
		{
		throw new Exception("FAILED WHILE CLICKING ON CAREER NAVIGATOR IMAGE LINK" + "\n clickOnNaukriCareerNavigatorimageLink" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	
	public boolean verifySalaryTrendText() throws Exception
	{
		Log.info("Verification of Salary Trend text or paragraph");
		
		try 
		{
			flag=uiDriver.findElement(Salarytrendstext).isDisplayed();
			Assert.assertTrue(flag, "Salary Trend Text is missing or not Matching");
			return flag;
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE SALARY TREND TEXT" + "\n verifySalaryTrendText" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	
	public boolean verifyViewSalariesButton() throws Exception
	{
		Log.info("Verification of View salary button");
		
		try 
		{
			flag=uiDriver.findElement(viewSalarybutton).isDisplayed();
			Assert.assertTrue(flag, "View salary button is missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE VERIFYING VIEW SALARY BUTTON" + "\n verifyViewSalariesButton" +e.getLocalizedMessage() );
		}
	}
	
	/********************************************************************************************************************************************************/
	public void clickOnViewSalaryButton() throws Exception
	{
		Log.info("click operation of View salary button" );
		
		try 
		{
			verifyViewSalariesButton();
			uiDriver.findElement(viewSalarybutton).click();
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON VIEW SALARY BUTTON" +"\nclickOnViewSalaryButton " +e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public boolean verifyConnectToRecruitersText() throws Exception
	{
		Log.info("Verification of connect to recruiters text");
		
		try
		{
			flag=uiDriver.findElement(connecttoRecruiterstext).isDisplayed();
			Assert.assertTrue(flag, "Connect to recruiters text is missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CONNECT TO RECRUITERS TEXT" +"\nverifyConnectToRecruitersText " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyViewRecruitersButton() throws Exception
	{
		Log.info("verification of view recruiters link");
		
		try 
		{
			flag=uiDriver.findElement(viewRecruitersbutton).isDisplayed();
			Assert.assertTrue(flag, "Verification of view recruiters link");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE VIEW RECRITERS LINK" + "\n verifyViewRecruiterkButton" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnViewRecruitersLinkButton() throws Exception
	{
		Log.info("Clicking on view recruiters link button");
		
		try 
		{
			verifyViewRecruitersButton();
			uiDriver.findElement(viewRecruitersbutton).click();
			
		} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON VIEW RECRUITERS LINK BUTTON");
		}
	}
	
	/********************************************************************************************************************************************************/
		
	public boolean verifyServicesForRecritersText() throws Exception
	{
		Log.info("Verification of verifyServicesForRecriters");
		
		try 
		{
			flag=uiDriver.findElement(serviceforrecruiters).isDisplayed();
			Assert.assertTrue(flag, "Service for recruiters text object is missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERYFING THE SERVICE FOR RECRUITERS TEXT" + "\nverifyServicesForRecritersText " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	
	public boolean verifyNaukriCallsLink() throws Exception
	{
		Log.info("Verification of Naukri links");
		try 
		{
			flag= uiDriver.findElement(naukricallslink).isDisplayed();
			Assert.assertTrue(flag, "Naukri links object is missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE NAUKRI CALLS LINK" + "\n verifyNaukriCallsLink " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnNaukriCallsLink() throws Exception
	{
		Log.info("Clicking on naukri link");
		
		try 
		{
			verifyNaukriCallsLink();
			uiDriver.findElement(naukricallslink).click();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON NAUKRI LINKS LINK "+ "\n clickOnNaukriCallsLink" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyFastestRecruitersVechileText() throws Exception
	{
		Log.info("Verification of fastest recruiters Vechile text");
		
		try 
		{
			flag=uiDriver.findElement(FastestRecruitersvechileText).isDisplayed();
			Assert.assertTrue(flag, "Fastest Recruiters Vechile object is missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE FASTEST RECRUITERS VECHILE TEXT" + "\n verifyFastestRecruitersVechileText " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifySearchCVforFreeLink() throws Exception
	{
		Log.info("Verifcation for search CV for free link");
		try
		{
			flag=uiDriver.findElement(searchcvforforfreelink).isDisplayed();
			Assert.assertTrue(flag, "Search cv for free link is missning");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE SEARCH CV FOR FREE " + "\n verifySearchCVforFreeLink" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnSearchCVForFreeLink() throws Exception
	{
		Log.info("Clciking on search cv for free link");
		try 
		{
			verifySearchCVforFreeLink();
			uiDriver.findElement(searchcvforforfreelink).click();
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON SEARCH CV FOR FREE LINK " + "\n clickOnSearchCVForFreeLink" + e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public boolean verifyFindtheRightCandiText() throws Exception
	{
		Log.info("Verifcation  of verify Find the right candidate" );
		
		try 
		{
			flag=uiDriver.findElement(findtherightcandidatetext).isDisplayed();
			Assert.assertTrue(flag, "Find the Right Candidate Text is Missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE FIND THE RIGHT CANDIDATE TEXT" + "\n verifyFindtheRightCandiText" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyHRZoneLink() throws Exception
	{
		Log.info("Verification HR Zone Link");
		try 
		{
			flag= uiDriver.findElement(hrzonelink).isDisplayed();
			Assert.assertTrue(flag, "HR ZONE OBJECT IS MISSING");
			return flag;
		} catch (Exception e) 
		{
		throw new Exception("FAILED WHILE VERIFYING THE HR ZONE LINK" + "\n verifyHRZoneLink" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void ClickOnHRZoneLink() throws Exception
	{
		Log.info("Click on HR ZONE LINK");
		
		try 
		{
			verifyHRZoneLink();
			uiDriver.findElement(hrzonelink).click();
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON THE HR ZONE LINK" + "\n ClickOnHRZoneLink " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyCampusHiringSolutionsLink() throws Exception
	{
		Log.info("Verifying the Compus Hiring Solutions Link");
		
		try 
		{
			flag=uiDriver.findElement(compusHiringsolutionslink).isDisplayed();
			Assert.assertTrue(flag, "Campuse Hiring Solutions Link is Missing");
			return flag;
			
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFYING THE CAMPUS HIRING SOLUTIONS LINK" + "\n verifyCampusHiringSolutionsLink" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnCampusHiringSolutionsLink() throws Exception
	{
		Log.info("Clicking on the Campus hriring solutions Link");
		try 
		{
			verifyCampusHiringSolutionsLink();
			uiDriver.findElement(compusHiringsolutionslink).click();
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON CAMPUSE HIRING SOLUTIONS LINK" + "\n clickOnCampusHiringSolutionsLink" + e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public boolean verifyOptimizeYourFresherHiring() throws Exception
	{
		Log.info("Verifying the optimize your Fresher Hiring");
		
		try 
		{
			flag=uiDriver.findElement(optimizeyourfresherHiring).isDisplayed();
			Assert.assertTrue(flag, "Optimize your Freshers Hiring");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERFYING THE OPTIMIZE YOUR FRESHER HIRING" + "\n verifyOptimizeYourFresherHiring" + e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public boolean verifyNaukriJobSpeak() throws Exception
	{
		Log.info("Verification of Naukri Jobs Speak");
		
		try 
		{
			flag=uiDriver.findElement(naukriJobSpeakText).isDisplayed();
			Assert.assertTrue(flag, "Naukri job speak object is Missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFING THE NAUKRI JOBS SPEAK TEXT" + "\n verifyNaukriJobSpeak" +e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public boolean verifyMonthlyjobIndextext() throws Exception
	{
		Log.info("Verification of Monthly Job index Text");
		try 
		{
			flag=uiDriver.findElement(monthlyJobIndexText).isDisplayed();
			Assert.assertTrue(flag, "Monthly Job index Text objext is Missing");
			return flag;
			
		}
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE MONTHLY JOB INDEX TEXT" + "\n verifyMonthlyjobIndextext" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyViewLatestEditionLink() throws Exception
	{
		Log.info("Verification of View Latest edition link");
		
		try 
		{
			flag=uiDriver.findElement(viewlatestadditionLink).isDisplayed();
			Assert.assertTrue(flag, "View Latest Edition Link is Missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE VIEW LATEST EDITION LINK" + "\n verifyViewLatestEditionLink" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnViewLatestEditionLink() throws Exception
	{
		Log.info("Clicking on View lastest edition link");
		try 
		{
			verifyViewLatestEditionLink();
			uiDriver.findElement(viewlatestadditionLink).click();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON THE VIEW LATEST EDITION LINK" + "\nclickOnViewLatestEditionLink " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyJobsByLocation() throws Exception
	{
		Log.info("Verification of jobs by location text");
		try
		{
			flag=uiDriver.findElement(jobsbyLocationsText).isDisplayed();
			Assert.assertTrue(flag, "Jobs by location text is missing");
			return flag;
		} 
		catch (Exception e) 
		{
		throw new Exception("FAILED WHILE VERIFYING THE JOBS BY LOCATION TEXT" + "\n verifyJobsByLocation" + e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public List<String> getJobsBYLocationsName() throws Exception
	{
		Log.info("Getting the Locations Name");
		try 
		{
			List<WebElement> jobsbylocationsweblist=uiDriver.findElements(jobsByLocationsLinksList);
			
			List<String> arrayjobsbylocationslist= new ArrayList<String>();
			
			for (WebElement loclinksname : jobsbylocationsweblist)
			{
				arrayjobsbylocationslist.add(loclinksname.getText());
			}		
			return arrayjobsbylocationslist;
		} 
	
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE GETTING THE LOCATIONS NAME" + "\n getLocationsName" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	
	public boolean verifyViewallLocationsLink() throws Exception
	{
		Log.info("Verification of View Location link");
		try 
		{
			flag=uiDriver.findElement(viewalllocationslink).isDisplayed();
			Assert.assertTrue(flag, "View Locations link is misssing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE VIEW ALL LOCATION LINK" + "\n verifyViewallLocationsLink" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnViewLocationsLink() throws Exception
	{
		Log.info("Clicking on View Location link");
		try 
		{
			verifyViewallLocationsLink();
			uiDriver.findElement(viewalllocationslink).click();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON VIEW LOCATION LINK"+ "\n clickOnViewLocationsLink" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyJobsByCategoryText() throws Exception
	{
		Log.info("Verification of Jobs by Category Text");
		try
		{
			flag=uiDriver.findElement(jobsbycategorytext).isDisplayed();
			Assert.assertTrue(flag, "Jobs by Category Text is Missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE JOBS BY CATEGORY TEXT" + "\n verifyJobsByCategoryText" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public List<String> getJobsByCategoryLists() throws Exception
	{
		Log.info("Getting the jobs by category list");
		
		try 
		{
			List<WebElement> jobsbycategoryweblists= uiDriver.findElements(jobsbycategorylinsList);
			List<String> arrayjobscategorylist= new ArrayList<String>();
			
			for (WebElement jobscategory : jobsbycategoryweblists) 
			{
				arrayjobscategorylist.add(jobscategory.getText());
			}
			return arrayjobscategorylist;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE GETTING THE CATEGORY LISTS"+ "\n getJobsByCategoryLists" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyViewAllCategoriesLink() throws Exception
	{
		Log.info("Verification of view all categories link");
		try
		{
			flag=uiDriver.findElement(viewallcategorieslink).isDisplayed();
			Assert.assertTrue(flag, "View all categories Link is Missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFING THE VIEW ALL CATEGORIES LINK" + "\n verifyViewAllCategories"+ e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void  clickONViewAllCategoriesLink() throws Exception
	{
		Log.info("Clicking on view all categories Link");
		
		try 
		{
			verifyViewAllCategoriesLink();
			uiDriver.findElement(viewallcategorieslink).click();
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON THE VIEW ALL CATEGORIES LINK" + "\n clickONViewAllCategoriesLink" + e.getLocalizedMessage());
		}
		
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyFootINformationText() throws Exception
	{
		Log.info("Verifcation of Information Text");
		try 
		{
			flag=uiDriver.findElement(Foot_informationText).isDisplayed();
			Assert.assertTrue(flag, "Foot information Text is missing");
			return flag;
		}
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE FOOT INFOPRMATION TEXT" + "\n verifyFootINformationText" + e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public List<String> getFootInformationLinks() throws Exception
	{
		Log.info("Getting the links of inflomation");
		try
		{
			List<WebElement> informationwebList= uiDriver.findElements(Foot_informationLinks);
			List<String> arrayfootinformationlink= new ArrayList<String>();
			
			for (WebElement footarr : informationwebList) 
			{
				arrayfootinformationlink.add(footarr.getText());
			}
			return arrayfootinformationlink;
		}
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE GETTING THE FOOT INFORMATION LINKS"+ "\n getFootInformationLinks " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyJobseekerText() throws Exception
	{
		Log.info("Verifcation of jobseeker text");
		try
		{
			flag=uiDriver.findElement(Foot_jobseekerText).isDisplayed();
			Assert.assertTrue(flag, "Jobseeker Text is missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE JOBSEEKER TEXT" + "\n verifyJobseekerText" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public List<String> getJobseekersLinks() throws Exception
	{
		Log.info("Verification for Jobseekers links");
		try 
		{
			List<WebElement> jobseekersweblist= uiDriver.findElements(foot_jobseekerlinks);
			List<String> Arrayjobseerkerlist= new ArrayList<String>();
			
			for (WebElement Arrjobseeker : jobseekersweblist) 
			{
				Arrayjobseerkerlist.add(Arrjobseeker.getText());
			}
			return Arrayjobseerkerlist;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE GETTING JOBSEEKERS LINKS NAME" + "\n getJobseekersLinks " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyBrowseJobsText() throws Exception
	{
		Log.info("Verifcation of browse jobs text");
		
		try 
		{
			flag= uiDriver.findElement(foot_browsejostext).isDisplayed();
			Assert.assertTrue(flag, "Browse Jobs Text is Missing");
			return flag;
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE BROWSE JOBS TEXT " + "\n verifyBrowseJobsText" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public List<String> getBrowseLinksList()  throws Exception
	{
		Log.info("getting all browse Links");
		
		try 
		{
			List<WebElement> webbrowselist= uiDriver.findElements(foot_browsejobslink);
			List<String> Arraybrowselist= new ArrayList<String>();
			
			for (WebElement arraybrowse : webbrowselist) 
			{
				Arraybrowselist.add(arraybrowse.getText());
			}
			return Arraybrowselist;
		} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE GETTING THE LINKS OF BROWSE" + "\n getBrowseLinksList " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyEmployersText() throws Exception
	{
		Log.info("Verifcation of Employer text");
		try 
		{
			flag=uiDriver.findElement(Foot_employersText).isDisplayed();
			Assert.assertTrue(flag, "Employers Text is Missing");
			return flag;
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE EMPLOYERS TEXT" + "\n verifyEmployersText" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public List<String> getEmployersLinksList() throws Exception
	{
		Log.info("Verification of getting the employers links name");
		try 
		{
			List<WebElement> employersweblist= uiDriver.findElements(Foot_employerslinks);
			List<String> arrayemployerlist= new ArrayList<String>();
			for (WebElement arremoloyer : employersweblist) 
			{
				arrayemployerlist.add(arremoloyer.getText());
			}
			return arrayemployerlist;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE GETTING THE LINKS OF EMPLOYERS" + "\n getEmployersLinksList" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	public boolean verifyFastForwardText() throws Exception
	{
		Log.info("Verification of Fast forward Text");
		
		try 
		{
			flag=uiDriver.findElement(Foot_FastForwardText).isDisplayed();
			Assert.assertTrue(flag, "Fast and Forward Text is missing on the Page");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE FAST FORWARD TEXT" + "\n verifyFastForwardText" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public List<String> getFastForwardLinksnames() throws Exception
	{
		Log.info("Verification of Fast and forward links names");
		
		try 
		{
			List<WebElement> webfastandforwordlinks=uiDriver.findElements(Foot_Fastforwardlinks);
			List<String> arrayfastandforwardlist= new ArrayList<String>();
			for (WebElement arrayfastandforward : webfastandforwordlinks) 
			{
				arrayfastandforwardlist.add(arrayfastandforward.getText());
			}
			return arrayfastandforwardlist;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE GETTING THE FAST AND FORWARD LINKS NAME" + "\n getFastForwardLinksnames" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyFollowUsText() throws Exception
	{
		Log.info("Verification of follow us text");
		try 
		{
			flag=uiDriver.findElement(Foot_followustext).isDisplayed();
			Assert.assertTrue(flag, "Follow us Text is Missing:");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception(" FAILED WHILE VERIFYING THE FOLLOW US TEXT" + "\n verifyFollowUsText " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public List<String> getFollowUslinks() throws Exception
	{
		Log.info("Verification of follow us links");
		try 
		{
			List<WebElement> webfollowuslist= uiDriver.findElements(Foot_followusLinks);
			List<String> arrayfollowuslist= new ArrayList<String>();
			for (WebElement arrayfollowus : webfollowuslist) 
			{
				arrayfollowuslist.add(arrayfollowus.getText());
			}
			return arrayfollowuslist;
			
		} 
		catch (Exception e) 
		{
		throw new Exception("FAILED WHILE VERYFING THE FOLLOW US LINKS" + "\n getFollowUslinks" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnLoginbutton() throws Exception
	{
		Log.info("Clicking on loginbutton link button");
		
		try 
		{
			
			uiDriver.findElement(loginlink).click();
			
		} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON login  LINK BUTTON");
		}
	}
	/********************************************************************************************************************************************************/
	
	
	/********************************************************************************************************************************************************/
	public boolean verifyRegisterLink(){
		flag = uiDriver.findElement(registerLink).isDisplayed();
		Assert.assertTrue(flag, "RegisterLink is not displayed");
		return flag;
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnRegisterLink() throws Exception
	{
		Log.info("Before Clicking on Register Link");
		
		try 
		{
			verifyRegisterLink();
			uiDriver.findElement(registerLink).click();
			Log.info("After Clicking on Register Link");
			
		} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON REGISTER LINK"+"clickOnRegisterLink()"+e.getLocalizedMessage());
		}
	}
	

}
