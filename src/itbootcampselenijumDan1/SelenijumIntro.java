package itbootcampselenijumDan1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenijumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\QA\\selenijum\\selenijum\\chrome\\chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com/");
	driver.navigate().to("https://www.youtube.com/?hl=sr&gl=RShttps://www.youtube.com/?hl=sr&gl=RS");
	//ctrl + f3 otvara interface gde je objekat napravljen
	driver.navigate().back();
	driver.navigate().forward();
	driver.findElement(By.id("search")).sendKeys("dule vujosevic");//ubacuje vrednosr u search
	driver.findElement(By.id("search-icon-legacy")).click();
	}

}
