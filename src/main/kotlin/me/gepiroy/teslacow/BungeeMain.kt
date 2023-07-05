package me.gepiroy.teslacow

import me.gepiroy.teslacow.obj.ConfBungee
import net.md_5.bungee.api.plugin.Plugin

class BungeeMain : Plugin() {
    override fun onEnable() {
        // You should not put an enable message in your plugin.
        // BungeeCord already does so
        logger.info("Yay! It loads!")
        proxy.pluginManager.registerCommand(this, CowsayCommand())
        ConfBungee("mysql_settings", this)
    }
}