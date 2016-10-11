import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JOB_APPLICATION  {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='http://www.rhoynar.com/contact-us/company/about-us']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "a[href='http://www.rhoynar.com/auto-test-gen']")
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

    @FindBy(id = "ninja_forms_field_2")
    @CacheLookup
    private WebElement email;

    @FindBy(id = "ninja_forms_field_13")
    @CacheLookup
    private WebElement expectedSalaryPerHour;

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

    @FindBy(css = ".page.page-id-516.page-child.parent-pageid-70.page-template-default.skt-it-consultant-pro div:nth-of-type(1) div:nth-of-type(1) div.container div:nth-of-type(1) a")
    @CacheLookup
    private WebElement home2;

    @FindBy(id = "ninja_forms_field_16")
    @CacheLookup
    private WebElement howManyHoursPerWeekCan;

    @FindBy(name = "_i2cLr")
    @CacheLookup
    private WebElement ifYouAreAHumanAnd;

    @FindBy(css = "a[href='http://www.rhoynar.com/iot-testing']")
    @CacheLookup
    private WebElement iotTesting;

    @FindBy(css = "a[href='http://www.rhoynar.com/iot-suite']")
    @CacheLookup
    private WebElement iottestrFrameworkIotTesting;

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

    @FindBy(id = "ninja_forms_field_1")
    @CacheLookup
    private WebElement name;

    @FindBy(id = "ninja_forms_field_19")
    @CacheLookup
    private WebElement openForCommissionsBasedCompensation;

    @FindBy(id = "ninja_forms_field_18")
    @CacheLookup
    private WebElement openToTravelAbout30;

    private final String pageLoadedText = "push([ 'view', {v:'ext',j:'1:3";

    private final String pageUrl = "C:\tools\AutoTestRv0.87\html\JOB_APPLICATION.html";

    @FindBy(id = "ninja_forms_field_6")
    @CacheLookup
    private WebElement phone;

    @FindBy(id = "ninja_forms_field_9")
    @CacheLookup
    private WebElement position;

    @FindBy(css = "a[href='http://www.rhoynar.com/why-rhoynar/pricing-model']")
    @CacheLookup
    private WebElement pricingModel;

    @FindBy(id = "ninja_forms_field_5")
    @CacheLookup
    private WebElement processing;

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

    @FindBy(css = "#copyright div.container div:nth-of-type(1) a")
    @CacheLookup
    private WebElement rhoynarSoftwareConsultingDenverCo;

    @FindBy(css = "a[href='http://www.rhoynar.com/security-testing']")
    @CacheLookup
    private WebElement securityTesting;

    @FindBy(css = "#menu-item-140 a")
    @CacheLookup
    private WebElement services;

    @FindBy(css = "a[href='http://www.rhoynar.com/squad-presentation-selenium-page-objects']")
    @CacheLookup
    private WebElement squadPresentation;

    @FindBy(id = "ninja_forms_field_5")
    @CacheLookup
    private WebElement submit;

    @FindBy(css = "a[href='http://www.rhoynar.com/resources/testimonials']")
    @CacheLookup
    private WebElement testimonials;

    @FindBy(id = "ninja_forms_field_12")
    @CacheLookup
    private WebElement totalYearsOfExperience;

    @FindBy(css = "a[href='http://www.rhoynar.com/software-development-training']")
    @CacheLookup
    private WebElement training;

    @FindBy(css = "a[href='http://www.rhoynar.com/qa-services/qa-testing']")
    @CacheLookup
    private WebElement webAndMobileQa;

    @FindBy(css = "a[href='http://www.rhoynar.com/software-development-services']")
    @CacheLookup
    private WebElement webDevelopment;

    @FindBy(id = "ninja_forms_field_20")
    @CacheLookup
    private WebElement whatIs13Minus8;

    @FindBy(css = "a[href='http://www.rhoynar.com/why-rhoynar']")
    @CacheLookup
    private WebElement whyRhoynar;

    @FindBy(css = "#footer div.container aside:nth-of-type(4) p:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement wwwRhoynarCom;

    public JOB_APPLICATION() {
    }

    public JOB_APPLICATION(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public JOB_APPLICATION(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public JOB_APPLICATION(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickAboutUsLink() {
	    if(aboutUs.isDisplayed())
        aboutUs.click();
        return this;
    }

    /**
     * Click on Autotestr Automatic Test Generation Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickAutotestrAutomaticTestGenerationLink() {
	    if(autotestrAutomaticTestGeneration.isDisplayed())
        autotestrAutomaticTestGeneration.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickBlog1Link() {
	    if(blog1.isDisplayed())
        blog1.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickBlog2Link() {
	    if(blog2.isDisplayed())
        blog2.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickCareers1Link() {
	    if(careers1.isDisplayed())
        careers1.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickCareers2Link() {
	    if(careers2.isDisplayed())
        careers2.click();
        return this;
    }

    /**
     * Click on Case Studies Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickCaseStudiesLink() {
	    if(caseStudies.isDisplayed())
        caseStudies.click();
        return this;
    }

    /**
     * Click on Company Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickCompanyLink() {
	    if(company.isDisplayed())
        company.click();
        return this;
    }

    /**
     * Click on Competitive Advantage Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickCompetitiveAdvantageLink() {
	    if(competitiveAdvantage.isDisplayed())
        competitiveAdvantage.click();
        return this;
    }

    /**
     * Click on Comprehensive Qa Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickComprehensiveQaLink() {
	    if(comprehensiveQa.isDisplayed())
        comprehensiveQa.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickContactUs1Link() {
	    if(contactUs1.isDisplayed())
        contactUs1.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickContactUs2Link() {
	    if(contactUs2.isDisplayed())
        contactUs2.click();
        return this;
    }

    /**
     * Click on Contactrhoynar Com Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickContactrhoynarComLink() {
	    if(contactrhoynarCom.isDisplayed())
        contactrhoynarCom.click();
        return this;
    }

    /**
     * Click on Continuous Integration Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickContinuousIntegrationLink() {
	    if(continuousIntegration.isDisplayed())
        continuousIntegration.click();
        return this;
    }

    /**
     * Click on Dev Solutions Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickDevSolutionsLink() {
	    if(devSolutions.isDisplayed())
        devSolutions.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickFacebookLink() {
	    if(facebook.isDisplayed())
        facebook.click();
        return this;
    }

    /**
     * Click on Follow Rhoynarsoft Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickFollowRhoynarsoftLink() {
	    if(followRhoynarsoft.isDisplayed())
        followRhoynarsoft.click();
        return this;
    }

    /**
     * Click on Google Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickGoogleLink() {
	    if(google.isDisplayed())
        google.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickHome1Link() {
	    if(home1.isDisplayed())
        home1.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickHome2Link() {
	    if(home2.isDisplayed())
        home2.click();
        return this;
    }

    /**
     * Click on Iot Testing Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickIotTestingLink() {
	    if(iotTesting.isDisplayed())
        iotTesting.click();
        return this;
    }

    /**
     * Click on Iottestr Framework Iot Testing Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickIottestrFrameworkIotTestingLink() {
	    if(iottestrFrameworkIotTesting.isDisplayed())
        iottestrFrameworkIotTesting.click();
        return this;
    }

    /**
     * Click on Mailr Email Automation Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickMailrEmailAutomationLink() {
	    if(mailrEmailAutomation.isDisplayed())
        mailrEmailAutomation.click();
        return this;
    }

    /**
     * Click on Menu Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickMenuLink() {
	    if(menu.isDisplayed())
        menu.click();
        return this;
    }

    /**
     * Click on Migrater Selenium Migration Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickMigraterSeleniumMigrationLink() {
	    if(migraterSeleniumMigration.isDisplayed())
        migraterSeleniumMigration.click();
        return this;
    }

    /**
     * Click on Mobile Development Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickMobileDevelopmentLink() {
	    if(mobileDevelopment.isDisplayed())
        mobileDevelopment.click();
        return this;
    }

    /**
     * Click on Pricing Model Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickPricingModelLink() {
	    if(pricingModel.isDisplayed())
        pricingModel.click();
        return this;
    }

    /**
     * Click on Processing Button.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickProcessingButton() {
        processing.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickProducts1Link() {
	    if(products1.isDisplayed())
        products1.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickProducts2Link() {
	    if(products2.isDisplayed())
        products2.click();
        return this;
    }

    /**
     * Click on Qa Solutions Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickQaSolutionsLink() {
	    if(qaSolutions.isDisplayed())
        qaSolutions.click();
        return this;
    }

    /**
     * Click on Qa Staffing Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickQaStaffingLink() {
	    if(qaStaffing.isDisplayed())
        qaStaffing.click();
        return this;
    }

    /**
     * Click on Qa Training Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickQaTrainingLink() {
	    if(qaTraining.isDisplayed())
        qaTraining.click();
        return this;
    }

    /**
     * Click on Qtp To Selenium Migration Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickQtpToSeleniumMigrationLink() {
	    if(qtpToSeleniumMigration.isDisplayed())
        qtpToSeleniumMigration.click();
        return this;
    }

    /**
     * Click on Rhoynar Software Consulting Denver Co Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickRhoynarSoftwareConsultingDenverCoLink() {
	    if(rhoynarSoftwareConsultingDenverCo.isDisplayed())
        rhoynarSoftwareConsultingDenverCo.click();
        return this;
    }

    /**
     * Click on Security Testing Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickSecurityTestingLink() {
	    if(securityTesting.isDisplayed())
        securityTesting.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickServicesLink() {
	    if(services.isDisplayed())
        services.click();
        return this;
    }

    /**
     * Click on Squad Presentation Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickSquadPresentationLink() {
	    if(squadPresentation.isDisplayed())
        squadPresentation.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickSubmitButton() {
        submit.click();
        return this;
    }

    /**
     * Click on Testimonials Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickTestimonialsLink() {
	    if(testimonials.isDisplayed())
        testimonials.click();
        return this;
    }

    /**
     * Click on Training Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickTrainingLink() {
	    if(training.isDisplayed())
        training.click();
        return this;
    }

    /**
     * Click on Web And Mobile Qa Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickWebAndMobileQaLink() {
	    if(webAndMobileQa.isDisplayed())
        webAndMobileQa.click();
        return this;
    }

    /**
     * Click on Web Development Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickWebDevelopmentLink() {
	    if(webDevelopment.isDisplayed())
        webDevelopment.click();
        return this;
    }

    /**
     * Click on Why Rhoynar Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickWhyRhoynarLink() {
	    if(whyRhoynar.isDisplayed())
        whyRhoynar.click();
        return this;
    }

    /**
     * Click on Www Rhoynar Com Link.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION clickWwwRhoynarComLink() {
	    if(wwwRhoynarCom.isDisplayed())
        wwwRhoynarCom.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION fill() {
        setTotalYearsOfExperienceNumberField();
        setIfYouAreAHumanAndTextField();
        setEmailTextField();
        setPhoneTextField();
        setPositionDropDownListField();
        setNameTextField();
        setOpenToTravelAbout30DropDownListField();
        setHowManyHoursPerWeekCanNumberField();
        setExpectedSalaryPerHourNumberField();
        setOpenForCommissionsBasedCompensationDropDownListField();
        setWhatIs13Minus8TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Email Text field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setEmailTextField() {
        return setEmailTextField(data.get("EMAIL"));
    }

    /**
     * Set value to Email Text field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setEmailTextField(String emailValue) {
        email.sendKeys(emailValue);
        return this;
    }

    /**
     * Set default value to Expected Salary Per Hour Number field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setExpectedSalaryPerHourNumberField() {
        return setExpectedSalaryPerHourNumberField(data.get("EXPECTED_SALARY_PER_HOUR"));
    }

    /**
     * Set value to Expected Salary Per Hour Number field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setExpectedSalaryPerHourNumberField(String expectedSalaryPerHourValue) {
        expectedSalaryPerHour.sendKeys(expectedSalaryPerHourValue);
        return this;
    }

    /**
     * Set default value to How Many Hours Per Week Can You Work Number field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setHowManyHoursPerWeekCanNumberField() {
        return setHowManyHoursPerWeekCanNumberField(data.get("HOW_MANY_HOURS_PER_WEEK_CAN"));
    }

    /**
     * Set value to How Many Hours Per Week Can You Work Number field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setHowManyHoursPerWeekCanNumberField(String howManyHoursPerWeekCanValue) {
        howManyHoursPerWeekCan.sendKeys(howManyHoursPerWeekCanValue);
        return this;
    }

    /**
     * Set default value to If You Are A Human And Are Seeing This Field Please Leave It Blank Text field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setIfYouAreAHumanAndTextField() {
        return setIfYouAreAHumanAndTextField(data.get("IF_YOU_ARE_A_HUMAN_AND"));
    }

    /**
     * Set value to If You Are A Human And Are Seeing This Field Please Leave It Blank Text field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setIfYouAreAHumanAndTextField(String ifYouAreAHumanAndValue) {
        ifYouAreAHumanAnd.sendKeys(ifYouAreAHumanAndValue);
        return this;
    }

    /**
     * Set default value to Name Text field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setNameTextField() {
        return setNameTextField(data.get("NAME"));
    }

    /**
     * Set value to Name Text field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setNameTextField(String nameValue) {
        name.sendKeys(nameValue);
        return this;
    }

    /**
     * Set default value to Open For Commissions Based Compensation Drop Down List field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setOpenForCommissionsBasedCompensationDropDownListField() {
        return setOpenForCommissionsBasedCompensationDropDownListField(data.get("OPEN_FOR_COMMISSIONS_BASED_COMPENSATION"));
    }

    /**
     * Set value to Open For Commissions Based Compensation Drop Down List field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setOpenForCommissionsBasedCompensationDropDownListField(String openForCommissionsBasedCompensationValue) {
        new Select(openForCommissionsBasedCompensation).selectByVisibleText(openForCommissionsBasedCompensationValue);
        return this;
    }

    /**
     * Set default value to Open To Travel About 30 Drop Down List field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setOpenToTravelAbout30DropDownListField() {
        return setOpenToTravelAbout30DropDownListField(data.get("OPEN_TO_TRAVEL_ABOUT_30"));
    }

    /**
     * Set value to Open To Travel About 30 Drop Down List field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setOpenToTravelAbout30DropDownListField(String openToTravelAbout30Value) {
        new Select(openToTravelAbout30).selectByVisibleText(openToTravelAbout30Value);
        return this;
    }

    /**
     * Set default value to Phone Text field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setPhoneTextField() {
        return setPhoneTextField(data.get("PHONE"));
    }

    /**
     * Set value to Phone Text field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setPhoneTextField(String phoneValue) {
        phone.sendKeys(phoneValue);
        return this;
    }

    /**
     * Set default value to Position Drop Down List field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setPositionDropDownListField() {
        return setPositionDropDownListField(data.get("POSITION"));
    }

    /**
     * Set value to Position Drop Down List field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setPositionDropDownListField(String positionValue) {
        new Select(position).selectByVisibleText(positionValue);
        return this;
    }

    /**
     * Set default value to Total Years Of Experience Number field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setTotalYearsOfExperienceNumberField() {
        return setTotalYearsOfExperienceNumberField(data.get("TOTAL_YEARS_OF_EXPERIENCE"));
    }

    /**
     * Set value to Total Years Of Experience Number field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setTotalYearsOfExperienceNumberField(String totalYearsOfExperienceValue) {
        totalYearsOfExperience.sendKeys(totalYearsOfExperienceValue);
        return this;
    }

    /**
     * Set default value to What Is 13 Minus 8 Text field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setWhatIs13Minus8TextField() {
        return setWhatIs13Minus8TextField(data.get("WHAT_IS_13_MINUS_8"));
    }

    /**
     * Set value to What Is 13 Minus 8 Text field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION setWhatIs13Minus8TextField(String whatIs13Minus8Value) {
        whatIs13Minus8.sendKeys(whatIs13Minus8Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION submit() {
        clickProcessingButton();
        return this;
    }

    /**
     * Unset default value from Open For Commissions Based Compensation Drop Down List field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION unsetOpenForCommissionsBasedCompensationDropDownListField() {
        return unsetOpenForCommissionsBasedCompensationDropDownListField(data.get("OPEN_FOR_COMMISSIONS_BASED_COMPENSATION"));
    }

    /**
     * Unset value from Open For Commissions Based Compensation Drop Down List field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION unsetOpenForCommissionsBasedCompensationDropDownListField(String openForCommissionsBasedCompensationValue) {
        new Select(openForCommissionsBasedCompensation).deselectByVisibleText(openForCommissionsBasedCompensationValue);
        return this;
    }

    /**
     * Unset default value from Open To Travel About 30 Drop Down List field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION unsetOpenToTravelAbout30DropDownListField() {
        return unsetOpenToTravelAbout30DropDownListField(data.get("OPEN_TO_TRAVEL_ABOUT_30"));
    }

    /**
     * Unset value from Open To Travel About 30 Drop Down List field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION unsetOpenToTravelAbout30DropDownListField(String openToTravelAbout30Value) {
        new Select(openToTravelAbout30).deselectByVisibleText(openToTravelAbout30Value);
        return this;
    }

    /**
     * Unset default value from Position Drop Down List field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION unsetPositionDropDownListField() {
        return unsetPositionDropDownListField(data.get("POSITION"));
    }

    /**
     * Unset value from Position Drop Down List field.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION unsetPositionDropDownListField(String positionValue) {
        new Select(position).deselectByVisibleText(positionValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION verifyPageLoaded() {
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the  class instance.
     */
    public JOB_APPLICATION verifyPageUrl() {
        return this;
    }
}
