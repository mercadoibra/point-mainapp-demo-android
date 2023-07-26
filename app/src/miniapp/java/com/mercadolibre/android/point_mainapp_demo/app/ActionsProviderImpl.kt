package com.mercadolibre.android.point_mainapp_demo.app

import android.content.Context
import androidx.appcompat.content.res.AppCompatResources
import com.mercadolibre.android.point_mainapp_demo.app.actions.contract.ActionsProvicer
import com.mercadolibre.android.point_mainapp_demo.app.actions.contract.HomeActions
import com.mercadolibre.android.point_mainapp_demo.app.actions.model.ActionModel
import com.mercadolibre.android.point_mainapp_demo.app.view.info.SmartInfoActivity
import com.mercadolibre.android.point_mainapp_demo.app.view.payment.launcher.PaymentLauncherActivity
import com.mercadolibre.android.point_mainapp_demo.app.view.printer.PrinterBitmapActivity

object ActionsProviderImpl : ActionsProvicer {

    override fun getActions(context: Context): List<ActionModel> {
        return listOf(
            ActionModel(
                title = context.getString(R.string.point_mainapp_demo_app_go_to_payment),
                icon = AppCompatResources.getDrawable(context, R.drawable.point_mainapp_demo_app_ic_payments),
                action = HomeActions.LaunchActivity(PaymentLauncherActivity::class.java)
            ),
            ActionModel(
                title = context.getString(R.string.point_mainapp_demo_app_home_printer_bitmap),
                icon = AppCompatResources.getDrawable(context, R.drawable.point_mainapp_demo_app_black_ic_print),
                action = HomeActions.LaunchActivity(PrinterBitmapActivity::class.java)
            ),
            ActionModel(
                title = context.getString(R.string.point_mainapp_demo_app_smart_info_main_title),
                icon = AppCompatResources.getDrawable(context, R.drawable.point_mainapp_demo_app_ic_info),
                action = HomeActions.LaunchActivity(SmartInfoActivity::class.java)
            ),
        )
    }
}