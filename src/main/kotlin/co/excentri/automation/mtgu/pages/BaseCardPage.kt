package co.excentri.automation.mtgu.pages

import co.excentri.automation.mtgu.sections.ActionBarSection
import co.excentri.automation.mtgu.sections.BaseCardSection
import co.excentri.automation.mtgu.sections.MainMenuSection
import io.appium.java_client.android.AndroidDriver

open class BaseCardPage(driver: AndroidDriver<*>) {

    internal var actionBarSection: ActionBarSection = ActionBarSection(driver)
    internal var baseCardSearchSection: BaseCardSection = BaseCardSection(driver)
}