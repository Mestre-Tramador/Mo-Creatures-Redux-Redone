package mestretramador.rrmocreatures.data.client.block;                                           
                                                                                                  
import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockModelProvider;           
import mestretramador.rrmocreatures.util.Constants;                                               
                                                                                                  
import net.minecraft.data.DataGenerator;                                                          
                                                                                                  
import net.minecraftforge.common.data.ExistingFileHelper;                                         
                                                                                                  
/**                                                                                               
 * Mo'Creatures Redux&Redone Ogre Lair Dirt block model.                                                
 *                                                                                                
 * @version 0.0.23                                                                             
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                               
 */                                                                                               
public class RRMoCBlockModelOgreLairDirt extends RRMoCBlockModelProvider                               
{                                                                                                 
    /**                                                                                           
     * Using the parent constructor, create a Ogre Lair Dirt.                                             
     *                                                                                            
     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator                
     *                           Data Generator}.                                                 
     * @param existingFileHelper Forge                                                            
     *                           {@link net.minecraftforge.common.data.ExistingFileHelper         
     *                           Existing File Helper}.                                           
     */                                                                                           
    public RRMoCBlockModelOgreLairDirt(DataGenerator generator, ExistingFileHelper existingFileHelper) 
    {                                                                                             
        super(generator, existingFileHelper, Constants.Blocks.OGRE_LAIR_DIRT, Constants.BLOCK_PATH);        
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
