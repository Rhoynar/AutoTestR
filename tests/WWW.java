import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WWW  {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='http://www.rhoynar.com/contact-us/company/about-us']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "a[href='services/qa-testing']")
    @CacheLookup
    private WebElement automationTesting;

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
    private WebElement caseStudies1;

    @FindBy(css = "a[href='resources/case-studies']")
    @CacheLookup
    private WebElement caseStudies2;

    @FindBy(css = "a[href='resources/testimonials']")
    @CacheLookup
    private WebElement clientTestimonials;

    @FindBy(css = "a[href='http://www.rhoynar.com/contact-us/company']")
    @CacheLookup
    private WebElement company;

    @FindBy(css = "#menu-item-155 a")
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

    @FindBy(css = "#menu-item-92 a")
    @CacheLookup
    private WebElement continuousIntegration1;

    @FindBy(css = ".home.blog.skt-it-consultant-pro div:nth-of-type(1) section:nth-of-type(3) div.container div.page_wrapper div:nth-of-type(2) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement continuousIntegration2;

    @FindBy(css = ".home.blog.skt-it-consultant-pro div:nth-of-type(1) section:nth-of-type(3) div.container div.page_wrapper div:nth-of-type(3) ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement continuousIntegration3;

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

    @FindBy(css = "#menu-item-76 a")
    @CacheLookup
    private WebElement home;

    @FindBy(css = "#slidecaption5 div.slide_info h1 a")
    @CacheLookup
    private WebElement innovativeWebAndMobileDevelopmentServices;

    @FindBy(css = "a[href='http://www.rhoynar.com/iot-testing']")
    @CacheLookup
    private WebElement iotTesting;

    @FindBy(css = "a[href='http://www.rhoynar.com/iot-suite']")
    @CacheLookup
    private WebElement iottestrFrameworkIotTesting;

    @FindBy(css = "#slidecaption3 div.slide_info h1 a")
    @CacheLookup
    private WebElement localOnshoreAndCosteffective;

    @FindBy(css = ".home.blog.skt-it-consultant-pro div:nth-of-type(1) section:nth-of-type(3) div.container div.page_wrapper div:nth-of-type(3) ul li:nth-of-type(4) a")
    @CacheLookup
    private WebElement lowCostUsBasedSolutions;

    @FindBy(css = "a[href='http://www.rhoynar.com/products/email-automation']")
    @CacheLookup
    private WebElement mailrEmailAutomation;

    @FindBy(css = ".home.blog.skt-it-consultant-pro div:nth-of-type(1) header.header div.container div.head_fix div:nth-of-type(2) div.mobile_nav a")
    @CacheLookup
    private WebElement menu;

    @FindBy(css = "#menu-item-305 a")
    @CacheLookup
    private WebElement migraterSeleniumMigration;

    @FindBy(css = "a[href='http://www.rhoynar.com/mobile-apps']")
    @CacheLookup
    private WebElement mobileDevelopment;

    @FindBy(css = ".home.blog.skt-it-consultant-pro div:nth-of-type(1) section:nth-of-type(3) div.container div.page_wrapper div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement networkModelAutotestgen;

    private final String pageLoadedText = "push([ 'view', {v:'ext',j:'1:3";

    private final String pageUrl = "C:\tools\AutoTestRv0.87\html\WWW.RHOYNAR.COM.html";

    @FindBy(css = "a[href='http://www.rhoynar.com/why-rhoynar/pricing-model']")
    @CacheLookup
    private WebElement pricingModel;

    @FindBy(css = "#menu-item-95 a")
    @CacheLookup
    private WebElement products1;

    @FindBy(css = "#menu-item-141 a")
    @CacheLookup
    private WebElement products2;

    @FindBy(css = ".home.blog.skt-it-consultant-pro div:nth-of-type(1) section:nth-of-type(2) div.container div:nth-of-type(4) a")
    @CacheLookup
    private WebElement productsRhoynarSoftwareHasExtensive;

    @FindBy(css = "#menu-item-90 a")
    @CacheLookup
    private WebElement qaSolutions;

    @FindBy(css = "#menu-item-306 a")
    @CacheLookup
    private WebElement qaStaffing;

    @FindBy(css = ".home.blog.skt-it-consultant-pro div:nth-of-type(1) section:nth-of-type(2) div.container div:nth-of-type(3) a")
    @CacheLookup
    private WebElement qaStaffingRhoynarQaStaffing;

    @FindBy(css = ".home.blog.skt-it-consultant-pro div:nth-of-type(1) section:nth-of-type(2) div.container div:nth-of-type(2) a")
    @CacheLookup
    private WebElement qaTestingServicesAtRhoynar;

    @FindBy(css = "a[href='http://www.rhoynar.com/qa-training']")
    @CacheLookup
    private WebElement qaTraining;

    @FindBy(css = "#menu-item-304 a")
    @CacheLookup
    private WebElement qtpToSeleniumMigration;

    @FindBy(css = ".home.blog.skt-it-consultant-pro div:nth-of-type(1) section:nth-of-type(3) div.container div.page_wrapper div:nth-of-type(3) ul li:nth-of-type(5) a")
    @CacheLookup
    private WebElement rhoynarAdvantage;

    @FindBy(css = "#copyright div.container div:nth-of-type(1) a")
    @CacheLookup
    private WebElement rhoynarSoftwareConsultingDenverCo;

    @FindBy(css = "#slidecaption2 div.slide_info h1 a")
    @CacheLookup
    private WebElement robustAndImpregnableTestSuitesWith;

    @FindBy(css = "a[href='http://www.rhoynar.com/security-testing']")
    @CacheLookup
    private WebElement securityTesting;

    @FindBy(css = ".home.blog.skt-it-consultant-pro div:nth-of-type(1) section:nth-of-type(3) div.container div.page_wrapper div:nth-of-type(3) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement seleniumMigration;

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

    @FindBy(css = "#slidecaption4 div.slide_info h1 a")
    @CacheLookup
    private WebElement unabridgedAutomationAndContinuousIntegration;

    @FindBy(css = "a[href='http://www.rhoynar.com/qa-services/qa-testing']")
    @CacheLookup
    private WebElement webAndMobileQa1;

    @FindBy(css = ".home.blog.skt-it-consultant-pro div:nth-of-type(1) section:nth-of-type(3) div.container div.page_wrapper div:nth-of-type(3) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement webAndMobileQa2;

    @FindBy(css = "#menu-item-657 a")
    @CacheLookup
    private WebElement webDevelopment;

    @FindBy(css = "#menu-item-86 a")
    @CacheLookup
    private WebElement whyRhoynar;

    @FindBy(css = ".home.blog.skt-it-consultant-pro div:nth-of-type(1) section:nth-of-type(2) div.container div:nth-of-type(1) a")
    @CacheLookup
    private WebElement whyRhoynarRhoynarSoftwareDesigns;

    @FindBy(css = "a[href='http://www.rhoynar.com']")
    @CacheLookup
    private WebElement wwwRhoynarCom;

    @FindBy(css = "#slidecaption1 div.slide_info h1 a")
    @CacheLookup
    private WebElement yourExtendedFullserviceQaTeam;

    public WWW() {
    }

    public WWW(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public WWW(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public WWW(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the  class instance.
     */
    public WWW clickAboutUsLink() {
	    if(aboutUs.isDisplayed())
        aboutUs.click();
        return this;
    }

    /**
     * Click on Automation Testing Link.
     *
     * @return the  class instance.
     */
    public WWW clickAutomationTestingLink() {
	    if(automationTesting.isDisplayed())
        automationTesting.click();
        return this;
    }

    /**
     * Click on Autotestr Automatic Test Generation Link.
     *
     * @return the  class instance.
     */
    public WWW clickAutotestrAutomaticTestGenerationLink() {
	    if(autotestrAutomaticTestGeneration.isDisplayed())
        autotestrAutomaticTestGeneration.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the  class instance.
     */
    public WWW clickBlog1Link() {
	    if(blog1.isDisplayed())
        blog1.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the  class instance.
     */
    public WWW clickBlog2Link() {
	    if(blog2.isDisplayed())
        blog2.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the  class instance.
     */
    public WWW clickCareers1Link() {
	    if(careers1.isDisplayed())
        careers1.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the  class instance.
     */
    public WWW clickCareers2Link() {
	    if(careers2.isDisplayed())
        careers2.click();
        return this;
    }

    /**
     * Click on Case Studies Link.
     *
     * @return the  class instance.
     */
    public WWW clickCaseStudies1Link() {
	    if(caseStudies1.isDisplayed())
        caseStudies1.click();
        return this;
    }

    /**
     * Click on Case Studies Link.
     *
     * @return the  class instance.
     */
    public WWW clickCaseStudies2Link() {
	    if(caseStudies2.isDisplayed())
        caseStudies2.click();
        return this;
    }

    /**
     * Click on Client Testimonials Link.
     *
     * @return the  class instance.
     */
    public WWW clickClientTestimonialsLink() {
	    if(clientTestimonials.isDisplayed())
        clientTestimonials.click();
        return this;
    }

    /**
     * Click on Company Link.
     *
     * @return the  class instance.
     */
    public WWW clickCompanyLink() {
	    if(company.isDisplayed())
        company.click();
        return this;
    }

    /**
     * Click on Competitive Advantage Link.
     *
     * @return the  class instance.
     */
    public WWW clickCompetitiveAdvantageLink() {
	    if(competitiveAdvantage.isDisplayed())
        competitiveAdvantage.click();
        return this;
    }

    /**
     * Click on Comprehensive Qa Link.
     *
     * @return the  class instance.
     */
    public WWW clickComprehensiveQaLink() {
	    if(comprehensiveQa.isDisplayed())
        comprehensiveQa.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the  class instance.
     */
    public WWW clickContactUs1Link() {
	    if(contactUs1.isDisplayed())
        contactUs1.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the  class instance.
     */
    public WWW clickContactUs2Link() {
	    if(contactUs2.isDisplayed())
        contactUs2.click();
        return this;
    }

    /**
     * Click on Contactrhoynar Com Link.
     *
     * @return the  class instance.
     */
    public WWW clickContactrhoynarComLink() {
	    if(contactrhoynarCom.isDisplayed())
        contactrhoynarCom.click();
        return this;
    }

    /**
     * Click on Continuous Integration Link.
     *
     * @return the  class instance.
     */
    public WWW clickContinuousIntegration1Link() {
	    if(continuousIntegration1.isDisplayed())
        continuousIntegration1.click();
        return this;
    }

    /**
     * Click on Continuous Integration Link.
     *
     * @return the  class instance.
     */
    public WWW clickContinuousIntegration2Link() {
	    if(continuousIntegration2.isDisplayed())
        continuousIntegration2.click();
        return this;
    }

    /**
     * Click on Continuous Integration Link.
     *
     * @return the  class instance.
     */
    public WWW clickContinuousIntegration3Link() {
	    if(continuousIntegration3.isDisplayed())
        continuousIntegration3.click();
        return this;
    }

    /**
     * Click on Dev Solutions Link.
     *
     * @return the  class instance.
     */
    public WWW clickDevSolutionsLink() {
	    if(devSolutions.isDisplayed())
        devSolutions.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the  class instance.
     */
    public WWW clickFacebookLink() {
	    if(facebook.isDisplayed())
        facebook.click();
        return this;
    }

    /**
     * Click on Follow Rhoynarsoft Link.
     *
     * @return the  class instance.
     */
    public WWW clickFollowRhoynarsoftLink() {
	    if(followRhoynarsoft.isDisplayed())
        followRhoynarsoft.click();
        return this;
    }

    /**
     * Click on Google Link.
     *
     * @return the  class instance.
     */
    public WWW clickGoogleLink() {
	    if(google.isDisplayed())
        google.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the  class instance.
     */
    public WWW clickHomeLink() {
	    if(home.isDisplayed())
        home.click();
        return this;
    }

    /**
     * Click on Innovative Web And Mobile Development Services Link.
     *
     * @return the  class instance.
     */
    public WWW clickInnovativeWebAndMobileDevelopmentServicesLink() {
	    if(innovativeWebAndMobileDevelopmentServices.isDisplayed())
        innovativeWebAndMobileDevelopmentServices.click();
        return this;
    }

    /**
     * Click on Iot Testing Link.
     *
     * @return the  class instance.
     */
    public WWW clickIotTestingLink() {
	    if(iotTesting.isDisplayed())
        iotTesting.click();
        return this;
    }

    /**
     * Click on Iottestr Framework Iot Testing Link.
     *
     * @return the  class instance.
     */
    public WWW clickIottestrFrameworkIotTestingLink() {
	    if(iottestrFrameworkIotTesting.isDisplayed())
        iottestrFrameworkIotTesting.click();
        return this;
    }

    /**
     * Click on Local Onshore And Costeffective Link.
     *
     * @return the  class instance.
     */
    public WWW clickLocalOnshoreAndCosteffectiveLink() {
	    if(localOnshoreAndCosteffective.isDisplayed())
        localOnshoreAndCosteffective.click();
        return this;
    }

    /**
     * Click on Low Cost Us Based Solutions Link.
     *
     * @return the  class instance.
     */
    public WWW clickLowCostUsBasedSolutionsLink() {
	    if(lowCostUsBasedSolutions.isDisplayed())
        lowCostUsBasedSolutions.click();
        return this;
    }

    /**
     * Click on Mailr Email Automation Link.
     *
     * @return the  class instance.
     */
    public WWW clickMailrEmailAutomationLink() {
	    if(mailrEmailAutomation.isDisplayed())
        mailrEmailAutomation.click();
        return this;
    }

    /**
     * Click on Menu Link.
     *
     * @return the  class instance.
     */
    public WWW clickMenuLink() {
	    if(menu.isDisplayed())
        menu.click();
        return this;
    }

    /**
     * Click on Migrater Selenium Migration Link.
     *
     * @return the  class instance.
     */
    public WWW clickMigraterSeleniumMigrationLink() {
	    if(migraterSeleniumMigration.isDisplayed())
        migraterSeleniumMigration.click();
        return this;
    }

    /**
     * Click on Mobile Development Link.
     *
     * @return the  class instance.
     */
    public WWW clickMobileDevelopmentLink() {
	    if(mobileDevelopment.isDisplayed())
        mobileDevelopment.click();
        return this;
    }

    /**
     * Click on Network Model Autotestgen Link.
     *
     * @return the  class instance.
     */
    public WWW clickNetworkModelAutotestgenLink() {
	    if(networkModelAutotestgen.isDisplayed())
        networkModelAutotestgen.click();
        return this;
    }

    /**
     * Click on Pricing Model Link.
     *
     * @return the  class instance.
     */
    public WWW clickPricingModelLink() {
	    if(pricingModel.isDisplayed())
        pricingModel.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the  class instance.
     */
    public WWW clickProducts1Link() {
	    if(products1.isDisplayed())
        products1.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the  class instance.
     */
    public WWW clickProducts2Link() {
	    if(products2.isDisplayed())
        products2.click();
        return this;
    }

    /**
     * Click on Products Rhoynar Software Has Extensive Research In Graph Theory And Neural Networks We Have Applied The Research In These Theories To Do Webautomation And Mobile Testing We Can Read More Link.
     *
     * @return the  class instance.
     */
    public WWW clickProductsRhoynarSoftwareHasExtensiveLink() {
	    if(productsRhoynarSoftwareHasExtensive.isDisplayed())
        productsRhoynarSoftwareHasExtensive.click();
        return this;
    }

    /**
     * Click on Qa Solutions Link.
     *
     * @return the  class instance.
     */
    public WWW clickQaSolutionsLink() {
	    if(qaSolutions.isDisplayed())
        qaSolutions.click();
        return this;
    }

    /**
     * Click on Qa Staffing Link.
     *
     * @return the  class instance.
     */
    public WWW clickQaStaffingLink() {
	    if(qaStaffing.isDisplayed())
        qaStaffing.click();
        return this;
    }

    /**
     * Click on Qa Staffing Rhoynar Qa Staffing Expertise Note If You Do Not See The Skills You Are Looking For In The Above Table Please Send Us An Email And Read More Link.
     *
     * @return the  class instance.
     */
    public WWW clickQaStaffingRhoynarQaStaffingLink() {
	    if(qaStaffingRhoynarQaStaffing.isDisplayed())
        qaStaffingRhoynarQaStaffing.click();
        return this;
    }

    /**
     * Click on Qa Testing Services At Rhoynar We Focus On One Thing And That Is Testing We Provide Following Testing And Qa Services For Our Clients Inhouse Comprehensive Testing And Read More Link.
     *
     * @return the  class instance.
     */
    public WWW clickQaTestingServicesAtRhoynarLink() {
	    if(qaTestingServicesAtRhoynar.isDisplayed())
        qaTestingServicesAtRhoynar.click();
        return this;
    }

    /**
     * Click on Qa Training Link.
     *
     * @return the  class instance.
     */
    public WWW clickQaTrainingLink() {
	    if(qaTraining.isDisplayed())
        qaTraining.click();
        return this;
    }

    /**
     * Click on Qtp To Selenium Migration Link.
     *
     * @return the  class instance.
     */
    public WWW clickQtpToSeleniumMigrationLink() {
	    if(qtpToSeleniumMigration.isDisplayed())
        qtpToSeleniumMigration.click();
        return this;
    }

    /**
     * Click on Rhoynar Advantage Link.
     *
     * @return the  class instance.
     */
    public WWW clickRhoynarAdvantageLink() {
	    if(rhoynarAdvantage.isDisplayed())
        rhoynarAdvantage.click();
        return this;
    }

    /**
     * Click on Rhoynar Software Consulting Denver Co Link.
     *
     * @return the  class instance.
     */
    public WWW clickRhoynarSoftwareConsultingDenverCoLink() {
	    if(rhoynarSoftwareConsultingDenverCo.isDisplayed())
        rhoynarSoftwareConsultingDenverCo.click();
        return this;
    }

    /**
     * Click on Robust And Impregnable Test Suites With Automatic Test Generation Link.
     *
     * @return the  class instance.
     */
    public WWW clickRobustAndImpregnableTestSuitesWithLink() {
	    if(robustAndImpregnableTestSuitesWith.isDisplayed())
        robustAndImpregnableTestSuitesWith.click();
        return this;
    }

    /**
     * Click on Security Testing Link.
     *
     * @return the  class instance.
     */
    public WWW clickSecurityTestingLink() {
	    if(securityTesting.isDisplayed())
        securityTesting.click();
        return this;
    }

    /**
     * Click on Selenium Migration Link.
     *
     * @return the  class instance.
     */
    public WWW clickSeleniumMigrationLink() {
	    if(seleniumMigration.isDisplayed())
        seleniumMigration.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the  class instance.
     */
    public WWW clickServicesLink() {
	    if(services.isDisplayed())
        services.click();
        return this;
    }

    /**
     * Click on Squad Presentation Link.
     *
     * @return the  class instance.
     */
    public WWW clickSquadPresentationLink() {
	    if(squadPresentation.isDisplayed())
        squadPresentation.click();
        return this;
    }

    /**
     * Click on Testimonials Link.
     *
     * @return the  class instance.
     */
    public WWW clickTestimonialsLink() {
	    if(testimonials.isDisplayed())
        testimonials.click();
        return this;
    }

    /**
     * Click on Training Link.
     *
     * @return the  class instance.
     */
    public WWW clickTrainingLink() {
	    if(training.isDisplayed())
        training.click();
        return this;
    }

    /**
     * Click on Unabridged Automation And Continuous Integration Link.
     *
     * @return the  class instance.
     */
    public WWW clickUnabridgedAutomationAndContinuousIntegrationLink() {
	    if(unabridgedAutomationAndContinuousIntegration.isDisplayed())
        unabridgedAutomationAndContinuousIntegration.click();
        return this;
    }

    /**
     * Click on Web And Mobile Qa Link.
     *
     * @return the  class instance.
     */
    public WWW clickWebAndMobileQa1Link() {
	    if(webAndMobileQa1.isDisplayed())
        webAndMobileQa1.click();
        return this;
    }

    /**
     * Click on Web And Mobile Qa Link.
     *
     * @return the  class instance.
     */
    public WWW clickWebAndMobileQa2Link() {
	    if(webAndMobileQa2.isDisplayed())
        webAndMobileQa2.click();
        return this;
    }

    /**
     * Click on Web Development Link.
     *
     * @return the  class instance.
     */
    public WWW clickWebDevelopmentLink() {
	    if(webDevelopment.isDisplayed())
        webDevelopment.click();
        return this;
    }

    /**
     * Click on Why Rhoynar Link.
     *
     * @return the  class instance.
     */
    public WWW clickWhyRhoynarLink() {
	    if(whyRhoynar.isDisplayed())
        whyRhoynar.click();
        return this;
    }

    /**
     * Click on Why Rhoynar Rhoynar Software Designs And Delivers Robust Software Testing Solutions That Leverage Our Deep Industryspecific Understanding With Technologyspecific Competencies And Unique Testingfocused Assets Our Core Values Read More Link.
     *
     * @return the  class instance.
     */
    public WWW clickWhyRhoynarRhoynarSoftwareDesignsLink() {
	    if(whyRhoynarRhoynarSoftwareDesigns.isDisplayed())
        whyRhoynarRhoynarSoftwareDesigns.click();
        return this;
    }

    /**
     * Click on Www Rhoynar Com Link.
     *
     * @return the  class instance.
     */
    public WWW clickWwwRhoynarComLink() {
	    if(wwwRhoynarCom.isDisplayed())
        wwwRhoynarCom.click();
        return this;
    }

    /**
     * Click on Your Extended Fullservice Qa Team Link.
     *
     * @return the  class instance.
     */
    public WWW clickYourExtendedFullserviceQaTeamLink() {
	    if(yourExtendedFullserviceQaTeam.isDisplayed())
        yourExtendedFullserviceQaTeam.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the  class instance.
     */
    public WWW verifyPageLoaded() {
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the  class instance.
     */
    public WWW verifyPageUrl() {
        return this;
    }
}
