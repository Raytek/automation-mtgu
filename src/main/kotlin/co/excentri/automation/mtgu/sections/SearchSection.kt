package co.excentri.automation.mtgu.sections

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory

open class SearchSection(driver: AndroidDriver<*>) {

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    @AndroidFindBy(id = "filter_card_name")
    lateinit var cardNameElement: AndroidElement

    @AndroidFindBy(id = "sumbit_search")
    lateinit var btnSearchElement: AndroidElement
}