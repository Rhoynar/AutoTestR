import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CASE_STUDIES_TEST {
	static WebDriver web;
	static CASE_STUDIES sc;
	Map <String, String> mapData;
	
	@BeforeSuite
	public void BeforeSuite() throws Exception
	{
	    DataMapGen dmg = new DataMapGen();
	    mapData = dmg.getDataMap();	
	}
	        
	@BeforeMethod
	public void BeforeTest()
	{
		web = new FirefoxDriver();
    	web.get("http://www.rhoynar.com/case-studies");
    	web.manage().window().maximize();    		
		sc = new CASE_STUDIES (web,mapData);
    	PageFactory.initElements(web, sc);
	}
	
	@AfterMethod
	public void AfterTest()
	{
		web.quit();
	}
	@Test 
	public void Test_clickAboutUsLink()
	{ 
		sc.clickAboutUsLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickAutotestrAutomaticTestGenerationLink()
	{ 
		sc.clickAutotestrAutomaticTestGenerationLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickBlog1Link()
	{ 
		sc.clickBlog1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickBlog2Link()
	{ 
		sc.clickBlog2Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickCareers1Link()
	{ 
		sc.clickCareers1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickCareers2Link()
	{ 
		sc.clickCareers2Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickCaseStudiesLink()
	{ 
		sc.clickCaseStudiesLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickCompanyLink()
	{ 
		sc.clickCompanyLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickCompetitiveAdvantageLink()
	{ 
		sc.clickCompetitiveAdvantageLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickComprehensiveQaLink()
	{ 
		sc.clickComprehensiveQaLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickContactUs1Link()
	{ 
		sc.clickContactUs1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickContactUs2Link()
	{ 
		sc.clickContactUs2Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickContactrhoynarComLink()
	{ 
		sc.clickContactrhoynarComLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickContinuousIntegrationLink()
	{ 
		sc.clickContinuousIntegrationLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickDevSolutionsLink()
	{ 
		sc.clickDevSolutionsLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickFacebookLink()
	{ 
		sc.clickFacebookLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickFollowRhoynarsoftLink()
	{ 
		sc.clickFollowRhoynarsoftLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickGoogleLink()
	{ 
		sc.clickGoogleLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickHome1Link()
	{ 
		sc.clickHome1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickHome2Link()
	{ 
		sc.clickHome2Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickIotTestingLink()
	{ 
		sc.clickIotTestingLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickIottestrFrameworkIotTestingLink()
	{ 
		sc.clickIottestrFrameworkIotTestingLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickMailrEmailAutomationLink()
	{ 
		sc.clickMailrEmailAutomationLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickMenuLink()
	{ 
		sc.clickMenuLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickMigraterSeleniumMigrationLink()
	{ 
		sc.clickMigraterSeleniumMigrationLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickMobileDevelopmentLink()
	{ 
		sc.clickMobileDevelopmentLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickPricingModelLink()
	{ 
		sc.clickPricingModelLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickProducts1Link()
	{ 
		sc.clickProducts1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickProducts2Link()
	{ 
		sc.clickProducts2Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickQaCaseStudiesLink()
	{ 
		sc.clickQaCaseStudiesLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickQaSolutionsLink()
	{ 
		sc.clickQaSolutionsLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickQaStaffingLink()
	{ 
		sc.clickQaStaffingLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickQaTrainingLink()
	{ 
		sc.clickQaTrainingLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickQtpToSeleniumMigrationLink()
	{ 
		sc.clickQtpToSeleniumMigrationLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickRhoynarSoftwareConsultingDenverCoLink()
	{ 
		sc.clickRhoynarSoftwareConsultingDenverCoLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickSecurityTestingLink()
	{ 
		sc.clickSecurityTestingLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickServicesLink()
	{ 
		sc.clickServicesLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickSquadPresentationLink()
	{ 
		sc.clickSquadPresentationLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickTestimonialsLink()
	{ 
		sc.clickTestimonialsLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickTrainingLink()
	{ 
		sc.clickTrainingLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickWebAndMobileQaLink()
	{ 
		sc.clickWebAndMobileQaLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickWebDevelopmentLink()
	{ 
		sc.clickWebDevelopmentLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickWhyRhoynarLink()
	{ 
		sc.clickWhyRhoynarLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickWwwRhoynarComLink()
	{ 
		sc.clickWwwRhoynarComLink();
		/* TEST - ADD Assert Here */
	}


}