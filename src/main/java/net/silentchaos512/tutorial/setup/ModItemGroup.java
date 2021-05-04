package net.silentchaos512.tutorial.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModItemGroup extends ItemGroup {
    public static final ItemGroup TUTORIAL = new ItemGroup(getGroupCountSafe(), "tutorial") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.SILVER_ORE.get());
        }
    };

    public ModItemGroup(int addIdFolder, String itemsFolderName) {
        super(addIdFolder, itemsFolderName);
    }

    @Override
    public ItemStack makeIcon() {
        return null;
    }
}