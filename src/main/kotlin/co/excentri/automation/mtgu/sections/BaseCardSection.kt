package co.excentri.automation.mtgu.sections

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory

class BaseCardSection(driver: AndroidDriver<*>) {

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    @AndroidFindBy(id = "textView_card_name")
    lateinit var cardNameElement: AndroidElement

    @AndroidFindBy(id = "textView_card_mana_cost")
    lateinit var cardManaCostElement: AndroidElement

    @AndroidFindBy(id = "textView_card_types")
    lateinit var cardTypesElement: AndroidElement

    @AndroidFindBy(id = "textView_card_text")
    lateinit var cardTextElement: AndroidElement
}