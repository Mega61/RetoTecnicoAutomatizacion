package co.com.choucair.retotecnico.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestSignUpData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.OpenUp;
import tasks.SignUp;

import java.util.List;

public class UtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Jake wants to join utest.com by signing up in their landing page$")
    public void thanJakeWantsToJoinUtestComBySigningUpInTheirLandingPage() {
        //The user opens the utest.com Landing Page
        OnStage.theActorCalled("Jake").wasAbleTo(OpenUp.thePage());

    }


    @When("^he starts filling the information required for the SignUp$")
    public void heStartsFillingTheInformationRequiredForTheSignUp(List<UtestSignUpData> utestSignUpData) {
        //The user starts filling the input's int he 4 forms of the signUp in utest.com
        //He goes in order from left to right and from top to button in order to maintain a logical order
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.onThePage(
                utestSignUpData.get(0).getFirstName(),
                utestSignUpData.get(0).getLastName(),
                utestSignUpData.get(0).getEmailAddress(),
                utestSignUpData.get(0).getCity(),
                utestSignUpData.get(0).getPostalCode(),
                utestSignUpData.get(0).getCountry(),
                utestSignUpData.get(0).getComputerOS(),
                utestSignUpData.get(0).getOsVersion(),
                utestSignUpData.get(0).getOsLanguage(),
                utestSignUpData.get(0).getMobileDeviceBrand(),
                utestSignUpData.get(0).getMobileDeviceModel(),
                utestSignUpData.get(0).getMobileDeviceOS(),
                utestSignUpData.get(0).getUtestPassword()
                ));

    }

    @Then("^he is able to login with his newly created account$")
    public void heSeesTheSuccessfulSignUpAlert(List<UtestSignUpData> utestSignUpData) {
        //The user login from the redirected page and checks if he has access with his newly created credentials
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(
                utestSignUpData.get(0).getConfirmationText(),
                utestSignUpData.get(0).getEmailAddress(),
                utestSignUpData.get(0).getUtestPassword())
                ));

    }

}
