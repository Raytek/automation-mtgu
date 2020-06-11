package co.excentri.automation.mtgu.actions

import co.excentri.automation.mtgu.pages.TipPage
import io.appium.java_client.android.AndroidDriver

class TipActions(driver: AndroidDriver<*>) : TipPage(driver) {

    fun closeTip() {
        if (tipSection.btnPositiveElement.isDisplayed && tipSection.btnPositiveElement.isEnabled)
            tipSection.btnPositiveElement.click()
    }
}