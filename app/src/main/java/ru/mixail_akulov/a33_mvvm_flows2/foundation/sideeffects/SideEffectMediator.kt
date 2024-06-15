package ru.mixail_akulov.a33_mvvm_flows2.foundation.sideeffects

import ru.mixail_akulov.a33_mvvm_flows2.foundation.utils.MainThreadExecutor
import ru.mixail_akulov.a33_mvvm_flows2.foundation.utils.ResourceActions
import java.util.concurrent.Executor

/**
 * Базовый класс для всех медиаторов побочных эффектов.
 * Эти посредники живут в [ActivityScopeViewModel].
 * Посредник должен делегировать всю логику, связанную с пользовательским интерфейсом, реализациям через поле [target].
 */
open class SideEffectMediator<Implementation>(
    executor: Executor = MainThreadExecutor()
) {

    protected val target = ResourceActions<Implementation>(executor)

    /**
     * Назначить/Отменить назначение целевой реализации для этого поставщика.
     */
    fun setTarget(target: Implementation?) {
        this.target.resource = target
    }

    fun clear() {
        target.clear()
    }
}