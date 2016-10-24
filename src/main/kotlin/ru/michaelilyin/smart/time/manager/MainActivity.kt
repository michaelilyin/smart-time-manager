package ru.michaelilyin.smart.time.manager

import android.app.Activity
import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.SimpleAdapter
import org.jetbrains.anko.*
import java.util.*

/**
 * TODO: javadoc
 * Created by Michael Ilyin on 20.10.2016.
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        linearLayout {
            orientation = LinearLayout.VERTICAL
            horizontalScrollView() {
                linearLayout {
                    orientation = LinearLayout.HORIZONTAL
                    button("Start action 1")
                    button("Start action 2")
                    button("Start action 3")
                    button("Start action 4")
                }
            }
            horizontalScrollView {
                linearLayout {
                    orientation = LinearLayout.HORIZONTAL
                    button("End action 1")
                    button("End action 2")
                    button("End action 3")
                    button("End action 4")
                }
            }
            textView("Component with today")
        }
    }

}