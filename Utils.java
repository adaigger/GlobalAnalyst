package GlobalAnalyst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {

   public static WebDriver getDriver () {
       System.setProperty("webdriver.gecko.driver", "C:/Users/daigg/Desktop/selenium/geckodriver-v0.29.0-win32/geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
       return driver;
   }
    
   public static boolean killDriver () {
       System.out.println("Not yet implemeted...");
       return true;
   }
   
   public static WebElement getCompaniesSearch(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[1]/div/div/div[3]/button"));
   }
   
   public static WebElement getCompaniesSearchModal(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[3]/div[1]/div[1]/div/div[2]/button"));
   }
   
   public static WebElement getCompaniesSearchBox(WebDriver driver) {
       return driver.findElement(By.xpath("//*[@id=\"_f36\"]"));
   }
   
   public static WebElement getCompaniesSearchIcon(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[3]/div/div[2]/div/form/button"));
   }
   
   public static WebElement getCompaniesSearchAdd(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr/td[1]/span"));
   }
   
   public static WebElement getCompaniesSearchApply(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[3]/div/div[3]/div/button[2]"));
   }
   
   public static WebElement getCompaniesSearchCurrency(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[3]/div[1]/div[2]/div/div/div[2]/div/span/span/span"));
   }
   
   public static WebElement getCompaniesSearchViewResults(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[3]/div[2]/span/button[1]"));
   }
   
   public static WebElement getPriceValue(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[3]/div[3]/div[1]/div/table/tbody/tr/td[5]/span"));
   }
   
   public static WebElement getMktCapValue(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[3]/div[3]/div[1]/div/table/tbody/tr/td[6]"));
   }
   
   public static WebElement getEVValue(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[3]/div[3]/div[1]/div/table/tbody/tr/td[7]"));
   }
   
   public static WebElement getREVValue(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[3]/div[3]/div[1]/div/table/tbody/tr/td[8]"));
   }
   
   public static WebElement getEarningsValue(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[3]/div[3]/div[1]/div/table/tbody/tr/td[9]"));
   }
   
   public static WebElement getEPSValue(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[3]/div[3]/div[1]/div/table/tbody/tr/td[10]"));
   } 
   
   public static WebElement getDIVValue(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[3]/div[3]/div[1]/div/table/tbody/tr/td[11]"));
   } 
   
   public static WebElement getPEValue(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[3]/div[3]/div[1]/div/table/tbody/tr/td[12]"));
   } 
       
   public static WebElement getPEGValue(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[3]/div[3]/div[1]/div/table/tbody/tr/td[13]"));
   } 
   
   public static WebElement getYahooMktCap(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div[1]/div/div[1]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[2]"));
   } 
   
   public static WebElement getYahooStatPage(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div/div[6]/div/div/section/div/ul/li[5]/a"));
   } 
   
   public static WebElement getYahooPrice(WebDriver driver) {
       return driver.findElement(By.xpath("//*[@id=\"quote-summary\"]/div[1]/table/tbody/tr[2]/td[2]"));
   } 
   
   public static WebElement getYahooREV(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div[1]/div/div[1]/div/div/section/div[3]/div[3]/div/div[4]/div/div/table/tbody/tr[1]/td[2]"));
   } 
   
   public static WebElement getYahooEarnings(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div[1]/div/div[1]/div/div/section/div[3]/div[3]/div/div[4]/div/div/table/tbody/tr[6]/td[2]"));
   } 
   
   public static WebElement getYahooEPS(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div[1]/div/div[1]/div/div/section/div[3]/div[2]/div/div[1]/div/div/table/tbody/tr[3]/td[2]"));
   } 
   
   public static WebElement getYahooDIV(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div[1]/div/div[1]/div/div/section/div[3]/div[2]/div/div[3]/div/div/table/tbody/tr[4]/td[2]"));
   } 
   
   public static WebElement getYahooPE(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div[1]/div/div[1]/div/div/section/div[3]/div[1]/div[2]/div/div[1]/div[1]/table/tbody/tr[3]/td[2]"));
   } 
   
   public static WebElement getYahooPEG(WebDriver driver) {
       return driver.findElement(By.xpath("//*[@id=\"Col1-0-KeyStatistics-Proxy\"]/section/div[3]/div[1]/div[2]/div/div[1]/div[1]/table/tbody/tr[5]/td[3]"));
   } 
   
   //FilterTests Selectors
   
   
   public static WebElement getFiltersButton(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[1]/div/div/div[2]/button"));
   } 
   
   public static WebElement getRegionNA(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/a[2]"));
   }
   
   public static WebElement getRegionSA(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/a[3]"));
   }
   
   public static WebElement getRegionE(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/a[4]"));
   }
   
   public static WebElement getRegionAS(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/a[5]"));
   }
   
   public static WebElement getRegionAF(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/a[6]"));
   }
   
   public static WebElement getRegionO(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/a[7]"));
   }
   
   public static WebElement getAllRegions(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/div/div[2]/section[1]/div/button"));
   }
   
   public static WebElement getAllUS(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/div/div[2]/section[2]/div/button[1]"));
   }
   
   public static WebElement getAllSA(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[2]/div/div[2]/section[3]/button[1]"));
   }
   
   public static WebElement getIndAll(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[2]/div/div[2]/button[1]"));
   }
   
   public static WebElement getIndEN(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[2]/div/div[3]/button[1]"));
   }
   
   public static WebElement getIndRE(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[2]/div/div[4]/button[1]"));
   }
   
   public static WebElement getIndBM(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[2]/div/div[5]/button[1]"));
   }
   
   public static WebElement getIndFIN(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[2]/div/div[6]/button[1]"));
   }
   
   public static WebElement getCapAll(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div/button[1]"));
   }
   
   public static WebElement getCapMEGA(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div/button[2]"));
   }
   
   public static WebElement getCapLARGE(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div/button[3]"));
   }
   
   public static WebElement getCapMID(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div/button[4]"));
   }
   
   public static WebElement getCapSMALL(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div/button[5]"));
   }
   
   public static WebElement getCapMICRO(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div/button[6]"));
   }
   
   public static WebElement getCurrency(WebDriver driver) {
       return driver.findElement(By.xpath("//*[@id=\"_dd131\"]"));
   }
   
   public static WebElement getFiltersResults(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[3]/div/span/button[1]"));
   }
   
   public static WebElement getFiltersReset(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[3]/div/span/button[2]"));
   }
   
   //Result table elements
   
   public static WebElement getResultsNumber(WebDriver driver) {
       return driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/div/div/div/div[1]/div/div/div[3]/div[2]/div/div/div/p"));
   }
   
   
   
   
   
   
   
   
   
   
    
}