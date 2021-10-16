package it.bisumto.example;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Example implements ModInitializer {
    public static final String MOD_ID = "fabric-mod-template";
    public static final String MOD_NAME = "Fabric Mod Template";
    public static final String MOD_VERSION = "1.0.0";
    public static final Logger LOG = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        System.out.println("Test");
    }

}
