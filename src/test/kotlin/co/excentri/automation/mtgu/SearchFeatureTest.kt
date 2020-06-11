package co.excentri.automation.mtgu

import co.excentri.automation.mtgu.actions.BaseCardActions
import co.excentri.automation.mtgu.actions.HomeActions
import co.excentri.automation.mtgu.actions.SearchActions
import co.excentri.automation.mtgu.actions.TipActions
import co.excentri.automation.mtgu.driver.DriverManager
import co.excentri.automation.mtgu.utils.Utils.Companion.elementExists
import io.appium.java_client.android.AndroidDriver
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SearchFeatureTest : DriverManager() {

    private val driver: AndroidDriver<*> = driverFactory()
    private val tipActions: TipActions = TipActions(driver)
    private val homeActions: HomeActions = HomeActions(driver)
    private val card: SearchActions.Card = SearchActions(driver).Card()
    private val cardActions: BaseCardActions = BaseCardActions(driver)

    // TODO: Add more tests

    @Test
    fun `When a user searches for a card that card should be found`() {
        val cardName = "Deathrite Shaman"
        val cardManaCost = "{B/G}"
        val cardTypes = "Creature — Elf Shaman"

        tipActions.closeTip()
        assertThat(homeActions.mainMenuSection.mainMenuElement.isDisplayed).isTrue()
        homeActions.mainMenuSection.searchOption.click()
        assertThat(elementExists(homeActions.mainMenuSection.mainMenuElement)).isFalse()

        card.name(cardName).search()

        assertThat(cardActions.baseCardSearchSection.cardNameElement.text).isEqualTo(cardName)
        assertThat(cardActions.baseCardSearchSection.cardManaCostElement.text).isEqualTo(cardManaCost)
        assertThat(cardActions.baseCardSearchSection.cardTypesElement.text).isEqualTo(cardTypes)
        assertThat(cardActions.baseCardSearchSection.cardTextElement.text).isNotNull().isNotBlank().isNotEmpty()
    }
}