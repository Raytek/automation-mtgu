package co.excentri.automation.mtgu

import co.excentri.automation.mtgu.actions.TipActions
import co.excentri.automation.mtgu.driver.DriverManager
import org.assertj.core.api.Assertions.assertThat
import org.testng.annotations.Test

class TipFeatureTest : DriverManager() {

    private val tipActions: TipActions = TipActions(driverFactory())

    @Test
    fun `When the app is started a tip should appear for the user`() {
        assertThat(tipActions.dialogTitleElement.isDisplayed).isTrue()
        assertThat(tipActions.dialogTitleElement.text).isEqualTo("Tips")
        assertThat(tipActions.tipTitleElement.isDisplayed).isTrue()
        assertThat(tipActions.tipTitleElement.text).isNotNull().isNotBlank()
        assertThat(tipActions.tipDescriptionElement.isDisplayed).isTrue()
        assertThat(tipActions.tipDescriptionElement.text).isNotNull().isNotBlank()
        assertThat(tipActions.btnPositiveElement.isDisplayed).isTrue()
        assertThat(tipActions.btnPositiveElement.isEnabled).isTrue()
    }
}