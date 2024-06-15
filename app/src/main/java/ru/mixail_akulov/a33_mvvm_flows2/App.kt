package ru.mixail_akulov.a33_mvvm_flows2

import android.app.Application
import ru.mixail_akulov.a33_mvvm_flows2.foundation.BaseApplication
import ru.mixail_akulov.a33_mvvm_flows2.foundation.model.coroutines.IoDispatcher
import ru.mixail_akulov.a33_mvvm_flows2.foundation.model.coroutines.WorkerDispatcher
import ru.mixail_akulov.a33_mvvm_flows2.simplemvvm.model.colors.InMemoryColorsRepository

/**
 * Здесь мы храним экземпляры классов слоя модели.
 */
class App : Application(), BaseApplication {

    // holder classes are used because we have 2 dispatchers of the same type
    private val ioDispatcher = IoDispatcher() // for IO operations
    private val workerDispatcher = WorkerDispatcher() // for CPU-intensive operations

    /**
     * Place your singleton scope dependencies here
     */
    override val singletonScopeDependencies: List<Any> = listOf(
        ioDispatcher,
        workerDispatcher,

        InMemoryColorsRepository(ioDispatcher)
    )
}