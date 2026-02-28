package com.whyij.neu.item;

import com.whyij.neu.NotEnoughUpgrade;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.Util;
import net.minecraft.world.item.*;

import java.util.function.Function;

public class ModItems {

          /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static final Item STONE_UPGRADE_SMITHING_TEMPLATE = registerItem("stone_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.COMMON));
    public static final Item COPPER_UPGRADE_SMITHING_TEMPLATE = registerItem("copper_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.COMMON));
    public static final Item IRON_UPGRADE_SMITHING_TEMPLATE = registerItem("iron_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.COMMON));
    public static final Item GOLD_UPGRADE_SMITHING_TEMPLATE = registerItem("gold_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.COMMON));
    public static final Item DIAMOND_UPGRADE_SMITHING_TEMPLATE = registerItem("diamond_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.UNCOMMON));
    public static final Item MACE_UPGRADE_SMITHING_TEMPLATE = registerItem("mace_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.EPIC));
    public static final Item ENDER_EYE_UPGRADE_SMITHING_TEMPLATE = registerItem("ender_eye_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.RARE));
    public static final Item RECOVERY_UPGRADE_SMITHING_TEMPLATE = registerItem("recovery_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.UNCOMMON));
    public static final Item CARROT_UPGRADE_SMITHING_TEMPLATE = registerItem("carrot_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.COMMON));
    public static final Item WARPED_FUNGUS_UPGRADE_SMITHING_TEMPLATE = registerItem("warped_fungus_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.COMMON));
    public static final Item SOUL_UPGRADE_SMITHING_TEMPLATE = registerItem("soul_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.COMMON));
    public static final Item CHEST_UPGRADE_SMITHING_TEMPLATE = registerItem("chest_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.COMMON));
    public static final Item HOPPER_UPGRADE_SMITHING_TEMPLATE = registerItem("hopper_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.COMMON));
    public static final Item TNT_UPGRADE_SMITHING_TEMPLATE = registerItem("tnt_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.COMMON));
    public static final Item LANTERN_UPGRADE_SMITHING_TEMPLATE = registerItem("lantern_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.COMMON));
    public static final Item WRITABLE_UPGRADE_SMITHING_TEMPLATE = registerItem("writable_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.COMMON));
    public static final Item UPGRADE_SMITHING_TEMPLATE_UPGRADE_SMITHING_TEMPLATE = registerItem("upgrade_smithing_template_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.EPIC));
    public static final Item UPGRADE_SMITHING_TEMPLATE_SMITHING_TEMPLATE = registerItem("upgrade_smithing_template_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, (new Item.Properties()).rarity(Rarity.EPIC));

    /// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
        fabricItemGroupEntries.addBefore(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE,COPPER_UPGRADE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.addBefore(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE,IRON_UPGRADE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.addBefore(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE,GOLD_UPGRADE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.addBefore(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE,DIAMOND_UPGRADE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.addBefore(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE,MACE_UPGRADE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.addBefore(ModItems.STONE_UPGRADE_SMITHING_TEMPLATE,ENDER_EYE_UPGRADE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.addBefore(ModItems.STONE_UPGRADE_SMITHING_TEMPLATE,RECOVERY_UPGRADE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.addBefore(ModItems.STONE_UPGRADE_SMITHING_TEMPLATE,CARROT_UPGRADE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.addBefore(ModItems.STONE_UPGRADE_SMITHING_TEMPLATE,WARPED_FUNGUS_UPGRADE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.addBefore(ModItems.STONE_UPGRADE_SMITHING_TEMPLATE,SOUL_UPGRADE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.addBefore(ModItems.STONE_UPGRADE_SMITHING_TEMPLATE,CHEST_UPGRADE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.addBefore(ModItems.STONE_UPGRADE_SMITHING_TEMPLATE,HOPPER_UPGRADE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.addBefore(ModItems.STONE_UPGRADE_SMITHING_TEMPLATE,TNT_UPGRADE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.addBefore(ModItems.STONE_UPGRADE_SMITHING_TEMPLATE,LANTERN_UPGRADE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.addBefore(ModItems.STONE_UPGRADE_SMITHING_TEMPLATE,WRITABLE_UPGRADE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.addBefore(ModItems.ENDER_EYE_UPGRADE_SMITHING_TEMPLATE,UPGRADE_SMITHING_TEMPLATE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.addBefore(ModItems.ENDER_EYE_UPGRADE_SMITHING_TEMPLATE,UPGRADE_SMITHING_TEMPLATE_UPGRADE_SMITHING_TEMPLATE);
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(ModItems::addItemToIG);
        NotEnoughUpgrade.LOGGER.info("Registering Items");
    }

}