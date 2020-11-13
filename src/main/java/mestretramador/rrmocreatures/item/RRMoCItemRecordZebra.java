package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.init.RegisterSoundEvent;
import mestretramador.rrmocreatures.model.item.RRMoCMusicDiscItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderRecordZebra;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Music Disc - Zebra item.                                          
 *                                                                                   
 * @version 0.0.18                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemRecordZebra extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Music Disc - Zebra.                            
    */                                                                               
   public RRMoCItemRecordZebra()                                                         
   {                                                                                 
       super(Constants.Items.RECORD_ZEBRA, new RRMoCItemProviderRecordZebra());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Music Disc - Zebra item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Music Disc - Zebra is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCMusicDiscItemModel(0, () -> RegisterSoundEvent.ZEBRA.returnAsSoundEvent(), ((RRMoCItemProviderRecordZebra) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
