package io.github.loyodea.obimod;

import io.github.loyodea.obimod.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(obimod.MODID)
public class obimod {
    public static final String MODID = "obimod";
    public obimod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID) {
        @Override
        public ItemStack makeIcon() {return ItemInit.OBI_SWORD.get().getDefaultInstance();}
    };
}
