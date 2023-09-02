package FormAutomation;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormAutomation {
	
	
	WebDriver driver;
	

    @BeforeClass
    public void setUp() {
        
    	//System.setProperty("webdriver.chrome.driver","/Users/arsalan.khalid/Downloads/chrome-mac-x64/Google Chrome for Testing.app");
    	
    	//WebDriverManager.chromedriver().clearDriverCache().setup();
    	 // Set up the wWebDriverManager for chrome driver
        WebDriverManager.chromedriver().setup();
        // Create the driver object
        driver = new ChromeDriver();
    }
    
	@Test
	public void Form_Fill() {
		try {
			
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "DEMOQA";
		assertEquals(expectedTitle,actualTitle);
		
		WebElement firstName = driver.findElement(By.id("firstName"));
	    WebElement lastName = driver.findElement(By.id("lastName"));
	    WebElement userEmail = driver.findElement(By.id("userEmail"));
	    WebElement genderMale = driver.findElement(By.xpath("//*[@id = 'gender-radio-1']"));
	    WebElement userNumber = driver.findElement(By.id("userNumber"));
	    WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
	    WebElement subjectInput = driver.findElement(By.id("subjectsInput"));
	    WebElement hubbiesRadio = driver.findElement(By.id("hobbies-checkbox-2"));
	    WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
	    WebElement currentAddress = driver.findElement(By.id("currentAddress"));
	    WebElement selectState = driver.findElement(By.xpath("//*[text()='Select State']"));
	    WebElement submitButton = driver.findElement(By.id("submit"));

	    firstName.sendKeys("Test");
	    lastName.sendKeys("User");
	    userEmail.sendKeys("ak@automation.com");
	    
	    JavascriptExecutor ex=(JavascriptExecutor)driver;
	    ex.executeScript("arguments[0].click()", genderMale);
	    
	    userNumber.sendKeys("1234567891");
	    dateOfBirthInput.click();
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@role='option' and text()='15']")));
	    
	    WebElement dateInput = driver.findElement(By.xpath("//*[@role='option' and text()='15']"));
	    dateInput.click();
	    
	    subjectInput.click();
	   
	    
	    WebElement sub = driver.findElement(By.xpath("//*[contains(@class, 'focused')]/descendant::*[@id= 'subjectsInput']"));
	    sub.sendKeys("Computer Science");
	 
	    WebElement sub1 = driver.findElement(By.id("react-select-2-option-0"));
	    sub1.click();
	    
	    JavascriptExecutor ex1=(JavascriptExecutor)driver;
	    ex1.executeScript("arguments[0].click()", hubbiesRadio);

	    uploadPicture.sendKeys("/Users/arsalan.khalid/Desktop/i1.jpg");
	    currentAddress.sendKeys("xyz");
	    
	    ex1.executeScript("arguments[0].click()", submitButton);
	    
	    boolean textFound = false;  
	    try {
	        driver.findElement(By.xpath("//*[text()='Thanks for submitting the form']"));
	        textFound = true;
	    } catch (Exception e) {
	        textFound = false;
	    }
	    
	    System.out.println(textFound);
	    
	    }
		catch (Exception e) {
		    // Handle exceptions
		  //  e.printStackTrace();
		}
	   
	    finally {
	       driver.quit();
	    }
	   
		
	}
	   
	}
