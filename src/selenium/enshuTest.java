package selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class enshuTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws Exception {
		try {
			System.setProperty("webdriver.chrome.driver", "./exe/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.google.com/xhtml"); // get()でブラウザ起動 Thread.sleep(5000); //処理を停止(動作確認の為) //ブラウザの要素を指定
														// メソッド名がわかりやすいですよね。 WebElement searchBox =
														// driver.findElement(By.name("q"));
														// searchBox.sendKeys("ChromeDriver");
			Thread.sleep(5000);
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("ChromeDriver");
			searchBox.submit();
			Thread.sleep(5000);
			driver.quit(); // ブラウザを閉じる。
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
