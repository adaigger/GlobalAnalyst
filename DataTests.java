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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

 
 
 
public class DataTests extends BaseTest {
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
    
    //This method submits a company search for the desired company and leaves the user on the results table
    public void CompDataSearch(String Company) throws InterruptedException {
		 
        System.out.println("--------Opening GlobalAnalyst Company Search--------");
        String Homepage = "https://www.interactivebrokers.com/en/index.php?f=49843#/";
 
        driver.get(Homepage);
        //Click Companies search and submit chosen ticker
        Utils.getCompaniesSearch(driver).click();
        Utils.getCompaniesSearchModal(driver).click();
        Thread.sleep(1000);
        Utils.getCompaniesSearchBox(driver).sendKeys(Company);
        Utils.getCompaniesSearchIcon(driver).click();
        Thread.sleep(1000);
        Utils.getCompaniesSearchAdd(driver).click();
        Utils.getCompaniesSearchApply(driver).click();
    }
    
    public void CompDataSearchUSD(String Company) throws InterruptedException {
		CompDataSearch(Company);
        //Choose USD from dropdown
        Utils.getCompaniesSearchCurrency(driver).click();
        Utils.getCompaniesSearchCurrency(driver).sendKeys(Keys.ARROW_DOWN);
        Utils.getCompaniesSearchCurrency(driver).sendKeys(Keys.ENTER);
        //CLick View Results
        Utils.getCompaniesSearchViewResults(driver).click(); 
        Thread.sleep(4000);
    }
    
    public void CompDataSearchHUF(String Company) throws InterruptedException { 
    	CompDataSearch(Company);
        //Choose USD from dropdown
        Utils.getCompaniesSearchCurrency(driver).click();       
        for (int i=0; i<12; i++){
            Utils.getCompaniesSearchCurrency(driver).sendKeys(Keys.ARROW_DOWN);
            if(i == 11){
                Utils.getCompaniesSearchCurrency(driver).sendKeys(Keys.ENTER);}}
        //CLick View Results
        Utils.getCompaniesSearchViewResults(driver).click(); 
        Thread.sleep(4000);
    }
    
    public void CompDataSearchJPY(String Company) throws InterruptedException { 
    	CompDataSearch(Company);
        //Choose USD from dropdown
        Utils.getCompaniesSearchCurrency(driver).click();       
        for (int i=0; i<15; i++){
            Utils.getCompaniesSearchCurrency(driver).sendKeys(Keys.ARROW_DOWN);
            if(i == 14){
                Utils.getCompaniesSearchCurrency(driver).sendKeys(Keys.ENTER);}}
        //CLick View Results
        Utils.getCompaniesSearchViewResults(driver).click(); 
        Thread.sleep(4000);
    }
    
    public void CompDataSearchFSR(String Company) throws InterruptedException { 
    	CompDataSearch(Company);
        //Choose USD from dropdown
        Utils.getCompaniesSearchCurrency(driver).click();       
        for (int i=0; i<25; i++){
            Utils.getCompaniesSearchCurrency(driver).sendKeys(Keys.ARROW_DOWN);
            if(i == 24){
                Utils.getCompaniesSearchCurrency(driver).sendKeys(Keys.ENTER);}}
        //CLick View Results
        Utils.getCompaniesSearchViewResults(driver).click(); 
        Thread.sleep(4000);
    }
    
    public void CompDataSearchGBP(String Company) throws InterruptedException { 
    	CompDataSearch(Company);
        //Choose USD from dropdown
        Utils.getCompaniesSearchCurrency(driver).click();       
        for (int i=0; i<4; i++){
            Utils.getCompaniesSearchCurrency(driver).sendKeys(Keys.ARROW_DOWN);
            if(i == 3){
                Utils.getCompaniesSearchCurrency(driver).sendKeys(Keys.ENTER);}}
        //CLick View Results
        Utils.getCompaniesSearchViewResults(driver).click(); 
        Thread.sleep(4000);
    }
    
    public void CompDataSearchMXN(String Company) throws InterruptedException { 
    	CompDataSearch(Company);
        //Choose USD from dropdown
        Utils.getCompaniesSearchCurrency(driver).click();       
        for (int i=0; i<16; i++){
            Utils.getCompaniesSearchCurrency(driver).sendKeys(Keys.ARROW_DOWN);
            if(i == 15){
                Utils.getCompaniesSearchCurrency(driver).sendKeys(Keys.ENTER);}}
        //CLick View Results
        Utils.getCompaniesSearchViewResults(driver).click(); 
        Thread.sleep(4000);
    }
    
    public void CompDataSearchBRL(String Company) throws InterruptedException { 
    	CompDataSearch(Company);
        //Choose USD from dropdown
        Utils.getCompaniesSearchCurrency(driver).click();       
        for (int i=0; i<3; i++){
            Utils.getCompaniesSearchCurrency(driver).sendKeys(Keys.ARROW_DOWN);
            if(i == 2){
                Utils.getCompaniesSearchCurrency(driver).sendKeys(Keys.ENTER);}}
        //CLick View Results
        Utils.getCompaniesSearchViewResults(driver).click(); 
        Thread.sleep(4000);
    }
    
    public Double getPrice() {
    	String value = Utils.getPriceValue(driver).getText().replace(",", "");
    	Double price = Double.parseDouble(value);
    	System.out.println("Price is " + price);
    	return price;
    }
    
    public Double getMktCap() {
    	String value = Utils.getMktCapValue(driver).getText().replace(",", "");
    	value = value.substring(0, value.length() -1);
    	Double Cap = Double.parseDouble(value);
    	System.out.println("MktCap is " + Cap);
    	return Cap;
    }
    
    public Double getEV() {
    	String value = Utils.getEVValue(driver).getText().replace(",", "");
    	value = value.substring(0, value.length() -1);
    	Double Cap = Double.parseDouble(value);
    	System.out.println("MktCap is " + Cap);
    	return Cap;
    }
    
    public Double getREV() {
    	String value = Utils.getREVValue(driver).getText().replace(",", "");
    	value = value.substring(0, value.length() -1);
    	Double Rev = Double.parseDouble(value);
    	System.out.println("REV is " + Rev);
    	return Rev;
    }
    
    public Double getEarnings() {
    	String value = Utils.getEarningsValue(driver).getText().replace(",", "");
    	value = value.substring(0, value.length() -1);
    	Double earn = Double.parseDouble(value);
    	System.out.println("Earnings is " + earn);
    	return earn;
    }
    
    public Double getEPS() {
    	String value = Utils.getEPSValue(driver).getText().replace(",", "");
    	value = value.substring(0, value.length() -1);
    	Double eps = Double.parseDouble(value);
    	System.out.println("EPS is " + eps);
    	return eps;
    }
    
    public Double getDIV() {
    	String value = Utils.getDIVValue(driver).getText().replace(",", "");
    	value = value.substring(0, value.length() -1);
    	Double div = Double.parseDouble(value);
    	System.out.println("DIV is " + div);
    	return div;
    }
    
    public Double getPE() {
    	String value = Utils.getPEValue(driver).getText().replace(",", "");
    	Double pe = Double.parseDouble(value);
    	System.out.println("PE is " + pe);
    	return pe;
    }
    
    public Double getPEG() {
    	String value = Utils.getPEGValue(driver).getText().replace(",", "");
    	Double peg = Double.parseDouble(value);
    	System.out.println("PEG is " + peg);
    	return peg;
    }
    
  //Go to Yahoo page for the company
    public void YahooData(String Company) throws InterruptedException {		 
        System.out.println("--------Opening Yahoo Search--------");
        String Homepage = "https://finance.yahoo.com/quote/" + Company + "?p=" + Company + "&.tsrc=fin-srch";
        driver.get(Homepage);
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ESCAPE);
    }
    
    public Double getYahooMktCap() {
    	String value = Utils.getYahooMktCap(driver).getText().replace(",", "");
    	value = value.substring(0, value.length() -1);
    	Double cap = Double.parseDouble(value);
    	System.out.println("Yahoo MktCap is " + cap);
    	
    	return cap;
    }
    
    public Double getYahooPrice(String Company) throws InterruptedException {
    	String value = Utils.getYahooPrice(driver).getText().replace(",", "");
    	Double price = Double.parseDouble(value);
    	System.out.println("Yahoo Price is " + price);
    	String Homepage = "https://finance.yahoo.com/quote/" + Company + "/key-statistics?p=" + Company + "";
        driver.get(Homepage);
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ESCAPE);
    	return price;
    }
    
    public Double getYahooREV() {
    	String value = Utils.getYahooREV(driver).getText().replace(",", "");
    	value = value.substring(0, value.length() -1);
    	Double rev = Double.parseDouble(value);
    	System.out.println("Yahoo REV is " + rev);
    	return rev;
    }
    
    public Double getYahooEarnings() {
    	String value = Utils.getYahooEarnings(driver).getText().replace(",", "");
    	value = value.substring(0, value.length() -1);
    	Double rev = Double.parseDouble(value);
    	System.out.println("Yahoo Earnings is " + rev);
    	return rev;
    }
    
    public Double getYahooEPS() {
    	String value = Utils.getYahooEPS(driver).getText().replace(",", "");
    	value = value.substring(0, value.length() -1);
    	Double eps = Double.parseDouble(value);
    	System.out.println("Yahoo EPS is " + eps);
    	return eps;
    }
    
    public Double getYahooDIV() {
    	String value = Utils.getYahooDIV(driver).getText().replace(",", "");
    	value = value.substring(0, value.length() -1);
    	Double div = Double.parseDouble(value);
    	System.out.println("Yahoo DIV is " + div);
    	return div;
    }
    
    public Double getYahooPE() {
    	String value = Utils.getYahooPE(driver).getText().replace(",", "");
    	Double pe = Double.parseDouble(value);
    	System.out.println("Yahoo PE is " + pe);
    	return pe;
    }
    
    public Double getYahooPEG() {
    	String value = Utils.getYahooPEG(driver).getText().replace(",", "");
    	Double peg = Double.parseDouble(value);
    	System.out.println("Yahoo PEG is " + peg);
    	return peg;
    }
    
    
    public boolean Compare(Double vi, Double vy) {
    	Double vmin = vy - 20;
    	Double vmax = vy + 20;
    	if (vi>vmin && vi<vmax) {
    		return true;
    	}
    	else {
    		System.out.println("Value Out of Range" + vi);
    		return false;
    	}
    	
    }
    
    public boolean CompareEPS(Double vi, Double vy) {
    	Double vmin = vy - 20;
    	Double vmax = vy + 20;
    	if (vi>vmin && vi<vmax) {
    		return true;
    	}
    	else {
    		System.out.println("Value Out of Range" + vi);
    		return false;
    	}
    	
    }
    
    @Test
    public void DataTestAAPL() throws InterruptedException {
    	String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = report.startTest(nameofCurrMethod);
    	CompDataSearchUSD("AAPL");
    	Double Price = getPrice();
    	Double MktCap = getMktCap();
    	Double REV = getREV();
    	Double Earnings = getEarnings();
    	Double EPS = getEPS();
    	Double DIV = getDIV();
    	Double PE = getPE();
    	Double PEG = getPEG();
    	//Go to Yahoo and get MKT CAP from homepage
    	YahooData("AAPL");
    	Double MktCapYahoo = getYahooMktCap();
    	Double PriceYahoo = getYahooPrice("AAPL");
    	Double REVYahoo = getYahooREV();
    	Double EarningsYahoo = getYahooEarnings();
    	Double EPSYahoo = getYahooEPS();
    	Double DIVYahoo = getYahooDIV();
    	Double PEYahoo = getYahooPE();
    	Double PEGYahoo = getYahooPEG();
    	if (!Compare(Price, PriceYahoo)) {
    		System.out.println("Price " + Price + " Is out of range of " + PriceYahoo);
    		test.log(LogStatus.FAIL, "Price " + Price + " Is out of range of " + PriceYahoo);
    	}
    	else if (!Compare(MktCap, MktCapYahoo)) {
    		System.out.println("MktCap " + MktCap + " Is out of range of " + MktCapYahoo);
    		test.log(LogStatus.FAIL, "MktCap " + MktCap + " Is out of range of " + MktCapYahoo);	
    	}
    	else if (!Compare(REV, REVYahoo)) {
    		System.out.println("REV " + REV + " Is out of range of " + REVYahoo);
    		test.log(LogStatus.FAIL, "REV " + REV + " Is out of range of " + REVYahoo);	
    	}
    	else if (!Compare(Earnings, EarningsYahoo)) {
    		System.out.println("Earnings " + Earnings + " Is out of range of " + EarningsYahoo);
    		test.log(LogStatus.FAIL, "Earnings " + Earnings + " Is out of range of " + EarningsYahoo);	
    	}
    	else if (!CompareEPS(EPS, EPSYahoo)) {
    		System.out.println("EPS " + EPS + " Is out of range of " + EPSYahoo);
    		test.log(LogStatus.FAIL, "EPS " + EPS + " Is out of range of " + EPSYahoo);	
    	}
    	else if (!Compare(DIV, DIVYahoo)) {
    		System.out.println("DIV " + DIV + " Is out of range of " + DIVYahoo);
    		test.log(LogStatus.FAIL, "DIV " + DIV + " Is out of range of " + DIVYahoo);	
    	}
    	else if (!Compare(PE, PEYahoo)) {
    		System.out.println("PE " + PE + " Is out of range of " + PEYahoo);
    		test.log(LogStatus.FAIL, "PE " + PE + " Is out of range of " + PEYahoo);	
    	}
    	else if (!Compare(PEG, PEGYahoo)) {
    		System.out.println("PEG " + PEG + " Is out of range of " + PEGYahoo);
    		test.log(LogStatus.FAIL, "PEG " + PEG + " Is out of range of " + PEGYahoo);	
    	}
    	else {
    		System.out.println("All values are in an accaptable range");
    		test.log(LogStatus.PASS, "All values are in an accaptable range");	
    	}
    }
    
    @Test
    public void DataTestMA() throws InterruptedException {
    	String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = report.startTest(nameofCurrMethod);
    	CompDataSearchUSD("MA");
    	Double Price = getPrice();
    	Double MktCap = getMktCap();
    	Double REV = getREV();
    	Double Earnings = getEarnings();
    	Double EPS = getEPS();
    	Double DIV = getDIV();
    	Double PE = getPE();
    	Double PEG = getPEG();
    	//Go to Yahoo and get MKT CAP from homepage
    	YahooData("MA");
    	Double MktCapYahoo = getYahooMktCap();
    	Double PriceYahoo = getYahooPrice("MA");
    	Double REVYahoo = getYahooREV();
    	Double EarningsYahoo = getYahooEarnings();
    	Double EPSYahoo = getYahooEPS();
    	Double DIVYahoo = getYahooDIV();
    	Double PEYahoo = getYahooPE();
    	Double PEGYahoo = getYahooPEG();
    	if (!Compare(Price, PriceYahoo)) {
    		System.out.println("Price " + Price + " Is out of range of " + PriceYahoo);
    		test.log(LogStatus.FAIL, "Price " + Price + " Is out of range of " + PriceYahoo);
    	}
    	else if (!Compare(MktCap, MktCapYahoo)) {
    		System.out.println("MktCap " + MktCap + " Is out of range of " + MktCapYahoo);
    		test.log(LogStatus.FAIL, "MktCap " + MktCap + " Is out of range of " + MktCapYahoo);	
    	}
    	else if (!Compare(REV, REVYahoo)) {
    		System.out.println("REV " + REV + " Is out of range of " + REVYahoo);
    		test.log(LogStatus.FAIL, "REV " + REV + " Is out of range of " + REVYahoo);	
    	}
    	else if (!Compare(Earnings, EarningsYahoo)) {
    		System.out.println("Earnings " + Earnings + " Is out of range of " + EarningsYahoo);
    		test.log(LogStatus.FAIL, "Earnings " + Earnings + " Is out of range of " + EarningsYahoo);	
    	}
    	else if (!CompareEPS(EPS, EPSYahoo)) {
    		System.out.println("EPS " + EPS + " Is out of range of " + EPSYahoo);
    		test.log(LogStatus.FAIL, "EPS " + EPS + " Is out of range of " + EPSYahoo);	
    	}
    	else if (!Compare(DIV, DIVYahoo)) {
    		System.out.println("DIV " + DIV + " Is out of range of " + DIVYahoo);
    		test.log(LogStatus.FAIL, "DIV " + DIV + " Is out of range of " + DIVYahoo);	
    	}
    	else if (!Compare(PE, PEYahoo)) {
    		System.out.println("PE " + PE + " Is out of range of " + PEYahoo);
    		test.log(LogStatus.FAIL, "PE " + PE + " Is out of range of " + PEYahoo);	
    	}
    	else if (!Compare(PEG, PEGYahoo)) {
    		System.out.println("PEG " + PEG + " Is out of range of " + PEGYahoo);
    		test.log(LogStatus.FAIL, "PEG " + PEG + " Is out of range of " + PEGYahoo);	
    	}
    	else {
    		System.out.println("All values are in an accaptable range");
    		test.log(LogStatus.PASS, "All values are in an accaptable range");	
    	}
    }
    
    @Test
    public void DataTestMS() throws InterruptedException {
    	String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = report.startTest(nameofCurrMethod);
    	CompDataSearchUSD("MS");
    	Double Price = getPrice();
    	Double MktCap = getMktCap();
    	Double REV = getREV();
    	Double Earnings = getEarnings();
    	Double EPS = getEPS();
    	Double DIV = getDIV();
    	Double PE = getPE();
    	Double PEG = getPEG();
    	//Go to Yahoo and get MKT CAP from homepage
    	YahooData("MS");
    	Double MktCapYahoo = getYahooMktCap();
    	Double PriceYahoo = getYahooPrice("MS");
    	Double REVYahoo = getYahooREV();
    	Double EarningsYahoo = getYahooEarnings();
    	Double EPSYahoo = getYahooEPS();
    	Double DIVYahoo = getYahooDIV();
    	Double PEYahoo = getYahooPE();
    	Double PEGYahoo = getYahooPEG();
    	if (!Compare(Price, PriceYahoo)) {
    		System.out.println("Price " + Price + " Is out of range of " + PriceYahoo);
    		test.log(LogStatus.FAIL, "Price " + Price + " Is out of range of " + PriceYahoo);
    	}
    	else if (!Compare(MktCap, MktCapYahoo)) {
    		System.out.println("MktCap " + MktCap + " Is out of range of " + MktCapYahoo);
    		test.log(LogStatus.FAIL, "MktCap " + MktCap + " Is out of range of " + MktCapYahoo);	
    	}
    	else if (!Compare(REV, REVYahoo)) {
    		System.out.println("REV " + REV + " Is out of range of " + REVYahoo);
    		test.log(LogStatus.FAIL, "REV " + REV + " Is out of range of " + REVYahoo);	
    	}
    	else if (!Compare(Earnings, EarningsYahoo)) {
    		System.out.println("Earnings " + Earnings + " Is out of range of " + EarningsYahoo);
    		test.log(LogStatus.FAIL, "Earnings " + Earnings + " Is out of range of " + EarningsYahoo);	
    	}
    	else if (!CompareEPS(EPS, EPSYahoo)) {
    		System.out.println("EPS " + EPS + " Is out of range of " + EPSYahoo);
    		test.log(LogStatus.FAIL, "EPS " + EPS + " Is out of range of " + EPSYahoo);	
    	}
    	else if (!Compare(DIV, DIVYahoo)) {
    		System.out.println("DIV " + DIV + " Is out of range of " + DIVYahoo);
    		test.log(LogStatus.FAIL, "DIV " + DIV + " Is out of range of " + DIVYahoo);	
    	}
    	else if (!Compare(PE, PEYahoo)) {
    		System.out.println("PE " + PE + " Is out of range of " + PEYahoo);
    		test.log(LogStatus.FAIL, "PE " + PE + " Is out of range of " + PEYahoo);	
    	}
    	else if (!Compare(PEG, PEGYahoo)) {
    		System.out.println("PEG " + PEG + " Is out of range of " + PEGYahoo);
    		test.log(LogStatus.FAIL, "PEG " + PEG + " Is out of range of " + PEGYahoo);	
    	}
    	else {
    		System.out.println("All values are in an accaptable range");
    		test.log(LogStatus.PASS, "All values are in an accaptable range");	
    	}
    }
    
    @Test
    public void DataTestDBX() throws InterruptedException {
    	String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = report.startTest(nameofCurrMethod);
    	CompDataSearchUSD("DBX");
    	Double Price = getPrice();
    	Double MktCap = getMktCap();
    	Double REV = getREV();
    	Double Earnings = getEarnings();
    	Double EPS = getEPS();
    	//Double DIV = getDIV();
    	//Double PE = getPE();
    	//Double PEG = getPEG();
    	//Go to Yahoo and get MKT CAP from homepage
    	YahooData("DBX");
    	Double MktCapYahoo = getYahooMktCap();
    	Double PriceYahoo = getYahooPrice("DBX");
    	Double REVYahoo = getYahooREV();
    	Double EarningsYahoo = getYahooEarnings();
    	Double EPSYahoo = getYahooEPS();
    //	Double DIVYahoo = getYahooDIV();
    //	Double PEYahoo = getYahooPE();
    	//Double PEGYahoo = getYahooPEG();
    	if (!Compare(Price, PriceYahoo)) {
    		System.out.println("Price " + Price + " Is out of range of " + PriceYahoo);
    		test.log(LogStatus.FAIL, "Price " + Price + " Is out of range of " + PriceYahoo);
    	}
    	else if (!Compare(MktCap, MktCapYahoo)) {
    		System.out.println("MktCap " + MktCap + " Is out of range of " + MktCapYahoo);
    		test.log(LogStatus.FAIL, "MktCap " + MktCap + " Is out of range of " + MktCapYahoo);	
    	}
    	else if (!Compare(REV, REVYahoo)) {
    		System.out.println("REV " + REV + " Is out of range of " + REVYahoo);
    		test.log(LogStatus.FAIL, "REV " + REV + " Is out of range of " + REVYahoo);	
    	}
    	else if (!Compare(Earnings, EarningsYahoo)) {
    		System.out.println("Earnings " + Earnings + " Is out of range of " + EarningsYahoo);
    		test.log(LogStatus.FAIL, "Earnings " + Earnings + " Is out of range of " + EarningsYahoo);	
    	}
    	else if (!CompareEPS(EPS, EPSYahoo)) {
    		System.out.println("EPS " + EPS + " Is out of range of " + EPSYahoo);
    		test.log(LogStatus.FAIL, "EPS " + EPS + " Is out of range of " + EPSYahoo);	
    	}
    	/*  	else if (!Compare(DIV, DIVYahoo)) {
    		System.out.println("DIV " + DIV + " Is out of range of " + DIVYahoo);
    		test.log(LogStatus.FAIL, "DIV " + DIV + " Is out of range of " + DIVYahoo);	
    	}
    	else if (!Compare(PE, PEYahoo)) {
    		System.out.println("PE " + PE + " Is out of range of " + PEYahoo);
    		test.log(LogStatus.FAIL, "PE " + PE + " Is out of range of " + PEYahoo);	
    	}
    	else if (!Compare(PEG, PEGYahoo)) {
    		System.out.println("PEG " + PEG + " Is out of range of " + PEGYahoo);
    		test.log(LogStatus.FAIL, "PEG " + PEG + " Is out of range of " + PEGYahoo);	
    	} */
    	else {
    		System.out.println("All values are in an accaptable range");
    		test.log(LogStatus.PASS, "All values are in an accaptable range");	
    	}
    }
    
    @Test
    public void DataTestCDMO() throws InterruptedException {
    	String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = report.startTest(nameofCurrMethod);
    	CompDataSearchUSD("CDMO");
    	Double Price = getPrice();
    	Double MktCap = getMktCap();
    	Double REV = getREV();
    	Double Earnings = getEarnings();
    	Double EPS = getEPS();
    	//Double DIV = getDIV();
    	Double PE = getPE();
    	//Double PEG = getPEG();
    	//Go to Yahoo and get MKT CAP from homepage
    	YahooData("CDMO");
    	Double MktCapYahoo = getYahooMktCap();
    	Double PriceYahoo = getYahooPrice("CDMO");
    	Double REVYahoo = getYahooREV();
    	Double EarningsYahoo = getYahooEarnings();
    	Double EPSYahoo = getYahooEPS();
    	//Double DIVYahoo = getYahooDIV();
    	Double PEYahoo = getYahooPE();
    //	Double PEGYahoo = getYahooPEG();
    	if (!Compare(Price, PriceYahoo)) {
    		System.out.println("Price " + Price + " Is out of range of " + PriceYahoo);
    		test.log(LogStatus.FAIL, "Price " + Price + " Is out of range of " + PriceYahoo);
    	}
    	else if (!Compare(MktCap, MktCapYahoo)) {
    		System.out.println("MktCap " + MktCap + " Is out of range of " + MktCapYahoo);
    		test.log(LogStatus.FAIL, "MktCap " + MktCap + " Is out of range of " + MktCapYahoo);	
    	}
    	else if (!Compare(REV, REVYahoo)) {
    		System.out.println("REV " + REV + " Is out of range of " + REVYahoo);
    		test.log(LogStatus.FAIL, "REV " + REV + " Is out of range of " + REVYahoo);	
    	}
    	else if (!Compare(Earnings, EarningsYahoo)) {
    		System.out.println("Earnings " + Earnings + " Is out of range of " + EarningsYahoo);
    		test.log(LogStatus.FAIL, "Earnings " + Earnings + " Is out of range of " + EarningsYahoo);	
    	}
    	else if (!CompareEPS(EPS, EPSYahoo)) {
    		System.out.println("EPS " + EPS + " Is out of range of " + EPSYahoo);
    		test.log(LogStatus.FAIL, "EPS " + EPS + " Is out of range of " + EPSYahoo);	
    	}
 /*   	else if (!Compare(DIV, DIVYahoo)) {
    		System.out.println("DIV " + DIV + " Is out of range of " + DIVYahoo);
    		test.log(LogStatus.FAIL, "DIV " + DIV + " Is out of range of " + DIVYahoo);	
    	} */
    	else if (!Compare(PE, PEYahoo)) {
    		System.out.println("PE " + PE + " Is out of range of " + PEYahoo);
    		test.log(LogStatus.FAIL, "PE " + PE + " Is out of range of " + PEYahoo);	
    	}
  /*  	else if (!Compare(PEG, PEGYahoo)) {
    		System.out.println("PEG " + PEG + " Is out of range of " + PEGYahoo);
    		test.log(LogStatus.FAIL, "PEG " + PEG + " Is out of range of " + PEGYahoo);	
    	} */
    	else {
    		System.out.println("All values are in an accaptable range");
    		test.log(LogStatus.PASS, "All values are in an accaptable range");	
    	}
    }
    
    @Test
    public void DataTestMCEM() throws InterruptedException {
    	String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = report.startTest(nameofCurrMethod);
    	CompDataSearchUSD("MCEM");
    	Double Price = getPrice();
    	Double MktCap = getMktCap();
    	Double REV = getREV();
    	Double Earnings = getEarnings();
    	Double EPS = getEPS();
    	Double DIV = getDIV();
    	Double PE = getPE();
  //  	Double PEG = getPEG();
    	//Go to Yahoo and get MKT CAP from homepage
    	YahooData("MCEM");
    	Double MktCapYahoo = getYahooMktCap();
    	Double PriceYahoo = getYahooPrice("MCEM");
    	Double REVYahoo = getYahooREV();
    	Double EarningsYahoo = getYahooEarnings();
    	Double EPSYahoo = getYahooEPS();
    	Double DIVYahoo = getYahooDIV();
    	Double PEYahoo = getYahooPE();
    	//Double PEGYahoo = getYahooPEG();
    	if (!Compare(Price, PriceYahoo)) {
    		System.out.println("Price " + Price + " Is out of range of " + PriceYahoo);
    		test.log(LogStatus.FAIL, "Price " + Price + " Is out of range of " + PriceYahoo);
    	}
    	else if (!Compare(MktCap, MktCapYahoo)) {
    		System.out.println("MktCap " + MktCap + " Is out of range of " + MktCapYahoo);
    		test.log(LogStatus.FAIL, "MktCap " + MktCap + " Is out of range of " + MktCapYahoo);	
    	}
    	else if (!Compare(REV, REVYahoo)) {
    		System.out.println("REV " + REV + " Is out of range of " + REVYahoo);
    		test.log(LogStatus.FAIL, "REV " + REV + " Is out of range of " + REVYahoo);	
    	}
    	else if (!Compare(Earnings, EarningsYahoo)) {
    		System.out.println("Earnings " + Earnings + " Is out of range of " + EarningsYahoo);
    		test.log(LogStatus.FAIL, "Earnings " + Earnings + " Is out of range of " + EarningsYahoo);	
    	}
    	else if (!CompareEPS(EPS, EPSYahoo)) {
    		System.out.println("EPS " + EPS + " Is out of range of " + EPSYahoo);
    		test.log(LogStatus.FAIL, "EPS " + EPS + " Is out of range of " + EPSYahoo);	
    	}
    	else if (!Compare(DIV, DIVYahoo)) {
    		System.out.println("DIV " + DIV + " Is out of range of " + DIVYahoo);
    		test.log(LogStatus.FAIL, "DIV " + DIV + " Is out of range of " + DIVYahoo);	
    	}
    	else if (!Compare(PE, PEYahoo)) {
    		System.out.println("PE " + PE + " Is out of range of " + PEYahoo);
    		test.log(LogStatus.FAIL, "PE " + PE + " Is out of range of " + PEYahoo);	
    	}
  /*  	else if (!Compare(PEG, PEGYahoo)) {
    		System.out.println("PEG " + PEG + " Is out of range of " + PEGYahoo);
    		test.log(LogStatus.FAIL, "PEG " + PEG + " Is out of range of " + PEGYahoo);	
    	} */
    	else {
    		System.out.println("All values are in an accaptable range");
    		test.log(LogStatus.PASS, "All values are in an accaptable range");	
    	}
    }
    
    @Test
    public void DataTest4IG() throws InterruptedException {
    	String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = report.startTest(nameofCurrMethod);
    	CompDataSearchHUF("4IG");
    	Double Price = getPrice();
    	Double MktCap = getMktCap();
    	Double REV = getREV();
    	Double Earnings = getEarnings();
    	Double EPS = getEPS();
    	Double DIV = getDIV();
    	Double PE = getPE();
   // 	Double PEG = getPEG();
    	//Go to Yahoo and get MKT CAP from homepage
    	YahooData("4IG.BD");
    	Double MktCapYahoo = getYahooMktCap();
    	Double PriceYahoo = getYahooPrice("4IG.BD");
    	Double REVYahoo = getYahooREV();
    	Double EarningsYahoo = getYahooEarnings();
    	Double EPSYahoo = getYahooEPS();
    	Double DIVYahoo = getYahooDIV();
    	Double PEYahoo = getYahooPE();
  //  	Double PEGYahoo = getYahooPEG();
    	if (!Compare(Price, PriceYahoo)) {
    		System.out.println("Price " + Price + " Is out of range of " + PriceYahoo);
    		test.log(LogStatus.FAIL, "Price " + Price + " Is out of range of " + PriceYahoo);
    	}
    	else if (!Compare(MktCap, MktCapYahoo)) {
    		System.out.println("MktCap " + MktCap + " Is out of range of " + MktCapYahoo);
    		test.log(LogStatus.FAIL, "MktCap " + MktCap + " Is out of range of " + MktCapYahoo);	
    	}
    	else if (!Compare(REV, REVYahoo)) {
    		System.out.println("REV " + REV + " Is out of range of " + REVYahoo);
    		test.log(LogStatus.FAIL, "REV " + REV + " Is out of range of " + REVYahoo);	
    	}
    	else if (!Compare(Earnings, EarningsYahoo)) {
    		System.out.println("Earnings " + Earnings + " Is out of range of " + EarningsYahoo);
    		test.log(LogStatus.FAIL, "Earnings " + Earnings + " Is out of range of " + EarningsYahoo);	
    	}
    	else if (!CompareEPS(EPS, EPSYahoo)) {
    		System.out.println("EPS " + EPS + " Is out of range of " + EPSYahoo);
    		test.log(LogStatus.FAIL, "EPS " + EPS + " Is out of range of " + EPSYahoo);	
    	}
    	else if (!Compare(DIV, DIVYahoo)) {
    		System.out.println("DIV " + DIV + " Is out of range of " + DIVYahoo);
    		test.log(LogStatus.FAIL, "DIV " + DIV + " Is out of range of " + DIVYahoo);	
    	}
    	else if (!Compare(PE, PEYahoo)) {
    		System.out.println("PE " + PE + " Is out of range of " + PEYahoo);
    		test.log(LogStatus.FAIL, "PE " + PE + " Is out of range of " + PEYahoo);	
    	}
/*    	else if (!Compare(PEG, PEGYahoo)) {
    		System.out.println("PEG " + PEG + " Is out of range of " + PEGYahoo);
    		test.log(LogStatus.FAIL, "PEG " + PEG + " Is out of range of " + PEGYahoo);	
    	} */
    	else {
    		System.out.println("All values are in an accaptable range");
    		test.log(LogStatus.PASS, "All values are in an accaptable range");	
    	}
    }
    
    @Test
    public void DataTest8035() throws InterruptedException {
    	String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = report.startTest(nameofCurrMethod);
    	CompDataSearchJPY("8035");
    	Double Price = getPrice();
    	Double MktCap = getMktCap();
    	Double REV = getREV();
    	Double Earnings = getEarnings();
    	Double EPS = getEPS();
    	Double DIV = getDIV();
    	Double PE = getPE();
    	Double PEG = getPEG();
    	//Go to Yahoo and get MKT CAP from homepage
    	YahooData("8035.T");
    	Double MktCapYahoo = getYahooMktCap();
    	Double PriceYahoo = getYahooPrice("8035.T");
    	Double REVYahoo = getYahooREV();
    	Double EarningsYahoo = getYahooEarnings();
    	Double EPSYahoo = getYahooEPS();
    	Double DIVYahoo = getYahooDIV();
    	Double PEYahoo = getYahooPE();
    	Double PEGYahoo = getYahooPEG();
    	if (!Compare(Price, PriceYahoo)) {
    		System.out.println("Price " + Price + " Is out of range of " + PriceYahoo);
    		test.log(LogStatus.FAIL, "Price " + Price + " Is out of range of " + PriceYahoo);
    	}
    	else if (!Compare(MktCap, MktCapYahoo)) {
    		System.out.println("MktCap " + MktCap + " Is out of range of " + MktCapYahoo);
    		test.log(LogStatus.FAIL, "MktCap " + MktCap + " Is out of range of " + MktCapYahoo);	
    	}
    	else if (!Compare(REV, REVYahoo)) {
    		System.out.println("REV " + REV + " Is out of range of " + REVYahoo);
    		test.log(LogStatus.FAIL, "REV " + REV + " Is out of range of " + REVYahoo);	
    	}
    	else if (!Compare(Earnings, EarningsYahoo)) {
    		System.out.println("Earnings " + Earnings + " Is out of range of " + EarningsYahoo);
    		test.log(LogStatus.FAIL, "Earnings " + Earnings + " Is out of range of " + EarningsYahoo);	
    	}
    	else if (!CompareEPS(EPS, EPSYahoo)) {
    		System.out.println("EPS " + EPS + " Is out of range of " + EPSYahoo);
    		test.log(LogStatus.FAIL, "EPS " + EPS + " Is out of range of " + EPSYahoo);	
    	}
    	else if (!Compare(DIV, DIVYahoo)) {
    		System.out.println("DIV " + DIV + " Is out of range of " + DIVYahoo);
    		test.log(LogStatus.FAIL, "DIV " + DIV + " Is out of range of " + DIVYahoo);	
    	}
    	else if (!Compare(PE, PEYahoo)) {
    		System.out.println("PE " + PE + " Is out of range of " + PEYahoo);
    		test.log(LogStatus.FAIL, "PE " + PE + " Is out of range of " + PEYahoo);	
    	}
    	else if (!Compare(PEG, PEGYahoo)) {
    		System.out.println("PEG " + PEG + " Is out of range of " + PEGYahoo);
    		test.log(LogStatus.FAIL, "PEG " + PEG + " Is out of range of " + PEGYahoo);	
    	}
    	else {
    		System.out.println("All values are in an accaptable range");
    		test.log(LogStatus.PASS, "All values are in an accaptable range");	
    	}
    }
    
    @Test
    public void DataTestFSR() throws InterruptedException {
    	String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = report.startTest(nameofCurrMethod);
    	CompDataSearchFSR("FSR");
    	Double Price = getPrice();
    	Double MktCap = getMktCap();
    	Double REV = getREV();
    	Double Earnings = getEarnings();
    	Double EPS = getEPS();
    	Double DIV = getDIV();
    	Double PE = getPE();
  //  	Double PEG = getPEG();
    	//Go to Yahoo and get MKT CAP from homepage
    	YahooData("FSR.JO");
    	Double MktCapYahoo = getYahooMktCap();
    	Double PriceYahoo = getYahooPrice("FSR.JO");
    	Double REVYahoo = getYahooREV();
    	Double EarningsYahoo = getYahooEarnings();
    	Double EPSYahoo = getYahooEPS();
    	Double DIVYahoo = getYahooDIV();
    	Double PEYahoo = getYahooPE();
   // 	Double PEGYahoo = getYahooPEG();
    	if (!Compare(Price, PriceYahoo)) {
    		System.out.println("Price " + Price + " Is out of range of " + PriceYahoo);
    		test.log(LogStatus.FAIL, "Price " + Price + " Is out of range of " + PriceYahoo);
    	}
    	else if (!Compare(MktCap, MktCapYahoo)) {
    		System.out.println("MktCap " + MktCap + " Is out of range of " + MktCapYahoo);
    		test.log(LogStatus.FAIL, "MktCap " + MktCap + " Is out of range of " + MktCapYahoo);	
    	}
    	else if (!Compare(REV, REVYahoo)) {
    		System.out.println("REV " + REV + " Is out of range of " + REVYahoo);
    		test.log(LogStatus.FAIL, "REV " + REV + " Is out of range of " + REVYahoo);	
    	}
    	else if (!Compare(Earnings, EarningsYahoo)) {
    		System.out.println("Earnings " + Earnings + " Is out of range of " + EarningsYahoo);
    		test.log(LogStatus.FAIL, "Earnings " + Earnings + " Is out of range of " + EarningsYahoo);	
    	}
    	else if (!CompareEPS(EPS, EPSYahoo)) {
    		System.out.println("EPS " + EPS + " Is out of range of " + EPSYahoo);
    		test.log(LogStatus.FAIL, "EPS " + EPS + " Is out of range of " + EPSYahoo);	
    	}
    	else if (!Compare(DIV, DIVYahoo)) {
    		System.out.println("DIV " + DIV + " Is out of range of " + DIVYahoo);
    		test.log(LogStatus.FAIL, "DIV " + DIV + " Is out of range of " + DIVYahoo);	
    	}
    	else if (!Compare(PE, PEYahoo)) {
    		System.out.println("PE " + PE + " Is out of range of " + PEYahoo);
    		test.log(LogStatus.FAIL, "PE " + PE + " Is out of range of " + PEYahoo);	
    	}
   /* 	else if (!Compare(PEG, PEGYahoo)) {
    		System.out.println("PEG " + PEG + " Is out of range of " + PEGYahoo);
    		test.log(LogStatus.FAIL, "PEG " + PEG + " Is out of range of " + PEGYahoo);	
    	} */
    	else {
    		System.out.println("All values are in an accaptable range");
    		test.log(LogStatus.PASS, "All values are in an accaptable range");	
    	}
    }
    
    @Test
    public void DataTestBHP() throws InterruptedException {
    	String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = report.startTest(nameofCurrMethod);
    	CompDataSearchGBP("BHP");
    	Double Price = getPrice();
    	Double MktCap = getMktCap();
    	Double REV = getREV();
    	Double Earnings = getEarnings();
    	Double EPS = getEPS();
    	Double DIV = getDIV();
    	Double PE = getPE();
  //  	Double PEG = getPEG();
    	//Go to Yahoo and get MKT CAP from homepage
    	YahooData("BHP.L");
    	Double MktCapYahoo = getYahooMktCap();
    	Double PriceYahoo = getYahooPrice("BHP.L");
    	Double REVYahoo = getYahooREV();
    	Double EarningsYahoo = getYahooEarnings();
    	Double EPSYahoo = getYahooEPS();
    	Double DIVYahoo = getYahooDIV();
    	Double PEYahoo = getYahooPE();
   // 	Double PEGYahoo = getYahooPEG();
    	if (!Compare(Price, PriceYahoo)) {
    		System.out.println("Price " + Price + " Is out of range of " + PriceYahoo);
    		test.log(LogStatus.FAIL, "Price " + Price + " Is out of range of " + PriceYahoo);
    	}
    	else if (!Compare(MktCap, MktCapYahoo)) {
    		System.out.println("MktCap " + MktCap + " Is out of range of " + MktCapYahoo);
    		test.log(LogStatus.FAIL, "MktCap " + MktCap + " Is out of range of " + MktCapYahoo);	
    	}
    	else if (!Compare(REV, REVYahoo)) {
    		System.out.println("REV " + REV + " Is out of range of " + REVYahoo);
    		test.log(LogStatus.FAIL, "REV " + REV + " Is out of range of " + REVYahoo);	
    	}
    	else if (!Compare(Earnings, EarningsYahoo)) {
    		System.out.println("Earnings " + Earnings + " Is out of range of " + EarningsYahoo);
    		test.log(LogStatus.FAIL, "Earnings " + Earnings + " Is out of range of " + EarningsYahoo);	
    	}
    	else if (!CompareEPS(EPS, EPSYahoo)) {
    		System.out.println("EPS " + EPS + " Is out of range of " + EPSYahoo);
    		test.log(LogStatus.FAIL, "EPS " + EPS + " Is out of range of " + EPSYahoo);	
    	}
    	else if (!Compare(DIV, DIVYahoo)) {
    		System.out.println("DIV " + DIV + " Is out of range of " + DIVYahoo);
    		test.log(LogStatus.FAIL, "DIV " + DIV + " Is out of range of " + DIVYahoo);	
    	}
    	else if (!Compare(PE, PEYahoo)) {
    		System.out.println("PE " + PE + " Is out of range of " + PEYahoo);
    		test.log(LogStatus.FAIL, "PE " + PE + " Is out of range of " + PEYahoo);	
    	}
 /*   	else if (!Compare(PEG, PEGYahoo)) {
    		System.out.println("PEG " + PEG + " Is out of range of " + PEGYahoo);
    		test.log(LogStatus.FAIL, "PEG " + PEG + " Is out of range of " + PEGYahoo);	
    	} */
    	else {
    		System.out.println("All values are in an accaptable range");
    		test.log(LogStatus.PASS, "All values are in an accaptable range");	
    	}
    }
    
    @Test
    public void DataTestMELI() throws InterruptedException {
    	String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = report.startTest(nameofCurrMethod);
    	CompDataSearchUSD("MELI");
    	Double Price = getPrice();
    	Double MktCap = getMktCap();
    	Double REV = getREV();
    	Double Earnings = getEarnings();
    	Double EPS = getEPS();
    	Double DIV = getDIV();
    	Double PE = getPE();
    	Double PEG = getPEG();
    	//Go to Yahoo and get MKT CAP from homepage
    	YahooData("MELI");
    	Double MktCapYahoo = getYahooMktCap();
    	Double PriceYahoo = getYahooPrice("MELI");
    	Double REVYahoo = getYahooREV();
    	Double EarningsYahoo = getYahooEarnings();
    	Double EPSYahoo = getYahooEPS();
    	Double DIVYahoo = getYahooDIV();
    	Double PEYahoo = getYahooPE();
    	Double PEGYahoo = getYahooPEG();
    	if (!Compare(Price, PriceYahoo)) {
    		System.out.println("Price " + Price + " Is out of range of " + PriceYahoo);
    		test.log(LogStatus.FAIL, "Price " + Price + " Is out of range of " + PriceYahoo);
    	}
    	else if (!Compare(MktCap, MktCapYahoo)) {
    		System.out.println("MktCap " + MktCap + " Is out of range of " + MktCapYahoo);
    		test.log(LogStatus.FAIL, "MktCap " + MktCap + " Is out of range of " + MktCapYahoo);	
    	}
    	else if (!Compare(REV, REVYahoo)) {
    		System.out.println("REV " + REV + " Is out of range of " + REVYahoo);
    		test.log(LogStatus.FAIL, "REV " + REV + " Is out of range of " + REVYahoo);	
    	}
    	else if (!Compare(Earnings, EarningsYahoo)) {
    		System.out.println("Earnings " + Earnings + " Is out of range of " + EarningsYahoo);
    		test.log(LogStatus.FAIL, "Earnings " + Earnings + " Is out of range of " + EarningsYahoo);	
    	}
    	else if (!CompareEPS(EPS, EPSYahoo)) {
    		System.out.println("EPS " + EPS + " Is out of range of " + EPSYahoo);
    		test.log(LogStatus.FAIL, "EPS " + EPS + " Is out of range of " + EPSYahoo);	
    	}
    	else if (!Compare(DIV, DIVYahoo)) {
    		System.out.println("DIV " + DIV + " Is out of range of " + DIVYahoo);
    		test.log(LogStatus.FAIL, "DIV " + DIV + " Is out of range of " + DIVYahoo);	
    	}
    	else if (!Compare(PE, PEYahoo)) {
    		System.out.println("PE " + PE + " Is out of range of " + PEYahoo);
    		test.log(LogStatus.FAIL, "PE " + PE + " Is out of range of " + PEYahoo);	
    	}
    	else if (!Compare(PEG, PEGYahoo)) {
    		System.out.println("PEG " + PEG + " Is out of range of " + PEGYahoo);
    		test.log(LogStatus.FAIL, "PEG " + PEG + " Is out of range of " + PEGYahoo);	
    	} 
    	else {
    		System.out.println("All values are in an accaptable range");
    		test.log(LogStatus.PASS, "All values are in an accaptable range");	
    	}
    }
    
    @Test
    public void DataTestLULU() throws InterruptedException {
    	String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = report.startTest(nameofCurrMethod);
    	CompDataSearchUSD("LULU");
    	Double Price = getPrice();
    	Double MktCap = getMktCap();
    	Double REV = getREV();
    	Double Earnings = getEarnings();
    	Double EPS = getEPS();
  //  	Double DIV = getDIV();
    	Double PE = getPE();
    	Double PEG = getPEG();
    	//Go to Yahoo and get MKT CAP from homepage
    	YahooData("LULU");
    	Double MktCapYahoo = getYahooMktCap();
    	Double PriceYahoo = getYahooPrice("LULU");
    	Double REVYahoo = getYahooREV();
    	Double EarningsYahoo = getYahooEarnings();
    	Double EPSYahoo = getYahooEPS();
  //  	Double DIVYahoo = getYahooDIV();
    	Double PEYahoo = getYahooPE();
    	Double PEGYahoo = getYahooPEG();
    	if (!Compare(Price, PriceYahoo)) {
    		System.out.println("Price " + Price + " Is out of range of " + PriceYahoo);
    		test.log(LogStatus.FAIL, "Price " + Price + " Is out of range of " + PriceYahoo);
    	}
    	else if (!Compare(MktCap, MktCapYahoo)) {
    		System.out.println("MktCap " + MktCap + " Is out of range of " + MktCapYahoo);
    		test.log(LogStatus.FAIL, "MktCap " + MktCap + " Is out of range of " + MktCapYahoo);	
    	}
    	else if (!Compare(REV, REVYahoo)) {
    		System.out.println("REV " + REV + " Is out of range of " + REVYahoo);
    		test.log(LogStatus.FAIL, "REV " + REV + " Is out of range of " + REVYahoo);	
    	}
    	else if (!Compare(Earnings, EarningsYahoo)) {
    		System.out.println("Earnings " + Earnings + " Is out of range of " + EarningsYahoo);
    		test.log(LogStatus.FAIL, "Earnings " + Earnings + " Is out of range of " + EarningsYahoo);	
    	}
    	else if (!CompareEPS(EPS, EPSYahoo)) {
    		System.out.println("EPS " + EPS + " Is out of range of " + EPSYahoo);
    		test.log(LogStatus.FAIL, "EPS " + EPS + " Is out of range of " + EPSYahoo);	
    	}
  /*  	else if (!Compare(DIV, DIVYahoo)) {
    		System.out.println("DIV " + DIV + " Is out of range of " + DIVYahoo);
    		test.log(LogStatus.FAIL, "DIV " + DIV + " Is out of range of " + DIVYahoo);	
    	} */
    	else if (!Compare(PE, PEYahoo)) {
    		System.out.println("PE " + PE + " Is out of range of " + PEYahoo);
    		test.log(LogStatus.FAIL, "PE " + PE + " Is out of range of " + PEYahoo);	
    	}
    	else if (!Compare(PEG, PEGYahoo)) {
    		System.out.println("PEG " + PEG + " Is out of range of " + PEGYahoo);
    		test.log(LogStatus.FAIL, "PEG " + PEG + " Is out of range of " + PEGYahoo);	
    	} 
    	else {
    		System.out.println("All values are in an accaptable range");
    		test.log(LogStatus.PASS, "All values are in an accaptable range");	
    	}
    }
    
    @Test
    public void DataTestASURB() throws InterruptedException {
    	String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = report.startTest(nameofCurrMethod);
    	CompDataSearchMXN("ASURB");
    	Double Price = getPrice();
    	Double MktCap = getMktCap();
    	Double REV = getREV();
    	Double Earnings = getEarnings();
    	Double EPS = getEPS();
    	Double DIV = getDIV();
    	Double PE = getPE();
//    	Double PEG = getPEG();
    	//Go to Yahoo and get MKT CAP from homepage
    	YahooData("ASURB.MX");
    	Double MktCapYahoo = getYahooMktCap();
    	Double PriceYahoo = getYahooPrice("ASURB.MX");
    	Double REVYahoo = getYahooREV();
    	Double EarningsYahoo = getYahooEarnings();
    	Double EPSYahoo = getYahooEPS();
    	Double DIVYahoo = getYahooDIV();
    	Double PEYahoo = getYahooPE();
//    	Double PEGYahoo = getYahooPEG();
    	if (!Compare(Price, PriceYahoo)) {
    		System.out.println("Price " + Price + " Is out of range of " + PriceYahoo);
    		test.log(LogStatus.FAIL, "Price " + Price + " Is out of range of " + PriceYahoo);
    	}
    	else if (!Compare(MktCap, MktCapYahoo)) {
    		System.out.println("MktCap " + MktCap + " Is out of range of " + MktCapYahoo);
    		test.log(LogStatus.FAIL, "MktCap " + MktCap + " Is out of range of " + MktCapYahoo);	
    	}
    	else if (!Compare(REV, REVYahoo)) {
    		System.out.println("REV " + REV + " Is out of range of " + REVYahoo);
    		test.log(LogStatus.FAIL, "REV " + REV + " Is out of range of " + REVYahoo);	
    	}
    	else if (!Compare(Earnings, EarningsYahoo)) {
    		System.out.println("Earnings " + Earnings + " Is out of range of " + EarningsYahoo);
    		test.log(LogStatus.FAIL, "Earnings " + Earnings + " Is out of range of " + EarningsYahoo);	
    	}
    	else if (!CompareEPS(EPS, EPSYahoo)) {
    		System.out.println("EPS " + EPS + " Is out of range of " + EPSYahoo);
    		test.log(LogStatus.FAIL, "EPS " + EPS + " Is out of range of " + EPSYahoo);	
    	}
  /*  	else if (!Compare(DIV, DIVYahoo)) {
    		System.out.println("DIV " + DIV + " Is out of range of " + DIVYahoo);
    		test.log(LogStatus.FAIL, "DIV " + DIV + " Is out of range of " + DIVYahoo);	
    	} */
    	else if (!Compare(PE, PEYahoo)) {
    		System.out.println("PE " + PE + " Is out of range of " + PEYahoo);
    		test.log(LogStatus.FAIL, "PE " + PE + " Is out of range of " + PEYahoo);	
    	}
  /*  	else if (!Compare(PEG, PEGYahoo)) {
    		System.out.println("PEG " + PEG + " Is out of range of " + PEGYahoo);
    		test.log(LogStatus.FAIL, "PEG " + PEG + " Is out of range of " + PEGYahoo);	
    	} */
    	else {
    		System.out.println("All values are in an accaptable range");
    		test.log(LogStatus.PASS, "All values are in an accaptable range");	
    	}
    }
    
    @Test
    public void DataTestBBAS3() throws InterruptedException {
    	String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = report.startTest(nameofCurrMethod);
    	CompDataSearchBRL("BBAS3");
    	Double Price = getPrice();
    	Double MktCap = getMktCap();
    	Double REV = getREV();
    	Double Earnings = getEarnings();
    	Double EPS = getEPS();
    	Double DIV = getDIV();
    	Double PE = getPE();
 //   	Double PEG = getPEG();
    	//Go to Yahoo and get MKT CAP from homepage
    	YahooData("BBAS3.SA");
    	Double MktCapYahoo = getYahooMktCap();
    	Double PriceYahoo = getYahooPrice("BBAS3.SA");
    	Double REVYahoo = getYahooREV();
    	Double EarningsYahoo = getYahooEarnings();
    	Double EPSYahoo = getYahooEPS();
    	Double DIVYahoo = getYahooDIV();
    	Double PEYahoo = getYahooPE();
 //   	Double PEGYahoo = getYahooPEG();
    	if (!Compare(Price, PriceYahoo)) {
    		System.out.println("Price " + Price + " Is out of range of " + PriceYahoo);
    		test.log(LogStatus.FAIL, "Price " + Price + " Is out of range of " + PriceYahoo);
    	}
    	else if (!Compare(MktCap, MktCapYahoo)) {
    		System.out.println("MktCap " + MktCap + " Is out of range of " + MktCapYahoo);
    		test.log(LogStatus.FAIL, "MktCap " + MktCap + " Is out of range of " + MktCapYahoo);	
    	}
    	else if (!Compare(REV, REVYahoo)) {
    		System.out.println("REV " + REV + " Is out of range of " + REVYahoo);
    		test.log(LogStatus.FAIL, "REV " + REV + " Is out of range of " + REVYahoo);	
    	}
    	else if (!Compare(Earnings, EarningsYahoo)) {
    		System.out.println("Earnings " + Earnings + " Is out of range of " + EarningsYahoo);
    		test.log(LogStatus.FAIL, "Earnings " + Earnings + " Is out of range of " + EarningsYahoo);	
    	}
    	else if (!CompareEPS(EPS, EPSYahoo)) {
    		System.out.println("EPS " + EPS + " Is out of range of " + EPSYahoo);
    		test.log(LogStatus.FAIL, "EPS " + EPS + " Is out of range of " + EPSYahoo);	
    	}
    	else if (!Compare(DIV, DIVYahoo)) {
    		System.out.println("DIV " + DIV + " Is out of range of " + DIVYahoo);
    		test.log(LogStatus.FAIL, "DIV " + DIV + " Is out of range of " + DIVYahoo);	
    	} 
    	else if (!Compare(PE, PEYahoo)) {
    		System.out.println("PE " + PE + " Is out of range of " + PEYahoo);
    		test.log(LogStatus.FAIL, "PE " + PE + " Is out of range of " + PEYahoo);	
    	}
   /* 	else if (!Compare(PEG, PEGYahoo)) {
    		System.out.println("PEG " + PEG + " Is out of range of " + PEGYahoo);
    		test.log(LogStatus.FAIL, "PEG " + PEG + " Is out of range of " + PEGYahoo);	
    	} */
    	else {
    		System.out.println("All values are in an accaptable range");
    		test.log(LogStatus.PASS, "All values are in an accaptable range");	
    	}
    }
    
    
}
