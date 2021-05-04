package net.silentchaos512.tutorial.setup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> SILVER_INGOT = Registration.ITEMS.register("silver_ingot", () ->
            new Item(new Item.Properties().tab(ModItemGroup.TUTORIAL)));

    static void register() {}
}
