package me.gepiroy.teslacow.obj

import net.md_5.bungee.api.plugin.Plugin
import net.md_5.bungee.config.Configuration
import net.md_5.bungee.config.ConfigurationProvider
import net.md_5.bungee.config.YamlConfiguration
import java.io.File
import java.io.IOException

import java.io.InputStream

/*
 * @param name имя конфига без расширения. Должно совпадать с файлом в ресурсах.
 */
class ConfBungee(val name:String, val plugin: Plugin) {
    val file:File = File(plugin.dataFolder.path+"/$name.yml")
    val conf: Configuration;
    init{
        plugin.logger.info("init began...")
        if(!file.exists()){
            createConf()
        }
        conf = ConfigurationProvider.getProvider(YamlConfiguration::class.java).load(file)
    }
    fun createConf(){
        try {
            file.mkdirs();
            plugin.getResourceAsStream("$name.yml").use {res ->
                file.outputStream().use {dest->
                    res.copyTo(dest)
                }
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}