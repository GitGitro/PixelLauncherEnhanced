package com.drdisagree.pixellauncherenhanced.xposed

import com.drdisagree.pixellauncherenhanced.data.common.Constants.LAUNCHER3_PACKAGE
import com.drdisagree.pixellauncherenhanced.data.common.Constants.PIXEL_LAUNCHER_PACKAGE
import com.drdisagree.pixellauncherenhanced.xposed.mods.ClearAllButton
import com.drdisagree.pixellauncherenhanced.xposed.mods.DrawerSearchbar
import com.drdisagree.pixellauncherenhanced.xposed.mods.LauncherSettings
import com.drdisagree.pixellauncherenhanced.xposed.mods.GestureMod
import com.drdisagree.pixellauncherenhanced.xposed.mods.GridOptions
import com.drdisagree.pixellauncherenhanced.xposed.mods.HideStatusbar
import com.drdisagree.pixellauncherenhanced.xposed.mods.HotseatMod
import com.drdisagree.pixellauncherenhanced.xposed.mods.IconLabels
import com.drdisagree.pixellauncherenhanced.xposed.mods.IconTextSize
import com.drdisagree.pixellauncherenhanced.xposed.mods.IconUpdater
import com.drdisagree.pixellauncherenhanced.xposed.mods.LauncherUtils
import com.drdisagree.pixellauncherenhanced.xposed.mods.LockLayout
import com.drdisagree.pixellauncherenhanced.xposed.mods.OpacityModifier
import com.drdisagree.pixellauncherenhanced.xposed.mods.SmartSpace
import com.drdisagree.pixellauncherenhanced.xposed.mods.ThemedIcons
import com.drdisagree.pixellauncherenhanced.xposed.mods.TopShadow
import com.drdisagree.pixellauncherenhanced.xposed.utils.HookCheck

object EntryList {

    private val launcherModPacks: List<Class<out ModPack>> = listOf(
        HookCheck::class.java,
        LauncherUtils::class.java,
        IconUpdater::class.java,
        ThemedIcons::class.java,
        OpacityModifier::class.java,
        GestureMod::class.java,
        IconLabels::class.java,
        HotseatMod::class.java,
        IconTextSize::class.java,
        SmartSpace::class.java,
        HideStatusbar::class.java,
        TopShadow::class.java,
        LauncherSettings::class.java,
        LockLayout::class.java,
        DrawerSearchbar::class.java,
        ClearAllButton::class.java,
        GridOptions::class.java
    )

    fun getEntries(packageName: String): ArrayList<Class<out ModPack>> {
        val modPacks = ArrayList<Class<out ModPack>>()

        when (packageName) {
            PIXEL_LAUNCHER_PACKAGE,
            LAUNCHER3_PACKAGE -> {
                modPacks.addAll(launcherModPacks)
            }
        }

        return modPacks
    }
}
