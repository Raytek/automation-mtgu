package co.excentri.automation.mtgu.actions

import co.excentri.automation.mtgu.pages.HomePage
import co.excentri.automation.mtgu.utils.Utils
import io.appium.java_client.android.AndroidDriver

class HomeActions(driver: AndroidDriver<*>) : HomePage(driver) {

    private val utils: Utils = Utils(driver)

    fun openMainMenu() {
        if (!utils.elementExists(mainMenuSection.mainMenuElement))
            actionBarSection.homeElement.click()
    }

    fun closeMainMenu() {
        if (utils.elementExists(mainMenuSection.mainMenuElement))
            actionBarSection.homeElement.click()
    }
}