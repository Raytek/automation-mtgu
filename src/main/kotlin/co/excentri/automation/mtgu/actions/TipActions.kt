package co.excentri.automation.mtgu.actions

import co.excentri.automation.mtgu.pages.TipPage
import io.appium.java_client.android.AndroidDriver

class TipActions(driver: AndroidDriver<*>) : TipPage(driver) {

    fun closeTip() {
        if (btnPositiveElement.isDisplayed && btnPositiveElement.isEnabled)
            btnPositiveElement.click()
    }
}