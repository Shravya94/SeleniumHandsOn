package StepDefination;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepdefination {
	WebDriver driver = hooks.driver;
	Actions action = hooks.action;
	String clicklnk = Keys.chord(Keys.CONTROL, Keys.ENTER);
	// -------------------------------------------------------------------------------------------------------------------
	/*
	 * // check code
	 * 
	 * @Given("^User is at the NSE page$") public void user_is_at_the_nse_page()
	 * throws Throwable { driver.get("https://time.ibm.com/");
	 * driver.manage().window().maximize(); WebDriverWait wait = new
	 * WebDriverWait(driver, 90);
	 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id("credsDiv")));
	 * // *[@id="credentialSignin"]
	 * driver.findElement(By.id("credentialSignin")).click(); //
	 * driver.findElement(By.id("credsDiv")).click();
	 * driver.findElement(By.id("user-name-input")).sendKeys("shravra1@in.ibm.com");
	 * driver.findElement(By.id("password-input")).sendKeys("Dimpi$9480338227");
	 * driver.findElement(By.id("login-button")).click();
	 * 
	 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
	 * "//button[contains(.,'Close')]")));
	 * driver.findElement(By.xpath("//button[contains(.,'Close')]")).click();
	 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(
	 * "week-ending-arrow-next")));
	 * driver.findElement(By.id("week-ending-arrow-next")).click();
	 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(
	 * "btn-copy-prev-week")));
	 * driver.findElement(By.id("btn-copy-prev-week")).click();
	 * driver.findElement(By.xpath("//*[text()='Ok']")).click();
	 * wait.until(ExpectedConditions.presenceOfElementLocated(By.
	 * xpath("//*[@class='border ng-star-inserted']"))); Thread.sleep(2000);
	 * driver.findElement(By.xpath("//div[3]/div[2]/div/span/app-hour-renderer/span"
	 * )).click();
	 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9");
	 * Thread.sleep(1000); Actions act = new Actions(driver);
	 * act.sendKeys(Keys.TAB); act.sendKeys("9"); act.sendKeys(Keys.TAB);
	 * act.sendKeys("9"); act.sendKeys(Keys.TAB); act.sendKeys("9");
	 * act.sendKeys(Keys.TAB); act.sendKeys("9"); act.sendKeys(Keys.TAB);
	 * 
	 * }
	 * 
	 * @When("^User vists Corporate Announcement$") public void
	 * user_vists_corporate_announcement() throws Throwable {
	 * 
	 * }
	 * 
	 * @Then("^User gets the first company details$") public void
	 * user_gets_the_first_company_details() throws Throwable {
	 * 
	 * }
	 * 
	 * @And("^User gets the second company details$") public void
	 * user_gets_the_second_company_details() throws Throwable {
	 * 
	 * }
	 * 
	 * @And("^User gets the third company details$") public void
	 * user_gets_the_third_company_details() throws Throwable {
	 * 
	 * }
	 * 
	 * @And("^User gets the fourth company details$") public void
	 * user_gets_the_fourth_company_details() throws Throwable {
	 * 
	 * }
	 */
	// -------------------------------------------------------------------------------------------------------------------

	// scenario1

	@Given("^User is at the NSE page1$")
	public void user_is_at_the_nse_page1() throws Throwable {
		System.out.println("--------------------------------------------------------------------------------");
		driver.get("https://www.nseindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(9000);
		driver.manage().deleteAllCookies();
		System.out.println("User is at the NSE page");
		Robot robot = new Robot();
		for (int i = 1; i <= 3; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_MINUS);
		}
	}

	@When("^User vists Corporate Announcement$")
	public void user_vists_corporate_announcement() throws Throwable {
		Thread.sleep(9000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//figure/a/img"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(9000);
		System.out.println("User vists Corporate Announcement");
	}

	@Then("^User gets the first company details$")
	public void user_gets_the_first_company_details() throws Throwable {
		Thread.sleep(9000);
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='corporate-announce']")));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("---------------------");
		String c1 = driver.findElement(By.xpath("//div[@id='slick-slide60']/div")).getText();
		c1.replace("Download", "");
		System.out.println("company1: " + c1);
		driver.findElement(By.xpath("//*[@id='slick-slide60']//a")).sendKeys(clicklnk);
		Thread.sleep(4000);
		System.out.println("User gets the first company details");

	}

	@And("^User gets the second company details$")
	public void user_gets_the_second_company_details() throws Throwable {
		System.out.println("---------------------");
		String c1 = driver.findElement(By.xpath("//div[@id='slick-slide61']/div")).getText();
		c1.replace("Download", "");
		System.out.println("company1: " + c1);
		driver.findElement(By.xpath("//*[@id='slick-slide61']//a")).sendKeys(clicklnk);
		Thread.sleep(4000);
		System.out.println("User gets the second company details");
	}

	@And("^User gets the third company details$")
	public void user_gets_the_third_company_details() throws Throwable {
		System.out.println("---------------------");
		String c1 = driver.findElement(By.xpath("//div[@id='slick-slide62']/div")).getText();
		c1.replace("Download", "");
		System.out.println("company1: " + c1);
		driver.findElement(By.xpath("//*[@id='slick-slide62']//a")).sendKeys(clicklnk);
		Thread.sleep(4000);
		System.out.println("User gets the third company details");
	}

	@And("^User gets the fourth company details$")
	public void user_gets_the_fourth_company_details() throws Throwable {
		System.out.println("---------------------");
		String c1 = driver.findElement(By.xpath("//div[@id='slick-slide63']/div")).getText();
		c1.replace("Download", "");
		System.out.println("company1: " + c1);
		driver.findElement(By.xpath("//*[@id='slick-slide63']//a")).sendKeys(clicklnk);
		Thread.sleep(4000);
		System.out.println("User gets the fourth company details");
		System.out.println("--------------------------------------------------------------------------------");
	}

//	// -------------------------------------------------------------------------------------------------------------------
//	// scenario2
	@Given("^User is at the NSE page2$")
	public void user_is_at_the_nse_page2() throws Throwable {
		driver.get("https://www.nseindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(9000);
		System.out.println("User is at the NSE page");
	}

	@When("^User vists Comapny directory$")
	public void user_vists_comapny_directory() throws Throwable {

		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("(//a[contains(text(),'Invest')])[4]")).click();
		System.out.println("investS");
		Thread.sleep(9000);
//		
//		  Consumer<By> hover = (By by) -> {
//		  action.moveToElement(driver.findElement(By.xpath(
//		  "(//a[contains(text(),'Invest')])[4]"))).perform(); };
//		  hover.accept(By.linkText("Company Directory")); Consumer<By> hover1 = (By by)
//		  -> { action.moveToElement(driver.findElement(By.
//		  xpath("//a[contains(text(),'Company Directory')]"))).click() .perform(); };
//		  hover1.accept(By.linkText("Company Directory"));
//		 
		driver.findElement(By.xpath("//a[contains(text(),'Company Directory')]")).click();
		System.out.println("investclcick");
//		 WebElement subMenu =
//		  driver.findElement(By.xpath("//a[contains(text(),'Company Directory')]"));
//		  action.moveToElement(subMenu); action.click().build().perform();
//		  
//		  // action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'
//		  Company // Directory')]"))).click().build() // .perform();
//		 

		Thread.sleep(9000);
		// driver.findElement(By.xpath("//a[contains(text(),'Company
		// Directory')]")).click();
		// Thread.sleep(9000);
//		
//		  String winHandleBefore = driver.getWindowHandle(); for (String winHandle :
//		  driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
//		 
		System.out.println("User vists Comapny directory");
	}

	@Then("^User searches for a company details$")
	public void user_searches_for_a_company_details() throws Throwable {
		Thread.sleep(9000);
		driver.manage().deleteAllCookies();
		// String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		driver.manage().deleteAllCookies();
		driver.findElement(By.linkText("Click here to Open Company Directory")).click();
		// String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		Thread.sleep(2000);
		// driver.findElement(By.id("CREquityInput")).click();
		// System.out.println("clicked");
		// driver.findElement(By.id("CREquityInput")).click();

		// JavascriptExecutor js = (JavascriptExecutor) driver; WebElement ele =
		// driver.findElement(By.linkText("Insider Trading"));
		// js.executeScript("arguments[0].scrollIntoView(true);", ele);

		driver.manage().deleteAllCookies();
		// driver.findElement(By.linkText("Refresh")).click();
		driver.findElement(By.xpath("//*[@id=\"CREquityInput\"]")).sendKeys("TATA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p/span[contains(.,'TATA Steel ')]")).click();
		Thread.sleep(2000);
		// driver.findElement(
		// By.xpath("//button[starts-with(@onclick,\"companyDirectoryFilter('equities',
		// 'CREquityInput')\")]"))
		// .click();
		// WebElement button =
		// driver.findElement(By.xpath("//button[contains(text(),'GO')]"));
		// driver.executeScript("arguments[0].click();", button);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'GO')]")));

		WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'GO')]"));
		String javascript = "arguments[0].click()";
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript(javascript, loginBtn);

//		Consumer<By> hover = (By by) -> {
//			action.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'GO')]"))).perform();
//		};
//		hover.accept(By.xpath("//button[contains(text(),'GO')]"));
//		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'GO')]"));
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click();", element);
//		driver.findElement(By.xpath("//button[contains(text(),'GO')]")).sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//button[contains(text(),'GO')]")).click();
		System.out.println("button clicked");
		Thread.sleep(9000);
		System.out.println("User searches for a company details");
	}

	@And("^User stores company details$")
	public void user_stores_company_details() throws Throwable {
		List<WebElement> irows = driver.findElements(By.xpath("//*[@id='CFcorpComDirEquityTable']/tbody/tr"));
		int iRowsCount = irows.size();
		List<WebElement> icols = driver.findElements(By.xpath("//*[@id='CFcorpComDirEquityTable']/tbody/tr[1]/td"));
		int iColsCount = icols.size();
		System.out.println("Selected web table has " + iRowsCount + " Rows and " + iColsCount + " Columns");
		System.out.println();

		FileOutputStream fos = new FileOutputStream("C://WebTableTOSpreedsheet.xlsx");

		XSSFWorkbook wkb = new XSSFWorkbook();
		XSSFSheet sheet1 = wkb.createSheet("CompanyDetails");
		for (int j = 1; j <= iColsCount; j++) {
			WebElement val = driver
					.findElement(By.xpath("//*[@id='CFcorpComDirEquityTable']/thead/tr[1]/th[" + j + "]"));
			String a = val.getText();
			System.out.print(a);

			XSSFRow excelRow = sheet1.createRow(1);
			XSSFCell excelCell = excelRow.createCell(j);
			excelCell.setCellType(XSSFCell.CELL_TYPE_STRING);
			excelCell.setCellValue(a);

			// wkb.write(fos);
			// XSSFRow excelRow = sheet1.createRow(1);
		}
		for (int i = 1; i <= iRowsCount; i++) {
			XSSFRow excelRow = sheet1.createRow(i + 1);
			for (int j = 1; j <= iColsCount; j++) {
				WebElement val = driver
						.findElement(By.xpath("//*[@id='CFcorpComDirEquityTable']/tbody/tr[" + i + "]/td[" + j + "]"));
				String a = val.getText();
				System.out.print(a);

				// XSSFRow excelRow = sheet1.createRow(i+1);
				XSSFCell excelCell = excelRow.createCell(j);
				excelCell.setCellType(XSSFCell.CELL_TYPE_STRING);
				excelCell.setCellValue(a);

				// wkb.write(fos);
			}
		}
		System.out.println();

		fos.flush();
		wkb.write(fos);
		fos.close();
		/*
		 * File file = new
		 * File("C:\\Users\\ShravyaRai\\Desktop\\SeleniumOutput\\output.xls");
		 * FileOutputStream fos = new
		 * FileOutputStream("C:\\Users\\ShravyaRai\\Desktop\\SeleniumOutput\\output.xls"
		 * );
		 * 
		 * XSSFWorkbook wkb = new XSSFWorkbook(); XSSFSheet sheet1 =
		 * wkb.createSheet("Company Directory`");
		 * 
		 * WebElement mytable = driver.findElement(By.id("CFcorpComDirEquityTable"));
		 * 
		 * List<WebElement> rows_table = mytable.findElements(By.tagName("tr")); int
		 * rows_count = rows_table.size(); System.out.println("Number of Rows " +
		 * rows_count); for (int row = 0; row < rows_count; row++) {
		 * 
		 * XSSFRow excelRow = sheet1.createRow(row); if (row == 0) { List<WebElement>
		 * head_row = rows_table.get(row).findElements(By.tagName("th")); int Head_count
		 * = head_row.size(); System.out.println("Number of Header cells In Row 0 are "
		 * + Head_count);
		 * 
		 * for (int i = 0; i < Head_count; i++) { XSSFCell excelCell =
		 * excelRow.createCell(i); excelCell.setCellType(XSSFCell.CELL_TYPE_STRING);
		 * String celtext = head_row.get(i).getText(); excelCell.setCellValue(celtext);
		 * System.out.println("Header in valuein column number " + i + " Is " +
		 * celtext); }
		 * 
		 * } else { List<WebElement> Columns_row =
		 * rows_table.get(row).findElements(By.tagName("td")); int columns_count =
		 * Columns_row.size(); System.out.println("Number of cells In Row " + row +
		 * " are " + columns_count);
		 * 
		 * for (int column = 0; column < columns_count; column++) { XSSFCell excelCell =
		 * excelRow.createCell(column);
		 * excelCell.setCellType(XSSFCell.CELL_TYPE_STRING); String celtext =
		 * Columns_row.get(column).getText(); excelCell.setCellValue(celtext);
		 * System.out.println( "Cell Value Of row number " + row + " and column number "
		 * + column + " Is " + celtext); }
		 * 
		 * } System.out.println("--------------------------------------------------"); }
		 * try { fos.flush(); wkb.write(fos); fos.close();
		 * 
		 * System.out.println("Excel written successfully..");
		 * 
		 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
		 * e) { e.printStackTrace(); }
		 */

		System.out.println("User stores company details");
	}

//	// -------------------------------------------------------------------------------------------------------------------
//scenario 3
	@Given("^User is at the NSE page3$")
	public void user_is_at_the_nse_page3() throws Throwable {
		System.out.println("--------------------------------------------------------------------------------");
		driver.get("https://www.nseindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(9000);
		System.out.println("User is at the NSE page");
	}

	@When("^User vists Clearing Holidays page$")
	public void user_vists_clearing_holidays_page() throws Throwable {
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//a[contains(text(),'Resources')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Holidays")).click();
		driver.findElement(By.linkText("Clearing Holidays")).click();
	}

	@Then("^User stores the holiday details$")
	public void user_stores_the_holiday_details() throws Throwable {
		File file = new File("C:\\Users\\ShravyaRai\\Desktop\\SeleniumOutput\\output1.xls");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ShravyaRai\\Desktop\\SeleniumOutput\\output1.xlsx");

		XSSFWorkbook wkb = new XSSFWorkbook();
		XSSFSheet sheet1 = wkb.createSheet("Holidays");

		WebElement mytable = driver.findElement(By.id("table-holiday-clearing"));

		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		int rows_count = rows_table.size();
		System.out.println("Number of Rows " + rows_count);

		for (int row = 0; row < rows_count; row++) {

			XSSFRow excelRow = sheet1.createRow(row);
			if (row == 0) {
				List<WebElement> head_row = rows_table.get(row).findElements(By.tagName("th"));
				int Head_count = head_row.size();
				System.out.println("Number of Header cells In Row 0 are " + Head_count);

				for (int i = 0; i < Head_count; i++) {
					XSSFCell excelCell = excelRow.createCell(i);
					excelCell.setCellType(XSSFCell.CELL_TYPE_STRING);
					String celtext = head_row.get(i).getText();
					excelCell.setCellValue(celtext);
					System.out.println("Header in valuein column number " + i + " Is " + celtext);
				}

			} else {
				List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
				int columns_count = Columns_row.size();
				System.out.println("Number of cells In Row " + row + " are " + columns_count);

				for (int column = 0; column < columns_count; column++) {
					XSSFCell excelCell = excelRow.createCell(column);
					excelCell.setCellType(XSSFCell.CELL_TYPE_STRING);
					String celtext = Columns_row.get(column).getText();
					excelCell.setCellValue(celtext);
					System.out.println(
							"Cell Value Of row number " + row + " and column number " + column + " Is " + celtext);
				}

			}
			System.out.println("--------------------------------------------------");
		}
		try {
			fos.flush();
			wkb.write(fos);
			fos.close();

			System.out.println("Excel written successfully..");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("User stores Holiday details");

	}

//	// -------------------------------------------------------------------------------------------------------------------
////scenario 4
	@Given("^User is at the NSE page4$")
	public void user_is_at_the_nse_page4() throws Throwable {
		System.out.println("--------------------------------------------------------------------------------");
		driver.get("https://www.nseindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		Robot robot = new Robot();
		for (int i = 1; i <= 3; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_MINUS);
		}
		Thread.sleep(4000);
		System.out.println("User is at the NSE page");
	}

	@When("^User vists Currency and Commodities Course page$")
	public void user_vists_currency_and_commodities_course_page() throws Throwable {
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//a[contains(text(),'Learn')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Class Room Courses")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Currency and Commodities')])[3]")).click();
		System.out.println("User vists Currency and Commodities Course page");
	}

	@Then("^User checks the course details$")
	public void user_checks_the_course_details() throws Throwable {
		System.out.println("-------------------------");
		String duration = driver.findElement(By.xpath("//td[1]")).getText();
		System.out.println("Course Duration: " + duration);
		Thread.sleep(9000);
		System.out.println("-------------------------");
		String overview = driver.findElement(By.xpath("//div[@class='tab-pane active']/div/p")).getText();
		System.out.println("Overview: " + overview);
		System.out.println("-------------------------");
		driver.findElement(By.linkText("COURSE OUTLINE")).click();
		Thread.sleep(1000);
		System.out.println("COURSE OUTLINE: ");

		WebElement text = driver.findElement(By.xpath("//div[@class='tab-pane active show']/div/ul"));
		List<WebElement> t1 = text.findElements(By.tagName("li"));
		for (int i = 1; i < t1.size(); i++) {
			System.out.println(t1.get(i).getText());
		}
		System.out.println("-------------------------");
		driver.findElement(By.linkText("COURSE OFFERING")).click();
		Thread.sleep(1000);
		System.out.println("COURSE OFFERING: ");
		WebElement text1 = driver.findElement(By.xpath("//div[@class='tab-pane active show']/div/ul"));
		List<WebElement> t2 = text1.findElements(By.tagName("li"));
		for (int i = 1; i < t2.size(); i++) {
			System.out.println(t2.get(i).getText());
		}
		System.out.println("-------------------------");
		driver.findElement(By.linkText("ELIGIBILITY")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		System.out.println("ELIGIBILITY: ");
		WebElement text2 = driver.findElement(By.xpath("//div[@class='tab-pane active show']/div/ul"));
		List<WebElement> t3 = text2.findElements(By.tagName("li"));
		for (int i = 1; i < t3.size(); i++) {
			System.out.println(t3.get(i).getText());
		}
		System.out.println("-------------------------");
		driver.findElement(By.linkText("BENEFITS")).click();
		Thread.sleep(1000);
		String str1 = driver.findElement(By.xpath("//div[@class='tab-pane active show']/div")).getText();
		System.out.println("BENEFITS: " + str1);
		System.out.println("-------------------------");
	}
}
