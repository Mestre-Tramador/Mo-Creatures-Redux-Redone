package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderChitinFrostHelmet;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Frost Chitin Helmet item.                                          
 *                                                                                   
 * @version 0.0.20                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemChitinFrostHelmet extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Frost Chitin Helmet.                            
    */                                                                               
   public RRMoCItemChitinFrostHelmet()                                                         
   {                                                                                 
       super(Constants.Items.CHITIN_FROST_HELMET, new RRMoCItemProviderChitinFrostHelmet());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Frost Chitin Helmet item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Frost Chitin Helmet is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderChitinFrostHelmet) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
