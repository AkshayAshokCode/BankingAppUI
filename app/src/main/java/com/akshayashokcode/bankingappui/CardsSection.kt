package com.akshayashokcode.bankingappui

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.akshayashokcode.bankingappui.data.Card
import com.akshayashokcode.bankingappui.ui.theme.Pink40
import com.akshayashokcode.bankingappui.ui.theme.Pink80
import com.akshayashokcode.bankingappui.ui.theme.Purple40
import com.akshayashokcode.bankingappui.ui.theme.Purple80
import com.akshayashokcode.bankingappui.ui.theme.PurpleGrey40
import com.akshayashokcode.bankingappui.ui.theme.PurpleGrey80


val cards = listOf(
    Card(
        cardType = "VISA",
        cardNumber = "**** **** **** 3421",
        cardName = "Business",
        balance = 46.674,
        color = getGradient(Purple40, Purple80)
    ),
    Card(
        cardType = "MASTERCARD",
        cardNumber = "**** **** **** 5454",
        cardName = "Saving",
        balance = 146.674,
        color = getGradient(PurpleGrey40, PurpleGrey80)
    ),
    Card(
        cardType = "Visa",
        cardNumber = "**** **** **** 9890",
        cardName = "School",
        balance = 6.674,
        color = getGradient(Pink40, Pink80)
    ),
    Card(
        cardType = "Visa",
        cardNumber = "**** **** **** 8765",
        cardName = "Business",
        balance = 4.674,
        color = getGradient(Purple40, Purple80)
    ),
)

fun getGradient(
    startColor: Color,
    endColor: Color
) :Brush {
    return Brush.horizontalGradient(colors = listOf(startColor, endColor))
}
@Composable
fun CardsSection() {

}