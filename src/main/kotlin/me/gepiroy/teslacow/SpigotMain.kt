package me.gepiroy.teslacow

import org.bukkit.plugin.java.JavaPlugin

class SpigotMain : JavaPlugin(){
    override fun onEnable() {
        logger.info("Yay! It loads from bukkit!")
    }
}