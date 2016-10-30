package ru.michaelilyin.smart.time.manager.core

import android.app.Application
import android.content.Context
import android.util.Log
import com.github.salomonbrys.kodein.instance
import mu.KLogging
import org.jetbrains.anko.doAsync
import ru.michaelilyin.smart.time.manager.core.DataBaseContext
import ru.michaelilyin.smart.time.manager.core.service.ActionTypeService

/**
 * TODO: javadoc
 * Created by Michael Ilyin on 28.10.2016.
 */
class TimeManagerApplication : Application() {

    companion object : KLogging()

    override fun onCreate() {
        super.onCreate()
        logger.info { "Starting time manager application" }
        val actionTypeService = injector.instance<ActionTypeService>()
    }

    override fun onTerminate() {
        super.onTerminate()
        logger.info { "Terminating time manager application" }
    }
}