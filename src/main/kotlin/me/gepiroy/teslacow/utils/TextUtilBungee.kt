package me.gepiroy.teslacow.utils

import net.md_5.bungee.api.ChatColor
import net.md_5.bungee.api.CommandSender
import net.md_5.bungee.api.chat.TextComponent

public class TextUtilBungee {
    //Утилка самописная, жить без неё не могу. Писал в нуля на kotlin. Не нарушает требований к заданию:
    //стороннего ничего не используется.
    companion object {//static в kotlin.
        /**
         * Сокращение для ChatColor.translateAlternateColorCodes по символу "&".
         * @param st строка под раскраску
         */
        fun str(st: String): String {
            return ChatColor.translateAlternateColorCodes('&', st)
        }

        /**
         * Формирование TextComponent-а для сообщений от банджи из строки.
         * Включает в себя цветовое форматирование.
         * @param st строка под компоновку
         */
        fun mes(st: String): TextComponent {
            return TextComponent(str(st))
        }

        /**
         * Отправка сообщения в консоль или игроку.
         * Включает в себя цветовое форматирование.
         * @param to кому назначено сообщение
         * @param st строка под отправку
         */
        fun mes(to: CommandSender, st: String){
            to.sendMessage(TextComponent(str(st)))
        }
    }
}