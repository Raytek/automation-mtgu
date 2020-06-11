package co.excentri.automation.mtgu

import co.excentri.automation.mtgu.actions.TipActions
import co.excentri.automation.mtgu.driver.DriverManager
import io.appium.java_client.android.AndroidDriver
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TipFeatureTest : DriverManager() {

    private val driver: AndroidDriver<*> = driverFactory()
    private val tipActions: TipActions = TipActions(driver)

    @Test
    fun `When the app is started a tip should appear for the user`() {
        assertThat(tipActions.tipSection.dialogTitleElement.isDisplayed).isTrue()
        assertThat(tipActions.tipSection.dialogTitleElement.text).isEqualTo("Tips")
        assertThat(tipActions.tipSection.tipTitleElement.isDisplayed).isTrue()
        assertThat(tipActions.tipSection.tipTitleElement.text).isNotNull().isNotBlank().isNotEmpty()
        assertThat(tipActions.tipSection.tipDescriptionElement.isDisplayed).isTrue()
        assertThat(tipActions.tipSection.tipDescriptionElement.text).isNotNull().isNotBlank().isNotEmpty()
        assertThat(tipActions.tipSection.btnPositiveElement.isDisplayed).isTrue()
        assertThat(tipActions.tipSection.btnPositiveElement.isEnabled).isTrue()
    }
}