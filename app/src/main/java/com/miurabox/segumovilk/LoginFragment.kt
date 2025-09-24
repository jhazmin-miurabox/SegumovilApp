package com.miurabox.segumovilk

import com.cursosant.insurance.loginModule.view.LoginFragment
import dagger.hilt.android.AndroidEntryPoint

/****
 * Project: Segumovil
 * From: com.miurabox.segumovilk
 * Created by Alain Nicolás Tello on 14/07/23 at 16:01
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
@AndroidEntryPoint
class LoginFragment : LoginFragment() {
    override fun onStart() {
        super.onStart()
        setImgCover(R.drawable.fondo)
        setImgLogo(R.drawable.logo_p)
        //setBackgroundColor(R.color.color_primary, R.color.color_on_primary)
    }
}