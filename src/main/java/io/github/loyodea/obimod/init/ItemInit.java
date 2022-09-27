package io.github.loyodea.obimod.init;

import io.github.loyodea.obimod.base.ObiArmorMaterial;
import io.github.loyodea.obimod.obimod;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, obimod.MODID);

    // OBSIDIAN INGOT
    public static final RegistryObject<Item> OBI_INGOT = ITEMS.register("obi_ingot",
            () -> new Item(props()));

    // OBSIDIAN TOOLS
    public static final RegistryObject<SwordItem> OBI_SWORD = ITEMS.register("obi_sword",
            () -> new SwordItem(ToolTiers.OBI, 12, -3.15f, props()));
    public static final RegistryObject<PickaxeItem> OBI_PICKAXE = ITEMS.register("obi_pickaxe",
            () -> new PickaxeItem(ToolTiers.OBI, 8, -2.75f, props()));
    public static final RegistryObject<AxeItem> OBI_AXE = ITEMS.register("obi_axe",
            () -> new AxeItem(ToolTiers.OBI, 14, -3.25f, props()));
    public static final RegistryObject<ShovelItem> OBI_SHOVEL = ITEMS.register("obi_shovel",
            () -> new ShovelItem(ToolTiers.OBI, 4, -2f, props()));
    public static final RegistryObject<HoeItem> OBI_HOE = ITEMS.register("obi_hoe",
            () -> new HoeItem(ToolTiers.OBI, 1, -1f, props()));

    // OBSIDIAN ARMOR
    public static final RegistryObject<ArmorItem> OBI_HELMET = ITEMS.register("obi_helmet",
            () -> new ArmorItem(ArmorTiers.OBI, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> OBI_CHESTPLATE = ITEMS.register("obi_chestplate",
            () -> new ArmorItem(ArmorTiers.OBI, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> OBI_LEGGINGS = ITEMS.register("obi_leggings",
            () -> new ArmorItem(ArmorTiers.OBI, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> OBI_BOOTS = ITEMS.register("obi_boots",
            () -> new ArmorItem(ArmorTiers.OBI, EquipmentSlot.FEET, props()));











    private static Item.Properties props() {return new Item.Properties().tab(obimod.TAB);}

    public static class ToolTiers {
        public static final Tier OBI = new ForgeTier(5, 1500, 5f, 1, 350, null, () -> Ingredient.of(ItemInit.OBI_SWORD.get()));
    }
    public static class ArmorTiers {
        public static final ArmorMaterial OBI = new ObiArmorMaterial("obi",
                1500,
                new int[]{6, 8, 10, 6},
                300,
                SoundEvents.ARMOR_EQUIP_DIAMOND,
                0.0f,
                0.07f,
                () -> Ingredient.of(ItemInit.OBI_SWORD.get()));
    }





}
