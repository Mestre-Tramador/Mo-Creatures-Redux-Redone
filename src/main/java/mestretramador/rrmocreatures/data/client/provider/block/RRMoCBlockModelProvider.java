package mestretramador.rrmocreatures.data.client.provider.block;

import mestretramador.rrmocreatures.data.client.provider.RRMoCModelProvider;

import net.minecraft.data.DataGenerator;

import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * Mo'Creatures Redux&Redone Block Model Provider base.
 * 
 * @version 0.0.19
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCBlockModelProvider extends RRMoCModelProvider
{
    /**
     * To create a Block Model, besides providing a DataGenerator and a
     * ExistingFileHelper, there is still need to pass the block model ID and its
     * path.
     * 
     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator
     *                           Data Generator}.
     * @param existingFileHelper Forge
     *                           {@link net.minecraftforge.common.data.ExistingFileHelper
     *                           Existing File Helper}.
     * @param model              The block model ID on Constants.
     * @param path               The path to the block model.
     */
    protected RRMoCBlockModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper, String model, String path)
    {
        super(generator, existingFileHelper, model, path);
    }
}
