package ru.michaelilyin.smart.time.manager.core

import android.content.Context
import android.util.Log
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.eagerSingleton
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.singleton
import mu.KLoggable
import mu.KLogger
import mu.KLogging
import ru.michaelilyin.smart.time.manager.core.dao.ActionTypeDAO
import ru.michaelilyin.smart.time.manager.core.service.ActionTypeService

/**
 * TODO: javadoc
 * Created by Michael Ilyin on 29.10.2016.
 */
internal class BindingsContext private constructor() {
    companion object : KLoggable {
        override val logger: KLogger = logger()

        private var instance: Kodein? = null

        @Synchronized
        fun get(ctx: Context): Kodein {
            if (instance == null) {
                logger.debug { "init injector" }
                instance = Kodein {
                    bind<DataBaseContext>() with eagerSingleton { ctx.database }

                    bind<ActionTypeDAO>() with singleton { ActionTypeDAO(instance()) }

                    bind<ActionTypeService>() with singleton { ActionTypeService(instance()) }
                }
            }
            return instance!!
        }
    }
}