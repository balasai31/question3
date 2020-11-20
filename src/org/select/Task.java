package org.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mani KDM\\eclipse-workspace\\select\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
		
		
		WebElement sel1 = driver.findElement(By.xpath("//select[@class='form-control']"));
		
	Select s=new Select(sel1);
	List<WebElement> options = s.getOptions();
	//to itterate
	for (int i = 0; i < options.size(); i++) {
		WebElement webElement = options.get(i);
		String text = webElement.getText();
		System.out.println(text);
		s.selectByVisibleText("Friday");
		
		WebElement mul = driver.findElement(By.id("multi-select"));
		
		boolean b = s.isMultiple();
		System.out.println(b);
		
		
	}
	}

}
