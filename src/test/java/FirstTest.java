import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class FirstTest {

    @Test
    public void testGoogle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
        searchBox.sendKeys("laptop");

        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        WebElement results = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='a-autoid-1-announce']")));
        results.click();

        WebElement cart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-cart-count-container")));
        cart.click();


        // System.out.println("Search results for: " + results.getText());
        //driver.quit();
    }
}