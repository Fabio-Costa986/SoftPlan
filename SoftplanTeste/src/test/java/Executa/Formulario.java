package Executa;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Formulario {
	
	WebDriver driver;

	@Before

	public void setUp() throws Exception {


	System.setProperty("webdriver.chrome.driver", "./src/Drivers/chromedriver.exe");

	driver = new ChromeDriver();

	driver.get ("http://localhost:8080/usuarios");

	}



	@After
	public void tearDown() throws Exception {

	driver.quit();

	}



	@Test

	public void selecionar() throws InterruptedException {


	driver.findElement(By.cssSelector("Nome")).sendKeys("Marcelo Silva");

	driver.findElement(By.id("mail")).sendKeys("teste@gmail.com");

	driver.findElement(By.cssSelector("Nome")).click();

	driver.findElement(By.cssSelector("Email")).click();

	Thread.sleep(5000);

	}
	

}
