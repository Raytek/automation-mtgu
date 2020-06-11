package co.excentri.automation.mtgu.sections

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory

open class ActionBarSection(driver: AndroidDriver<*>) {

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    @AndroidFindBy(id = "android:id/home")
    lateinit var homeElement: AndroidElement

    @AndroidFindBy(id = "android:id/action_bar_title")
    lateinit var titleElement: AndroidElement
}