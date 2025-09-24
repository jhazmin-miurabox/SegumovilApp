package com.miurabox.segumovilk

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cursosant.insurance.common.entities.User
import com.cursosant.insurance.common.utils.NavUtils
import com.cursosant.insurance.homeModule.view.HomeFragment
import com.miurabox.segumovilk.databinding.FragmentHomeCustomBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

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
class HomeFragment : HomeFragment() {
    override fun onStart() {
        super.onStart()
        setImgCover(R.drawable.fondo_menu)
        setBackgroundColor(R.color.color_custom_background)
        //showQuoter()
    }
}