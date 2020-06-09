package co.excentri.automation.mtgu

import co.excentri.automation.mtgu.actions.HomeActions
import co.excentri.automation.mtgu.actions.TipActions
import co.excentri.automation.mtgu.driver.DriverManager
import co.excentri.automation.mtgu.utils.Utils.Companion.elementExists
import org.assertj.core.api.Assertions.assertThat
import org.testng.annotations.Test

class SearchFeatureTest : DriverManager() {

    private val tipActions: TipActions = TipActions(driverFactory())
    private val homeActions: HomeActions = HomeActions(driverFactory())

    // TODO: Refactor it

    @Test
    fun `When a user select the option 'Search' the menu should disappear`() {
        tipActions.closeTip()
        assertThat(homeActions.options.isDisplayed).isTrue()
        homeActions.searchOption.click()
        assertThat(elementExists(homeActions.options)).isFalse()
        homeActions.openMenu()
        homeActions.closeMenu()
    }
}