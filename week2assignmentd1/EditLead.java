package week2assignmentd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prakash");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Duraisamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Praku");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Mechanical");
		driver.findElement(By.name("description")).sendKeys("Selenium Training");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("prakashdurai005@gmail.com");
		WebElement Stateelement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select State =new Select(Stateelement);
		State.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Selenium Assignment Edit Lead");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println("The title of resulting page:" + title);
	}

}
