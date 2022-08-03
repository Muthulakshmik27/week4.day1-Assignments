package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RowColumnCount {
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
       
      List<WebElement>tabrow1 = driver.findElements(By.xpath("//table[1]//tr"));
      int row=tabrow1.size();
      System.out.println(row);
      
      List<WebElement> tabrow2=driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
      int row1=tabrow2.size();
      System.out.println(row1);
      
      List<WebElement> tabcol1=driver.findElements(By.xpath("//table[1]//th"));
      int col=tabcol1.size();
      System.out.println(col);
      
      List<WebElement> tabcol2=driver.findElements(By.xpath("//table[@class='attributes-list']//th"));
      int col1=tabcol2.size();
      System.out.println(col1);
      
}
}
