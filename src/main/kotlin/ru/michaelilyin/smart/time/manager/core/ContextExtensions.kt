package ru.michaelilyin.smart.time.manager.core

import android.content.Context
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.KodeinContainer
import com.github.salomonbrys.kodein.TKodein
import org.jetbrains.anko.db.ManagedSQLiteOpenHelper

/**
 * TODO: javadoc
 * Created by Michael Ilyin on 29.10.2016.
 */

val Context.database: DataBaseContext
    get() = DataBaseContext.get(this)

val Context.injector: Kodein
    get() = BindingsContext.get(this)