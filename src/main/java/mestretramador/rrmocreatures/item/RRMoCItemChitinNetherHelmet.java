package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderChitinNetherHelmet;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Nether Chitin Helmet item.                                          
 *                                                                                   
 * @version 0.0.22                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemChitinNetherHelmet extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Nether Chitin Helmet.                            
    */                                                                               
   public RRMoCItemChitinNetherHelmet()                                                         
   {                                                                                 
       super(Constants.Items.CHITIN_NETHER_HELMET, new RRMoCItemProviderChitinNetherHelmet());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Nether Chitin Helmet item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Nether Chitin Helmet is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderChitinNetherHelmet) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
