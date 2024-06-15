package ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.navigator

import ru.mixail_akulov.a33_mvvm_flows2.foundation.views.BaseScreen
import ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.navigator.plugin.NavigatorPlugin

/**
 * Интерфейс побочных эффектов для навигации из модели представления.
 * Прежде чем использовать эту функцию, вам необходимо добавить [NavigatorPlugin] в свою активность.
 */
interface Navigator {

    /**
     * Запустите новый экран в верхней части заднего стека.
     */
    fun launch(screen: BaseScreen)

    /**
     * Вернитесь к предыдущему экрану и, при желании, отправьте несколько результатов.
     */
    fun goBack(result: Any? = null)

}