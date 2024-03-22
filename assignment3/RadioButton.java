package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		System.out.println(driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected());
		System.out.println(driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected());
		driver.close();
		
	
		

	}

}
