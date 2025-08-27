package net.doglover.dlrlaterdiscsforge.datagen;

import net.doglover.dlrlaterdiscsforge.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        // Blank Music Disc recipe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLANK_MUSIC_DISC.get())
                .pattern(" X ")
                .pattern("XOX")
                .pattern(" X ")
                .define('X', Items.GRAY_CONCRETE_POWDER)
                .define('O', Items.LIGHT_GRAY_CONCRETE_POWDER)
                .unlockedBy(getHasName(Items.LIGHT_GRAY_CONCRETE_POWDER), has(Items.LIGHT_GRAY_CONCRETE_POWDER))
                .unlockedBy(getHasName(Items.GRAY_CONCRETE_POWDER), has(Items.GRAY_CONCRETE_POWDER))
                .save(pWriter);

        // All vanilla music disc recipes
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                Items.MUSIC_DISC_13, 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                Items.MUSIC_DISC_CAT, 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                Items.MUSIC_DISC_BLOCKS, 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                Items.MUSIC_DISC_CHIRP, 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                Items.MUSIC_DISC_FAR, 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                Items.MUSIC_DISC_MALL, 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                Items.MUSIC_DISC_MELLOHI, 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                Items.MUSIC_DISC_STAL, 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                Items.MUSIC_DISC_STRAD, 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                Items.MUSIC_DISC_WARD, 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                Items.MUSIC_DISC_11, 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                Items.MUSIC_DISC_WAIT, 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                Items.MUSIC_DISC_OTHERSIDE, 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                Items.MUSIC_DISC_5, 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                Items.MUSIC_DISC_PIGSTEP, 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                Items.MUSIC_DISC_RELIC, 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);

        // All LaterDiscs music disc recipes
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                ModItems.MUSIC_DISC_CREATOR.get(), 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                ModItems.MUSIC_DISC_CREATOR_MUSIC_BOX.get(), 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                ModItems.MUSIC_DISC_PRECIPICE.get(), 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                ModItems.MUSIC_DISC_TEARS.get(), 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.BLANK_MUSIC_DISC.get()), RecipeCategory.MISC,
                ModItems.MUSIC_DISC_LAVA_CHICKEN.get(), 1)
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);

        // The All-Disc recipe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_ALL_DISC.get())
                .pattern("ABA")
                .pattern("CXD")
                .pattern("AEA")
                .define('A', Items.GRAY_CONCRETE_POWDER)
                .define('B', ModItems.MUSIC_DISC_CREATOR.get())
                .define('C', Items.MUSIC_DISC_CAT)
                .define('D', Items.MUSIC_DISC_BLOCKS)
                .define('E', ModItems.MUSIC_DISC_TEARS.get())
                .define('X', ModItems.BLANK_MUSIC_DISC.get())
                .unlockedBy(getHasName(ModItems.BLANK_MUSIC_DISC.get()), has(ModItems.BLANK_MUSIC_DISC.get()))
                .save(pWriter);
    }
}
