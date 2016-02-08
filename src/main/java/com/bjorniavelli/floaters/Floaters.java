package com.bjorniavelli.floaters;

import com.bjorniavelli.floaters.proxy.IProxy;
import com.bjorniavelli.floaters.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class Floaters
{
    @Mod.Instance(Reference.MOD_ID)
    public static Floaters instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        proxy.preInit(e);
    }

    public void init (FMLInitializationEvent e)
    {
        proxy.init(e);
    }

    public void postInit (FMLPostInitializationEvent e)
    {
        proxy.postInit(e);
    }
}
