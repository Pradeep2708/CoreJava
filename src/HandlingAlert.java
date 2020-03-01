
public class HandlingAlert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Desktop\\radical\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(test(),'Click for prompt Box')]")).click();
		Thread.sleep(3000);
		
		alert.sendKeys("Hello pradeep");
		Thread.sleep(3000);
		alert.accept();

	}

}
