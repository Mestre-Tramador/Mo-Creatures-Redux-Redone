package mestretramador.rrmocreatures.data.common.recipes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import com.google.common.collect.ImmutableList;

import mestretramador.rrmocreatures.init.RegisterBlock;
import mestretramador.rrmocreatures.init.RegisterItem;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;

/**
 * Mo'Creatures Redux&Redone Shapeless Recipes Generator.
 * 
 * @version 0.0.29
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCShapelessRecipeGeneration extends RecipeProvider
{
    /** The Map with the recipes for planks. */
    final private static Map<Block, Block> PLANKS = new HashMap<Block, Block>();

    /** The Map with the recipes for the Magic Scrolls. */
    final private static Map<Item, List<Item>> SCROLLS = new HashMap<Item, List<Item>>();

    /** The Map with the recipes for the different flavors of Kitty Food. */
    final private static Map<Item, Map<Item, Integer>> KITTY_FOODS = new HashMap<Item, Map<Item, Integer>>();

    /**
     *  When creating the Shapeless Recipes Generator, the Maps are already setted for the registering.
     * 
     * @param generator The actual Data Generator.
     */
    public RRMoCShapelessRecipeGeneration(DataGenerator generator)
    {
        super(generator);

        PLANKS.put(RegisterBlock.OGRE_LAIR_PLANKS.returnAsBlock(), RegisterBlock.OGRE_LAIR_LOG.returnAsBlock());
        PLANKS.put(RegisterBlock.WYVERN_LAIR_PLANKS.returnAsBlock(), RegisterBlock.WYVERN_LAIR_LOG.returnAsBlock()); 
        
        SCROLLS.put(RegisterItem.SCROLL_OWNER.returnAsItem(), ImmutableList.of(
            RegisterItem.SCROLL_BLANK.returnAsItem(),
            Items.BLACK_DYE            
        ));
        
        SCROLLS.put(RegisterItem.SCROLL_FREEDOM.returnAsItem(), ImmutableList.of(
            RegisterItem.SCROLL_OWNER.returnAsItem(),
            Items.RED_DYE
        ));
        
        SCROLLS.put(RegisterItem.SCROLL_SALE.returnAsItem(), ImmutableList.of(
            RegisterItem.SCROLL_OWNER.returnAsItem(),
            Items.LIGHT_BLUE_DYE,
            Items.GLOWSTONE_DUST
        ));

        KITTY_FOODS.put(Items.COOKED_COD, Map.ofEntries(
            Map.entry(Items.COOKED_COD, 2),
            Map.entry(Items.TROPICAL_FISH, 1)
        ));
        
        KITTY_FOODS.put(Items.COOKED_BEEF, Map.ofEntries(
            Map.entry(Items.COOKED_BEEF, 1),
            Map.entry(Items.COOKED_PORKCHOP, 1),
            Map.entry(Items.COOKED_RABBIT, 1)
        ));

        KITTY_FOODS.put(Items.COOKED_CHICKEN, Map.ofEntries(
            Map.entry(Items.COOKED_CHICKEN, 2),
            Map.entry(Items.EGG, 1)
        ));

        KITTY_FOODS.put(Items.COOKED_MUTTON, Map.ofEntries(
            Map.entry(Items.COOKED_MUTTON, 2),
            Map.entry(Items.CARROT, 1)
        ));

        KITTY_FOODS.put(Items.COOKED_SALMON, Map.ofEntries(
            Map.entry(Items.COOKED_SALMON, 2),
            Map.entry(Items.BROWN_MUSHROOM, 2)
        ));

        KITTY_FOODS.put(Items.CARROT, Map.ofEntries(
            Map.entry(Items.CARROT, 1),
            Map.entry(Items.POTATO, 1),
            Map.entry(Items.PUMPKIN_SEEDS, 2)
        ));
    }
    
    /**
     * A Register Method overrid of the
     * {@link net.minecraft.data.RecipeProvider#registerRecipes parent method} to
     * register the current Mo'Creatures Redux&Redone Shapeless Recipes.
     * 
     * @param consumer The consumer of the finished Recipe file.
     */
    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
    {
        PLANKS.forEach((planks, log) -> registerPlanksRecipes(consumer, planks, log));

        SCROLLS.forEach((scroll, paperAndDyes) -> registerScrollsRepices(consumer, scroll, paperAndDyes));

        KITTY_FOODS.forEach((flavor, ingredients) -> registerKittyFoodsRecipes(consumer, flavor, ingredients));

        registerOtherRecipes(consumer);
    }

    /**
     * Register the Shapeless Recipe of some Kitty Food Flavor with its default
     * ingredients and the given ones.
     * 
     * @param consumer    The consumer of the finished Recipe file.
     * @param flavor      The Flavor, that is, the first and most caracteristic
     *                    Item.
     * @param ingredients The rest of ingredients Items and the respective quantity.
     */
    private static void registerKittyFoodsRecipes(Consumer<IFinishedRecipe> consumer, Item flavor, Map<Item, Integer> ingredients)
    {
        final ShapelessRecipeBuilder recipe = ShapelessRecipeBuilder
        .shapelessRecipe(RegisterItem.KITTY_FOOD.returnAsItem(), 3)
        .addIngredient(Items.PAPER, 1)
        .addIngredient(Items.WHEAT, 2);
        
        ingredients.forEach((ingredient, quantity) -> recipe.addIngredient(ingredient, quantity));

        final String[] flavorName = flavor.toString().split("_");

        recipe
        .setGroup("kitty_foods")
        .addCriterion("has_flour", hasItem(Items.WHEAT))
        .addCriterion("has_flavor", hasItem(flavor))
        .build(consumer, new ResourceLocation(Constants.MOD_ID, "kitty_food_of_"+flavorName[(flavorName.length - 1)]));    
    }

    /**
     * Register other more specific and/or singular Shapeless Recipes.
     * 
     * @param consumer The consumer of the finished Recipe file.
     */
    private static void registerOtherRecipes(Consumer<IFinishedRecipe> consumer)
    {
        // ? Turtle Soup.
        ShapelessRecipeBuilder
        .shapelessRecipe(RegisterItem.TURTLE_COOKED_SOUP.returnAsItem())
        .addIngredient(RegisterItem.TURTLE_COOKED.returnAsItem())
        .addIngredient(Items.KELP, 2)
        .addIngredient(Items.POTATO)
        .addIngredient(Items.BOWL)
        .setGroup("foods")
        .addCriterion("has_bowl", hasItem(Items.BOWL))
        .addCriterion("has_meat", hasItem(RegisterItem.TURTLE_COOKED.returnAsItem()))
        .build(consumer);
    }

    /**
     * Register the Shapeless Recipes of the four Planks Blocks by one Log Block,
     * like the Vanilla Minecraft way.
     * 
     * @param consumer The consumer of the finished Recipe file.
     * @param planks   The obtained Planks
     * @param log      The used Log.
     */
    private static void registerPlanksRecipes(Consumer<IFinishedRecipe> consumer, Block planks, Block log)
    {
        ShapelessRecipeBuilder
        .shapelessRecipe(planks, 4)
        .addIngredient(log)
        .setGroup("planks")
        .addCriterion("has_log", hasItem(log))
        .build(consumer);
    }

    /**
     * Register the Shapeless Recipes of the Magic Scrolls with the quill, the paper
     * and its dyes used as tints.
     * 
     * @param consumer     The consumer of the finished Recipe file.
     * @param scroll       The Scroll obtained.
     * @param paperAndDyes The paper and the dyes used.
     */
    private static void registerScrollsRepices(Consumer<IFinishedRecipe> consumer, Item scroll, List<Item> paperAndDyes)
    {
        final ShapelessRecipeBuilder recipe = ShapelessRecipeBuilder.shapelessRecipe(scroll, 1);

        paperAndDyes.forEach(item -> recipe.addIngredient(item));

        final Item paper = paperAndDyes.get(0);

        recipe
        .addIngredient(Items.FEATHER)
        .setGroup("scrolls")
        .addCriterion("has_scroll_paper", hasItem(paper))
        .addCriterion("has_quill", hasItem(Items.FEATHER))
        .build(consumer);
    }    
}
