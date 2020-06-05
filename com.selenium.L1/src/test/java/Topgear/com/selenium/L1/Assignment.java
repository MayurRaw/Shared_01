package Topgear.com.selenium.L1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.ExcelUtils;

public class Assignment {

	WebDriver driver = null;
	static ExcelUtils excel;
	static String projectPath = System.getProperty("user.dir");

	@BeforeMethod
	void setUpMethod() {

		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath + "/Resources/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	void test1() {

		excel = new ExcelUtils(projectPath + "/excel/testdata.xlsx", "Sheet1");
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();

		System.out.println(ExcelUtils.getCellDataString(1, 0));
		driver.findElement(By.id("input-email")).sendKeys(ExcelUtils.getCellDataString(1, 0));
		driver.findElement(By.name("password")).sendKeys(ExcelUtils.getCellDataString(1, 1));

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();
		// driver.findElement(By.xpath("")).click();
		// driver.findElement(By.xpath("")).click();
		// driver.findElement(By.xpath("")).click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	void test2() {

		excel = new ExcelUtils(projectPath + "/excel/testdata.xlsx", "Sheet1");
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();

		System.out.println(ExcelUtils.getCellDataString(1, 0));
		driver.findElement(By.id("input-email")).sendKeys(ExcelUtils.getCellDataString(1, 0));
		driver.findElement(By.name("password")).sendKeys(ExcelUtils.getCellDataString(1, 1));

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();
		// driver.findElement(By.xpath("")).click();
		// driver.findElement(By.xpath("")).click();
		// driver.findElement(By.xpath("")).click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	void tearDownMethod() {
		driver.close();
		// driver.quit();
	}

}
