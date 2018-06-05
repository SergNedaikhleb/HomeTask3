import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class homeTaskListener extends AbstractWebDriverEventListener {

    public void beforeNavigateBack(WebDriver driver) {
        System.out.println("We did navigate back before");
    }

    public void afterNavigateBack(WebDriver driver) {
        System.out.println("We did navigate back after");
    }
    public void beforeNavigateForward(WebDriver driver) {
        System.out.println("We did navigate forward before");
    }
    public void afterNavigateForward(WebDriver driver) {
        System.out.println("We did navigate forward after");
    }
}
