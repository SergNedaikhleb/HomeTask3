import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.jws.WebParam;
import java.beans.EventHandler;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class homeTask3 {
    public static void main(String[] args) {
        WebDriver driver = initChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        System.setProperty("chromedriver.exe","C:\\Users\\QA\\IdeaProjects\\Lecture\\src\\main\\resources\\chromedriver.exe");
        EventFiringWebDriver evdriver = new EventFiringWebDriver(driver);
        homeTaskListener listen = new homeTaskListener();
        evdriver.register(listen);

        driver.manage().window().maximize();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0");
        WebElement login = driver.findElement(By.id("email"));
        login.sendKeys("webinar.test@gmail.com");
        WebElement passw = driver.findElement(By.id("passwd"));
        passw.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement log_in = driver.findElement(By.name("submitLogin"));
        log_in.submit();
        System.out.println("Page title is:" + driver.getTitle());
        System.out.println("Page URL is:" + driver.getCurrentUrl());
       // WebElement Catalog = new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("subtab-AdminCatalog")));
        WebElement CatalOg = driver.findElement(By.id("subtab-AdminCatalog"));
        CatalOg.click();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminCategories&token=795a6350b3a0f87af2a165b4c1a34372");
        WebElement add = driver.findElement(By.id("page-header-desc-category-new_category"));
        add.click();
        WebElement name = driver.findElement(By.id("name_1"));
        name.sendKeys("TestCategory");
        WebElement save = driver.findElement(By.id("category_form_submit_btn"));
        save.submit();
        WebElement succes  = driver.findElement(By.cssSelector("#content > div:nth-child(4) > div > button"));
        succes.click();
        WebElement backtolist = driver.findElement(By.id("desc-category-back"));
        backtolist.click();

        WebElement myCat = driver.findElement(By.xpath("//td[contains(text(), 'TestCategory')]"));
        System.out.println("I found my category. It calls: " + myCat.getText());

    }



    private static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", homeTask3.class.getResource("chromedriver.exe").getPath());
        return new ChromeDriver();


    }
}

