package com.nerdnyanroo.jaaiom.datagen;

import com.nerdnyanroo.jaaiom.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class jRecipes extends RecipeProvider {

    public jRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.NERDIUM_ORE_ITEM),
                        Registration.NERDIUM_INGOT.get(), 1.0f, 200)
                .unlockedBy("has_ore", has(Registration.NERDIUM_ORE_ITEM))
                .save(consumer, "nerdium_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_NERDIUM_CHUNK.get()),
                        Registration.NERDIUM_INGOT.get(), 0.7f, 200)
                .unlockedBy("has_chunk", has(Registration.RAW_NERDIUM_CHUNK.get()))
                .save(consumer, "nerdium_ingot2");
    }
}