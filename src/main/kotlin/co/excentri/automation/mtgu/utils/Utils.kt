package co.excentri.automation.mtgu.utils

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidElement
import org.openqa.selenium.NoSuchElementException
import org.openqa.selenium.StaleElementReferenceException
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.WebDriverWait


class Utils(val driver: AndroidDriver<*>) {

    private fun invisibilityOfElementLocated(element: AndroidElement): ExpectedCondition<Boolean> {
        return ExpectedCondition {
            try {
                !element.isDisplayed
            } catch (e: NoSuchElementException) {
                true
            } catch (e: StaleElementReferenceException) {
                true
            }
        }
    }

    fun elementExists(element: AndroidElement): Boolean {
        return !WebDriverWait(driver, 2).until(invisibilityOfElementLocated(element))
    }
}