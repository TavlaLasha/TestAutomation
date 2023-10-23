import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestTwo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().maximize();

        WebElement selectEl = driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]"));
        Select select = new Select(selectEl);
        String defaultValue = select.getFirstSelectedOption().getText();
        System.out.println(defaultValue);
    }
}
