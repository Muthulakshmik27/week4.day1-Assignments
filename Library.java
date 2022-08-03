package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
	   public static void main(String[] args) {
		   WebDriverManager.chromedriver().setup();
	       //Launch the browser
	       ChromeDriver driver=new ChromeDriver();
	       //Load the url
	       driver.get("https://html.com/tags/table/");
	       //maxmize the window
	       driver.manage().window().maximize();
	       //wait
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       List<WebElement> col1= driver.findElements(By.xpath("//table[1]//th"));
	       int colsize=col1.size();
	      
	       
	       List<String> lib1=new ArrayList<String>();
	       for(int i=1;i<colsize-1;i++)
	       {
	    	   String val1=driver.findElement(By.xpath("//table[1]//tbody/tr[1]/td["+i+"]")).getText();
	    	   lib1.add(val1);
	    	   
	       }
	       System.out.println("Market Share");
	       System.out.println(lib1);
	       
	       List<String> lib2=new ArrayList<String>();
	       for(int j=1;j<colsize-1;j++)
	       {
	    	   String val2=driver.findElement(By.xpath("//table[1]//tbody/tr[2]/td["+j+"]")).getText();
	    	   lib2.add(val2);
	    	   
	       }
	       System.out.println("Absolute Share");
	       System.out.println(lib2);
}
}