package mestretramador.rrmocreatures.data.client.block;

import mestretramador.rrmocreatures.block.RRMoCBlockOgreLairTallGrass;
import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockStateProvider;
import mestretramador.rrmocreatures.init.RegisterBlock;
import mestretramador.rrmocreatures.util.Constants;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
                                                                                                  
/**                                                                                               
 * Mo'Creatures Redux&Redone Ogre Lair Tall Grass block state.                                                
 *                                                                                                
 * @version 0.0.23                                                                             
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                               
 */                                                                                               
public class RRMoCBlockStateOgreLairTallGrass extends RRMoCBlockStateProvider                               
{                                                                                                 
    /**                                                                                           
     * Using the parent constructor, create the blockstate from Ogre Lair Tall Grass.                           
     *                                                                                            
     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator                
     *                           Data Generator}.                                                 
     * @param existingFileHelper Forge                                                            
     *                           {@link net.minecraftforge.common.data.ExistingFileHelper         
     *                           Existing File Helper}.                                           
     */                                                                                           
    public RRMoCBlockStateOgreLairTallGrass(DataGenerator generator, ExistingFileHelper existingFileHelper) 
    {                                                                                             
        super(generator, existingFileHelper, RegisterBlock.OGRE_LAIR_TALL_GRASS);                                 
    }                                                                                             
                                                                                                  
    /**                                                                                           
     * Register the block states by the given registered block.                                   
     */                                                                                           
    @Override                                                                                     
    protected void registerStatesAndModels()                                                      
    {         
        final ConfiguredModel blockConfiguredModel = new ConfiguredModel(
            models().cross(
                modLoc(Constants.BLOCK_PATH + Constants.Blocks.OGRE_LAIR_TALL_GRASS).getPath(),
                modLoc(Constants.BLOCK_PATH + Constants.Blocks.OGRE_LAIR_TALL_GRASS)
            )
        );
        
        getVariantBuilder(((RRMoCBlockOgreLairTallGrass) this.registeredBlock).returnAsBlock())
        .partialState()
        .setModels(blockConfiguredModel);        
    }  
}                                                                                                 
