package mestretramador.rrmocreatures.util;

import javax.annotation.Nullable;

import mestretramador.rrmocreatures.init.RegisterBlock;
import mestretramador.rrmocreatures.init.RegisterItem;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

/**
 * ItemGroups (aka Creative Tabs) to use on Itens Providers and generaly.
 * 
 * @version 0.0.26
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public final class Tabs
{
    /** Animal Caring and related stuff tab.  */
    public static final ItemGroup ANIMALSTUFF = new ItemGroup(Titles.ANIMALSTUFF)
    {
        // ! Only Client
        /**
         * Use the item
         * {@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeSaddle Handmade Saddle}
         * as an icon.
         * 
         * @return The icon as an item stack.
         */
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        { return new ItemStack(getItemIcon(Titles.ANIMALSTUFF)); }
    };

    /** Blocks only tab. */
    public static final ItemGroup BLOCKS = new ItemGroup(Titles.BLOCKS)
    {
        // ! Only Client
        /**
         * Use the item
         * {@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairGrass Wyvern Lair Grass}
         * as an icon.
         * 
         * @return The icon as an item stack.
         */
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        { return new ItemStack(getBlockIcon(Titles.BLOCKS)); }
    };

    /** Weapons and armors for combat tab. */
    public static final ItemGroup COMBAT = new ItemGroup(Titles.COMBAT)
    {
        // ! Only Client
        /**
         * Use the item
         * {@link mestretramador.rrmocreatures.item.RRMoCItemStingDirtSword Dirt Sting Sword}
         * as an icon.
         * 
         * @return The icon as an item stack.
         */
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        { return new ItemStack(getItemIcon(Titles.COMBAT)); }
    };

    /** Hatchable Eggs only tab. */
    public static final ItemGroup EGGS = new ItemGroup(Titles.EGGS)
    {
        // ! Only Client
        /**
         * Use the item
         * {@link mestretramador.rrmocreatures.item.RRMoCItemEggHatchable Hatchable Egg}
         * as an icon.
         * 
         * @return The icon as an item stack.
         */
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        { return new ItemStack(getItemIcon(Titles.EGGS)); }
    };

    /** Foods and beverages tab. */
    public static final ItemGroup FOOD = new ItemGroup(Titles.FOOD)
    {
        // ! Only Client
        /**
         * Use the item
         * {@link mestretramador.rrmocreatures.item.RRMoCItemOstrichRaw Raw Ostrich}
         * as an icon.
         * 
         * @return The icon as an item stack.
         */
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        { return new ItemStack(getItemIcon(Titles.FOOD)); }
    };

    /** Magical itens (Amulets, Essences, Scrolls, Staffs) tab. */
    public static final ItemGroup MAGIC = new ItemGroup(Titles.MAGIC)
    {
        // ! Only Client
        /**
         * Use the item
         * {@link mestretramador.rrmocreatures.item.RRMoCItemAmuletGuardianFilled Filled Guardian Amulet}
         * as an icon.
         * 
         * @return The icon as an item stack.
         */
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        { return new ItemStack(getItemIcon(Titles.MAGIC)); }
    };

    /** Materials and ingredients tab. */
    public static final ItemGroup MATERIALS = new ItemGroup(Titles.MATERIALS)
    {
        // ! Only Client
        /**
         * Use the item
         * {@link mestretramador.rrmocreatures.item.RRMoCItemFur Fur}
         * as an icon.
         * 
         * @return The icon as an item stack.
         */
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        { return new ItemStack(getItemIcon(Titles.MATERIALS)); }
    };

    /** Miscellaneous and other uncategorized itens tab. */
    public static final ItemGroup MISC = new ItemGroup(Titles.MISC)
    {
        // ! Only Client
        /**
         * Use the item
         * {@link mestretramador.rrmocreatures.item.RRMoCItemCreaturePedia Creaturepedia}
         * as an icon.
         * 
         * @return The icon as an item stack.
         */
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        { return new ItemStack(getItemIcon(Titles.MISC)); }
    };

    /** Tools and usable itens of sorts tab. */
    public static final ItemGroup TOOLS = new ItemGroup(Titles.TOOLS)
    {
        // ! Only Client
        /**
         * Use the item
         * {@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeSaddle Handmade Saddle}
         * as an icon.
         * 
         * @return The icon as an item stack.
         */
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon()
        { return new ItemStack(getItemIcon(Titles.TOOLS)); }
    };

    /**
     * Switch between the tab titles to returnan a item as an Icon or <i>null</i>
     * when creating an ItemGroup.
     * 
     * @param tab A String from the {@link Titles} class.
     * @return A MoC R&R Item to serve as an icon.
     */
    @Nullable
    private static final Item getItemIcon(String tab)
    {
        switch(tab)
        {
            case Titles.ANIMALSTUFF: return RegisterItem.HANDMADE_SADDLE.returnAsItem();
            case Titles.COMBAT: return RegisterItem.STING_DIRT_SWORD.returnAsItem();
            case Titles.EGGS: return RegisterItem.EGG_HATCHABLE.returnAsItem();
            case Titles.FOOD: return RegisterItem.OSTRICH_RAW.returnAsItem();
            case Titles.MAGIC: return RegisterItem.AMULET_GUARDIAN_FILLED.returnAsItem();
            case Titles.MATERIALS: return RegisterItem.FUR.returnAsItem();
            case Titles.MISC: return RegisterItem.CREATURE_PEDIA.returnAsItem();
            case Titles.TOOLS: return RegisterItem.WHIP.returnAsItem();
            default: return null;
        }
    }

    /**
     * Switch between the tab titles to return a block as an Icon or <i>null</i>
     * when creating an Item.
     * 
     * @param tab A String from the {@link Titles} class.
     * @return A MoC R&R Block to serve as an icon.
     */
    @Nullable
    private static final Block getBlockIcon(String tab)
    {
        switch(tab)
        {
            case Titles.BLOCKS: return RegisterBlock.WYVERN_LAIR_GRASS.returnAsBlock();
            default: return null;
        }
    }

    /** Constant Titles to ItemGroups. */
    private static final class Titles
    {
        /** Title to Animal stuff tab. */
        private static final String ANIMALSTUFF = (Constants.MOD_ID + "_animalstuff");
        
        /** Title to Blocks tab. */
        private static final String BLOCKS = (Constants.MOD_ID + "_blocks");
        
        /** Title to Combat tab. */
        private static final String COMBAT = (Constants.MOD_ID + "_combat");
        
        /** Title to Eggs tab. */
        private static final String EGGS = (Constants.MOD_ID + "_eggs");
        
        /** Title to Food tab. */
        private static final String FOOD = (Constants.MOD_ID + "_food");
        
        /** Title to Magic tab. */
        private static final String MATERIALS = (Constants.MOD_ID + "_materials");
        
        /** Title to Materials tab. */
        private static final String MAGIC = (Constants.MOD_ID + "_magic");
        
        /** Title to Miscellaneous tab. */
        private static final String MISC = (Constants.MOD_ID + "_misc");
        
        /** Title to Tools tab. */
        private static final String TOOLS = (Constants.MOD_ID + "_tools");
    }
}
