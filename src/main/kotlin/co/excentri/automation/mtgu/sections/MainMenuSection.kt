package co.excentri.automation.mtgu.sections

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory

open class MainMenuSection(driver: AndroidDriver<*>) {

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    @AndroidFindBy(id = "main_menu_placeholder")
    lateinit var mainMenuElement: AndroidElement

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[contains(@text, 'Search')]")
    lateinit var searchOption: AndroidElement

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[contains(@text, 'Collection')]")
    lateinit var collectionOption: AndroidElement

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[contains(@text, 'Decks')]")
    lateinit var decksOption: AndroidElement

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[contains(@text, 'Favorites')]")
    lateinit var favoritesOption: AndroidElement

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[contains(@text, 'Trade Tool')]")
    lateinit var tradeToolOption: AndroidElement

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[contains(@text, 'Rules')]")
    lateinit var rulesOption: AndroidElement

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[contains(@text, 'Random Card')]")
    lateinit var randomCardOption: AndroidElement

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[contains(@text, 'Game Tools')]")
    lateinit var gameToolsOption: AndroidElement

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[contains(@text, 'Settings')]")
    lateinit var settingshOption: AndroidElement

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[contains(@text, 'Data & Backup')]")
    lateinit var dataAndBackuphOption: AndroidElement

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[contains(@text, 'Get PRO')]")
    lateinit var getProOption: AndroidElement

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[contains(@text, 'External Links')]")
    lateinit var externalLinksOption: AndroidElement

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[contains(@text, 'Feedback')]")
    lateinit var feedbackOption: AndroidElement

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Copyright policy')]")
    lateinit var copyrightPoliceOption: AndroidElement
}