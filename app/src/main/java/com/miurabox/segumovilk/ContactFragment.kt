package com.miurabox.segumovilk

import com.cursosant.insurance.contactModule.view.ContactFragment
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
class ContactFragment : ContactFragment() {
    override fun onStart() {
        super.onStart()
        setImgCover(R.drawable.img_map_office)
        setAddress(getString(R.string.contact_address))
        setLatLong(20.671401,-100.43791)
    }
}