package com.miurabox.segumovilk

import com.cursosant.insurance.aboutModule.view.AboutFragment
import dagger.hilt.android.AndroidEntryPoint

/****
 * Project: Segumovil
 * From: com.miurabox.segumovil
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
class AboutFragment : AboutFragment() {
    override fun onStart() {
        super.onStart()
        setImgCover(R.drawable.fondo_nosotros)
        setAboutDescription(R.string.about_description)
        setWebsite("https://heysaam.com/inicio")
    }
}