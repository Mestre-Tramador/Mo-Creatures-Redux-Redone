package mestretramador.rrmocreatures.data.common.recipes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import com.google.common.collect.ImmutableMap;

import mestretramador.rrmocreatures.init.RegisterItem;
import mestretramador.rrmocreatures.util.Constants;
import mestretramador.rrmocreatures.util.Tags;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;

/**
 * Mo'Creatures Redux&Redone Shaped Recipes Generator.
 * 
 * @version 0.0.29
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCShapedRecipeGeneration extends RecipeProvider
{
    /** The Map with the recipes for amulets. */
    final static private Map<Item, Map<Item, Item>> AMULETS = new HashMap<Item, Map<Item, Item>>();

    /** The Map with the recipes for armors. */
    final static private List<Item> ARMORS = new ArrayList<Item>();

    /** The Map with the recipes for items with weighted covers. */
    final static private Map<Item, Map<Item, Item>> COVERED_WIH_WEIGHTS = new HashMap<Item, Map<Item, Item>>();
    
    /** The Map with the recipes for diagonal items with two subitems. */
    final static private Map<Item, Map<Item, Item>> DIAGONAL_WITH_TWO_ITEMS = new HashMap<Item, Map<Item, Item>>();

    /** The Map with the recipes for mount armors. */
    final static private Map<Item, Map<Item, Item>> MOUNT_ARMORS = new HashMap<Item, Map<Item, Item>>();

    /** The Map with the recipes for elephant tusks. */
    final static private Map<Item, Object> TUSKS = new HashMap<Item, Object>();

    /**
     *  When creating the Shaped Recipes Generator, the Maps are already set for the registering.
     * 
     * @param generator The actual Data Generator.
     */
    public RRMoCShapedRecipeGeneration(DataGenerator generator)
    {
        super(generator);

        AMULETS.put(RegisterItem.AMULET_BONE.returnAsItem(),
            ImmutableMap.of(
                Items.BONE,
                Items.IRON_NUGGET
            )
        );
        AMULETS.put(RegisterItem.AMULET_FAIRY.returnAsItem(),
            ImmutableMap.of(
                RegisterItem.UNICORN_HORN.returnAsItem(),
                Items.GLOWSTONE_DUST
            )
        );
        AMULETS.put(RegisterItem.AMULET_GHOST.returnAsItem(),
            ImmutableMap.of(
                Items.GHAST_TEAR,
                Items.PHANTOM_MEMBRANE
            )
        );
        AMULETS.put(RegisterItem.AMULET_SKY.returnAsItem(),
            ImmutableMap.of(
                Items.GOLD_INGOT,
                Items.LAPIS_LAZULI
            )
        );

        ARMORS.add(RegisterItem.FUR.returnAsItem());
        ARMORS.add(RegisterItem.HIDE.returnAsItem());
        ARMORS.add(RegisterItem.REPTILE_HIDE.returnAsItem());

        COVERED_WIH_WEIGHTS.put(RegisterItem.HANDMADE_SADDLE.returnAsItem(), ImmutableMap.of(Items.LEATHER, Items.IRON_INGOT));
        COVERED_WIH_WEIGHTS.put(RegisterItem.FISH_NET.returnAsItem(), ImmutableMap.of(Items.STRING, RegisterItem.SHARK_TEETH.returnAsItem()));

        DIAGONAL_WITH_TWO_ITEMS.put(RegisterItem.KEY.returnAsItem(), ImmutableMap.of(Items.IRON_NUGGET, Items.IRON_NUGGET));
        DIAGONAL_WITH_TWO_ITEMS.put(RegisterItem.STAFF_DIAMOND.returnAsItem(),
            ImmutableMap.of(
                RegisterItem.STAFF_BASE.returnAsItem(),
                Items.DIAMOND
            )
        );
        DIAGONAL_WITH_TWO_ITEMS.put(RegisterItem.STAFF_LIGHT.returnAsItem(),
            ImmutableMap.of(
                RegisterItem.STAFF_BASE.returnAsItem(),
                RegisterItem.UNICORN_HORN.returnAsItem()
            )
        );
        DIAGONAL_WITH_TWO_ITEMS.put(RegisterItem.STAFF_ENDER.returnAsItem(),
            ImmutableMap.of(
                RegisterItem.STAFF_BASE.returnAsItem(),
                Items.ENDER_EYE
            )
        ); 

        MOUNT_ARMORS.put(RegisterItem.HANDMADE_MOUNT_ARMOR_LEATHER.returnAsItem(), ImmutableMap.of(
            Items.LEATHER,
            Items.ORANGE_WOOL
        ));
        MOUNT_ARMORS.put(RegisterItem.HANDMADE_MOUNT_ARMOR_IRON.returnAsItem(), ImmutableMap.of(
            Items.IRON_INGOT,
            Items.BLACK_WOOL
        ));
        MOUNT_ARMORS.put(RegisterItem.HANDMADE_MOUNT_ARMOR_GOLD.returnAsItem(), ImmutableMap.of(
            Items.GOLD_INGOT,
            Items.RED_WOOL
        ));
        MOUNT_ARMORS.put(RegisterItem.HANDMADE_MOUNT_ARMOR_DIAMOND.returnAsItem(), ImmutableMap.of(
            Items.DIAMOND,
            Items.BLUE_WOOL
        ));
        MOUNT_ARMORS.put(RegisterItem.HANDMADE_MOUNT_ARMOR_CRYSTAL.returnAsItem(), ImmutableMap.of(
            Items.QUARTZ,
            Items.CYAN_WOOL
        ));
        
        TUSKS.put(RegisterItem.ELEPHANT_TUSKS_WOOD.returnAsItem(), ItemTags.PLANKS);
        TUSKS.put(RegisterItem.ELEPHANT_TUSKS_IRON.returnAsItem(), Items.IRON_INGOT);
        TUSKS.put(RegisterItem.ELEPHANT_TUSKS_DIAMOND.returnAsItem(), Items.DIAMOND);
    }
    
    /**
     * A Register Method overrid of the
     * {@link net.minecraft.data.RecipeProvider#registerRecipes parent method} to
     * register the current Mo'Creatures Redux&Redone Shaped Recipes.
     * 
     * @param consumer The consumer of the finished Recipe file.
     */
    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
    {        
        AMULETS.forEach((amulet, parts) -> {
            parts.forEach((pointers, fills) -> registerAmuletsRecipes(consumer, amulet, pointers, fills));
        });

        ARMORS.forEach((material) -> registerArmorRecipes(consumer, material));

        COVERED_WIH_WEIGHTS.forEach((item, materials) -> {
            materials.forEach((cover, weights) -> registerCoveredWithWeightsRecipes(consumer, item, cover, weights));
        });

        DIAGONAL_WITH_TWO_ITEMS.forEach((key, pair) -> {            
            pair.forEach((first, second) -> registerDiagonalWithTwoItemsRecipes(consumer, key, first, second));
        });

        MOUNT_ARMORS.forEach((armor, materials) -> {
            materials.forEach((type, cover) -> registerMountArmorRecipes(consumer, armor, type, cover));
        });

        TUSKS.forEach((tusk, material) -> registerElephantTusksRecipes(consumer, tusk, material));       
        
        registerColoredKittyBedsRecipes(consumer);

        registerOtherRecipes(consumer);
    }

    /**
     * Register the Shaped Recipe of the Amulets with its default core and the given
     * assemble parts.
     * 
     * @param consumer The consumer of the finished Recipe file.
     * @param amulet   The resultant amulet of the recipe.
     * @param pointers The item which goes on the pointers of the amulet.
     * @param fills    The item which fills the amulet.
     */
    private void registerAmuletsRecipes(Consumer<IFinishedRecipe> consumer, Item amulet, Item pointers, Item fills)
    {
        ShapedRecipeBuilder
        .shapedRecipe(amulet)
        .key('O', Items.DIAMOND)
        .key('.', pointers)
        .key('|', fills)
        .patternLine(".|.")
        .patternLine("|O|")
        .patternLine(".|.")
        .setGroup("amulets")
        .addCriterion("has_core", hasItem(Items.DIAMOND))
        .build(consumer);
    }

    /**
     * Register the Shaped Recipe of the armors of a material.
     * 
     * @param consumer The consumer of the finished Recipe file.
     * @param material The material base of each armor part.
     */
    private void registerArmorRecipes(Consumer<IFinishedRecipe> consumer, Item material)
    {
        Item helmet = null;
        Item chest  = null;
        Item legs   = null;
        Item boots  = null;

        switch(material.getRegistryName().getPath())
        {
            case Constants.Items.FUR:
                helmet = RegisterItem.FUR_HELMET.returnAsItem();
                chest  = RegisterItem.FUR_CHEST.returnAsItem();
                legs   = RegisterItem.FUR_LEGS.returnAsItem();
                boots  = RegisterItem.FUR_BOOTS.returnAsItem();
            break;

            case Constants.Items.HIDE:
                helmet = RegisterItem.HIDE_HELMET.returnAsItem();
                chest  = RegisterItem.HIDE_CHEST.returnAsItem();
                legs   = RegisterItem.HIDE_LEGS.returnAsItem();
                boots  = RegisterItem.HIDE_BOOTS.returnAsItem();
            break;

            case Constants.Items.REPTILE_HIDE:
                helmet = RegisterItem.REPTILE_HIDE_HELMET.returnAsItem();
                chest  = RegisterItem.REPTILE_HIDE_CHEST.returnAsItem();
                legs   = RegisterItem.REPTILE_HIDE_LEGS.returnAsItem();
                boots  = RegisterItem.REPTILE_HIDE_BOOTS.returnAsItem();
            break;
        }

        ShapedRecipeBuilder
        .shapedRecipe(helmet)
        .key('H', material)
        .patternLine("HHH")
        .patternLine("H H")
        .patternLine("   ")
        .setGroup(material.getRegistryName().getPath() + "_helmet")
        .addCriterion("has_material", hasItem(material))
        .build(consumer);

        ShapedRecipeBuilder
        .shapedRecipe(chest)
        .key('C', material)
        .patternLine("C C")
        .patternLine("CCC")
        .patternLine("CCC")
        .setGroup(material.getRegistryName().getPath() + "_chest")
        .addCriterion("has_material", hasItem(material))
        .build(consumer);

        ShapedRecipeBuilder
        .shapedRecipe(legs)
        .key('L', material)
        .patternLine("LLL")
        .patternLine("L L")
        .patternLine("L L")
        .setGroup(material.getRegistryName().getPath() + "_legs")
        .addCriterion("has_material", hasItem(material))
        .build(consumer);

        ShapedRecipeBuilder
        .shapedRecipe(boots)
        .key('B', material)
        .patternLine("   ")
        .patternLine("B B")
        .patternLine("B B")
        .setGroup(material.getRegistryName().getPath() + "_boots")
        .addCriterion("has_material", hasItem(material))
        .build(consumer);
    }

    /**
     * Register the Shaped Recipe of covered items with weights of some material. 
     * 
     * @param consumer The consumer of the finished Recipe file.
     * @param result   The resultant item of the recipe.
     * @param cover    The material of the cover item.
     * @param weights  The item which serve as the weights.
     */
    private void registerCoveredWithWeightsRecipes(Consumer<IFinishedRecipe> consumer, Item result, Item cover, Item weights)
    {
        final String group = result.getRegistryName().getPath();

        ShapedRecipeBuilder
        .shapedRecipe(result)
        .key('#', cover)
        .key('*', weights)
        .patternLine("###")
        .patternLine("#*#")
        .patternLine("* *")
        .setGroup(group)
        .addCriterion("has_material", hasItem(cover))
        .build(consumer);
    }

    /**
     * Register the Shaped Recipe of diagonal items with two subitems. 
     * 
     * @param consumer   The consumer of the finished Recipe file.
     * @param resultItem The resultant item of the recipe.
     * @param firstItem  The first subitem.
     * @param secondItem The second subitem.
     */
    private void registerDiagonalWithTwoItemsRecipes(Consumer<IFinishedRecipe> consumer, Item resultItem, Item firstItem, Item secondItem)
    {
        final String resourceKey = Constants.MOD_ID + ":";
                
        String group = "";

        switch(resultItem.getRegistryName().toString())
        {
            case resourceKey + Constants.Items.STAFF_DIAMOND:
            case resourceKey + Constants.Items.STAFF_LIGHT:
            case resourceKey + Constants.Items.STAFF_ENDER:
                group = "staffs";
            break;

            case resourceKey + Constants.Items.KEY:
                group = "keys";
            break;
        }

        ShapedRecipeBuilder
        .shapedRecipe(resultItem)
        .key('F', firstItem)
        .key('S', secondItem)
        .patternLine("   ")
        .patternLine(" S ")
        .patternLine("F  ")
        .setGroup(group)
        .addCriterion("has_key", hasItem(secondItem))
        .build(consumer);
    }

    /**
     * Register the Shaped Recipe of the elephant tusks by material.
     * 
     * @param consumer The consumer of the finished Recipe file.
     * @param tusk     The resultant tusk.
     * @param material The material of the elephant tusk.
     */
    @SuppressWarnings("unchecked")
    private void registerElephantTusksRecipes(Consumer<IFinishedRecipe> consumer, Item tusk, Object material)
    {
        final ShapedRecipeBuilder recipe = ShapedRecipeBuilder.shapedRecipe(tusk);

        if(material instanceof Item)
        {
            recipe.key('#', (Item) material).addCriterion("has_material", hasItem((Item) material));
        }
        else if(material instanceof ITag.INamedTag<?>)
        {
            recipe.key('#', (ITag.INamedTag<Item>) material).addCriterion("has_material", hasItem((ITag.INamedTag<Item>) material));
        }

        recipe
        .key('/', Tags.Items.LEADS)
        .patternLine("  /")
        .patternLine(" /#")
        .patternLine("###")
        .setGroup("elephant_tusks")
        .build(consumer);            
    }

    /**
     * Register the Shaped Recipe of every and each colored kitty bed.
     * 
     * @param consumer The consumer of the finished Recipe file.
     */
    private void registerColoredKittyBedsRecipes(Consumer<IFinishedRecipe> consumer)
    {
        Map.ofEntries(
            Map.entry(RegisterItem.KITTY_BED_BLACK.returnAsItem(), Items.BLACK_CARPET),
            Map.entry(RegisterItem.KITTY_BED_BLUE.returnAsItem(), Items.BLUE_CARPET),
            Map.entry(RegisterItem.KITTY_BED_BROWN.returnAsItem(), Items.BROWN_CARPET),
            Map.entry(RegisterItem.KITTY_BED_CYAN.returnAsItem(), Items.CYAN_CARPET),
            Map.entry(RegisterItem.KITTY_BED_GRAY.returnAsItem(), Items.GRAY_CARPET),
            Map.entry(RegisterItem.KITTY_BED_GREEN.returnAsItem(), Items.GREEN_CARPET),
            Map.entry(RegisterItem.KITTY_BED_LIGHT_BLUE.returnAsItem(), Items.LIGHT_BLUE_CARPET),
            Map.entry(RegisterItem.KITTY_BED_LIGHT_GRAY.returnAsItem(), Items.LIGHT_GRAY_CARPET),
            Map.entry(RegisterItem.KITTY_BED_LIME.returnAsItem(), Items.LIME_CARPET),
            Map.entry(RegisterItem.KITTY_BED_MAGENTA.returnAsItem(), Items.MAGENTA_CARPET),
            Map.entry(RegisterItem.KITTY_BED_ORANGE.returnAsItem(), Items.ORANGE_CARPET),
            Map.entry(RegisterItem.KITTY_BED_PINK.returnAsItem(), Items.PINK_CARPET),
            Map.entry(RegisterItem.KITTY_BED_PURPLE.returnAsItem(), Items.PURPLE_CARPET),
            Map.entry(RegisterItem.KITTY_BED_RED.returnAsItem(), Items.RED_CARPET),
            Map.entry(RegisterItem.KITTY_BED_WHITE.returnAsItem(), Items.WHITE_CARPET),
            Map.entry(RegisterItem.KITTY_BED_YELLOW.returnAsItem(), Items.YELLOW_CARPET)
        )
        .forEach((bed, carpet) -> registerPileRecipe(
            consumer,
            bed,
            RegisterItem.KITTY_BED.returnAsItem(),
            carpet,
            "colored_kitty_beds"
        ));
    }

    /**
     * Register the Shaped Recipe of a handmade mount armor of some material.
     * 
     * @param consumer The consumer of the finished Recipe file.
     * @param armor    The resultant handmade mount armor.
     * @param material The material of the armor.
     * @param wool     The colored wool of saddle of the armor.
     */
    private void registerMountArmorRecipes(Consumer<IFinishedRecipe> consumer, Item armor, Item material, Item wool)
    {
        ShapedRecipeBuilder
        .shapedRecipe(armor)
        .key('#', material)
        .key('^', wool)
        .patternLine("  #")
        .patternLine("#^#")
        .patternLine("^#^")
        .setGroup("mount_armors")
        .addCriterion("has_material", hasItem(material))
        .build(consumer);
    }

    /**
     * Register other more specific and/or singular Shaped Recipes.
     * 
     * @param consumer The consumer of the finished Recipe file.
     */
    private void registerOtherRecipes(Consumer<IFinishedRecipe> consumer)
    {
        // ? Guardian Amulet
        ShapedRecipeBuilder
        .shapedRecipe(RegisterItem.AMULET_GUARDIAN.returnAsItem())
        .key('O', Items.DIAMOND)
        .key('.', Items.GOLD_NUGGET)
        .patternLine(". .")
        .patternLine(" O ")
        .patternLine(" . ")
        .setGroup("amulets")
        .addCriterion("has_core", hasItem(Items.DIAMOND))
        .build(consumer);

        // ? Elephant Saddlebag.
        ShapedRecipeBuilder
        .shapedRecipe(RegisterItem.ELEPHANT_CHEST.returnAsItem())
        .key('|', Tags.Items.LEADS)
        .key('#', RegisterItem.FUR.returnAsItem())
        .key('U', Tags.Items.CHESTS)
        .patternLine("| |")
        .patternLine("###")
        .patternLine("U|U")
        .setGroup("wereables_storage")
        .addCriterion("has_storage", hasItem(Tags.Items.CHESTS))
        .build(consumer);

        // ? Elephant Harness.
        ShapedRecipeBuilder
        .shapedRecipe(RegisterItem.ELEPHANT_HARNESS.returnAsItem())
        .key('#', RegisterItem.FUR.returnAsItem())
        .key('|', Items.LEATHER)
        .patternLine("###")
        .patternLine("|#|")
        .patternLine("| |")
        .setGroup("elephants")
        .addCriterion("has_item", hasItem(RegisterItem.FUR.returnAsItem()))
        .build(consumer);

        // ? Indian Elephant Garment.
        ShapedRecipeBuilder
        .shapedRecipe(RegisterItem.ELEPHANT_INDIAN_GARMENT.returnAsItem())
        .key('#', Items.RED_WOOL)
        .key('|', Items.YELLOW_WOOL)
        .key('.', Items.GOLD_NUGGET)
        .patternLine("|#|")
        .patternLine("|#|")
        .patternLine(". .")
        .setGroup("indian_elephants")
        .addCriterion("has_item", hasItem(ItemTags.WOOL))
        .build(consumer);

        // ? Indian Elephant Howdah.
        ShapedRecipeBuilder
        .shapedRecipe(RegisterItem.ELEPHANT_INDIAN_HOWDAH.returnAsItem())
        .key('_', Items.RED_CARPET)
        .key('|', Items.STICK)
        .key('#', ItemTags.WOODEN_SLABS)
        .key('.', Items.GOLD_NUGGET)
        .patternLine("___")
        .patternLine("| |")
        .patternLine(".#.")
        .setGroup("indian_elephants")
        .addCriterion("has_item", hasItem(ItemTags.WOOL))
        .build(consumer);

        // ? Handmade Lead.
        ShapedRecipeBuilder
        .shapedRecipe(RegisterItem.HANDMADE_LEAD.returnAsItem())
        .key('+', Items.STRING)
        .patternLine("++ ")
        .patternLine("++ ")
        .patternLine("  +")
        .setGroup("handmade_lead")
        .addCriterion("has_string", hasItem(Items.STRING))
        .build(consumer);

        // ? Handmade Saddlebag.
        ShapedRecipeBuilder
        .shapedRecipe(RegisterItem.HANDMADE_SADDLE_CHEST.returnAsItem())
        .key('#', Items.LEATHER)
        .key('*', Items.IRON_INGOT)
        .key('|', Tags.Items.LEADS)
        .patternLine("| |")
        .patternLine("#*#")
        .patternLine("###")
        .setGroup("handmade_saddle_chest")
        .addCriterion("has_material", hasItem(Items.LEATHER))
        .build(consumer);

        // ? Kitty Bed
        ShapedRecipeBuilder
        .shapedRecipe(RegisterItem.KITTY_BED.returnAsItem())
        .key('#', ItemTags.PLANKS)
        .key('_', ItemTags.WOODEN_SLABS)
        .key('U', Items.BUCKET)
        .patternLine("U  ")
        .patternLine("_ _")
        .patternLine("###")
        .setGroup("kitty_bed")
        .addCriterion("has_item", hasItem(ItemTags.PLANKS))
        .build(consumer);
    }

    /**
     * Register the Shaped Recipe of pile items.
     * 
     * @param consumer The consumer of the finished Recipe file.
     * @param result   The resultant item of the recipe.
     * @param base     The item base of the pile.
     * @param over     The item above (over) of the pile.
     * @param group    The group of the recipe.
     */
    private void registerPileRecipe(Consumer<IFinishedRecipe> consumer, Item result, Item base, Item over, String group)
    {
        ShapedRecipeBuilder
        .shapedRecipe(result)
        .key('u', base)
        .key('_', over)
        .patternLine("   ")
        .patternLine(" _ ")
        .patternLine(" u ")
        .setGroup(group)
        .addCriterion("has_base", hasItem(base))
        .build(consumer);
    }
}
