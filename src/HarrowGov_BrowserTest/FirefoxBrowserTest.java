package HarrowGov_BrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxBrowserTest {
    public static void main(String[] args) {

        String baseurl = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);
        String title = driver.getTitle();
        boolean verifytitle = title.equals("Harrow council");
        boolean verifytitlecontains= title.contains("Council");
        System.out.println(title);
        System.out.println(verifytitlecontains);
        System.out.println(verifytitle);
        driver.close();


    }
}
