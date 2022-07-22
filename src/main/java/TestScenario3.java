import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestScenario3 {
    @Test
    public void testC1(WebDriver driver,JavascriptExecutor js){
        driver.get("https://testebs.firat.edu.tr/aday/kayit");
        js.executeScript("scroll(0, 250);");
        driver.findElement(By.xpath("//span[contains(text(),'t Ol')]")).click();
    }

    @Test
    public void testC2(WebDriver driver){
        //pass the testC2 and testC3
    }

    @Test
    public void testC4(WebDriver driver,JavascriptExecutor js){
        driver.findElement(By.xpath("//input[@name='userFirstName']")).sendKeys("11111111");
        js.executeScript("scroll(0, 250);");
        driver.findElement(By.xpath("//span[contains(text(),'t Ol')]")).click();
    }

    @Test
    public void testC5(WebDriver driver,JavascriptExecutor js){
        driver.findElement(By.xpath("//input[@name='userLastName']")).sendKeys("111111111");
        js.executeScript("scroll(0, 250);");
        driver.findElement(By.xpath("//span[contains(text(),'t Ol')]")).click();
    }

    @Test
    public void testC6(WebDriver driver,JavascriptExecutor js) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='userUID']")).sendKeys("111111111111");
        js.executeScript("scroll(0, 250);");
        driver.findElement(By.xpath("//span[contains(text(),'t Ol')]")).click();
    }

    @Test
    public void testC7(WebDriver driver, JavascriptExecutor js){
        driver.findElement(By.xpath("//input[@id='born_date']")).sendKeys("9999");
        js.executeScript("scroll(0, 250);");
        driver.findElement(By.xpath("//span[contains(text(),'t Ol')]")).click();
    }

    @Test
    public void testC8(WebDriver driver,JavascriptExecutor js){
        driver.findElement(By.xpath("//input[@name='userEMailAddress']")).sendKeys("1@f");
        js.executeScript("scroll(0, 250);");
        driver.findElement(By.xpath("//span[contains(text(),'t Ol')]")).click();
    }

    @Test
    public void testC9(WebDriver driver,JavascriptExecutor js){
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
        js.executeScript("scroll(0, 250);");
        driver.findElement(By.xpath("//span[contains(text(),'t Ol')]")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
        js.executeScript("scroll(0, 250);");
        driver.findElement(By.xpath("//span[contains(text(),'t Ol')]")).click();
        driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
    }

    @Test
    public void testC10(WebDriver driver,JavascriptExecutor js){
        driver.findElement(By.xpath("//input[@name='userFirstName']")).sendKeys("11111111");
        driver.findElement(By.xpath("//input[@name='userLastName']")).sendKeys("111111111");
        driver.findElement(By.xpath("//input[@id='userUID']")).sendKeys("111111111111");
        driver.findElement(By.xpath("//input[@id='born_date']")).sendKeys("9999");
        driver.findElement(By.xpath("//input[@name='userEMailAddress']")).sendKeys("1@firat.edu.tr");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name='password2']")).sendKeys("654321");
        js.executeScript("scroll(0, 250);");
        driver.findElement(By.xpath("//span[contains(text(),'t Ol')]")).click();
        driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();

    }

    @Test
    public void testC11(WebDriver driver){
        driver.findElement(By.xpath("//div[@class='logo-inner']//img")).click();
        System.out.println(driver.getTitle());
    }


}
