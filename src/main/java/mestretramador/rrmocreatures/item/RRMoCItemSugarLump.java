package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderSugarLump;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Sugar Lumps item.                                          
 *                                                                                   
 * @version 0.0.13                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemSugarLump extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Sugar Lumps.                            
    */                                                                               
   public RRMoCItemSugarLump()                                                         
   {                                                                                 
       super(Constants.Items.SUGAR_LUMP, new RRMoCItemProviderSugarLump());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Sugar Lumps item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Sugar Lumps is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderSugarLump) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
