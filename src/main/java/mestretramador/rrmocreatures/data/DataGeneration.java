package mestretramador.rrmocreatures.data;

import mestretramador.rrmocreatures.data.client.block.RRMoCBlockModelWyvernLairStone;
import mestretramador.rrmocreatures.data.client.block.RRMoCBlockStateWyvernLairStone;
import mestretramador.rrmocreatures.data.client.item.RRMoCItemModelHandmadeSaddle;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.data.DataGenerator;

import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

/**
 * Mo'Creatures Redux&Redone Data Generators.
 * @version 0.0.6
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGeneration
{
    /** Private constructor. */
    private DataGeneration() {}

    /**
     * Gathering the daga, generates all
     * data to Block States, Blocks, and
     * Items.
     * @param event The {@link net.minecraftforge.fml.event.lifecycle.GatherDataEvent Gather Data Event}.
     */
    @SubscribeEvent
    public static void gatherDataGeneration(GatherDataEvent event)
    {
        final DataGenerator generator = event.getGenerator();

        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gatherBlockStateDataGeneration(generator, existingFileHelper);
        
        gatherBlockDataGeneration(generator, existingFileHelper);

        gatherItemDataGeneration(generator, existingFileHelper);
    }

    /**
     * Gather data generation to Blocks.
     * @param generator The actual Data Generator.
     * @param existingFileHelper The actual Existing File Helper.
     */
    private static void gatherBlockDataGeneration(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {        
        generator.addProvider(new RRMoCBlockModelWyvernLairStone(generator, existingFileHelper));
    }

    /**
     * Gather data generation to Block States.
     * @param generator The actual Data Generator.
     * @param existingFileHelper The actual Existing File Helper.
     */
    private static void gatherBlockStateDataGeneration(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        generator.addProvider(new RRMoCBlockStateWyvernLairStone(generator, existingFileHelper));
    }

    /**
     * Gather data generation to Items.
     * @param generator The actual Data Generator.
     * @param existingFileHelper The actual Existing File Helper.
     */
    private static void gatherItemDataGeneration(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        generator.addProvider(new RRMoCItemModelHandmadeSaddle(generator, existingFileHelper));
    }
}
