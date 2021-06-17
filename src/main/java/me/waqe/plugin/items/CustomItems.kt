package me.waqe.plugin.items

import me.waqe.plugin.App.Companion.instance
import net.md_5.bungee.api.ChatColor
import org.bukkit.Material
import org.bukkit.inventory.ItemFlag
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.ShapedRecipe
import org.bukkit.inventory.ShapelessRecipe




class CustomItems {


    fun customRecipe() {
        val item = ItemStack(Material.DIAMOND_AXE, 1)
        val meta = item.itemMeta
        meta!!.setDisplayName(ChatColor.AQUA.toString() + "AXE OF ZEUS")
        val lore = ArrayList<String>()
        lore.add(ChatColor.WHITE.toString() + "Used by Zeus in the great god battle")
        meta.lore = lore
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES)
        item.itemMeta = meta
        val r = ShapedRecipe(item)
        r.shape("#% ", "#$ ", " $ ")
        r.setIngredient('#', Material.DIAMOND)
        r.setIngredient('%', Material.IRON_INGOT)
        r.setIngredient('$', Material.STICK)
        instance.server.addRecipe(r)
    }

    fun unshaped() {
        val item = ItemStack(Material.ENDER_PEARL, 1)
        val slr = ShapelessRecipe(item)
        slr.addIngredient(3, Material.LAVA_BUCKET)
        slr.addIngredient(3, Material.FLINT)
        instance.server.addRecipe(slr)
    }
}
