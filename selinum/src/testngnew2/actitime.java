package testngnew2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class actitime extends generic
{
@Test
public void test()
{
	driver.get("http://localhost/login.do");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.xpath("//a[.='Login ']")).click();
	String s = driver.getTitle();
	Assert.assertEquals(s,"actiTIME - Enter Time-Track");
}
}
