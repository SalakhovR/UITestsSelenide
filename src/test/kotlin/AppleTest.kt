import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class AppleTest : BaseTest() {
    val APPLE_URL = "https://appleinsider.ru/"
    val SEARCH_STRING = "Чем IPhone 13 отличается от IPhone 12"
    val EXPECTED_WORD = "iphone-13"

    @Test
    fun checkHrefArticle() {
        Assertions.assertTrue(
                MainPage(APPLE_URL)
                    .clickOnSearch(SEARCH_STRING)
                    .getHrefFromFirstArticle()
                    .contains(EXPECTED_WORD)
            )
    }
}