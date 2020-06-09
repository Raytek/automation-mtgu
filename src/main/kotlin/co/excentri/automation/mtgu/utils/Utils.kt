package co.excentri.automation.mtgu.utils

import io.appium.java_client.android.AndroidElement
import org.openqa.selenium.NoSuchElementException

class Utils {
    companion object {
        fun elementExists(element: AndroidElement): Boolean {
            var exist: Boolean = true
            try {
                element.isDisplayed
            } catch (e: NoSuchElementException) {
                exist = false
            } finally {
                return exist
            }
        }
    }
}