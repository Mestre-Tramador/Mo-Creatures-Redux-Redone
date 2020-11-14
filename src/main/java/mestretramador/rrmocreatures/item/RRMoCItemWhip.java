package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemWhipModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderWhip;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Whip item.                                          
 *                                                                                   
 * @version 0.0.20                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemWhip extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Whip.                            
    */                                                                               
   public RRMoCItemWhip()                                                         
   {                                                                                 
       super(Constants.Items.WHIP, new RRMoCItemProviderWhip());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Whip item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Whip is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemWhipModel(((RRMoCItemProviderWhip) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
