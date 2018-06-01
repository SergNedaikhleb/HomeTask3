import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class homeTaskScriptB extends homeTask {

    public static void main(String[] args) {
        WebDriver driver = initChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0");
        WebElement login = driver.findElement(By.id("email"));
        login.sendKeys("webinar.test@gmail.com");
        WebElement passw = driver.findElement(By.id("passwd"));
        passw.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement log_in = driver.findElement(By.name("submitLogin"));
        log_in.submit();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement Dashboard = driver.findElement(By.cssSelector("#tab-AdminDashboard > a > span"));
        Dashboard.click();
        driver.navigate().refresh();
        System.out.println("This title is: " + driver.getTitle());
        WebElement Orders = driver.findElement(By.cssSelector("#subtab-AdminParentOrders > a > span"));
        Orders.click();
        driver.navigate().refresh();
        System.out.println("This Title is: " + driver.getTitle());
        WebElement Catalog = driver.findElement(By.linkText("Каталог"));
        Catalog.click();
        driver.navigate().refresh();
        System.out.println("This Title is: " + driver.getTitle());
        driver.navigate().back();
        WebElement Clients = driver.findElement(By.cssSelector("#subtab-AdminParentCustomer > a > span"));
        Clients.click();
        driver.navigate().refresh();
        System.out.println("This Title is: " + driver.getTitle());
        WebElement Support = driver.findElement(By.cssSelector("#subtab-AdminParentCustomerThreads > a > span"));
        Support.click();
        driver.navigate().refresh();
        System.out.println("This Title is: " + driver.getTitle());
        WebElement Static = driver.findElement(By.cssSelector("#subtab-AdminStats > a > span"));
        Static.click();
        driver.navigate().refresh();
        System.out.println("This Title is: " + driver.getTitle());
        WebElement Modules = driver.findElement(By.cssSelector("#subtab-AdminParentModulesSf > a > span"));
        Modules.click();
        driver.navigate().refresh();
        System.out.println("This Title is: " + driver.getTitle());
        driver.navigate().back();
        WebElement Design = driver.findElement(By.cssSelector("#subtab-AdminParentThemes > a > span"));
        Design.click();
        driver.navigate().refresh();
        System.out.println("This Title is: " + driver.getTitle());
        WebElement Delivery = driver.findElement(By.cssSelector("#subtab-AdminParentShipping > a > span"));
        Delivery.click();
        driver.navigate().refresh();
        System.out.println("This Title is: " + driver.getTitle());
        WebElement Payment = driver.findElement(By.cssSelector("#subtab-AdminParentPayment > a > span"));
        Payment.click();
        driver.navigate().refresh();
        System.out.println("This Title is: " + driver.getTitle());
        WebElement International = driver.findElement(By.cssSelector("#subtab-AdminInternational > a > span"));
        International.click();
        driver.navigate().refresh();
        System.out.println("This Title is: " + driver.getTitle());
        WebElement Param = driver.findElement(By.cssSelector("#subtab-ShopParameters > a > span"));
        Param.click();
        driver.navigate().refresh();
        System.out.println("This Title is: " + driver.getTitle());
        WebElement Config = driver.findElement(By.cssSelector("#subtab-AdminAdvancedParameters > a > span"));
        Config.click();
        driver.navigate().refresh();
        System.out.println("This Title is: " + driver.getTitle());



/*
        By locator = By.tagName("li");
        List<WebElement> check = driver.findElements(locator);
        System.out.println(check.size());
        By secondLocator = By.tagName("section");
        List<WebElement> modules = driver.findElements(secondLocator);
        System.out.println(modules.size());

        WebElement user = driver.findElement(By.id("employee_infos"));
        user.click();
        WebElement logout = driver.findElement(By.id("header_logout"));
        logout.click();
*/
    }
}
