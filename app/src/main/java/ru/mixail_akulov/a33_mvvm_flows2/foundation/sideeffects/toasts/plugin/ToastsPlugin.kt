package ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.toasts.plugin

import android.content.Context
import ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.SideEffectMediator
import ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.SideEffectPlugin
import ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.toasts.Toasts

/**
 * Плагин для отображения всплывающих сообщений от моделей представления.
 * Позволяет добавить интерфейс [Toasts] в конструктор модели представления.
 */
class ToastsPlugin : SideEffectPlugin<Toasts, Nothing> {

    override val mediatorClass: Class<Toasts>
        get() = Toasts::class.java

    override fun createMediator(applicationContext: Context): SideEffectMediator<Nothing> {
        return ToastsSideEffectMediator(applicationContext)
    }

}