package mestretramador.rrmocreatures.data.client.block;

import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockModelProvider;
import mestretramador.rrmocreatures.util.Constants;
import mestretramador.rrmocreatures.util.Constants.Blocks;
import net.minecraft.data.DataGenerator;

import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * Mo'Creatures Redux&Redone Wyvern Lair Stone block model.
 * 
 * @version 0.0.29
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCBlockModelWyvernLairStone extends RRMoCBlockModelProvider
{
    /**
     * Using the parent constructor, create a Wyvern Lair Stone.
     * 
     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator
     *                           Data Generator}.
     * @param existingFileHelper Forge
     *                           {@link net.minecraftforge.common.data.ExistingFileHelper
     *                           Existing File Helper}.
     */
    public RRMoCBlockModelWyvernLairStone(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, existingFileHelper, Blocks.WYVERN_LAIR_STONE, Constants.BLOCK_PATH);
    }

    /**
     * Register the Model with the defined constants.
     */
    @Override
    protected void registerModels()
    {
        withExistingParent(this.model, modLoc(this.path + this.model));
    }
}
