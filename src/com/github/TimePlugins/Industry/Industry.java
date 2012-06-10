package com.github.TimePlugins.Industry;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class Industry extends JavaPlugin {
	Logger log;

	public void onEnable(){ 
		log = this.getLogger();
		log.info("Timeplugins has been enabled.");
	}
	
	public void onDisable(){ 
		log.info("Timeplugins has been enabled.");
	}
	
}
