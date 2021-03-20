package mestretramador.rrmocreatures.data.client.block;                                           
                                                                                                  
import mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairPlanks;                                      
import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockStateProvider;           
import mestretramador.rrmocreatures.init.RegisterBlock;                                           
                                                                                                  
import net.minecraft.data.DataGenerator;                                                          
                                                                                                  
import net.minecraftforge.common.data.ExistingFileHelper;                                         
                                                                                                  
/**                                                                                               
 * Mo'Creatures Redux&Redone Wyvern Lair Planks block state.                                                
 *                                                                                                
 * @version 0.028                                                                             
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                               
 */                                                                                               
public class RRMoCBlockStateWyvernLairPlanks extends RRMoCBlockStateProvider                               
{                                                                                                 
    /**                                                                                           
     * Using the parent constructor, create the blockstate from Wyvern Lair Planks.                           
     *                                                                                            
     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator                
     *                           Data Generator}.                                                 
     * @param existingFileHelper Forge                                                            
     *                           {@link net.minecraftforge.common.data.ExistingFileHelper         
     *                           Existing File Helper}.                                           
     */                                                                                           
    public RRMoCBlockStateWyvernLairPlanks(DataGenerator generator, ExistingFileHelper existingFileHelper) 
    {                                                                                             
        super(generator, existingFileHelper, RegisterBlock.WYVERN_LAIR_PLANKS);                                 
    }                                                                                             
                                                                                                  
    /**                                                                                           
     * Register the block states by the given registered block.                                   
     */                                                                                           
    @Override                                                                                     
    protected void registerStatesAndModels()                                                      
    {                                                                                             
        simpleBlock(((RRMoCBlockWyvernLairPlanks) this.registeredBlock).returnAsBlock());         
    }                                                                                             
}                                                                                                 
