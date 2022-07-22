import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestScenario2 {

    @Test
    public void testC1(WebDriver driver) {
        driver.findElement(By.xpath("//span[contains(text(),'Yap')]")).click();
        driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
        String ms = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
        System.out.println(ms);
    }

    @Test
    public void testC2(WebDriver driver){
        driver.findElement(By.xpath("//input[@name='userEMailAddress']")).sendKeys("1@f");
        driver.findElement(By.xpath("//span[contains(text(),'Yap')]")).click();
        driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
        String ms = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
        System.out.println(ms);
    }

    @Test
    public void testC3(WebDriver driver){
        driver.findElement(By.xpath("//input[@name='userEMailAddress']")).sendKeys("1@firat.edu.tr");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ff");
        driver.findElement(By.xpath("//span[contains(text(),'Yap')]")).click();
        driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
        String ms = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
        System.out.println(ms);
    }

    @Test
    public void testC4(WebDriver driver){
        driver.findElement(By.xpath("//input[@name='userEMailAddress']")).sendKeys("170541028@firat.edu.tr");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//span[contains(text(),'Yap')]")).click();
        driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
    }

    @Test
    public void testC5(WebDriver driver){
        driver.findElement(By.xpath("//input[@name='userEMailAddress']")).sendKeys("170541028@firat.edu.tr");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ff");
        driver.findElement(By.xpath("//span[contains(text(),'Yap')]")).click();
        driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
    }

    @Test
    public void testC6(WebDriver driver){
        driver.findElement(By.xpath("//span[contains(text(),'t Ol')]")).click();
        System.out.println(driver.getTitle());
        driver.navigate().back();
    }

    @Test
    public void testC7(WebDriver driver){
        driver.findElement(By.xpath("//p[@class='forgot-password']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Gönder')]")).click();
        driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
    }

    @Test
    public void testC8(WebDriver driver){
        driver.findElement(By.xpath("//p[@class='change-password']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Gönder')]")).click();
        driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
    }

}
