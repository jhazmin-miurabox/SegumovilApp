package com.miurabox.segumovilk

import android.content.Intent
import android.util.Log
import com.cursosant.insurance.common.fcm.BaseFCMService

/****
 * Project: Ancora
 * From: com.miurabox.ancora
 * Created by Alain Nicolás Tello on 28/11/23 at 13
 * All rights reserved 2023.
 *
 * All my Udemy Courses:
 * https://www.udemy.com/user/alain-nicolas-tello/
 * And Frogames formación:
 * https://cursos.frogamesformacion.com/pages/instructor-alain-nicolas
 *
 * Coupons on my Website:
 * www.alainnicolastello.com
 ***/
class FCMService : BaseFCMService() {
    override fun onNewToken(newToken: String) {
        super.onNewToken(newToken)
        Log.i("CursosANTLog", newToken)
    }

    override fun onCreate() {
        super.onCreate()
        setValues(R.drawable.ic_stat_name, R.color.color_primary, Intent(this, MainActivity::class.java))
    }
}