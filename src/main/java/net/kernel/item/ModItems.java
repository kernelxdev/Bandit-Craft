package net.kernel.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kernel.BanditCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(BanditCraft.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        BanditCraft.LOGGER.info("Registering Mod Items for " + BanditCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(STEEL_INGOT);
        });
    }

}
