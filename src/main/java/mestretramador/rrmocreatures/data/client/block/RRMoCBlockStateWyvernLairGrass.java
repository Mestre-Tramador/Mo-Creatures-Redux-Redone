package mestretramador.rrmocreatures.data.client.block;

import mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairGrass;
import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockStateProvider;
import mestretramador.rrmocreatures.init.RegisterBlock;
import mestretramador.rrmocreatures.util.Constants;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
                                                                                                  
/**                                                                                               
 * Mo'Creatures Redux&Redone Wyvern Lair Grass block state.                                                
 *                                                                                                
 * @version 0.0.29                                                                             
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                               
 */                                                                                               
public class RRMoCBlockStateWyvernLairGrass extends RRMoCBlockStateProvider                               
{                                                                                                 
    /**                                                                                           
     * Using the parent constructor, create the blockstate from Wyvern Lair Grass.                           
     *                                                                                            
     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator                
     *                           Data Generator}.                                                 
     * @param existingFileHelper Forge                                                            
     *                           {@link net.minecraftforge.common.data.ExistingFileHelper         
     *                           Existing File Helper}.                                           
     */                                                                                           
    public RRMoCBlockStateWyvernLairGrass(DataGenerator generator, ExistingFileHelper existingFileHelper) 
    {                                                                                             
        super(generator, existingFileHelper, RegisterBlock.WYVERN_LAIR_GRASS);                                 
    }                                                                                             
                                                                                                  
    /**                                                                                           
     * Register the block states by the given registered block.                                   
     */                                                                                           
    @Override                                                                                     
    protected void registerStatesAndModels()                                                      
    {    
        final ConfiguredModel blockConfiguredModel = new ConfiguredModel(
            models().cubeBottomTop(
                modLoc(Constants.BLOCK_PATH + Constants.Blocks.WYVERN_LAIR_GRASS).getPath(),
                modLoc(Constants.BLOCK_PATH + Constants.Blocks.WYVERN_LAIR_GRASS_SIDE),
                modLoc(Constants.BLOCK_PATH + Constants.Blocks.WYVERN_LAIR_DIRT),
                modLoc(Constants.BLOCK_PATH + Constants.Blocks.WYVERN_LAIR_GRASS_TOP)
            )
        );
        
        getVariantBuilder(((RRMoCBlockWyvernLairGrass) this.registeredBlock).returnAsBlock())
        .partialState()
        .setModels(blockConfiguredModel);     
    } 
}                                                                                                 
