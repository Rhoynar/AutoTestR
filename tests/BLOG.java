import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BLOG  {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#post-25 header.entry-header h3.entry-title a")
    @CacheLookup
    private WebElement 10ThingsYouMustKnowAbout;

    @FindBy(css = "a[href='http://www.rhoynar.com/contact-us/company/about-us']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "#post-20 header.entry-header div:nth-of-type(1) div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement agile1;

    @FindBy(css = "#post-20 footer.entry-meta span:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement agile2;

    @FindBy(css = "#post-22 header.entry-header div:nth-of-type(1) div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement agile3;

    @FindBy(css = "#post-22 footer.entry-meta span:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement agile4;

    @FindBy(css = "a[href='http://www.rhoynar.com/auto-test-gen']")
    @CacheLookup
    private WebElement autotestrAutomaticTestGeneration;

    @FindBy(css = "a[title='View all posts in BDD']")
    @CacheLookup
    private WebElement bdd1;

    @FindBy(css = "#post-706 footer.entry-meta span:nth-of-type(1) a")
    @CacheLookup
    private WebElement bdd2;

    @FindBy(css = "#post-706 header.entry-header h3.entry-title a")
    @CacheLookup
    private WebElement behaviorDrivenDevelopmentBddForYour;

    @FindBy(css = "#post-689 header.entry-header h3.entry-title a")
    @CacheLookup
    private WebElement benefitsOfContinuousDelivery;

    @FindBy(css = "#post-22 header.entry-header h3.entry-title a")
    @CacheLookup
    private WebElement benefitsOfTestDrivenDevelopment;

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

    @FindBy(css = "a[href='http://www.rhoynar.com/join-us-for-a-presentation-on-browser-automation-and-page-object-models?share=google-plus-1']")
    @CacheLookup
    private WebElement clickToShareOnGoogleOpens1;

    @FindBy(css = "a[href='http://www.rhoynar.com/behavior-driven-development-bdd-for-your-organization?share=google-plus-1']")
    @CacheLookup
    private WebElement clickToShareOnGoogleOpens2;

    @FindBy(css = "a[href='http://www.rhoynar.com/blog-benefits-of-continuous-delivery?share=google-plus-1']")
    @CacheLookup
    private WebElement clickToShareOnGoogleOpens3;

    @FindBy(css = "a[href='http://www.rhoynar.com/10-things-you-must-know-about-agile?share=google-plus-1']")
    @CacheLookup
    private WebElement clickToShareOnGoogleOpens4;

    @FindBy(css = "a[href='http://www.rhoynar.com/practical-agile?share=google-plus-1']")
    @CacheLookup
    private WebElement clickToShareOnGoogleOpens5;

    @FindBy(css = "a[href='http://www.rhoynar.com/benefits-of-test-driven-development?share=google-plus-1']")
    @CacheLookup
    private WebElement clickToShareOnGoogleOpens6;

    @FindBy(css = "a[href='http://www.rhoynar.com/join-us-for-a-presentation-on-browser-automation-and-page-object-models?share=twitter']")
    @CacheLookup
    private WebElement clickToShareOnTwitterOpens1;

    @FindBy(css = "a[href='http://www.rhoynar.com/behavior-driven-development-bdd-for-your-organization?share=twitter']")
    @CacheLookup
    private WebElement clickToShareOnTwitterOpens2;

    @FindBy(css = "a[href='http://www.rhoynar.com/blog-benefits-of-continuous-delivery?share=twitter']")
    @CacheLookup
    private WebElement clickToShareOnTwitterOpens3;

    @FindBy(css = "a[href='http://www.rhoynar.com/10-things-you-must-know-about-agile?share=twitter']")
    @CacheLookup
    private WebElement clickToShareOnTwitterOpens4;

    @FindBy(css = "a[href='http://www.rhoynar.com/practical-agile?share=twitter']")
    @CacheLookup
    private WebElement clickToShareOnTwitterOpens5;

    @FindBy(css = "a[href='http://www.rhoynar.com/benefits-of-test-driven-development?share=twitter']")
    @CacheLookup
    private WebElement clickToShareOnTwitterOpens6;

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

    @FindBy(css = "#post-689 header.entry-header div:nth-of-type(1) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement continuousDelivery1;

    @FindBy(css = "#post-689 footer.entry-meta span:nth-of-type(1) a")
    @CacheLookup
    private WebElement continuousDelivery2;

    @FindBy(css = "#post-20 header.entry-header div:nth-of-type(1) div:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement continuousDelivery3;

    @FindBy(css = "#post-20 footer.entry-meta span:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement continuousDelivery4;

    @FindBy(css = "a[href='http://www.rhoynar.com/qa-services/continuous-integration']")
    @CacheLookup
    private WebElement continuousIntegration1;

    @FindBy(css = "a[href='http://www.rhoynar.com/tag/continuous-integration']")
    @CacheLookup
    private WebElement continuousIntegration2;

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
    private WebElement home1;

    @FindBy(css = ".page.page-id-16.page-parent.page-template.page-template-blog-post.page-template-blog-post-php.skt-it-consultant-pro div:nth-of-type(1) div:nth-of-type(1) div.container div:nth-of-type(1) a")
    @CacheLookup
    private WebElement home2;

    @FindBy(css = "a[href='http://www.rhoynar.com/iot-testing']")
    @CacheLookup
    private WebElement iotTesting;

    @FindBy(css = "a[href='http://www.rhoynar.com/iot-suite']")
    @CacheLookup
    private WebElement iottestrFrameworkIotTesting;

    @FindBy(css = "#post-729 header.entry-header h3.entry-title a")
    @CacheLookup
    private WebElement joinUsForAPresentationOn;

    @FindBy(css = "#post-729 footer.entry-meta span:nth-of-type(2) a")
    @CacheLookup
    private WebElement leaveAComment1;

    @FindBy(css = "#post-706 footer.entry-meta span:nth-of-type(2) a")
    @CacheLookup
    private WebElement leaveAComment2;

    @FindBy(css = "#post-689 footer.entry-meta span:nth-of-type(3) a")
    @CacheLookup
    private WebElement leaveAComment3;

    @FindBy(css = "#post-25 footer.entry-meta span:nth-of-type(2) a")
    @CacheLookup
    private WebElement leaveAComment4;

    @FindBy(css = "#post-20 footer.entry-meta span:nth-of-type(2) a")
    @CacheLookup
    private WebElement leaveAComment5;

    @FindBy(css = "#post-22 footer.entry-meta span:nth-of-type(2) a")
    @CacheLookup
    private WebElement leaveAComment6;

    @FindBy(css = "a[href='http://www.rhoynar.com/products/email-automation']")
    @CacheLookup
    private WebElement mailrEmailAutomation;

    @FindBy(css = "a[href='#']")
    @CacheLookup
    private WebElement menu;

    @FindBy(css = "#menu-item-305 a")
    @CacheLookup
    private WebElement migraterSeleniumMigration;

    @FindBy(css = "a[href='http://www.rhoynar.com/mobile-apps']")
    @CacheLookup
    private WebElement mobileDevelopment;

    @FindBy(css = "#post-729 header.entry-header div:nth-of-type(1) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement noComments1;

    @FindBy(css = "#post-706 header.entry-header div:nth-of-type(1) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement noComments2;

    @FindBy(css = "#post-689 header.entry-header div:nth-of-type(1) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement noComments3;

    @FindBy(css = "#post-25 header.entry-header div:nth-of-type(1) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement noComments4;

    @FindBy(css = "#post-20 header.entry-header div:nth-of-type(1) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement noComments5;

    @FindBy(css = "#post-22 header.entry-header div:nth-of-type(1) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement noComments6;

    private final String pageLoadedText = "== typeof windowOpen ){ // If there's another sharing window open, close it";

    private final String pageUrl = "C:\tools\AutoTestRv0.87\html\BLOG.html";

    @FindBy(css = "#post-20 header.entry-header h3.entry-title a")
    @CacheLookup
    private WebElement practicalAgile;

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

    @FindBy(css = "#post-729 div.entry-summary p:nth-of-type(2) a")
    @CacheLookup
    private WebElement readMore1;

    @FindBy(css = "#post-706 div.entry-summary p:nth-of-type(2) a")
    @CacheLookup
    private WebElement readMore2;

    @FindBy(css = "#post-689 div.entry-summary p:nth-of-type(2) a")
    @CacheLookup
    private WebElement readMore3;

    @FindBy(css = "#post-25 div.entry-summary p:nth-of-type(2) a")
    @CacheLookup
    private WebElement readMore4;

    @FindBy(css = "#post-20 div.entry-summary p:nth-of-type(2) a")
    @CacheLookup
    private WebElement readMore5;

    @FindBy(css = "#post-22 div.entry-summary p:nth-of-type(2) a")
    @CacheLookup
    private WebElement readMore6;

    @FindBy(css = "#copyright div.container div:nth-of-type(1) a")
    @CacheLookup
    private WebElement rhoynarSoftwareConsultingDenverCo;

    @FindBy(css = "a[href='http://www.rhoynar.com/security-testing']")
    @CacheLookup
    private WebElement securityTesting;

    @FindBy(css = "a[title='View all posts in Selenium WebDriver']")
    @CacheLookup
    private WebElement seleniumWebdriver1;

    @FindBy(css = "#post-729 footer.entry-meta span:nth-of-type(1) a")
    @CacheLookup
    private WebElement seleniumWebdriver2;

    @FindBy(css = "#menu-item-140 a")
    @CacheLookup
    private WebElement services;

    @FindBy(css = "a[href='http://www.rhoynar.com/join-us-for-a-presentation-on-browser-automation-and-page-object-models?share=facebook']")
    @CacheLookup
    private WebElement shareOnFacebookOpensInNew1;

    @FindBy(css = "a[href='http://www.rhoynar.com/behavior-driven-development-bdd-for-your-organization?share=facebook']")
    @CacheLookup
    private WebElement shareOnFacebookOpensInNew2;

    @FindBy(css = "a[href='http://www.rhoynar.com/blog-benefits-of-continuous-delivery?share=facebook']")
    @CacheLookup
    private WebElement shareOnFacebookOpensInNew3;

    @FindBy(css = "a[href='http://www.rhoynar.com/10-things-you-must-know-about-agile?share=facebook']")
    @CacheLookup
    private WebElement shareOnFacebookOpensInNew4;

    @FindBy(css = "a[href='http://www.rhoynar.com/practical-agile?share=facebook']")
    @CacheLookup
    private WebElement shareOnFacebookOpensInNew5;

    @FindBy(css = "a[href='http://www.rhoynar.com/benefits-of-test-driven-development?share=facebook']")
    @CacheLookup
    private WebElement shareOnFacebookOpensInNew6;

    @FindBy(css = "a[href='http://www.rhoynar.com/squad-presentation-selenium-page-objects']")
    @CacheLookup
    private WebElement squadPresentation;

    @FindBy(css = "a[title='View all posts in Test Driven Development']")
    @CacheLookup
    private WebElement testDrivenDevelopment1;

    @FindBy(css = "#post-22 footer.entry-meta span:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement testDrivenDevelopment2;

    @FindBy(css = "a[href='http://www.rhoynar.com/resources/testimonials']")
    @CacheLookup
    private WebElement testimonials;

    @FindBy(css = "a[href='http://www.rhoynar.com/software-development-training']")
    @CacheLookup
    private WebElement training;

    @FindBy(css = "#post-25 header.entry-header div:nth-of-type(1) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement uncategorized1;

    @FindBy(css = "#post-25 footer.entry-meta span:nth-of-type(1) a")
    @CacheLookup
    private WebElement uncategorized2;

    @FindBy(css = "#post-20 header.entry-header div:nth-of-type(1) div:nth-of-type(3) a:nth-of-type(3)")
    @CacheLookup
    private WebElement uncategorized3;

    @FindBy(css = "#post-20 footer.entry-meta span:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement uncategorized4;

    @FindBy(css = "a[class='genericon genericon-facebook']")
    @CacheLookup
    private WebElement viewRhoynarsProfileOnFacebook;

    @FindBy(css = "a[class='genericon genericon-twitter']")
    @CacheLookup
    private WebElement viewRhoynarsoftsProfileOnTwitter;

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

    public BLOG() {
    }

    public BLOG(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public BLOG(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public BLOG(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on 10 Things You Must Know About Agile Link.
     *
     * @return the  class instance.
     */
    public BLOG click10ThingsYouMustKnowAboutLink() {
	    if(10ThingsYouMustKnowAbout.isDisplayed())
        10ThingsYouMustKnowAbout.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the  class instance.
     */
    public BLOG clickAboutUsLink() {
	    if(aboutUs.isDisplayed())
        aboutUs.click();
        return this;
    }

    /**
     * Click on Agile Link.
     *
     * @return the  class instance.
     */
    public BLOG clickAgile1Link() {
	    if(agile1.isDisplayed())
        agile1.click();
        return this;
    }

    /**
     * Click on Agile Link.
     *
     * @return the  class instance.
     */
    public BLOG clickAgile2Link() {
	    if(agile2.isDisplayed())
        agile2.click();
        return this;
    }

    /**
     * Click on Agile Link.
     *
     * @return the  class instance.
     */
    public BLOG clickAgile3Link() {
	    if(agile3.isDisplayed())
        agile3.click();
        return this;
    }

    /**
     * Click on Agile Link.
     *
     * @return the  class instance.
     */
    public BLOG clickAgile4Link() {
	    if(agile4.isDisplayed())
        agile4.click();
        return this;
    }

    /**
     * Click on Autotestr Automatic Test Generation Link.
     *
     * @return the  class instance.
     */
    public BLOG clickAutotestrAutomaticTestGenerationLink() {
	    if(autotestrAutomaticTestGeneration.isDisplayed())
        autotestrAutomaticTestGeneration.click();
        return this;
    }

    /**
     * Click on Bdd Link.
     *
     * @return the  class instance.
     */
    public BLOG clickBdd1Link() {
	    if(bdd1.isDisplayed())
        bdd1.click();
        return this;
    }

    /**
     * Click on Bdd Link.
     *
     * @return the  class instance.
     */
    public BLOG clickBdd2Link() {
	    if(bdd2.isDisplayed())
        bdd2.click();
        return this;
    }

    /**
     * Click on Behavior Driven Development Bdd For Your Organization Link.
     *
     * @return the  class instance.
     */
    public BLOG clickBehaviorDrivenDevelopmentBddForYourLink() {
	    if(behaviorDrivenDevelopmentBddForYour.isDisplayed())
        behaviorDrivenDevelopmentBddForYour.click();
        return this;
    }

    /**
     * Click on Benefits Of Continuous Delivery Link.
     *
     * @return the  class instance.
     */
    public BLOG clickBenefitsOfContinuousDeliveryLink() {
	    if(benefitsOfContinuousDelivery.isDisplayed())
        benefitsOfContinuousDelivery.click();
        return this;
    }

    /**
     * Click on Benefits Of Test Driven Development Link.
     *
     * @return the  class instance.
     */
    public BLOG clickBenefitsOfTestDrivenDevelopmentLink() {
	    if(benefitsOfTestDrivenDevelopment.isDisplayed())
        benefitsOfTestDrivenDevelopment.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the  class instance.
     */
    public BLOG clickBlog1Link() {
	    if(blog1.isDisplayed())
        blog1.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the  class instance.
     */
    public BLOG clickBlog2Link() {
	    if(blog2.isDisplayed())
        blog2.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the  class instance.
     */
    public BLOG clickCareers1Link() {
	    if(careers1.isDisplayed())
        careers1.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the  class instance.
     */
    public BLOG clickCareers2Link() {
	    if(careers2.isDisplayed())
        careers2.click();
        return this;
    }

    /**
     * Click on Case Studies Link.
     *
     * @return the  class instance.
     */
    public BLOG clickCaseStudiesLink() {
	    if(caseStudies.isDisplayed())
        caseStudies.click();
        return this;
    }

    /**
     * Click on Click To Share On Google Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickClickToShareOnGoogleOpens1Link() {
	    if(clickToShareOnGoogleOpens1.isDisplayed())
        clickToShareOnGoogleOpens1.click();
        return this;
    }

    /**
     * Click on Click To Share On Google Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickClickToShareOnGoogleOpens2Link() {
	    if(clickToShareOnGoogleOpens2.isDisplayed())
        clickToShareOnGoogleOpens2.click();
        return this;
    }

    /**
     * Click on Click To Share On Google Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickClickToShareOnGoogleOpens3Link() {
	    if(clickToShareOnGoogleOpens3.isDisplayed())
        clickToShareOnGoogleOpens3.click();
        return this;
    }

    /**
     * Click on Click To Share On Google Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickClickToShareOnGoogleOpens4Link() {
	    if(clickToShareOnGoogleOpens4.isDisplayed())
        clickToShareOnGoogleOpens4.click();
        return this;
    }

    /**
     * Click on Click To Share On Google Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickClickToShareOnGoogleOpens5Link() {
	    if(clickToShareOnGoogleOpens5.isDisplayed())
        clickToShareOnGoogleOpens5.click();
        return this;
    }

    /**
     * Click on Click To Share On Google Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickClickToShareOnGoogleOpens6Link() {
	    if(clickToShareOnGoogleOpens6.isDisplayed())
        clickToShareOnGoogleOpens6.click();
        return this;
    }

    /**
     * Click on Click To Share On Twitter Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickClickToShareOnTwitterOpens1Link() {
	    if(clickToShareOnTwitterOpens1.isDisplayed())
        clickToShareOnTwitterOpens1.click();
        return this;
    }

    /**
     * Click on Click To Share On Twitter Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickClickToShareOnTwitterOpens2Link() {
	    if(clickToShareOnTwitterOpens2.isDisplayed())
        clickToShareOnTwitterOpens2.click();
        return this;
    }

    /**
     * Click on Click To Share On Twitter Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickClickToShareOnTwitterOpens3Link() {
	    if(clickToShareOnTwitterOpens3.isDisplayed())
        clickToShareOnTwitterOpens3.click();
        return this;
    }

    /**
     * Click on Click To Share On Twitter Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickClickToShareOnTwitterOpens4Link() {
	    if(clickToShareOnTwitterOpens4.isDisplayed())
        clickToShareOnTwitterOpens4.click();
        return this;
    }

    /**
     * Click on Click To Share On Twitter Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickClickToShareOnTwitterOpens5Link() {
	    if(clickToShareOnTwitterOpens5.isDisplayed())
        clickToShareOnTwitterOpens5.click();
        return this;
    }

    /**
     * Click on Click To Share On Twitter Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickClickToShareOnTwitterOpens6Link() {
	    if(clickToShareOnTwitterOpens6.isDisplayed())
        clickToShareOnTwitterOpens6.click();
        return this;
    }

    /**
     * Click on Company Link.
     *
     * @return the  class instance.
     */
    public BLOG clickCompanyLink() {
	    if(company.isDisplayed())
        company.click();
        return this;
    }

    /**
     * Click on Competitive Advantage Link.
     *
     * @return the  class instance.
     */
    public BLOG clickCompetitiveAdvantageLink() {
	    if(competitiveAdvantage.isDisplayed())
        competitiveAdvantage.click();
        return this;
    }

    /**
     * Click on Comprehensive Qa Link.
     *
     * @return the  class instance.
     */
    public BLOG clickComprehensiveQaLink() {
	    if(comprehensiveQa.isDisplayed())
        comprehensiveQa.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the  class instance.
     */
    public BLOG clickContactUs1Link() {
	    if(contactUs1.isDisplayed())
        contactUs1.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the  class instance.
     */
    public BLOG clickContactUs2Link() {
	    if(contactUs2.isDisplayed())
        contactUs2.click();
        return this;
    }

    /**
     * Click on Contactrhoynar Com Link.
     *
     * @return the  class instance.
     */
    public BLOG clickContactrhoynarComLink() {
	    if(contactrhoynarCom.isDisplayed())
        contactrhoynarCom.click();
        return this;
    }

    /**
     * Click on Continuous Delivery Link.
     *
     * @return the  class instance.
     */
    public BLOG clickContinuousDelivery1Link() {
	    if(continuousDelivery1.isDisplayed())
        continuousDelivery1.click();
        return this;
    }

    /**
     * Click on Continuous Delivery Link.
     *
     * @return the  class instance.
     */
    public BLOG clickContinuousDelivery2Link() {
	    if(continuousDelivery2.isDisplayed())
        continuousDelivery2.click();
        return this;
    }

    /**
     * Click on Continuous Delivery Link.
     *
     * @return the  class instance.
     */
    public BLOG clickContinuousDelivery3Link() {
	    if(continuousDelivery3.isDisplayed())
        continuousDelivery3.click();
        return this;
    }

    /**
     * Click on Continuous Delivery Link.
     *
     * @return the  class instance.
     */
    public BLOG clickContinuousDelivery4Link() {
	    if(continuousDelivery4.isDisplayed())
        continuousDelivery4.click();
        return this;
    }

    /**
     * Click on Continuous Integration Link.
     *
     * @return the  class instance.
     */
    public BLOG clickContinuousIntegration1Link() {
	    if(continuousIntegration1.isDisplayed())
        continuousIntegration1.click();
        return this;
    }

    /**
     * Click on Continuous Integration Link.
     *
     * @return the  class instance.
     */
    public BLOG clickContinuousIntegration2Link() {
	    if(continuousIntegration2.isDisplayed())
        continuousIntegration2.click();
        return this;
    }

    /**
     * Click on Dev Solutions Link.
     *
     * @return the  class instance.
     */
    public BLOG clickDevSolutionsLink() {
	    if(devSolutions.isDisplayed())
        devSolutions.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the  class instance.
     */
    public BLOG clickFacebookLink() {
	    if(facebook.isDisplayed())
        facebook.click();
        return this;
    }

    /**
     * Click on Follow Rhoynarsoft Link.
     *
     * @return the  class instance.
     */
    public BLOG clickFollowRhoynarsoftLink() {
	    if(followRhoynarsoft.isDisplayed())
        followRhoynarsoft.click();
        return this;
    }

    /**
     * Click on Google Link.
     *
     * @return the  class instance.
     */
    public BLOG clickGoogleLink() {
	    if(google.isDisplayed())
        google.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the  class instance.
     */
    public BLOG clickHome1Link() {
	    if(home1.isDisplayed())
        home1.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the  class instance.
     */
    public BLOG clickHome2Link() {
	    if(home2.isDisplayed())
        home2.click();
        return this;
    }

    /**
     * Click on Iot Testing Link.
     *
     * @return the  class instance.
     */
    public BLOG clickIotTestingLink() {
	    if(iotTesting.isDisplayed())
        iotTesting.click();
        return this;
    }

    /**
     * Click on Iottestr Framework Iot Testing Link.
     *
     * @return the  class instance.
     */
    public BLOG clickIottestrFrameworkIotTestingLink() {
	    if(iottestrFrameworkIotTesting.isDisplayed())
        iottestrFrameworkIotTesting.click();
        return this;
    }

    /**
     * Click on Join Us For A Presentation On Browser Automation And Page Object Models Link.
     *
     * @return the  class instance.
     */
    public BLOG clickJoinUsForAPresentationOnLink() {
	    if(joinUsForAPresentationOn.isDisplayed())
        joinUsForAPresentationOn.click();
        return this;
    }

    /**
     * Click on Leave A Comment Link.
     *
     * @return the  class instance.
     */
    public BLOG clickLeaveAComment1Link() {
	    if(leaveAComment1.isDisplayed())
        leaveAComment1.click();
        return this;
    }

    /**
     * Click on Leave A Comment Link.
     *
     * @return the  class instance.
     */
    public BLOG clickLeaveAComment2Link() {
	    if(leaveAComment2.isDisplayed())
        leaveAComment2.click();
        return this;
    }

    /**
     * Click on Leave A Comment Link.
     *
     * @return the  class instance.
     */
    public BLOG clickLeaveAComment3Link() {
	    if(leaveAComment3.isDisplayed())
        leaveAComment3.click();
        return this;
    }

    /**
     * Click on Leave A Comment Link.
     *
     * @return the  class instance.
     */
    public BLOG clickLeaveAComment4Link() {
	    if(leaveAComment4.isDisplayed())
        leaveAComment4.click();
        return this;
    }

    /**
     * Click on Leave A Comment Link.
     *
     * @return the  class instance.
     */
    public BLOG clickLeaveAComment5Link() {
	    if(leaveAComment5.isDisplayed())
        leaveAComment5.click();
        return this;
    }

    /**
     * Click on Leave A Comment Link.
     *
     * @return the  class instance.
     */
    public BLOG clickLeaveAComment6Link() {
	    if(leaveAComment6.isDisplayed())
        leaveAComment6.click();
        return this;
    }

    /**
     * Click on Mailr Email Automation Link.
     *
     * @return the  class instance.
     */
    public BLOG clickMailrEmailAutomationLink() {
	    if(mailrEmailAutomation.isDisplayed())
        mailrEmailAutomation.click();
        return this;
    }

    /**
     * Click on Menu Link.
     *
     * @return the  class instance.
     */
    public BLOG clickMenuLink() {
	    if(menu.isDisplayed())
        menu.click();
        return this;
    }

    /**
     * Click on Migrater Selenium Migration Link.
     *
     * @return the  class instance.
     */
    public BLOG clickMigraterSeleniumMigrationLink() {
	    if(migraterSeleniumMigration.isDisplayed())
        migraterSeleniumMigration.click();
        return this;
    }

    /**
     * Click on Mobile Development Link.
     *
     * @return the  class instance.
     */
    public BLOG clickMobileDevelopmentLink() {
	    if(mobileDevelopment.isDisplayed())
        mobileDevelopment.click();
        return this;
    }

    /**
     * Click on No Comments Link.
     *
     * @return the  class instance.
     */
    public BLOG clickNoComments1Link() {
	    if(noComments1.isDisplayed())
        noComments1.click();
        return this;
    }

    /**
     * Click on No Comments Link.
     *
     * @return the  class instance.
     */
    public BLOG clickNoComments2Link() {
	    if(noComments2.isDisplayed())
        noComments2.click();
        return this;
    }

    /**
     * Click on No Comments Link.
     *
     * @return the  class instance.
     */
    public BLOG clickNoComments3Link() {
	    if(noComments3.isDisplayed())
        noComments3.click();
        return this;
    }

    /**
     * Click on No Comments Link.
     *
     * @return the  class instance.
     */
    public BLOG clickNoComments4Link() {
	    if(noComments4.isDisplayed())
        noComments4.click();
        return this;
    }

    /**
     * Click on No Comments Link.
     *
     * @return the  class instance.
     */
    public BLOG clickNoComments5Link() {
	    if(noComments5.isDisplayed())
        noComments5.click();
        return this;
    }

    /**
     * Click on No Comments Link.
     *
     * @return the  class instance.
     */
    public BLOG clickNoComments6Link() {
	    if(noComments6.isDisplayed())
        noComments6.click();
        return this;
    }

    /**
     * Click on Practical Agile Link.
     *
     * @return the  class instance.
     */
    public BLOG clickPracticalAgileLink() {
	    if(practicalAgile.isDisplayed())
        practicalAgile.click();
        return this;
    }

    /**
     * Click on Pricing Model Link.
     *
     * @return the  class instance.
     */
    public BLOG clickPricingModelLink() {
	    if(pricingModel.isDisplayed())
        pricingModel.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the  class instance.
     */
    public BLOG clickProducts1Link() {
	    if(products1.isDisplayed())
        products1.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the  class instance.
     */
    public BLOG clickProducts2Link() {
	    if(products2.isDisplayed())
        products2.click();
        return this;
    }

    /**
     * Click on Qa Solutions Link.
     *
     * @return the  class instance.
     */
    public BLOG clickQaSolutionsLink() {
	    if(qaSolutions.isDisplayed())
        qaSolutions.click();
        return this;
    }

    /**
     * Click on Qa Staffing Link.
     *
     * @return the  class instance.
     */
    public BLOG clickQaStaffingLink() {
	    if(qaStaffing.isDisplayed())
        qaStaffing.click();
        return this;
    }

    /**
     * Click on Qa Training Link.
     *
     * @return the  class instance.
     */
    public BLOG clickQaTrainingLink() {
	    if(qaTraining.isDisplayed())
        qaTraining.click();
        return this;
    }

    /**
     * Click on Qtp To Selenium Migration Link.
     *
     * @return the  class instance.
     */
    public BLOG clickQtpToSeleniumMigrationLink() {
	    if(qtpToSeleniumMigration.isDisplayed())
        qtpToSeleniumMigration.click();
        return this;
    }

    /**
     * Click on Read More Link.
     *
     * @return the  class instance.
     */
    public BLOG clickReadMore1Link() {
	    if(readMore1.isDisplayed())
        readMore1.click();
        return this;
    }

    /**
     * Click on Read More Link.
     *
     * @return the  class instance.
     */
    public BLOG clickReadMore2Link() {
	    if(readMore2.isDisplayed())
        readMore2.click();
        return this;
    }

    /**
     * Click on Read More Link.
     *
     * @return the  class instance.
     */
    public BLOG clickReadMore3Link() {
	    if(readMore3.isDisplayed())
        readMore3.click();
        return this;
    }

    /**
     * Click on Read More Link.
     *
     * @return the  class instance.
     */
    public BLOG clickReadMore4Link() {
	    if(readMore4.isDisplayed())
        readMore4.click();
        return this;
    }

    /**
     * Click on Read More Link.
     *
     * @return the  class instance.
     */
    public BLOG clickReadMore5Link() {
	    if(readMore5.isDisplayed())
        readMore5.click();
        return this;
    }

    /**
     * Click on Read More Link.
     *
     * @return the  class instance.
     */
    public BLOG clickReadMore6Link() {
	    if(readMore6.isDisplayed())
        readMore6.click();
        return this;
    }

    /**
     * Click on Rhoynar Software Consulting Denver Co Link.
     *
     * @return the  class instance.
     */
    public BLOG clickRhoynarSoftwareConsultingDenverCoLink() {
	    if(rhoynarSoftwareConsultingDenverCo.isDisplayed())
        rhoynarSoftwareConsultingDenverCo.click();
        return this;
    }

    /**
     * Click on Security Testing Link.
     *
     * @return the  class instance.
     */
    public BLOG clickSecurityTestingLink() {
	    if(securityTesting.isDisplayed())
        securityTesting.click();
        return this;
    }

    /**
     * Click on Selenium Webdriver Link.
     *
     * @return the  class instance.
     */
    public BLOG clickSeleniumWebdriver1Link() {
	    if(seleniumWebdriver1.isDisplayed())
        seleniumWebdriver1.click();
        return this;
    }

    /**
     * Click on Selenium Webdriver Link.
     *
     * @return the  class instance.
     */
    public BLOG clickSeleniumWebdriver2Link() {
	    if(seleniumWebdriver2.isDisplayed())
        seleniumWebdriver2.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the  class instance.
     */
    public BLOG clickServicesLink() {
	    if(services.isDisplayed())
        services.click();
        return this;
    }

    /**
     * Click on Share On Facebook Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickShareOnFacebookOpensInNew1Link() {
	    if(shareOnFacebookOpensInNew1.isDisplayed())
        shareOnFacebookOpensInNew1.click();
        return this;
    }

    /**
     * Click on Share On Facebook Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickShareOnFacebookOpensInNew2Link() {
	    if(shareOnFacebookOpensInNew2.isDisplayed())
        shareOnFacebookOpensInNew2.click();
        return this;
    }

    /**
     * Click on Share On Facebook Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickShareOnFacebookOpensInNew3Link() {
	    if(shareOnFacebookOpensInNew3.isDisplayed())
        shareOnFacebookOpensInNew3.click();
        return this;
    }

    /**
     * Click on Share On Facebook Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickShareOnFacebookOpensInNew4Link() {
	    if(shareOnFacebookOpensInNew4.isDisplayed())
        shareOnFacebookOpensInNew4.click();
        return this;
    }

    /**
     * Click on Share On Facebook Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickShareOnFacebookOpensInNew5Link() {
	    if(shareOnFacebookOpensInNew5.isDisplayed())
        shareOnFacebookOpensInNew5.click();
        return this;
    }

    /**
     * Click on Share On Facebook Opens In New Window Link.
     *
     * @return the  class instance.
     */
    public BLOG clickShareOnFacebookOpensInNew6Link() {
	    if(shareOnFacebookOpensInNew6.isDisplayed())
        shareOnFacebookOpensInNew6.click();
        return this;
    }

    /**
     * Click on Squad Presentation Link.
     *
     * @return the  class instance.
     */
    public BLOG clickSquadPresentationLink() {
	    if(squadPresentation.isDisplayed())
        squadPresentation.click();
        return this;
    }

    /**
     * Click on Test Driven Development Link.
     *
     * @return the  class instance.
     */
    public BLOG clickTestDrivenDevelopment1Link() {
	    if(testDrivenDevelopment1.isDisplayed())
        testDrivenDevelopment1.click();
        return this;
    }

    /**
     * Click on Test Driven Development Link.
     *
     * @return the  class instance.
     */
    public BLOG clickTestDrivenDevelopment2Link() {
	    if(testDrivenDevelopment2.isDisplayed())
        testDrivenDevelopment2.click();
        return this;
    }

    /**
     * Click on Testimonials Link.
     *
     * @return the  class instance.
     */
    public BLOG clickTestimonialsLink() {
	    if(testimonials.isDisplayed())
        testimonials.click();
        return this;
    }

    /**
     * Click on Training Link.
     *
     * @return the  class instance.
     */
    public BLOG clickTrainingLink() {
	    if(training.isDisplayed())
        training.click();
        return this;
    }

    /**
     * Click on Uncategorized Link.
     *
     * @return the  class instance.
     */
    public BLOG clickUncategorized1Link() {
	    if(uncategorized1.isDisplayed())
        uncategorized1.click();
        return this;
    }

    /**
     * Click on Uncategorized Link.
     *
     * @return the  class instance.
     */
    public BLOG clickUncategorized2Link() {
	    if(uncategorized2.isDisplayed())
        uncategorized2.click();
        return this;
    }

    /**
     * Click on Uncategorized Link.
     *
     * @return the  class instance.
     */
    public BLOG clickUncategorized3Link() {
	    if(uncategorized3.isDisplayed())
        uncategorized3.click();
        return this;
    }

    /**
     * Click on Uncategorized Link.
     *
     * @return the  class instance.
     */
    public BLOG clickUncategorized4Link() {
	    if(uncategorized4.isDisplayed())
        uncategorized4.click();
        return this;
    }

    /**
     * Click on View Rhoynars Profile On Facebook Link.
     *
     * @return the  class instance.
     */
    public BLOG clickViewRhoynarsProfileOnFacebookLink() {
	    if(viewRhoynarsProfileOnFacebook.isDisplayed())
        viewRhoynarsProfileOnFacebook.click();
        return this;
    }

    /**
     * Click on View Rhoynarsofts Profile On Twitter Link.
     *
     * @return the  class instance.
     */
    public BLOG clickViewRhoynarsoftsProfileOnTwitterLink() {
	    if(viewRhoynarsoftsProfileOnTwitter.isDisplayed())
        viewRhoynarsoftsProfileOnTwitter.click();
        return this;
    }

    /**
     * Click on Web And Mobile Qa Link.
     *
     * @return the  class instance.
     */
    public BLOG clickWebAndMobileQaLink() {
	    if(webAndMobileQa.isDisplayed())
        webAndMobileQa.click();
        return this;
    }

    /**
     * Click on Web Development Link.
     *
     * @return the  class instance.
     */
    public BLOG clickWebDevelopmentLink() {
	    if(webDevelopment.isDisplayed())
        webDevelopment.click();
        return this;
    }

    /**
     * Click on Why Rhoynar Link.
     *
     * @return the  class instance.
     */
    public BLOG clickWhyRhoynarLink() {
	    if(whyRhoynar.isDisplayed())
        whyRhoynar.click();
        return this;
    }

    /**
     * Click on Www Rhoynar Com Link.
     *
     * @return the  class instance.
     */
    public BLOG clickWwwRhoynarComLink() {
	    if(wwwRhoynarCom.isDisplayed())
        wwwRhoynarCom.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the  class instance.
     */
    public BLOG verifyPageLoaded() {
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the  class instance.
     */
    public BLOG verifyPageUrl() {
        return this;
    }
}
