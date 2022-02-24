package GlobalAnalyst;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

 
 
 
public class FilterTests extends BaseTest {
    WebDriver driver;
 
 
 
 
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\devuser6\\Desktop\\geckodriver-v0.24.0-win32\\geckodriver.exe");
 
    }
 
 
    @BeforeMethod
	public void setUpMethod() throws Exception {
        System.out.println("--------Starting Test--------");
        driver = Utils.getDriver();
 
    }
 
    @AfterMethod
	public void tearDownMethod() throws Exception {
        System.out.println("--------Test Finished--------");
        driver.quit();
    }
    
    public void FilterSearch() throws InterruptedException {		 
        System.out.println("--------Opening GlobalAnalyst Company Search--------");
        String Homepage = "https://www.interactivebrokers.com/en/index.php?f=49843#/";
        driver.get(Homepage);
        Utils.getFiltersButton(driver).click();
    }
    
    public void FilterResults() throws InterruptedException {		 
        
    }
    
    @Test
    public void SelectAllSearch() throws InterruptedException {
    	String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = report.startTest(nameofCurrMethod);
    	FilterSearch();
    	Utils.getAllRegions(driver).click();
    	Utils.getIndAll(driver).click();
    	Utils.getCapAll(driver).click();
    	Utils.getCurrency(driver).click();
    	Utils.getCurrency(driver).sendKeys(Keys.ARROW_DOWN);
        Utils.getCurrency(driver).sendKeys(Keys.ENTER);
        Utils.getFiltersResults(driver).click();
        String totalnum = Utils.getResultsNumber(driver).getText();
        
    }
    
    
    
    
}
