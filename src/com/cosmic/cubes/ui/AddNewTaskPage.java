package com.cosmic.cubes.ui;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

import com.cosmic.cubes.utils.generic.HandleDropDown;

	public class AddNewTaskPage
	{
		WebDriver driver;
		WebElement ddl;
		String text;
		public AddNewTaskPage(WebDriver driver)
		{
			this.driver = driver;
		}
		public void waitForAddNewTaskPage()
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Create Tasks']")));
		}
		public WebElement getCustomerDDDL()
		{
			return driver.findElement(By.id("ext-gen48"));
		    
		}
		public WebElement getCustomerNameTextbox()
		{
			return driver.findElement(By.id("createTasksPopup_newCustomer"));
		}
		public WebElement getProjectNameTextbox()
		{
			return driver.findElement(By.id("createTasksPopup_newProject"));
		}
		public WebElement getTaskNameFirstTextbox()
		{
			return driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder']"));
		}
		public WebElement getCreateTaskButton()
		{
			return driver.findElement(By.id("createTasksPopup_commitBtn"));
		}
}
