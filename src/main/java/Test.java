import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = initChromeDriver();
        driver.get("https://bing.com");
        WebElement field = driver.findElement(By.id("sb_form_q"));
        field.sendKeys("abrakadabra");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement button = driver.findElement(By.name("go"));
        button.click();


        List<WebElement> list = driver.findElements(By.className("b_algo"));
        System.out.println(list.size());
        driver.quit();
    }
    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver",Test.class.getResource("chromedriver.exe").getPath());
        return new ChromeDriver();
    }
}
