package Module1_Login;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
//pom class 1
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabsLoginPage
{
	//Step1: declaration
	@FindBy(xpath="//input[@name='user-name']") private WebElement UN;  //private WebElement UN=driver.finElement(By.xpath(""))
	@FindBy(xpath="//input[@name='password']") private WebElement PWD;	//private WebElement PWD=driver.finElement(By.xpath(""))
	@FindBy(xpath="//input[@name='login-button']") private WebElement LoginBtn;	//private WebElement LoginBtn=driver.finElement(By.xpath(""))
	@FindBy(xpath="//div[@class='error-message-container error']") private WebElement errorMsg;
	WebDriver driver;
	
	
	//initialization
	public SwagLabsLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);      //className.methodName(WebdriverObject, thisKeyword);
		this.driver=driver;
	}
	
	public void inpSwagLabsLoginPageUsername(String username) 
	{
		UN.sendKeys(username);
	}
	
	public void inpSwagLabsLoginPagePaswword(String password)
	{
		PWD.sendKeys(password);
	}
	
	public void clickSwagLabsLoginPageLoginBtn()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(LoginBtn));
		
		LoginBtn.click();
	}
	
	
	public void verifySwagLabsLoginPageErrorMsg(String expErrorMsg) 
	{
		String actErrorMsg = errorMsg.getText();
		if (actErrorMsg.contains(expErrorMsg)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
	
	
	public void clickOnOkBtnOnAlert()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.alertIsPresent());
				
		driver.switchTo().alert().accept();
	}
	
}
