import com.codeborne.selenide.Configuration
import com.codeborne.selenide.Selenide
import io.github.bonigarcia.wdm.WebDriverManager
import kotlin.test.AfterTest
import kotlin.test.BeforeTest

abstract class BaseTest {
    fun setUp() {
        WebDriverManager.chromedriver().setup()
        Configuration.browser = "chrome"
        Configuration.browserSize = "1920x1080"
        Configuration.headless = false
    }

    @BeforeTest
    fun init(){
        setUp()
    }

    @AfterTest
    fun tearDown(){
        Selenide.closeWebDriver()
    }
}