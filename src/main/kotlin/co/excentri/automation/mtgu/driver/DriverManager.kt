package co.excentri.automation.mtgu.driver

import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.DesiredCapabilities
import java.io.File
import java.net.URL
import java.util.concurrent.TimeUnit.SECONDS

open class DriverManager {
    companion object {
        fun driverFactory(): AndroidDriver<*> {
            val driver: AndroidDriver<*>
            val url = "http://localhost:4723/wd/hub"
            val apk = File("src/test/resources/mtg_unofficial_v_2_4_0.apk")

            val dc = DesiredCapabilities()
            dc.setCapability("platformVersion", "10")
            dc.setCapability("app", apk.absolutePath)
            dc.setCapability("appPackage", "io.carlol.mtgu.mobile")
            dc.setCapability("appWaitActivity", "io.carlol.mtgu.mobile.MtguActivity")
            dc.setCapability("deviceName", "device")
            dc.setCapability("automationName", "UiAutomator2")
            dc.setCapability("autoGrantPermissions", "true")
            dc.setCapability("autoAcceptAlerts", "true")

            driver = AndroidDriver<WebElement>(URL(url), dc)
            driver.manage().timeouts().implicitlyWait(2, SECONDS)

            return driver
        }
    }
}
