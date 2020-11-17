package mestretramador.rrmocreatures.data.client.block;                                           
                                                                                                  
import mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairDirt;                                      
import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockStateProvider;           
import mestretramador.rrmocreatures.init.RegisterBlock;                                           
                                                                                                  
import net.minecraft.data.DataGenerator;                                                          
                                                                                                  
import net.minecraftforge.common.data.ExistingFileHelper;                                         
                                                                                                  
/**                                                                                               
 * Mo'Creatures Redux&Redone Wyvern Lair Dirt block state.                                                
 *                                                                                                
 * @version 0.0.22                                                                             
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                               
 */                                                                                               
public class RRMoCBlockStateWyvernLairDirt extends RRMoCBlockStateProvider                               
{                                                                                                 
    /**                                                                                           
     * Using the parent constructor, create the blockstate from Wyvern Lair Dirt.                           
     *                                                                                            
     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator                
     *                           Data Generator}.                                                 
     * @param existingFileHelper Forge                                                            
     *                           {@link net.minecraftforge.common.data.ExistingFileHelper         
     *                           Existing File Helper}.                                           
     */                                                                                           
    public RRMoCBlockStateWyvernLairDirt(DataGenerator generator, ExistingFileHelper existingFileHelper) 
    {                                                                                             
        super(generator, existingFileHelper, RegisterBlock.WYVERN_LAIR_DIRT);                                 
    }                                                                                             
                                                                                                  
    /**                                                                                           
     * Register the block states by the given registered block.                                   
     */                                                                                           
    @Override                                                                                     
    protected void registerStatesAndModels()                                                      
    {                                                                                             
        simpleBlock(((RRMoCBlockWyvernLairDirt) this.registeredBlock).returnAsBlock());       
    }                                                                                             
}                                                                                                 
