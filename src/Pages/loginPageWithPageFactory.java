package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class loginPageWithPageFactory extends CommonMethods {

    @FindBy(id="txtUsername")
    public WebElement usernamefield;

    @FindBy (xpath = "//input[@id = 'txtPassword']")
    public WebElement passwordfield;

    @FindBy (css="input#btnLogin")
    public  WebElement loginbtn;

    //    call the constructor to initialize all elements
    public loginPageWithPageFactory(){

        PageFactory.initElements(driver,this);
    }

}
