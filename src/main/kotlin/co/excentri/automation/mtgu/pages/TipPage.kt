package co.excentri.automation.mtgu.pages

import co.excentri.automation.mtgu.sections.TipSection
import io.appium.java_client.android.AndroidDriver

open class TipPage(driver: AndroidDriver<*>) {

    internal var tipSection: TipSection = TipSection(driver)
}