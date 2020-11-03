package runnerTest.webPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BasePage;

public class HomePage extends ElementUtil{
    private By today=By.xpath("//a[@data-day='0']//span[@class='toggle']");
    private By locationArea= By.xpath("//input[@type='text' and @value]");
    private By high_lowtem= By.xpath("//body/div[@id='week']/div[2]/div[1]/div[2]/div[1]");


    public String getHomePageTitle(){
        String title = BasePage.get().getTitle();
        System.out.println(title);
        return title;
    }


    public void clickToday(){
        scrollDown();
        WebDriverWait wait = new WebDriverWait(BasePage.get(),20);
        wait.until(ExpectedConditions.presenceOfElementLocated(today));
        clickOn(today);
    }
    public String  verifyText(){
        String text= getTextFromElement(locationArea);
        return text;
    }

    public String  getHighLowTem(){
        String text =getTextFromElement(high_lowtem);
        System.out.println("the highest and lowest temp. accordingly time is : "+text);
        return text;

    }


}
