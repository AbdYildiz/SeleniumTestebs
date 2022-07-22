import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestScenario1 {

    @Test
    public void testC1(WebDriver driver) {
        driver.get("https://testebs.firat.edu.tr");
        driver.findElement(By.xpath("//div[@class='rightModal Modal']//a[@class='button'][contains(text(),'renci Giri')]")).click();
    }

}
