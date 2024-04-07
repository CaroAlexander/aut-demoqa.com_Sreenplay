package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;



public class LoginPage extends PageObject {

    private LoginPage(){
    }
    public static final Target newUserBtn = Target.the("newUser Button").located(By.id("newUser"));
    public static final Target userNameLb = Target.the("User name label").located(By.id("userName"));
    public static final Target passwordLb = Target.the("Password label").located(By.id("password"));
    public static final Target loginLb = Target.the("Login Button").located(By.id("login"));

}
