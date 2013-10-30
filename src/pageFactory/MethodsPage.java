package pageFactory;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class MethodsPage {
	// Method for log function
	  public static void log(String message)
	  {
	  Throwable t = new Throwable();
	  StackTraceElement trace[] = t.getStackTrace();
	  if (trace.length > 1)
	  {
	  StackTraceElement element = trace[1];
	  System.out.format("[%s.%s] %s", element.getClassName(), element.getMethodName(), message).println();
	  }
	  else
	  System.out.format("[no info] %s", message);
	  }
	 
	 protected WebDriver driver;
	 
	 public MethodsPage(WebDriver driver) {
	  this.driver = driver;
	 }
	 
	 public boolean isElementPresent(WebElement element) {
	  try{
	  element.isDisplayed();
	  return true;
	  } 
	  catch (NoSuchElementException e) {
	  return false;
	  } 
	 }
	  
     public void type (WebElement webElement, String text ) {
	  webElement.clear();
	  webElement.sendKeys(text);
	  
	 }

}
