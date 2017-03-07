package FirstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {
	
	public static void main(String[] args){
		
		//Firefox
//		System.setProperty("webdriver.firefox.bin", 
	//			"C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	//	WebDriver driver = new FirefoxDriver();
	//	driver.navigate().to("https://www.google.com");
		
		//chrome
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Bjay\\Dropbox\\Selenuim Resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		
		// use JExcel to import user name password from excel itself
}fas;ldjf;apsf;sladfa;ldhdapshfladp;asjdahsf
}