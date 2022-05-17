package com.therealm18.beyond_planets_machines.registries;

import com.therealm18.beyond_planets_machines.BeyondPlanetsMachines;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrscauthd.beyond_earth.itemgroups.ItemGroups;

public class ItemsRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BeyondPlanetsMachines.MODID);

    //Solar Panels
    public static final RegistryObject<BlockItem> SOLAR_PANEL_T1_ITEM = ITEMS.register("solar_panel_t1", () -> new BlockItem(BlocksRegistry.SOLAR_PANEL_BLOCK_T1.get(), new Item.Properties().tab(ItemGroups.tab_machines)));
    public static final RegistryObject<BlockItem> SOLAR_PANEL_T2_ITEM = ITEMS.register("solar_panel_t2", () -> new BlockItem(BlocksRegistry.SOLAR_PANEL_BLOCK_T2.get(), new Item.Properties().tab(ItemGroups.tab_machines)));
    public static final RegistryObject<BlockItem> SOLAR_PANEL_T3_ITEM = ITEMS.register("solar_panel_t3", () -> new BlockItem(BlocksRegistry.SOLAR_PANEL_BLOCK_T3.get(), new Item.Properties().tab(ItemGroups.tab_machines)));
    public static final RegistryObject<BlockItem> SOLAR_PANEL_T4_ITEM = ITEMS.register("solar_panel_t4", () -> new BlockItem(BlocksRegistry.SOLAR_PANEL_BLOCK_T4.get(), new Item.Properties().tab(ItemGroups.tab_machines)));
}