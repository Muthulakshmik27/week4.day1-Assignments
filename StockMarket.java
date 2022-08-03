package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StockMarket {
    public static void main(String[] args) {
    	 WebDriverManager.chromedriver().setup();
         //Launch the browser
         ChromeDriver driver=new ChromeDriver();
         //Load the url
         driver.get("https://www.chittorgarh.com/");
         //maxmize the window
         driver.manage().window().maximize();
         //wait
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         //Click on stock market
         driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
         //click om NSE bulk deals
         driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
         //Get the row size
         List<WebElement> row=driver.findElements(By.xpath("//table//tr"));
         int rsize=row.size();
         System.out.println(rsize);
         //Get all the security names
         List<String> iplist=new ArrayList<String>();
         for(int i=1;i<rsize;i++)
         {
        	 String securityname =driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']/tbody/tr[\"+i+\"]/td[3]")).getText();
        	 iplist.add(securityname);
        	 
         }
         System.out.println(iplist);
        //Ensure whether there are duplicate Security names
          Set<String> ipset=new HashSet<String>(iplist);
          int setsize=ipset.size();
          System.out.println(setsize);
          
          if(ipset.size()<iplist.size())
          {
        	  System.out.println("Duplicates in the list");
          }
            else
          {
        	  System.out.println("No Duplicates");
          }
          
          }
         
         
	}
