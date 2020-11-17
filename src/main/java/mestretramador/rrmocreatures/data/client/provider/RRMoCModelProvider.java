package mestretramador.rrmocreatures.data.client.provider;

import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.data.DataGenerator;

import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * Mo'Creatures Redux&Redone Model Provider base.
 * 
 * @version 0.0.22
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCModelProvider extends ItemModelProvider
{
    /**
     * The Model constant ID.
     */
    protected String model;

    /**
     * The path to the model.
     */
    protected String path;

    /**
     * To create a Model, besides providing a DataGenerator and a
     * ExistingFileHelper, there is need to pass the model ID and its path.
     * 
     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator
     *                           Data Generator}.
     * @param existingFileHelper Forge
     *                           {@link net.minecraftforge.common.data.ExistingFileHelper
     *                           Existing File Helper}.
     * @param model              The block ID on Constants.
     * @param path               The path to the model.
     */
    protected RRMoCModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper, String model, String path)
    {
        super(generator, Constants.MOD_ID, existingFileHelper);

        this.model = model;

        this.path = path;
    }
}
