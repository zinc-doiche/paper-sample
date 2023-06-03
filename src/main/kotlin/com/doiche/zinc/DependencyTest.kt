package com.doiche.zinc

import org.bukkit.Material
import org.bukkit.craftbukkit.v1_19_R3.inventory.CraftItemStack
import org.bukkit.inventory.ItemStack

class DependencyTest {
    fun doSth(a: String) {
        println(a)
        CraftItemStack.asNMSCopy(ItemStack(Material.FISHING_ROD)).barWidth
    }
}