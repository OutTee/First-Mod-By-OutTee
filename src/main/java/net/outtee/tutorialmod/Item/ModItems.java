package net.outtee.tutorialmod.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.outtee.tutorialmod.TutorialMod;

public class ModItems {
    public static final Item CUM = registerItem("cum",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addItemsToItemGroup(ItemGroups.INGREDIENTS, CUM);
    }
    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void  registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items " + TutorialMod.MOD_ID);

        addItemsToItemGroup();
    }
}

