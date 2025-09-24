package com.miurabox.segumovilk

import com.cursosant.insurance.privacyModule.view.PrivacyFragment
import dagger.hilt.android.AndroidEntryPoint

/****
 * Project: Segumovil
 * From: com.miurabox.segumovilk
 * Created by Alain Nicolás Tello on 31/07/23 at 14:38
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
class PrivacyFragment : PrivacyFragment() {
    override fun onStart() {
        super.onStart()
        setWebsite("https://heysaam.com/segumovil")
        setPrivacyPolicies(R.string.privacy_policies)
    }
}