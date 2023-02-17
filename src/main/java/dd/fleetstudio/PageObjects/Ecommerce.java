package dd.fleetstudio.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce extends CommonMethods{
	
	WebDriver driver;

	public Ecommerce(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "name")
	private WebElement addName;
	
	@FindBy(id = "email")
	private WebElement addEmail;
	
	@FindBy(id = "form-submit")
	private WebElement submit;
	

	public ProjectsPage loginApplication(String name, String email) {
		
		waitForWebElementToAppear(submit);
		
		addName.sendKeys(name);
		addEmail.sendKeys(email);
		submit.click();				//OTP-fsuMuyBJ if required
		
		ProjectsPage projectsPage = new ProjectsPage(driver);
		return projectsPage;

	}

	public void goTo() {
		driver.get("https://rahulshettyacademy.com/practice-project");
	}
}
