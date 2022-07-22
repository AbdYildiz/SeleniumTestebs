import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestScenario5 {

    @Test
    public void testC1(WebDriver driver){
        driver.get("https://testebs.firat.edu.tr/aday/giris");
        driver.findElement(By.xpath("//p[@class='change-password']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Gönder')]")).click();
        driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();

    }
}
