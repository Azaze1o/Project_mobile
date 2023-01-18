package tests;

import com.codeborne.selenide.CollectionCondition;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class WikipediaAndroidTests extends TestBase {

    @Tag("Mobile")
    @Owner("Илья Гагарин")
    @Test
    void searchWikiTest() {
        back();
        step("Ввод текст поиска", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
        });
        step("Проверка кол-ва запросов", () -> {
            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                    .shouldHave(sizeGreaterThan(0));
        });
    }

//    @Tag("Mobile")
//    @Owner("Илья Гагарин")
//    @Test
//    void addLanguageTest() {
//        back();
//        step("Поиск", () ->
//                $(AppiumBy.accessibilityId("Search Wikipedia")).click());
//        step("Добавление нового языка", () -> {
//            $(AppiumBy.id("org.wikipedia.alpha:id/search_lang_button")).click();
//            $$(AppiumBy.id("org.wikipedia.alpha:id/wiki_language_title")).findBy(text("ADD LANGUAGE")).click();
//            $$(AppiumBy.id("org.wikipedia.alpha:id/localized_language_name")).findBy(text("Deutsch")).click();
//        });
//        step("Проверка добавленного", () ->
//                $$(AppiumBy.className("android.widget.TextView")).findBy(text("Deutsch")).shouldBe(visible));
//    }
//
//    @Tag("Mobile")
//    @Owner("Илья Гагарин")
//    @Test
//    void countrySearchTest() {
//        back();
//        step("Ввод текста поиска", () -> {
//            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
//            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Japan");
//        });
//        step("Проверка кол-ва запросов", () -> {
//            $$(AppiumBy.className("android.widget.TextView"))
//                    .shouldHave(CollectionCondition.sizeGreaterThan(0));
//        });
//        step("Проверка найденого", () -> {
//            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).click();
//            $(AppiumBy.className("android.webkit.WebView")).click();
//            $(AppiumBy.className("android.widget.TextView")).shouldHave(text("Japan"));
//        });
//    }
}



