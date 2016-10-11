import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BLOG_TEST {
	static WebDriver web;
	static BLOG sc;
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
    	web.get("http://www.rhoynar.com/blog");
    	web.manage().window().maximize();    		
		sc = new BLOG (web,mapData);
    	PageFactory.initElements(web, sc);
	}
	
	@AfterMethod
	public void AfterTest()
	{
		web.quit();
	}
	@Test 
	public void Test_click10ThingsYouMustKnowAboutLink()
	{ 
		sc.click10ThingsYouMustKnowAboutLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickAboutUsLink()
	{ 
		sc.clickAboutUsLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickAgile1Link()
	{ 
		sc.clickAgile1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickAgile2Link()
	{ 
		sc.clickAgile2Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickAgile3Link()
	{ 
		sc.clickAgile3Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickAgile4Link()
	{ 
		sc.clickAgile4Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickAutotestrAutomaticTestGenerationLink()
	{ 
		sc.clickAutotestrAutomaticTestGenerationLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickBdd1Link()
	{ 
		sc.clickBdd1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickBdd2Link()
	{ 
		sc.clickBdd2Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickBehaviorDrivenDevelopmentBddForYourLink()
	{ 
		sc.clickBehaviorDrivenDevelopmentBddForYourLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickBenefitsOfContinuousDeliveryLink()
	{ 
		sc.clickBenefitsOfContinuousDeliveryLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickBenefitsOfTestDrivenDevelopmentLink()
	{ 
		sc.clickBenefitsOfTestDrivenDevelopmentLink();
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
	public void Test_clickClickToShareOnGoogleOpens1Link()
	{ 
		sc.clickClickToShareOnGoogleOpens1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickClickToShareOnGoogleOpens2Link()
	{ 
		sc.clickClickToShareOnGoogleOpens2Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickClickToShareOnGoogleOpens3Link()
	{ 
		sc.clickClickToShareOnGoogleOpens3Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickClickToShareOnGoogleOpens4Link()
	{ 
		sc.clickClickToShareOnGoogleOpens4Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickClickToShareOnGoogleOpens5Link()
	{ 
		sc.clickClickToShareOnGoogleOpens5Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickClickToShareOnGoogleOpens6Link()
	{ 
		sc.clickClickToShareOnGoogleOpens6Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickClickToShareOnTwitterOpens1Link()
	{ 
		sc.clickClickToShareOnTwitterOpens1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickClickToShareOnTwitterOpens2Link()
	{ 
		sc.clickClickToShareOnTwitterOpens2Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickClickToShareOnTwitterOpens3Link()
	{ 
		sc.clickClickToShareOnTwitterOpens3Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickClickToShareOnTwitterOpens4Link()
	{ 
		sc.clickClickToShareOnTwitterOpens4Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickClickToShareOnTwitterOpens5Link()
	{ 
		sc.clickClickToShareOnTwitterOpens5Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickClickToShareOnTwitterOpens6Link()
	{ 
		sc.clickClickToShareOnTwitterOpens6Link();
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
	public void Test_clickContinuousDelivery1Link()
	{ 
		sc.clickContinuousDelivery1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickContinuousDelivery2Link()
	{ 
		sc.clickContinuousDelivery2Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickContinuousDelivery3Link()
	{ 
		sc.clickContinuousDelivery3Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickContinuousDelivery4Link()
	{ 
		sc.clickContinuousDelivery4Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickContinuousIntegration1Link()
	{ 
		sc.clickContinuousIntegration1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickContinuousIntegration2Link()
	{ 
		sc.clickContinuousIntegration2Link();
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
	public void Test_clickJoinUsForAPresentationOnLink()
	{ 
		sc.clickJoinUsForAPresentationOnLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickLeaveAComment1Link()
	{ 
		sc.clickLeaveAComment1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickLeaveAComment2Link()
	{ 
		sc.clickLeaveAComment2Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickLeaveAComment3Link()
	{ 
		sc.clickLeaveAComment3Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickLeaveAComment4Link()
	{ 
		sc.clickLeaveAComment4Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickLeaveAComment5Link()
	{ 
		sc.clickLeaveAComment5Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickLeaveAComment6Link()
	{ 
		sc.clickLeaveAComment6Link();
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
	public void Test_clickNoComments1Link()
	{ 
		sc.clickNoComments1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickNoComments2Link()
	{ 
		sc.clickNoComments2Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickNoComments3Link()
	{ 
		sc.clickNoComments3Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickNoComments4Link()
	{ 
		sc.clickNoComments4Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickNoComments5Link()
	{ 
		sc.clickNoComments5Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickNoComments6Link()
	{ 
		sc.clickNoComments6Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickPracticalAgileLink()
	{ 
		sc.clickPracticalAgileLink();
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
	public void Test_clickReadMore1Link()
	{ 
		sc.clickReadMore1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickReadMore2Link()
	{ 
		sc.clickReadMore2Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickReadMore3Link()
	{ 
		sc.clickReadMore3Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickReadMore4Link()
	{ 
		sc.clickReadMore4Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickReadMore5Link()
	{ 
		sc.clickReadMore5Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickReadMore6Link()
	{ 
		sc.clickReadMore6Link();
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
	public void Test_clickSeleniumWebdriver1Link()
	{ 
		sc.clickSeleniumWebdriver1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickSeleniumWebdriver2Link()
	{ 
		sc.clickSeleniumWebdriver2Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickServicesLink()
	{ 
		sc.clickServicesLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickShareOnFacebookOpensInNew1Link()
	{ 
		sc.clickShareOnFacebookOpensInNew1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickShareOnFacebookOpensInNew2Link()
	{ 
		sc.clickShareOnFacebookOpensInNew2Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickShareOnFacebookOpensInNew3Link()
	{ 
		sc.clickShareOnFacebookOpensInNew3Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickShareOnFacebookOpensInNew4Link()
	{ 
		sc.clickShareOnFacebookOpensInNew4Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickShareOnFacebookOpensInNew5Link()
	{ 
		sc.clickShareOnFacebookOpensInNew5Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickShareOnFacebookOpensInNew6Link()
	{ 
		sc.clickShareOnFacebookOpensInNew6Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickSquadPresentationLink()
	{ 
		sc.clickSquadPresentationLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickTestDrivenDevelopment1Link()
	{ 
		sc.clickTestDrivenDevelopment1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickTestDrivenDevelopment2Link()
	{ 
		sc.clickTestDrivenDevelopment2Link();
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
	public void Test_clickUncategorized1Link()
	{ 
		sc.clickUncategorized1Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickUncategorized2Link()
	{ 
		sc.clickUncategorized2Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickUncategorized3Link()
	{ 
		sc.clickUncategorized3Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickUncategorized4Link()
	{ 
		sc.clickUncategorized4Link();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickViewRhoynarsProfileOnFacebookLink()
	{ 
		sc.clickViewRhoynarsProfileOnFacebookLink();
		/* TEST - ADD Assert Here */
	}

	@Test 
	public void Test_clickViewRhoynarsoftsProfileOnTwitterLink()
	{ 
		sc.clickViewRhoynarsoftsProfileOnTwitterLink();
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