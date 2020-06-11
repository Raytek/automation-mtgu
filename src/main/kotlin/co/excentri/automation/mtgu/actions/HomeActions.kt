package co.excentri.automation.mtgu.actions

import co.excentri.automation.mtgu.pages.HomePage
import co.excentri.automation.mtgu.utils.Utils.Companion.elementExists
import io.appium.java_client.android.AndroidDriver

class HomeActions(driver: AndroidDriver<*>) : HomePage(driver) {

    fun openMainMenu() {
        if (!elementExists(mainMenuSection.mainMenuElement))
            actionBarSection.homeElement.click()
    }

    fun closeMainMenu() {
        if (elementExists(mainMenuSection.mainMenuElement))
            actionBarSection.homeElement.click()
    }
}