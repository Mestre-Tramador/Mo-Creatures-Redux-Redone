package io.github.mestretramador.mocreaturesrr.data.client.item;

import io.github.mestretramador.mocreaturesrr.MoCreaturesReduxRedone;
import io.github.mestretramador.mocreaturesrr.init.MoCRRItems;
import io.github.mestretramador.mocreaturesrr.util.Layer;
import io.github.mestretramador.mocreaturesrr.util.Path;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;

import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile.ExistingModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * The Provider to generate the data of the Mo'Creatures Redux&Redone
 * Item Models, following the existing JSON pattern.
 *
 * @since 0.0.0.1
 * @author Mestre Tramador
 */
public final class MoCRRItemModelProvider extends ItemModelProvider
{
    /** The {@code item} folder. */
    private final Path ITEM_PATH = Path.ITEM;

    /** The Existing Model File for Item Models. */
    private final ExistingModelFile generatedFile = getExistingFile(mcLoc(ITEM_PATH.generated()));

    /** The Existing Template File for Spawn Egg Item Templates.  */
    private final ExistingModelFile templateFile = getExistingFile(mcLoc(ITEM_PATH.spawnEgg()));

    /**
     * The instantiation follows of the {@link ItemModelProvider parent}
     * class, but the ID is already passed.
     *
     * @param generator          The JSON creator for the Item Models.
     * @param existingFileHelper Allow the maintaining of the Item Model
     *                           JSON pattern.
     */
    public MoCRRItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, MoCreaturesReduxRedone.ID, existingFileHelper);
    }

    /**
     * The Item Models of {@link MoCRRItems#allItems() all} instances
     * are registered following intern routines.
     */
    @Override
    protected void registerModels()
    {
        MoCRRItems.allItems().forEach(this::registerItemModel);
        MoCRRItems.allSpawnEggsItems().forEach(this::registerSpawnEggTemplate);
    }

    /**
     * All Item Models have a {@link Layer#ZERO layer0}
     * texture following its name.
     *
     * @param item The Item which the Model
     *             is currently builded.
     */
    private void registerItemModel(Item item)
    {
        String itemName = item.toString();

        ItemModelBuilder builder = getBuilder(itemName);

        builder.parent(this.generatedFile).texture(
            Layer.ZERO.toString(),
            ITEM_PATH.toString().concat(itemName)
        );
    }

    /**
     * All Spawn Egg Item Templates have a
     * {@link MoCRRItemModelProvider#templateFile template}
     * to follow.
     *
     * @param spawnEgg The Item which the Template is
     *                 currently builded.
     */
    private void registerSpawnEggTemplate(Item spawnEgg)
    {
        getBuilder(spawnEgg.toString()).parent(this.templateFile);
    }
}