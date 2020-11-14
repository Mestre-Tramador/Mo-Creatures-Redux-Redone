package mestretramador.rrmocreatures.data.client.item;                                                   
                                                                                                         
import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemModelProvider;                    
import mestretramador.rrmocreatures.util.Constants;                                                      
                                                                                                         
import net.minecraft.data.DataGenerator;                                                                 
                                                                                                         
import net.minecraftforge.client.model.generators.ItemModelBuilder;                                      
import net.minecraftforge.client.model.generators.ModelFile;                                             
import net.minecraftforge.common.data.ExistingFileHelper;                                                
                                                                                                         
/**                                                                                                      
 * Mo'Creatures Redux&Redone Cooked Turtle item model.                                                        
 *                                                                                                       
 * @version 0.0.20                                                                                    
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                                      
 */                                                                                                      
public class RRMoCItemModelTurtleCooked extends RRMoCItemModelProvider                                        
{                                                                                                        
    /**                                                                                                  
     * Using the parent constructor, create a Cooked Turtle.                                                    
     *                                                                                                   
     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator                       
     *                           Data Generator}.                                                        
     * @param existingFileHelper Forge                                                                   
     *                           {@link net.minecraftforge.common.data.ExistingFileHelper                
     *                           Existing File Helper}.                                                  
     */                                                                                                  
    public RRMoCItemModelTurtleCooked(DataGenerator generator, ExistingFileHelper existingFileHelper)         
    {                                                                                                    
        super(generator, existingFileHelper, Constants.Items.TURTLE_COOKED, Constants.ITEM_PATH, "layer0");       
    }                                                                                                    
                                                                                                         
    /**                                                                                                  
     * Register the Model with the defined constants.                                                    
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
