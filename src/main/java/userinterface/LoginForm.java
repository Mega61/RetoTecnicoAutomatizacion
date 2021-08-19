package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginForm {
    //Landing Page Elements
    public static final Target LOGIN_BUTTON = Target.the("Login Button from the landing page").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[1]/a"));
    //-----------------------------------------
    //Login form elements
    public static final Target LOGIN_EMAIL_INPUT = Target.the("Email or username field in the login form").located(By.id("username"));
    public static final Target LOGIN_PASSWORD_INPUT = Target.the("password field in the login form").located(By.id("password"));
    public static final Target FINAL_LOGIN_BUTTON = Target.the("Login button in the login form to submit the credentials").located(By.id("kc-login"));


}
