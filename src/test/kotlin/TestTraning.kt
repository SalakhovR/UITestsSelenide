
import com.codeborne.selenide.Condition.text
import com.codeborne.selenide.Selectors.byXpath
import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.open
import kotlin.test.Test

val URL = "https://the-internet.herokuapp.com/"

class TestTraning {
    @Test
    fun ABTest() {
        open(URL)
        `$`(byXpath("//*[@id=\"content\"]/ul/li[1]/a")).click()
        `$`(byXpath("//*[@id=\"content\"]/div/h3")).shouldHave(text("A/B Test Control"))
        `$`(byXpath("//*[@id=\"content\"]/div/p")).shouldHave(text("Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through)."))
    }

    @Test
    fun AddRemoveTest(){
        open(URL)
        `$`(byXpath("//*[@id=\"content\"]/ul/li[2]/a")).click()
        `$`(byXpath("//*[@id=\"elements\"]/button")).shouldNotBe()
        `$`(byXpath("//*[@id=\"content\"]/div/button")).shouldHave(text("Add Element")).click()
        `$`(byXpath("//*[@id=\"elements\"]/button")).shouldHave(text("Delete")).click()
        `$`(byXpath("//*[@id=\"elements\"]/button")).shouldNotBe()
    }
}

//class AddRemoveElements {
//    @Test
//    fun test(){
//        open(URL)
//        `$`(byXpath("//*[@id=\"content\"]/ul/li[2]/a")).click()
//        `$`(byXpath("//*[@id=\"elements\"]/button")).shouldNotBe()
//        `$`(byXpath("//*[@id=\"content\"]/div/button")).shouldHave(text("Add Element")).click()
//        `$`(byXpath("//*[@id=\"elements\"]/button")).shouldHave(text("Delete")).click()
//        `$`(byXpath("//*[@id=\"elements\"]/button")).shouldNotBe()
//    }
//}