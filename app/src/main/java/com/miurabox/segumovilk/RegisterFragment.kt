package com.miurabox.segumovilk

import com.cursosant.insurance.registerModule.view.RegisterFragment
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
class RegisterFragment : RegisterFragment(){
    override fun onStart() {
        super.onStart()
        setImgCover(R.drawable.fondo)
        //setBackgroundColor(R.color.color_primary, R.color.color_on_primary)
    }
}