package qademo;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class practiceFormTest {
    @BeforeAll
    static void setup(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void formTest(){
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $("#firstName").sendKeys("Stanislaw");
        $("#lastName").sendKeys("QA");
        $("#userEmail").sendKeys("spiskun@qamentor.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").sendKeys("1234567654");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionContainingText("June");
        $(".react-datepicker__year-select").selectOptionContainingText("1986");
        $(".react-datepicker__day.react-datepicker__day--025").click();

        $("#subjectsInput").sendKeys("E");
        $(byText("English")).click();
        $("#subjectsInput").sendKeys("B");
        $(byText("Biology")).click();
        $("[for=hobbies-checkbox-1]").click();
        $("input#uploadPicture").uploadFile(new File("src/test/resources/"));

        $("#currentAddress").sendKeys("Chrzanow, Poland");
        $(byText("Select State")).click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Panipat")).click();
        $("button#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));

    }
}
