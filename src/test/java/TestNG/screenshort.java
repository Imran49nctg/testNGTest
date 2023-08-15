package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshort {

	public static void main(String[] args) {
		//Specify the path to your chrome driver
		System.setProperty("webdriver.chrome.driver", "Path_to_your_chrome_driver");
		// Instantiate chrome driver object
		WebDriver driver = new ChromeDriver();
		// Navigate to the testim website
		driver.get("https://www.testim.io/");
		//Use TakesScreenshot method to capture screenshot
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		//Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		//Path to the location to save screenshot
		FileUtils.copyFile(source, new File("./SeleniumScreenshots/Screen.png"));
		System.out.println("Screenshot is captured");
		driver.quit();
		}
		

	}

