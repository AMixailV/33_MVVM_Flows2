package ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.resources.plugin

import android.content.Context
import ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.SideEffectMediator
import ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects.resources.Resources

class ResourcesSideEffectMediator(
    private val appContext: Context
) : SideEffectMediator<Nothing>(), Resources {

    override fun getString(resId: Int, vararg args: Any): String {
        return appContext.getString(resId, *args)
    }

}