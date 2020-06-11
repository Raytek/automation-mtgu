package co.excentri.automation.mtgu.actions

import co.excentri.automation.mtgu.pages.SearchPage
import io.appium.java_client.android.AndroidDriver

class SearchActions(driver: AndroidDriver<*>) : SearchPage(driver) {
    inner class Card() {
        fun name(name: String) = apply { searchSection.cardNameElement.sendKeys(name) }
        fun search() = apply { searchSection.btnSearchElement.click() }
    }
}