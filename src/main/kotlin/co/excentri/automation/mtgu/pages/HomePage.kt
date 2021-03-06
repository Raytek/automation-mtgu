package co.excentri.automation.mtgu.pages

import co.excentri.automation.mtgu.sections.ActionBarSection
import co.excentri.automation.mtgu.sections.MainMenuSection
import io.appium.java_client.android.AndroidDriver

open class HomePage(driver: AndroidDriver<*>) {

    internal var actionBarSection: ActionBarSection = ActionBarSection(driver)
    internal var mainMenuSection: MainMenuSection = MainMenuSection(driver)
}