package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundTable {
	 public static void main(String[] args) {
		   WebDriverManager.chromedriver().setup();
	       //Launch the browser
	       ChromeDriver driver=new ChromeDriver();
	       //Load the url
	       driver.get("http://www.leafground.com/pages/table.html");
	       //maxmize the window
	       driver.manage().window().maximize();
	       //wait
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	      List<WebElement>tabrow1 = driver.findElements(By.xpath("//table/tbody/tr"));
	      int row=tabrow1.size();
	      System.out.println(row);
	      
	      List<WebElement> tabcol1=driver.findElements(By.xpath("//table/tbody/tr/th"));
	      int col=tabcol1.size();
	      System.out.println(col);
	      
	      for(int i=2;i<=row-1;i++)
	      {
	    	  for(int j=1;j<=col;j++)
	    	  {
	    		 String input= driver.findElement(By.xpath("//table/tbody/tr[\"+i+\"]/td[\"+j+\"]")).getText();
	    				 System.out.println(input);
	    	  }
	    	  System.out.println();
	    		
	      }
	      
	    
}
}