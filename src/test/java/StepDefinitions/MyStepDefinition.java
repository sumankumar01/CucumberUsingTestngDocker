package StepDefinitions;




import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class MyStepDefinition {
	
	//private ExtentTest step;
	
	/*public MyStepDefinition(TestContext context) {
		testContext = context;
		
		//querryobjects=new BFrameworkQueryObjects();
		
		 
	}*/
	
	WebDriver driver;
	
/*	public MyStepDefinition(Shareobjects context) {
		context = context;
		registrationPage = context.getPageObjectManager().registrationobjectPage();
	
		driver=RegistrationPage.driver;
		//BFrameworkQueryObjects=
		//querryobjects=new BFrameworkQueryObjects();
		
		 
	}
	*/
	
	@Given("I am on rhp Flight egestration page")
	public void i_am_on_rhp_Flight_egestration_page() throws MalformedURLException, SocketException, InterruptedException {
		

		new DesiredCapabilities();
		// DesiredCapabilities dc = DesiredCapabilities.chrome();
		 DesiredCapabilities dc = DesiredCapabilities.chrome();
		 dc.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
		    dc.setCapability(CapabilityType.PLATFORM, Platform.LINUX);
		    
	      /*  if (System.getProperty("browser").equals("firefox"))
	            dc = DesiredCapabilities.firefox();
*///dc.setCapability("something", true);

ChromeOptions options = new ChromeOptions();
options.addArguments("--no-sandbox");
options.setAcceptInsecureCerts(true);
options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
//options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
/*options.setCapability(CapabilityType.PLATFORM_NAME, Platfoptionsorm.WINDOWS);
options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);*/
//options.merge(dc);

Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
for (NetworkInterface netint : Collections.list(nets))
{ Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
	for (InetAddress inetAddress : Collections.list(inetAddresses)) {
		System.out.printf("InetAddress: %s\n", inetAddress);
    }
}


InetAddress IP=InetAddress.getLoopbackAddress();
System.out.println(IP);
RemoteWebDriver  driver = new RemoteWebDriver(new URL("http://192.168.3.12:4444/wd/hub"), dc);
	        driver.get("https://stackoverflow.com/questions/50042753/how-to-build-docker-images-using-a-declarative-jenkinsfile");
	        Thread.sleep(10000);
	        System.out.printf(driver.getCurrentUrl());
	        Thread.sleep(10000);
	        driver.get("https://stackoverflow.com/questions/50042753/how-to-build-docker-images-using-a-declarative-jenkinsfile");
	        Thread.sleep(10000);
	        
	        System.out.printf(driver.getCurrentUrl());
	        Thread.sleep(10000);
	        driver.get("https://stackoverflow.com/questions/50042753/how-to-build-docker-images-using-a-declarative-jenkinsfile");
	        Thread.sleep(10000);
	        System.out.printf(driver.getCurrentUrl());
	        driver.get("https://stackoverflow.com/questions/50042753/how-to-build-docker-images-using-a-declarative-jenkinsfile");
	        Thread.sleep(10000);
	        System.out.printf(driver.getCurrentUrl());
	        Thread.sleep(10000);
	        driver.get("https://stackoverflow.com/questions/50042753/how-to-build-docker-images-using-a-declarative-jenkinsfile");
	        Thread.sleep(10000);
	        System.out.printf(driver.getCurrentUrl());
	        Thread.sleep(10000);
	
		 /*Reporter.addStepLog("running step I am on rhp Flight egestration page");
		 Reporter.addStepLog("running step I am on rhp Flight egestration page................");*/
	}

	@When("Enter the information of User")
	public void enter_the_information_of_User() {
		//ExtentTestManager.childstartTest("Enter the information of User");
		
		 /*Reporter.addStepLog("running step Enter the information of User");
		 Reporter.addStepLog("running step Enter the information of User................");*/
	}

	@Then("Registration should be successfull")
	public void registration_should_be_successfull() {
		//ExtentTestManager.childstartTest("Registration should be successfull");
		//assertTrue("not match", false);
	}
    
    public static String right(String value, int length) {
		// To get right characters from a string, change the begin index.
		return value.substring(value.length() - length);
	}

}