package ru.michaelilyin.smart.time.manager.core

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.util.Log
import mu.KLoggable
import mu.KLogger
import mu.KLogging
import org.jetbrains.anko.db.ManagedSQLiteOpenHelper

/**
 * TODO: javadoc
 * Created by Michael Ilyin on 28.10.2016.
 */
class DataBaseContext private constructor(context: Context) :
        ManagedSQLiteOpenHelper(context, "smart.time.manager", null, 2) {

    companion object : KLoggable {
        override val logger: KLogger = logger()

        private var instance: DataBaseContext? = null

        @Synchronized
        fun get(ctx: Context): DataBaseContext {
            if (instance == null) {
                logger.debug { "init database context" }
                instance = DataBaseContext(ctx.applicationContext)
            }
            return instance!!
        }
    }

    override fun onCreate(db: SQLiteDatabase) {
        logger.debug { "onCreate()" }
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        logger.debug { "onUpgrade($oldVersion, $newVersion)" }
    }

}