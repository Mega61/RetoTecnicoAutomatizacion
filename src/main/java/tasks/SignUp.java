package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestSignUpForms;

public class SignUp implements Task {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String city;
    private String postalCode;
    private String country;
    private String computerOS;
    private String osVersion;
    private String osLanguage;
    private String mobileDeviceBrand;
    private String mobileDeviceModel;
    private String mobileDeviceOS;
    private String utestPassword;

    public SignUp(String firstName, String lastName, String emailAddress, String city, String postalCode, String country, String computerOS, String osVersion, String osLanguage, String mobileDeviceBrand, String mobileDeviceModel, String mobileDeviceOS, String utestPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.computerOS = computerOS;
        this.osVersion = osVersion;
        this.osLanguage = osLanguage;
        this.mobileDeviceBrand = mobileDeviceBrand;
        this.mobileDeviceModel = mobileDeviceModel;
        this.mobileDeviceOS = mobileDeviceOS;
        this.utestPassword = utestPassword;
    }

    public static SignUp onThePage(String firstName, String lastName, String emailAddress, String city, String postalCode, String country, String computerOS, String osVersion, String osLanguage, String mobileDeviceBrand, String mobileDeviceModel, String mobileDeviceOS, String utestPassword){
        return Tasks.instrumented(SignUp.class, firstName, lastName, emailAddress, city, postalCode, country, computerOS, osVersion, osLanguage, mobileDeviceBrand, mobileDeviceModel, mobileDeviceOS, utestPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestSignUpForms.JOIN_BUTTON),
                Enter.theValue(firstName).into(UtestSignUpForms.FIRST_NAME_INPUT),
                Enter.theValue(lastName).into(UtestSignUpForms.LAST_NAME_INPUT),
                Enter.theValue(emailAddress).into(UtestSignUpForms.EMAIL_INPUT),
                Click.on(UtestSignUpForms.BIRTH_MONTH_SELECT),
                Click.on(UtestSignUpForms.BIRTH_DAY_SELECT),
                Click.on(UtestSignUpForms.BIRTH_YEAR_SELECT),
                Click.on(UtestSignUpForms.CONTINUE_TO_SECOND_FORM_BUTTON),
                Enter.theValue(city).into(UtestSignUpForms.CITY_INPUT),
                Enter.theValue(postalCode).into(UtestSignUpForms.POSTAL_CODE_INPUT),
                Click.on(UtestSignUpForms.COUNTRY_FIELD),
                Enter.theValue(country).into(UtestSignUpForms.COUNTRY_SEARCH_INPUT),
                Click.on(UtestSignUpForms.CONTINUE_TO_THIRD_FORM_BUTTON),
                Click.on(UtestSignUpForms.COMPUTER_OS_FIELD),
                Enter.theValue(computerOS).into(UtestSignUpForms.COMPUTER_OS_INPUT),
                Click.on(UtestSignUpForms.OS_VERSION_FIELD),
                Enter.theValue(osVersion).into(UtestSignUpForms.OS_VERSION_INPUT),
                Click.on(UtestSignUpForms.OS_LANGUAGE_FIELD),
                Enter.theValue(osLanguage).into(UtestSignUpForms.OS_LANGUAGE_INPUT),
                Click.on(UtestSignUpForms.MOBILE_BRAND_FIELD),
                Enter.theValue(mobileDeviceBrand).into(UtestSignUpForms.MOBILE_BRAND_INPUT),
                Click.on(UtestSignUpForms.MOBILE_BRAND_CONFIRMATION),
                Click.on(UtestSignUpForms.MOBILE_MODEL_FIELD),
                Enter.theValue(mobileDeviceModel).into(UtestSignUpForms.MOBILE_MODEL_INPUT),
                Click.on(UtestSignUpForms.MOBILE_MODEL_CONFIRMATION),
                Click.on(UtestSignUpForms.MOBILE_OS_FIELD),
                Enter.theValue(mobileDeviceOS).into(UtestSignUpForms.MOBILE_OS_INPUT),
                Click.on(UtestSignUpForms.MOBILE_OS_CONFIRMATION),
                Click.on(UtestSignUpForms.CONTINUE_TO_FOURTH_FORM_BUTTON),
                Enter.theValue(utestPassword).into(UtestSignUpForms.PASSWORD_INPUT),
                Enter.theValue(utestPassword).into(UtestSignUpForms.CONFIRM_PASSWORD_INPUT),
                Click.on(UtestSignUpForms.TERMS_OF_USE_CHECKBOX),
                Click.on(UtestSignUpForms.PRIVACY_AND_SECURITY_CHECKBOX),
                Click.on(UtestSignUpForms.CONTINUE_TO_COMPLETE_SIGNUP)
        );

    }
}
