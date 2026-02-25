package com.whyij.neu.item;

import com.whyij.neu.NotEnoughUpgrade;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;

import java.util.function.Function;

public class ModItems {
    public static final Item STONE_UPGRADE_SMITHING_TEMPLATE = registerItem("stone_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.COMMON));

    public static Item registerItem(String string, Function<Item.Properties, Item> function, Item.Properties properties) {
        ResourceKey<Item> resourceKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(NotEnoughUpgrade.MOD_ID,string));
        Item item = (Item)function.apply(properties.setId(resourceKey));
        if (item instanceof BlockItem blockItem) {
            blockItem.registerBlocks(Item.BY_BLOCK, item);
        }

        return (Item)Registry.register(BuiltInRegistries.ITEM, resourceKey, item);
    }


    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.addBefore(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE,STONE_UPGRADE_SMITHING_TEMPLATE);
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(ModItems::addItemToIG);
        NotEnoughUpgrade.LOGGER.info("Registering Items");
    }

}