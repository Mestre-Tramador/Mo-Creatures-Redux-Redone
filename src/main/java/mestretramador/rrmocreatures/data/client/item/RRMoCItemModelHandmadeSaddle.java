package mestretramador.rrmocreatures.data.client.item;

import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemModelProvider;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.data.DataGenerator;

import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * Mo'Creatures Redux&Redone Handmade Saddle item model.
 * 
 * @version 0.0.19
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemModelHandmadeSaddle extends RRMoCItemModelProvider
{

    /**
     * Using the parent constructor, create an Handmade Saddle.
     * 
     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator
     *                           Data Generator}.
     * @param existingFileHelper Forge
     *                           {@link net.minecraftforge.common.data.ExistingFileHelper
     *                           Existing File Helper}.
     */
    public RRMoCItemModelHandmadeSaddle(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, existingFileHelper, Constants.Items.HANDMADE_SADDLE, Constants.ITEM_PATH, "layer0");
    }

    /**
     * Register the model with the defined constants.
     */
    @Override
    protected void registerModels()
    {
        final ModelFile itemModelFileGenerated = getExistingFile(LOCATION);

        buildModelRegistered(itemModelFileGenerated);
    }

    /**
     * Helper function to build based on a generated file.
     * 
     * @param itemModelFile The Item Model File.
     * @return The builder with the texture provided by the constants.
     */
    private ItemModelBuilder buildModelRegistered(ModelFile itemModelFile)
    {
        return getBuilder(this.model).parent(itemModelFile).texture(this.layer, this.path + this.model);
    }
}
