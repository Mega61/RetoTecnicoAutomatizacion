package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignUpForms {

    //Landing Page Elements
    public static final Target JOIN_BUTTON =  Target.the("Join Today button that redirects to the signUp forms").located(By.className("unauthenticated-nav-bar__sign-up"));
    //-----------------------------------------
    //First SignUp Form Elements
    public static final Target FIRST_NAME_INPUT =  Target.the("First Name Input in the first form of signUp").located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT =  Target.the("Last Name Input in the first form of signUp").located(By.id("lastName"));
    public static final Target EMAIL_INPUT =  Target.the("Email Input in the first form of signUp").located(By.id("email"));
    public static final Target BIRTH_MONTH_SELECT =  Target.the("Birth Month select in the first signup form").located(By.xpath("//*[@id=\"birthMonth\"]/option[10]"));
    public static final Target BIRTH_DAY_SELECT =  Target.the("Birth Day select in the first signup form").located(By.xpath("//*[@id=\"birthDay\"]/option[30]"));
    public static final Target BIRTH_YEAR_SELECT =  Target.the("Birth Year select in the first signup form").located(By.xpath("//*[@id=\"birthYear\"]/option[4]"));
    public static final Target CONTINUE_TO_SECOND_FORM_BUTTON =  Target.the("Button that redirects to the second form of the signup").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    //-----------------------------------------
    //Second SignUp Form Elements
    public static final Target CITY_INPUT =  Target.the("City Input in the second form of signUp").located(By.id("city"));
    public static final Target POSTAL_CODE_INPUT =  Target.the("Postal Code or ZIP Input in the second form of signUp").located(By.id("zip"));
    public static final Target COUNTRY_FIELD =  Target.the("Div that contains the country input which enables the input").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target COUNTRY_SEARCH_INPUT =  Target.the("Country Input in the second form of signUp").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target CONTINUE_TO_THIRD_FORM_BUTTON =  Target.the("Button that redirects to the third form of the signup").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    //-----------------------------------------
    //Third SignUp Form Elements
        //Computer OS required elements to enable de input
    public static final Target COMPUTER_OS_FIELD = Target.the("Span that enables the input").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span"));
    public static final Target COMPUTER_OS_INPUT = Target.the("input that corresponds to the computer os").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]"));
        //OS version required elements to enable de input
    public static final Target OS_VERSION_FIELD = Target.the("Span that enables the input").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span"));
    public static final Target OS_VERSION_INPUT = Target.the("input that corresponds to the os version").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]"));
        //OS Language required elements to enable de input
    public static final Target OS_LANGUAGE_FIELD = Target.the("Span that enables the input").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/span"));
    public static final Target OS_LANGUAGE_INPUT = Target.the("input that corresponds to the os language").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/input[1]"));
        //Mobile Brand required elements to enable de input
    public static final Target MOBILE_BRAND_FIELD = Target.the("Span that enables the input").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));
    public static final Target MOBILE_BRAND_CONFIRMATION = Target.the("Once entered the brand the filter option is displayed").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[3]/span/div"));
    public static final Target MOBILE_BRAND_INPUT = Target.the("input that corresponds to the mobile brand").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));
        //Mobile Model required elements to enable de input
    public static final Target MOBILE_MODEL_FIELD = Target.the("Span that enables the input").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));
    public static final Target MOBILE_MODEL_CONFIRMATION = Target.the("Once entered the model the filter option is displayed").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[3]/span/div"));
    public static final Target MOBILE_MODEL_INPUT = Target.the("input that corresponds to the mobile model").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));
        //Mobile OS required elements to enable de input
    public static final Target MOBILE_OS_FIELD = Target.the("Span that enables the input").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));
    public static final Target MOBILE_OS_CONFIRMATION = Target.the("Once entered the OS the filter option is displayed").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[3]/span/div"));
    public static final Target MOBILE_OS_INPUT = Target.the("input that corresponds to the mobile os").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));
        //Final Button
    public static final Target CONTINUE_TO_FOURTH_FORM_BUTTON =  Target.the("Button that redirects to the fourth form of the signup").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    //-----------------------------------------
    //Fourth SignUp Form Elements
    public static final Target PASSWORD_INPUT = Target.the("Create password input").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_INPUT = Target.the("Confirm password input").located(By.id("confirmPassword"));
    public static final Target TERMS_OF_USE_CHECKBOX = Target.the("Use of terms confirmation checkbox").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PRIVACY_AND_SECURITY_CHECKBOX = Target.the("Privacy and security policies confirmation checkbox").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target CONTINUE_TO_COMPLETE_SIGNUP =  Target.the("Button that finalizes the signup process").located(By.id("laddaBtn"));




}
