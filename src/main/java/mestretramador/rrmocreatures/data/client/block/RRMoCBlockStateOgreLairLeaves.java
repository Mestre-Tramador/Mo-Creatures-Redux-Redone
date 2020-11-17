package mestretramador.rrmocreatures.data.client.block;                                           
                                                                                                  
import mestretramador.rrmocreatures.block.RRMoCBlockOgreLairLeaves;                                      
import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockStateProvider;           
import mestretramador.rrmocreatures.init.RegisterBlock;                                           
                                                                                                  
import net.minecraft.data.DataGenerator;                                                          
                                                                                                  
import net.minecraftforge.common.data.ExistingFileHelper;                                         
                                                                                                  
/**                                                                                               
 * Mo'Creatures Redux&Redone Ogre Lair Leaves block state.                                                
 *                                                                                                
 * @version 0.0.22                                                                             
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                               
 */                                                                                               
public class RRMoCBlockStateOgreLairLeaves extends RRMoCBlockStateProvider                               
{                                                                                                 
    /**                                                                                           
     * Using the parent constructor, create the blockstate from Ogre Lair Leaves.                           
     *                                                                                            
     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator                
     *                           Data Generator}.                                                 
     * @param existingFileHelper Forge                                                            
     *                           {@link net.minecraftforge.common.data.ExistingFileHelper         
     *                           Existing File Helper}.                                           
     */                                                                                           
    public RRMoCBlockStateOgreLairLeaves(DataGenerator generator, ExistingFileHelper existingFileHelper) 
    {                                                                                             
        super(generator, existingFileHelper, RegisterBlock.OGRE_LAIR_LEAVES);                                 
    }                                                                                             
                                                                                                  
    /**                                                                                           
     * Register the block states by the given registered block.                                   
     */                                                                                           
    @Override                                                                                     
    protected void registerStatesAndModels()                                                      
    {                                                                                                      
        simpleBlock(((RRMoCBlockOgreLairLeaves) this.registeredBlock).returnAsBlock());
    }                                                                                             
}                                                                                                 
