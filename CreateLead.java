package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		//To verify the page loaded
	  // String title=driver.getTitle();
	   String title = driver.getTitle();
	   System.out.println(title);
	   System.out.println(driver.getCurrentUrl());
	   driver.findElement(By.linkText("Leads")).click();
	   driver.findElement(By.linkText("Create Lead")).click();
	   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TeastLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ayisha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muthu");
		driver.findElement(By.name("departmentName")).sendKeys("NonIt to It");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("first step in the second chance of my career,way to the restart");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ayisha.cse@gamil.com");
		
		driver.findElement(By.className("smallSubmit")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
		System.out.println(driver.getCurrentUrl());

	}

}
