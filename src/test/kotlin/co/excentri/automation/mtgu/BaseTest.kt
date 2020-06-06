package co.excentri.automation.mtgu

import io.appium.java_client.android.AndroidDriver
import org.assertj.core.api.Assertions.assertThat
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.DesiredCapabilities
import org.springframework.boot.test.context.SpringBootTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import java.io.File
import java.net.URL

@SpringBootTest
class BaseTest {

    internal lateinit var driver: AndroidDriver<*>

    @BeforeTest
    fun setUp() {
        val url = "http://localhost:4723/wd/hub"
        val apk = File("src/test/resources/mtg_unofficial_v_2_4_0.apk")

        val dc = DesiredCapabilities()
        dc.setCapability("platformVersion", "10")
        dc.setCapability("app", apk.absolutePath)
        dc.setCapability("appPackage", "io.carlol.mtgu.mobile")
        dc.setCapability("appWaitActivity", "io.carlol.mtgu.mobile.MtguActivity")
        dc.setCapability("appWaitDuration", "30000")
        dc.setCapability("deviceName", "Pixel_3a_XL_API_29")
        dc.setCapability("automationName", "UiAutomator2")
        dc.setCapability("autoGrantPermissions", "true")
        dc.setCapability("autoAcceptAlerts", "true")

        driver = AndroidDriver<WebElement>(URL(url), dc)
    }

    @Test
    fun `When the app is started a tip should appear for the user`() {
        assertThat(driver.findElement(By.id("dialog_title")).isDisplayed).isTrue()
        assertThat(driver.findElement(By.id("dialog_title")).text).isEqualTo("Tips")
        assertThat(driver.findElement(By.id("tip_title")).isDisplayed).isTrue()
        assertThat(driver.findElement(By.id("tip_title")).text).isNotNull().isNotBlank()
        assertThat(driver.findElement(By.id("tip_description")).isDisplayed).isTrue()
        assertThat(driver.findElement(By.id("tip_description")).text).isNotNull().isNotBlank()
        assertThat(driver.findElement(By.id("btn_positive")).isDisplayed).isTrue()
        assertThat(driver.findElement(By.id("btn_positive")).isEnabled).isTrue()
    }

}
