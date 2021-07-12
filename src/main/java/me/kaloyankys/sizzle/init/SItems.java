package me.kaloyankys.sizzle.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SItems {

public static final Item TOMATO = register("tomato", new Item(new FabricItemSettings().food(SFoods.BASE_VEGETABLE).group(ItemGroup.FOOD)));
public static final Item SLICED_TOMATO = register("sliced_tomato", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
public static final Item CUCUMBER = register("cucumber", new Item(new FabricItemSettings().food(SFoods.BASE_VEGETABLE).group(ItemGroup.FOOD)));
public static final Item SLICED_CUCUMBER = register("sliced_cucumber", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item register (String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("sizzle", id), item);
    }
}
