package mestretramador.rrmocreatures.data.client.provider.item;

import mestretramador.rrmocreatures.data.client.provider.RRMoCModelProvider;

import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * Mo'Creatures Redux&Redone Item Model Provider base.
 * 
 * @version 0.0.18
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCItemModelProvider extends RRMoCModelProvider
{
    /** The layer of the Item. */
    protected String layer;

    /** The constant location for the Items resources. */
    protected ResourceLocation LOCATION;

    /**
     * To create an Item Model, besides providing a DataGenerator and a
     * ExistingFileHelper, there is still need to pass the item model ID and its
     * path, also a layer. The Location is automatically loaded, but can be changed.
     * 
     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator
     *                           Data Generator}.
     * @param existingFileHelper Forge
     *                           {@link net.minecraftforge.common.data.ExistingFileHelper
     *                           Existing File Helper}.
     * @param model              The item model ID on Constants.
     * @param path               The path to the item model.
     * @param layer              An existing layer.
     */
    protected RRMoCItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper, String model, String path, String layer)
    {
        super(generator, existingFileHelper, model, path);

        this.layer = layer;

        LOCATION = mcLoc("item/generated");
    }
}
