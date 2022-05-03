package ExperitestTC1.features.authentication;
import ExperitestTC1.steps.DecohereUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
@RunWith(SerenityRunner.class)
public class WhenAuthenticating {
    @Steps private DecohereUser user;
    @Managed(driver = "chrome") WebDriver browser;
    @Test public void shouldBeAbleToLoginAsAdmin() {
        user.isOnTheHomePage();
        user.logsInAsAdmin();
        user.shouldBeOnLandingPage();
    }
}