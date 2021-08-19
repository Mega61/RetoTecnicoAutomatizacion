package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.LoginForm;

public class Answer implements Question<Boolean> {

    private String question;
    private String emailAddress;
    private String utestPassword;

    public Answer(String question, String emailAddress, String utestPassword) {
        this.question = question;
        this.emailAddress = emailAddress;
        this.utestPassword = utestPassword;
    }

    public static Answer toThe(String question, String emailAddress, String utestPassword){
        return new Answer(question, emailAddress, utestPassword);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result = false;

        try {
            actor.attemptsTo(
                    Click.on(LoginForm.LOGIN_BUTTON),
                    Enter.theValue(emailAddress).into(LoginForm.LOGIN_EMAIL_INPUT),
                    Enter.theValue(utestPassword).into(LoginForm.LOGIN_PASSWORD_INPUT),
                    Click.on(LoginForm.FINAL_LOGIN_BUTTON)
            );
            String emailConfirmation = Text.of(EmailConfirmationPage.CONFIRMATION_TEXT).viewedBy(actor).asString();
            if(question.equals(emailConfirmation)) {
                result = true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
