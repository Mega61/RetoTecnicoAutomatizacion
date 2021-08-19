package questions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class EmailConfirmationPage {

    public static final Target CONFIRMATION_TEXT = Target.the("Paragraph that affirms the need for the email confirmation").located(By.className("instructions"));
}
