// modyfikatory dostępu w Java

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

// różnica pomiędzy klasą, interfejsem, a klasą abstrakcyjną
//dziedziczenie w java
public class UltimateQATest extends PageSetup {


    @Test
    public void testOne() {
        WebElement button = driver.findElement(By.id("idExample"));
        button.click();

        WebElement buttonSuccess = driver.findElement(By.className("entry-title"));
        //import static
        assertEquals("Button success", buttonSuccess.getText());


    }

    @Test
    public void testTwo() throws InterruptedException  {
        WebElement nameInput = driver.findElement(By.id("et_pb_contact_name_0"));
        nameInput.sendKeys("Maciej");

        WebElement emailInput = driver.findElement(By.id("et_pb_contact_email_0"));
        emailInput.sendKeys("tester@tester.pl");

        Thread.sleep(2000);

        WebElement buttonSuccess = driver.findElement(By.name("et_builder_submit_button"));
        buttonSuccess.click();

        Thread.sleep(2000);

        //waity w Selenium explicit wait, implicit wait, fluent wait

        WebElement thanksText = driver.findElement(By.xpath("//div[@class='et-pb-contact-message']/p"));
        assertEquals("Thanks for contacting us", thanksText.getText());
    }
}
