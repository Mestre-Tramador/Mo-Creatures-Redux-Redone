package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderTurtleRaw;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Raw Turtle item.                                          
 *                                                                                   
 * @version 0.0.19                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemTurtleRaw extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Raw Turtle.                            
    */                                                                               
   public RRMoCItemTurtleRaw()                                                         
   {                                                                                 
       super(Constants.Items.TURTLE_RAW, new RRMoCItemProviderTurtleRaw());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Raw Turtle item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Raw Turtle is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderTurtleRaw) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
