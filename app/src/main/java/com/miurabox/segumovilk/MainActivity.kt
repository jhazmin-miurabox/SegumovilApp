package com.miurabox.segumovilk

import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.cursosant.insurance.R
import com.cursosant.insurance.common.utils.NavUtils
import com.cursosant.insurance.databinding.ActivityMainBinding
import com.cursosant.insurance.mainModule.view.MainActivity
import com.google.android.material.navigation.NavigationView
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
class MainActivity : MainActivity() {
    @Inject lateinit var navUtils: NavUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)

        setupInit()
    }

    private fun setupInit() {
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        val graph = navController.navInflater.inflate(com.miurabox.segumovilk.R.navigation.mobile_navigation_custom)

        with(navUtils) {
            this.navController = navController

            actionDeleteAccountToLogin = com.miurabox.segumovilk.R.id.action_delete_account_to_login
            actionDocumentsToPdf =  com.miurabox.segumovilk.R.id.action_documents_to_pdf
            actionPolicyDetailToPdf = com.miurabox.segumovilk.R.id.action_policy_detail_to_pdf
            actionPoliciesToPolicyDetail = com.miurabox.segumovilk.R.id.action_policies_to_policy_detail
            actionPolicyDetailToPdf = com.miurabox.segumovilk.R.id.action_policy_detail_to_pdf
            actionSignoutToLogin = com.miurabox.segumovilk.R.id.action_sign_out_to_login
            actionAboutToPrivacy = com.miurabox.segumovilk.R.id.action_about_to_privacy
            actionLoginToRegister = com.miurabox.segumovilk.R.id.action_login_to_register
            actionLoginToHome = com.miurabox.segumovilk.R.id.action_login_to_home
            actionRegisterToLogin = com.miurabox.segumovilk.R.id.action_register_to_login
            actionQuoteToQuoteResult = com.miurabox.segumovilk.R.id.action_quote_to_quote_result
            actionQuoteResultToQuoteResultDetail = com.miurabox.segumovilk.R.id.action_quote_result_to_quote_result_detail

            actionToAbout = com.miurabox.segumovilk.R.id.action_to_about
            actionToPolicies= com.miurabox.segumovilk.R.id.action_to_policies
            actionToInsurers = com.miurabox.segumovilk.R.id.action_to_insurers
            actionToQuote = com.miurabox.segumovilk.R.id.action_to_quote
            actionToCallEmergency = com.miurabox.segumovilk.R.id.action_to_call_emergency
            actionToSinister = com.miurabox.segumovilk.R.id.action_to_sinister
            actionToDocuments = com.miurabox.segumovilk.R.id.action_to_documents
        }

        navView.inflateMenu(com.miurabox.segumovilk.R.menu.activity_main_drawer_custom)
        graph.setStartDestination(R.id.nav_home)
        navController.setGraph(graph, null)
        navController.navigate(com.miurabox.segumovilk.R.id.action_global_to_login)

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_about, R.id.nav_policies, R.id.nav_quote, R.id.nav_insurers,
                com.miurabox.segumovilk.R.id.nav_documents, R.id.nav_contact, R.id.nav_sign_out, R.id.nav_delete_account,
                R.id.nav_call_emergency, R.id.nav_sinister, R.id.nav_privacy
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        setImgCover(com.miurabox.segumovilk.R.drawable.logo_blanco)
    }
}