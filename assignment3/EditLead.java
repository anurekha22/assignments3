package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Anu");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("rekha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("b");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("working on automation testing");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("abc@gmail.com");
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec =new Select(stateDD);
		sec.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click(); 
	    driver.findElement(By.xpath("//a[text()='Edit']")).click();
	    driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
	    driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("edited the lead form");
	    driver.findElement(By.name("submitButton")).click();
	    System.out.println("the Title is :"+driver.getTitle());
	    driver.close();
	    
	    
	
		
		
		
		
		
		
		
		
	}

}
