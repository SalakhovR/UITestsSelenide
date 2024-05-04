import com.codeborne.selenide.ElementsCollection
import com.codeborne.selenide.Selenide.`$$x`

class SearchResultPage {
    val articlesTitles: ElementsCollection = `$$x`("//h2//a")

    /**
     * Возвращает href из первой статьи
     */
    fun getHrefFromFirstArticle(): String{
        return articlesTitles.first().getAttribute("href").toString()
    }
}