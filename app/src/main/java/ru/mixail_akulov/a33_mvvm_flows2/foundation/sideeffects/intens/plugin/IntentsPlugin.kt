package ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.intens.plugin

import android.content.Context
import ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.intens.Intents
import ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.SideEffectMediator
import ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.SideEffectPlugin

/**
    Плагин для запуска системных активностей из view-моделей.
    Позволяет добавить интерфейс [Intents] в конструктор модели представления.
 */
class IntentsPlugin : SideEffectPlugin<Intents, Nothing> {

    override val mediatorClass: Class<Intents>
        get() = Intents::class.java

    override fun createMediator(applicationContext: Context): SideEffectMediator<Nothing> {
        return IntentsSideEffectMediator(applicationContext)
    }

}