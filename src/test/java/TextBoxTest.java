import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {

    @BeforeAll
    static void PageLoad() {
        pageLoadStrategy = "eager";
        browserSize = "1920x1080";
        browser = "firefox";
    }

    @Test
    void fillFormTest () {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Roberto Cavalli");
        $("#userEmail").setValue("robertocav@gmail.com");
        $("#currentAddress").setValue("New-York");
        $("#permanentAddress").setValue("Utah");
        $("#submit").click();
        $("#output").shouldHave(text("Roberto Cavalli"), text("robertocav@gmail.com"), text("New-York"), text("Utah"));
    }
}
