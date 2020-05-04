package com.hrms.lib; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;
public class General extends Global {  
public void openapplication()  { 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Srija\\Desktop\\chromedriver.exe");
    driver=new ChromeDriver();
driver.navigate().to(url);  
System.out.println("Application opened");

Reporter.log("application opened");
Log.info("application opened");
}  
public void closebrowser(){  
driver.quit(); 
Log.info("application closed");
}  
public void login() throws Exception {  
driver.findElement(By.name(txt_loginname)).sendKeys(un);  
driver.findElement(By.name(txt_password)).sendKeys(pw);  
driver.findElement(By.name(btn_login)). click();  
Thread.sleep(3000);  
System.out.println("login completed");

Log.info("login completed");
}  
public void logout () {  
driver.findElement(By.linkText(link_logout)). click();  
System.out.println("logout completed");
Log.info("logout completed");

}  
public void addemp() throws Exception {  
driver.switchTo(). frame("rightMenu");  
//click on add button  
driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();  
Thread.sleep(4000);  
System.out.println("clicked on add button");  
driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("hello");  
driver.findElement(By.xpath("//input[@name='txtEmpLastName']")).sendKeys("world");  
driver.findElement(By.xpath("//input[@value='Save']")).click();  
Thread.sleep(4000);  
System.out.println("New employee added");  
Log.info("employee added");
//exit from frame;  
driver.switchTo().defaultContent();  }  
public void delemp() {  
System.out.println("delete emp");
Log.info("application opened");
}   }  