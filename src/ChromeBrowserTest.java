import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //setup chrome browser
        WebDriver driver = new ChromeDriver();
        // open Url
        driver.get(baseUrl);
        //print the title of page
        String title = driver.getTitle();
        System.out.println(title);
        //print the current Url
        System.out.println("Current Url :" + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page Source :" + driver.getPageSource());
        //enter email to email field
        driver.findElement(By.id("user[email]")).sendKeys("vish392@gmail.com");
        //enter password to password field
        driver.findElement(By.id("user[password]")).sendKeys("644894684684ff");
        //close the browser
        driver.close();
    }
}
