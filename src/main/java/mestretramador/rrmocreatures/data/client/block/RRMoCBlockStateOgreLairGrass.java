package mestretramador.rrmocreatures.data.client.block;                                           
                                                                                                  
import mestretramador.rrmocreatures.block.RRMoCBlockOgreLairGrass;
import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockStateProvider;           
import mestretramador.rrmocreatures.init.RegisterBlock;
import mestretramador.rrmocreatures.util.Constants;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;                                         
                                                                                                  
/**                                                                                               
 * Mo'Creatures Redux&Redone Ogre Lair Grass block state.                                                
 *                                                                                                
 * @version 0.0.17                                                                             
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                               
 */                                                                                               
public class RRMoCBlockStateOgreLairGrass extends RRMoCBlockStateProvider
{                                                                                                 
    /**                                                                                           
     * Using the parent constructor, create the blockstate from Ogre Lair Grass.                           
     *                                                                                            
     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator                
     *                           Data Generator}.                                                 
     * @param existingFileHelper Forge                                                            
     *                           {@link net.minecraftforge.common.data.ExistingFileHelper         
     *                           Existing File Helper}.                                           
     */                                                                                           
    public RRMoCBlockStateOgreLairGrass(DataGenerator generator, ExistingFileHelper existingFileHelper) 
    {                                                                                             
        super(generator, existingFileHelper, RegisterBlock.OGRE_LAIR_GRASS);                                 
    }                                                                                             
                                                                                                  
    /**                                                                                           
     * Register the block states by the given registered block.                                   
     */                                                                                           
    @Override                                                                                     
    protected void registerStatesAndModels()                                                      
    {       
        final ConfiguredModel blockConfiguredModel = new ConfiguredModel(
            models().cubeBottomTop(
                modLoc(Constants.BLOCK_PATH + Constants.Blocks.OGRE_LAIR_GRASS).getPath(),
                modLoc(Constants.BLOCK_PATH + Constants.Blocks.OGRE_LAIR_GRASS_SIDE),
                modLoc(Constants.BLOCK_PATH + Constants.Blocks.OGRE_LAIR_DIRT),
                modLoc(Constants.BLOCK_PATH + Constants.Blocks.OGRE_LAIR_GRASS_TOP)
            )
        );
        
        getVariantBuilder(((RRMoCBlockOgreLairGrass) this.registeredBlock).returnAsBlock())
        .partialState()
        .setModels(blockConfiguredModel);
    }
}                                                                                                 
