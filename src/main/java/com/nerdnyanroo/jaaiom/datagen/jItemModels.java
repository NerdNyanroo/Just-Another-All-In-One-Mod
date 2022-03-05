package com.nerdnyanroo.jaaiom.datagen;

import com.nerdnyanroo.jaaiom.setup.Registration;
import com.nerdnyanroo.jaaiom.jaaiom;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class jItemModels extends ItemModelProvider {

    public jItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, jaaiom.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //ResourceLocation rl = new ResourceLocation(jaaiom.MODID, "name")
        withExistingParent(Registration.NERDIUM_ORE_OVERWORLD_ITEM.get().getRegistryName().getPath(), modLoc("block/nerdium_ore_overworld"));
        withExistingParent(Registration.NERDIUM_ORE_DEEPSLATE_ITEM.get().getRegistryName().getPath(), modLoc("block/nerdium_ore_deepslate"));

        singleTexture(Registration.RAW_NERDIUM_CHUNK.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/raw_nerdium_chunk"));
        singleTexture(Registration.NERDIUM_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nerdium_ingot"));

    }

}
