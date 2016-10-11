import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PRODUCTS  {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='http://www.rhoynar.com/contact-us/company/about-us']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "a[title='Automatic Selenium WebDriver Test Generation']")
    @CacheLookup
    private WebElement automaticSeleniumWebdriverTestGeneration;

    @FindBy(css = "#post-8 div.entry-content div:nth-of-type(1) h3 a")
    @CacheLookup
    private WebElement automaticTestGeneration;

    @FindBy(css = "#menu-item-152 a")
    @CacheLookup
    private WebElement autotestrAutomaticTestGeneration;

    @FindBy(css = "#menu-item-99 a")
    @CacheLookup
    private WebElement blog1;

    @FindBy(css = "#menu-item-495 a")
    @CacheLookup
    private WebElement blog2;

    @FindBy(css = "#menu-item-77 a")
    @CacheLookup
    private WebElement careers1;

    @FindBy(css = "#menu-item-494 a")
    @CacheLookup
    private WebElement careers2;

    @FindBy(css = "a[href='http://www.rhoynar.com/case-studies']")
    @CacheLookup
    private WebElement caseStudies;

    @FindBy(css = "a[href='http://www.rhoynar.com/contact-us/company']")
    @CacheLookup
    private WebElement company;

    @FindBy(css = "a[href='http://www.rhoynar.com/competitive-advantage']")
    @CacheLookup
    private WebElement competitiveAdvantage;

    @FindBy(css = "a[href='http://www.rhoynar.com/qa-services/comprehensive-qa']")
    @CacheLookup
    private WebElement comprehensiveQa;

    @FindBy(css = "#menu-item-441 a")
    @CacheLookup
    private WebElement contactUs1;

    @FindBy(css = "#menu-item-142 a")
    @CacheLookup
    private WebElement contactUs2;

    @FindBy(css = "a[href='mailto:contact@rhoynar.com']")
    @CacheLookup
    private WebElement contactrhoynarCom;

    @FindBy(css = "a[href='http://www.rhoynar.com/qa-services/continuous-integration']")
    @CacheLookup
    private WebElement continuousIntegration;

    @FindBy(css = "a[href='http://www.rhoynar.com/software-development']")
    @CacheLookup
    private WebElement devSolutions;

    @FindBy(css = "a[title='Facebook']")
    @CacheLookup
    private WebElement facebook;

    @FindBy(css = "a[class='twitter-follow-button']")
    @CacheLookup
    private WebElement followRhoynarsoft;

    @FindBy(css = "a[title='Google Plus']")
    @CacheLookup
    private WebElement google;

    @FindBy(css = "#post-8 div.entry-content div:nth-of-type(2) div strong:nth-of-type(2) a")
    @CacheLookup
    private WebElement harshMurari1;

    @FindBy(css = "#post-8 div.entry-content div:nth-of-type(8) div strong:nth-of-type(2) a")
    @CacheLookup
    private WebElement harshMurari2;

    @FindBy(css = "#menu-item-76 a")
    @CacheLookup
    private WebElement home1;

    @FindBy(css = ".page.page-id-8.page-parent.page-template-default.skt-it-consultant-pro div:nth-of-type(1) div:nth-of-type(1) div.container div:nth-of-type(1) a")
    @CacheLookup
    private WebElement home2;

    @FindBy(css = "#menu-item-118 a")
    @CacheLookup
    private WebElement iotTesting;

    @FindBy(css = "#menu-item-127 a")
    @CacheLookup
    private WebElement iottestrFrameworkIotTesting;

    @FindBy(css = "#menu-item-96 a")
    @CacheLookup
    private WebElement mailrEmailAutomation1;

    @FindBy(css = "#post-8 div.entry-content div:nth-of-type(7) h3 a")
    @CacheLookup
    private WebElement mailrEmailAutomation2;

    @FindBy(css = "a[title='MailR Email Automation Solution']")
    @CacheLookup
    private WebElement mailrEmailAutomationSolution;

    @FindBy(css = "a[href='#']")
    @CacheLookup
    private WebElement menu;

    @FindBy(css = "a[href='http://www.rhoynar.com/services/qtp-to-selenium-migration']")
    @CacheLookup
    private WebElement migraterQtpToSeleniumMigration;

    @FindBy(css = "#menu-item-305 a")
    @CacheLookup
    private WebElement migraterSeleniumMigration;

    @FindBy(css = "a[href='http://www.rhoynar.com/mobile-apps']")
    @CacheLookup
    private WebElement mobileDevelopment;

    private final String pageLoadedText = "push([ 'view', {v:'ext',j:'1:3";

    @FindBy(css = "a[href='https://code.google.com/p/selenium/wiki/PageObjects']")
    @CacheLookup
    private WebElement pageObjectModel;

    private final String pageUrl = "C:\tools\AutoTestRv0.87\html\PRODUCTS.html";

    @FindBy(css = "a[href='http://www.rhoynar.com/why-rhoynar/pricing-model']")
    @CacheLookup
    private WebElement pricingModel;

    @FindBy(css = "#menu-item-95 a")
    @CacheLookup
    private WebElement products1;

    @FindBy(css = "#menu-item-141 a")
    @CacheLookup
    private WebElement products2;

    @FindBy(css = "#menu-item-90 a")
    @CacheLookup
    private WebElement qaSolutions;

    @FindBy(css = "a[href='http://www.rhoynar.com/qa-staffing']")
    @CacheLookup
    private WebElement qaStaffing;

    @FindBy(css = "a[href='http://www.rhoynar.com/qa-training']")
    @CacheLookup
    private WebElement qaTraining;

    @FindBy(css = "#menu-item-304 a")
    @CacheLookup
    private WebElement qtpToSeleniumMigration;

    @FindBy(css = "#post-8 div.entry-content div:nth-of-type(5) p:nth-of-type(2) a")
    @CacheLookup
    private WebElement readMore;

    @FindBy(css = "#copyright div.container div:nth-of-type(1) a")
    @CacheLookup
    private WebElement rhoynarSoftwareConsultingDenverCo;

    @FindBy(css = "#post-8 div.entry-content div:nth-of-type(5) h3 a")
    @CacheLookup
    private WebElement rsciRhoynarSocInterfaceForIot;

    @FindBy(css = "a[href='http://www.rhoynar.com/security-testing']")
    @CacheLookup
    private WebElement securityTesting;

    @FindBy(css = "#menu-item-140 a")
    @CacheLookup
    private WebElement services;

    @FindBy(css = "a[href='http://www.rhoynar.com/squad-presentation-selenium-page-objects']")
    @CacheLookup
    private WebElement squadPresentation;

    @FindBy(css = "a[href='http://www.rhoynar.com/resources/testimonials']")
    @CacheLookup
    private WebElement testimonials;

    @FindBy(css = "a[href='http://www.rhoynar.com/software-development-training']")
    @CacheLookup
    private WebElement training;

    @FindBy(css = "a[href='http://www.joecolantonio.com/2014/07/31/selenium-conference-how-to-migrate-from-qtp-to-selenium/']")
    @CacheLookup
    private WebElement upto80Reductions;

    @FindBy(css = "a[href='http://www.rhoynar.com/qa-services/qa-testing']")
    @CacheLookup
    private WebElement webAndMobileQa;

    @FindBy(css = "a[href='http://www.rhoynar.com/software-development-services']")
    @CacheLookup
    private WebElement webDevelopment;

    @FindBy(css = "a[href='http://www.rhoynar.com/why-rhoynar']")
    @CacheLookup
    private WebElement whyRhoynar;

    @FindBy(css = "#footer div.container aside:nth-of-type(4) p:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement wwwRhoynarCom;

    public PRODUCTS() {
    }

    public PRODUCTS(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public PRODUCTS(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public PRODUCTS(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickAboutUsLink() {
	    if(aboutUs.isDisplayed())
        aboutUs.click();
        return this;
    }

    /**
     * Click on Automatic Selenium Webdriver Test Generation Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickAutomaticSeleniumWebdriverTestGenerationLink() {
	    if(automaticSeleniumWebdriverTestGeneration.isDisplayed())
        automaticSeleniumWebdriverTestGeneration.click();
        return this;
    }

    /**
     * Click on Automatic Test Generation Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickAutomaticTestGenerationLink() {
	    if(automaticTestGeneration.isDisplayed())
        automaticTestGeneration.click();
        return this;
    }

    /**
     * Click on Autotestr Automatic Test Generation Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickAutotestrAutomaticTestGenerationLink() {
	    if(autotestrAutomaticTestGeneration.isDisplayed())
        autotestrAutomaticTestGeneration.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickBlog1Link() {
	    if(blog1.isDisplayed())
        blog1.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickBlog2Link() {
	    if(blog2.isDisplayed())
        blog2.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickCareers1Link() {
	    if(careers1.isDisplayed())
        careers1.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickCareers2Link() {
	    if(careers2.isDisplayed())
        careers2.click();
        return this;
    }

    /**
     * Click on Case Studies Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickCaseStudiesLink() {
	    if(caseStudies.isDisplayed())
        caseStudies.click();
        return this;
    }

    /**
     * Click on Company Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickCompanyLink() {
	    if(company.isDisplayed())
        company.click();
        return this;
    }

    /**
     * Click on Competitive Advantage Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickCompetitiveAdvantageLink() {
	    if(competitiveAdvantage.isDisplayed())
        competitiveAdvantage.click();
        return this;
    }

    /**
     * Click on Comprehensive Qa Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickComprehensiveQaLink() {
	    if(comprehensiveQa.isDisplayed())
        comprehensiveQa.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickContactUs1Link() {
	    if(contactUs1.isDisplayed())
        contactUs1.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickContactUs2Link() {
	    if(contactUs2.isDisplayed())
        contactUs2.click();
        return this;
    }

    /**
     * Click on Contactrhoynar Com Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickContactrhoynarComLink() {
	    if(contactrhoynarCom.isDisplayed())
        contactrhoynarCom.click();
        return this;
    }

    /**
     * Click on Continuous Integration Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickContinuousIntegrationLink() {
	    if(continuousIntegration.isDisplayed())
        continuousIntegration.click();
        return this;
    }

    /**
     * Click on Dev Solutions Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickDevSolutionsLink() {
	    if(devSolutions.isDisplayed())
        devSolutions.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickFacebookLink() {
	    if(facebook.isDisplayed())
        facebook.click();
        return this;
    }

    /**
     * Click on Follow Rhoynarsoft Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickFollowRhoynarsoftLink() {
	    if(followRhoynarsoft.isDisplayed())
        followRhoynarsoft.click();
        return this;
    }

    /**
     * Click on Google Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickGoogleLink() {
	    if(google.isDisplayed())
        google.click();
        return this;
    }

    /**
     * Click on Harsh Murari Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickHarshMurari1Link() {
	    if(harshMurari1.isDisplayed())
        harshMurari1.click();
        return this;
    }

    /**
     * Click on Harsh Murari Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickHarshMurari2Link() {
	    if(harshMurari2.isDisplayed())
        harshMurari2.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickHome1Link() {
	    if(home1.isDisplayed())
        home1.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickHome2Link() {
	    if(home2.isDisplayed())
        home2.click();
        return this;
    }

    /**
     * Click on Iot Testing Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickIotTestingLink() {
	    if(iotTesting.isDisplayed())
        iotTesting.click();
        return this;
    }

    /**
     * Click on Iottestr Framework Iot Testing Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickIottestrFrameworkIotTestingLink() {
	    if(iottestrFrameworkIotTesting.isDisplayed())
        iottestrFrameworkIotTesting.click();
        return this;
    }

    /**
     * Click on Mailr Email Automation Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickMailrEmailAutomation1Link() {
	    if(mailrEmailAutomation1.isDisplayed())
        mailrEmailAutomation1.click();
        return this;
    }

    /**
     * Click on Mailr Email Automation Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickMailrEmailAutomation2Link() {
	    if(mailrEmailAutomation2.isDisplayed())
        mailrEmailAutomation2.click();
        return this;
    }

    /**
     * Click on Mailr Email Automation Solution Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickMailrEmailAutomationSolutionLink() {
	    if(mailrEmailAutomationSolution.isDisplayed())
        mailrEmailAutomationSolution.click();
        return this;
    }

    /**
     * Click on Menu Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickMenuLink() {
	    if(menu.isDisplayed())
        menu.click();
        return this;
    }

    /**
     * Click on Migrater Qtp To Selenium Migration Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickMigraterQtpToSeleniumMigrationLink() {
	    if(migraterQtpToSeleniumMigration.isDisplayed())
        migraterQtpToSeleniumMigration.click();
        return this;
    }

    /**
     * Click on Migrater Selenium Migration Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickMigraterSeleniumMigrationLink() {
	    if(migraterSeleniumMigration.isDisplayed())
        migraterSeleniumMigration.click();
        return this;
    }

    /**
     * Click on Mobile Development Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickMobileDevelopmentLink() {
	    if(mobileDevelopment.isDisplayed())
        mobileDevelopment.click();
        return this;
    }

    /**
     * Click on Page Object Model Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickPageObjectModelLink() {
	    if(pageObjectModel.isDisplayed())
        pageObjectModel.click();
        return this;
    }

    /**
     * Click on Pricing Model Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickPricingModelLink() {
	    if(pricingModel.isDisplayed())
        pricingModel.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickProducts1Link() {
	    if(products1.isDisplayed())
        products1.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickProducts2Link() {
	    if(products2.isDisplayed())
        products2.click();
        return this;
    }

    /**
     * Click on Qa Solutions Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickQaSolutionsLink() {
	    if(qaSolutions.isDisplayed())
        qaSolutions.click();
        return this;
    }

    /**
     * Click on Qa Staffing Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickQaStaffingLink() {
	    if(qaStaffing.isDisplayed())
        qaStaffing.click();
        return this;
    }

    /**
     * Click on Qa Training Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickQaTrainingLink() {
	    if(qaTraining.isDisplayed())
        qaTraining.click();
        return this;
    }

    /**
     * Click on Qtp To Selenium Migration Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickQtpToSeleniumMigrationLink() {
	    if(qtpToSeleniumMigration.isDisplayed())
        qtpToSeleniumMigration.click();
        return this;
    }

    /**
     * Click on Read More Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickReadMoreLink() {
	    if(readMore.isDisplayed())
        readMore.click();
        return this;
    }

    /**
     * Click on Rhoynar Software Consulting Denver Co Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickRhoynarSoftwareConsultingDenverCoLink() {
	    if(rhoynarSoftwareConsultingDenverCo.isDisplayed())
        rhoynarSoftwareConsultingDenverCo.click();
        return this;
    }

    /**
     * Click on Rsci Rhoynar Soc Interface For Iot Testing Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickRsciRhoynarSocInterfaceForIotLink() {
	    if(rsciRhoynarSocInterfaceForIot.isDisplayed())
        rsciRhoynarSocInterfaceForIot.click();
        return this;
    }

    /**
     * Click on Security Testing Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickSecurityTestingLink() {
	    if(securityTesting.isDisplayed())
        securityTesting.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickServicesLink() {
	    if(services.isDisplayed())
        services.click();
        return this;
    }

    /**
     * Click on Squad Presentation Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickSquadPresentationLink() {
	    if(squadPresentation.isDisplayed())
        squadPresentation.click();
        return this;
    }

    /**
     * Click on Testimonials Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickTestimonialsLink() {
	    if(testimonials.isDisplayed())
        testimonials.click();
        return this;
    }

    /**
     * Click on Training Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickTrainingLink() {
	    if(training.isDisplayed())
        training.click();
        return this;
    }

    /**
     * Click on Upto 80 Reductions Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickUpto80ReductionsLink() {
	    if(upto80Reductions.isDisplayed())
        upto80Reductions.click();
        return this;
    }

    /**
     * Click on Web And Mobile Qa Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickWebAndMobileQaLink() {
	    if(webAndMobileQa.isDisplayed())
        webAndMobileQa.click();
        return this;
    }

    /**
     * Click on Web Development Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickWebDevelopmentLink() {
	    if(webDevelopment.isDisplayed())
        webDevelopment.click();
        return this;
    }

    /**
     * Click on Why Rhoynar Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickWhyRhoynarLink() {
	    if(whyRhoynar.isDisplayed())
        whyRhoynar.click();
        return this;
    }

    /**
     * Click on Www Rhoynar Com Link.
     *
     * @return the  class instance.
     */
    public PRODUCTS clickWwwRhoynarComLink() {
	    if(wwwRhoynarCom.isDisplayed())
        wwwRhoynarCom.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the  class instance.
     */
    public PRODUCTS verifyPageLoaded() {
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the  class instance.
     */
    public PRODUCTS verifyPageUrl() {
        return this;
    }
}
