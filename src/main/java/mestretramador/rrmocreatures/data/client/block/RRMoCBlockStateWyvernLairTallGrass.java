package mestretramador.rrmocreatures.data.client.block;

import mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairTallGrass;
import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockStateProvider;
import mestretramador.rrmocreatures.init.RegisterBlock;
import mestretramador.rrmocreatures.util.Constants;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
                                                                                                  
/**                                                                                               
 * Mo'Creatures Redux&Redone Wyvern Lair Tall Grass block state.                                                
 *                                                                                                
 * @version 0.0.14                                                                             
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                               
 */                                                                                               
public class RRMoCBlockStateWyvernLairTallGrass extends RRMoCBlockStateProvider                               
{                                                                                                 
    /**                                                                                           
     * Using the parent constructor, create the blockstate from Wyvern Lair Tall Grass.                           
     *                                                                                            
     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator                
     *                           Data Generator}.                                                 
     * @param existingFileHelper Forge                                                            
     *                           {@link net.minecraftforge.common.data.ExistingFileHelper         
     *                           Existing File Helper}.                                           
     */                                                                                           
    public RRMoCBlockStateWyvernLairTallGrass(DataGenerator generator, ExistingFileHelper existingFileHelper) 
    {                                                                                             
        super(generator, existingFileHelper, RegisterBlock.WYVERN_LAIR_TALL_GRASS);                                 
    }                                                                                             
                                                                                                  
    /**                                                                                           
     * Register the block states by the given registered block.                                   
     */                                                                                           
    @Override                                                                                     
    protected void registerStatesAndModels()                                                      
    {      
        final ConfiguredModel blockConfiguredModel = new ConfiguredModel(
            models().cross(
                modLoc(Constants.BLOCK_PATH + Constants.Blocks.WYVERN_LAIR_TALL_GRASS).getPath(),
                modLoc(Constants.BLOCK_PATH + Constants.Blocks.WYVERN_LAIR_TALL_GRASS)
            )
        );
        
        getVariantBuilder(((RRMoCBlockWyvernLairTallGrass) this.registeredBlock).returnAsBlock())
        .partialState()
        .setModels(blockConfiguredModel);        
    }     
}                                                                                                 
