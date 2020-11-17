package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderCreaturePedia;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Creaturepedia item.                                          
 *                                                                                   
 * @version 0.0.22                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemCreaturePedia extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Creaturepedia.                            
    */                                                                               
   public RRMoCItemCreaturePedia()                                                         
   {                                                                                 
       super(Constants.Items.CREATURE_PEDIA, new RRMoCItemProviderCreaturePedia());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Creaturepedia item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Creaturepedia is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderCreaturePedia) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
