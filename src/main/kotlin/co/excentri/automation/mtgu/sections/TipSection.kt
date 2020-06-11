package co.excentri.automation.mtgu.sections

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory

open class TipSection(driver: AndroidDriver<*>) {

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    @AndroidFindBy(id = "dialog_title")
    lateinit var dialogTitleElement: AndroidElement

    @AndroidFindBy(id = "tip_title")
    lateinit var tipTitleElement: AndroidElement

    @AndroidFindBy(id = "tip_description")
    lateinit var tipDescriptionElement: AndroidElement

    @AndroidFindBy(id = "btn_positive")
    lateinit var btnPositiveElement: AndroidElement
}