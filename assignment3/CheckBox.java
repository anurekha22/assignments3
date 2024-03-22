package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')]//div)[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed());
		driver.findElement(By.xpath("(//div[contains(@class,'ui-toggleswitch ui-widget')]//div)[2]")).click();
		
		driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]")).click();
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("//ul[@data-label='Cities']/following::label[text()='Istanbul']")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='State has been changed.']")).isSelected());
		
		driver.close();
	}
	

}
