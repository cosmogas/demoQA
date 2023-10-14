package qademo;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class textBoxTesting {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        Configuration.browserSize = "1920x1080";

    open ("https://demoqa.com/text-box");
    $(".main-header").shouldHave(text("Text Box"));
    $("#userName").setValue("Stanislaw");
    $("#userEmail").setValue("spiskun@qamentor.com");
    $("#currentAddress").setValue("Poland, Krakow, ul. Jana Matejki 4/4");
    $("#permanentAddress").setValue("greatest country of Europe");
    }
}
