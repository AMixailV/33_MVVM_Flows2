package ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.intens

/**
Интерфейс побочных эффектов для запуска некоторых системных действий.
Перед использованием этой функции вам необходимо добавить [IntentsPlugin] в свою активность.
 */
interface Intents {

    /**
     * Откройте системные настройки для этого приложения.
     */
    fun openAppSettings()

}