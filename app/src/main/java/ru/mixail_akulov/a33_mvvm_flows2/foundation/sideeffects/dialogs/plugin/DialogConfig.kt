package ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.dialogs.plugin

/**
 * Configuration of alert dialog displayed by [Dialogs.show]
 */
data class DialogConfig(
    val title: String,
    val message: String,
    val positiveButton: String = "",
    val negativeButton: String = "",
    val cancellable: Boolean = true
)