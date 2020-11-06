package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderFurLegs;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Fur Legs item.                                          
 *                                                                                   
 * @version 0.0.9                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemFurLegs extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Fur Legs.                            
    */                                                                               
   public RRMoCItemFurLegs()                                                         
   {                                                                                 
       super(Constants.Items.FUR_LEGS, new RRMoCItemProviderFurLegs());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Fur Legs item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Fur Legs is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderFurLegs) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
