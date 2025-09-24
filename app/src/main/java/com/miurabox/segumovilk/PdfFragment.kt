package com.miurabox.segumovilk

import com.cursosant.insurance.pdfModule.view.PdfFragment
import dagger.hilt.android.AndroidEntryPoint

/****
 * Project: Segumovil
 * From: com.miurabox.segumovilk
 * Created by Alain Nicolás Tello on 11/08/23 at 17:55
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
class PdfFragment : PdfFragment() {
    override fun onStart() {
        super.onStart()
        setupProvider("com.miurabox.segumovilk.fileprovider", "/segumovil_files/")
    }
}