package ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.toasts

/**
 * Интерфейс для показа всплывающих сообщений пользователю из моделей представления.
 * Вам нужно добавить [ToastsPlugin] в свою активность, прежде чем использовать эту функцию.
 */
interface Toasts {

    /**
     * Показать простое всплывающее сообщение.
     */
    fun toast(message: String)

}