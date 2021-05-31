package mestretramador.rrmocreatures.data.common.loot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.mojang.datafixers.util.Pair;

import mestretramador.rrmocreatures.data.common.provider.loot.RRMoCBlockLootTablesProvider;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTableManager;
import net.minecraft.loot.ValidationTracker;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.util.ResourceLocation;

/**
 * Mo'Creatures Redux&Redone Loot Tables Generator.
 * 
 * @version 0.0.29
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCLootTablesGeneration extends LootTableProvider
{
    /** The List wich contains all Loot Tables Pairs. */
    final static private List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>> TABLES = new ArrayList<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>>();

    /**
     * When creating the Loot Tables Generator, the tables are already loaded.
     * 
     * @param generator The actual Data Generator.
     */
    public RRMoCLootTablesGeneration(DataGenerator generator)
    {
        super(generator);

        setBlocks();
        // TODO: Insert more Loot Tables.
    }

    /**
     * A Getter Method override of the
     * {@link net.minecraft.data.LootTableProvider#getTables parent method} to
     * return the current Mo'Creatures Redux&Redone Loot Tables.
     */
    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>> getTables()
    {              
        return TABLES;
    }

    /**
     * <p>
     * Override of the {@link net.minecraft.data.LootTableProvider#validate Vanilla
     * process of validation}.
     * </p>
     * <p>
     * This override only validate the relationship between the Tracker and each of
     * the Resource Locations and Loot Tables.
     * </p>
     * 
     * @param map               The Map wich relates the Resource Locations of the
     *                          Loot Tables.
     * @param validationTracker The Tracker used to validate.
     */
    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationTracker)
    {
        map.forEach((resourceLocation, lootTable) -> LootTableManager.validateLootTable(validationTracker, resourceLocation, lootTable));
    }

    /**
     * Setter for adding the Mo'Creatures Redux&Redone Blocks Loot Tables.
     */
    private static void setBlocks()
    {
        TABLES.add(Pair.of(RRMoCBlockLootTablesProvider::new, LootParameterSets.BLOCK));
    }
}
