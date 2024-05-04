import com.codeborne.selenide.Selectors.byXpath
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.SelenideElement
import org.openqa.selenium.Keys

/**
 * Главная страница сайта https://appleinsider.ru/
 */
class MainPage(url: String) {
    private val textBoxInput: SelenideElement
    init {
        Selenide.open(url)
        textBoxInput = `$`(byXpath("//input[@name='s']"))
    }

    /**
     * Выполняется поиск среди статей и нажимается кнопка Enter
     * @param stringForSearch поисковая строка
     */
    fun clickOnSearch(stringForSearch: String): SearchResultPage {
        textBoxInput.setValue(stringForSearch)
        textBoxInput.sendKeys(Keys.ENTER)
        return SearchResultPage()
    }
}