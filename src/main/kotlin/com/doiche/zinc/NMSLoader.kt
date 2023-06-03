package com.doiche.zinc

import org.bukkit.plugin.java.JavaPlugin

class NMSLoader: JavaPlugin() {
    override fun onEnable() {
        logger.info("=====Enable NMS loader.")
    }
}