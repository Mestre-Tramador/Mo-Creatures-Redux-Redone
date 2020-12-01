package mestretramador.rrmocreatures.data.client.provider.block;

import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.data.DataGenerator;

import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * Mo'Creatures Redux&Redone BlockState Provider base.
 * 
 * @version 0.0.26
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCBlockStateProvider extends BlockStateProvider
{
    /** An already registered block inherited from a Block Class. */
    protected Object registeredBlock;

    /**
     * To create a Block States, besides providing a DataGenerator and a
     * ExistingFileHelper, there is need to pass the block registered.
     * 
     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator
     *                           Data Generator}.
     * @param existingFileHelper Forge
     *                           {@link net.minecraftforge.common.data.ExistingFileHelper
     *                           Existing File Helper}.
     * @param registeredBlock    Pass the Block from the
     *                           {@link mestretramador.rrmocreatures.init.RegisterBlock
     *                           Registration class}.
     */
    protected RRMoCBlockStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper, Object registeredBlock)
    {
        super(generator, Constants.MOD_ID, existingFileHelper);

        this.registeredBlock = registeredBlock;
    }
}
