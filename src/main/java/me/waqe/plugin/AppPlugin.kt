package me.waqe.plugin

import me.waqe.plugin.events.EventsClass
import me.waqe.plugin.items.CustomItems
import net.md_5.bungee.api.ChatColor
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class App : JavaPlugin(), Listener {
    companion object {
        lateinit var instance: App
    }

    override fun onEnable() {
        server.consoleSender.sendMessage("${ChatColor.GREEN}Tutorial has been Enabled")
        server.pluginManager.registerEvents(EventsClass(), this)
        loadConfig()
        val items = CustomItems()
        items.customRecipe()
        items.unshaped()
    }

    override fun onDisable() {
        server.consoleSender.sendMessage("${ChatColor.RED}Tutorial has been Disabled")
    }

    fun loadConfig() {
        config.options().copyDefaults(true)
        saveConfig()
    }
}
