package net.doglover.dlrextradiscsforge.datagen;

import net.doglover.dlrextradiscsforge.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLANK_MUSIC_DISC.get())
                .pattern(" X ")
                .pattern("XOX")
                .pattern(" X ")
                .define('X', Items.LIGHT_GRAY_CONCRETE_POWDER)
                .define('O', Items.GRAY_CONCRETE_POWDER)
                .unlockedBy(getHasName(Items.LIGHT_GRAY_CONCRETE_POWDER), has(Items.LIGHT_GRAY_CONCRETE_POWDER))
                .unlockedBy(getHasName(Items.GRAY_CONCRETE_POWDER), has(Items.GRAY_CONCRETE_POWDER))
                .save(pWriter);
    }
}
