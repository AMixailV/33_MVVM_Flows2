package ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.resources

import androidx.annotation.StringRes

/**
 * Интерфейс для доступа к ресурсам из моделей представления.
 * Перед использованием этой функции вам необходимо добавить [ResourcesPlugin] в свою активность.
 */
interface Resources {

    fun getString(@StringRes resId: Int, vararg args: Any): String

}