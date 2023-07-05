package me.gepiroy.teslacow

import me.gepiroy.teslacow.utils.TextUtilBungee
import net.md_5.bungee.api.CommandSender
import net.md_5.bungee.api.chat.TextComponent
import net.md_5.bungee.api.connection.ProxiedPlayer
import net.md_5.bungee.api.plugin.Command

class CowsayCommand: Command("cowsay"){
    override fun execute(sender: CommandSender, args: Array<out String>) {
        if(args.isEmpty()){
            TextUtilBungee.mes(sender,"&7/&fcowsay &c<text>")
            return;
        }
        if(sender is ProxiedPlayer){
            val p: ProxiedPlayer = sender
            p.sendMessage(TextComponent("Your ping is "+p.ping))
        }
    }
}