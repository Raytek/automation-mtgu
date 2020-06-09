package co.excentri.automation.mtgu.actions

import co.excentri.automation.mtgu.pages.HomePage
import io.appium.java_client.android.AndroidDriver
import co.excentri.automation.mtgu.utils.Utils.Companion.elementExists

class HomeActions(driver: AndroidDriver<*>) : HomePage(driver) {

    private val actionBarActions: ActionBarActions = ActionBarActions(driver)

    fun openMenu() {
        if (!elementExists(options))
            actionBarActions.homeElement.click()
    }

    fun closeMenu() {
        if (elementExists(options))
            actionBarActions.homeElement.click()
    }
}