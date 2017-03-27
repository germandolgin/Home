import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

/**
 * Created by shadowspeaker on 25.03.17.
 */
public class Save_Code_to_txt {
    public static void main (String args[]){
System.setProperty("webdriver.chrome.driver","/home/shadowspeaker/Apps/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
System.out.print(driver.getPageSource());
driver.close();
        }
    }

