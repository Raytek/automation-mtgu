package co.excentri.automation.mtgu.pages

import co.excentri.automation.mtgu.sections.ActionBarSection
import co.excentri.automation.mtgu.sections.SearchSection
import io.appium.java_client.android.AndroidDriver

open class SearchPage(driver: AndroidDriver<*>) {

    internal var actionBarSection: ActionBarSection = ActionBarSection(driver)
    internal var searchSection: SearchSection = SearchSection(driver)
}