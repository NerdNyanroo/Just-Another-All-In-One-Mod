package com.nerdnyanroo.jaaiom.datagen;

import com.nerdnyanroo.jaaiom.setup.Registration;
import com.nerdnyanroo.jaaiom.jaaiom;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class jItemTags extends ItemTagsProvider {

    public jItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, jaaiom.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.NERDIUM_ORE_OVERWORLD_ITEM.get())
                .add(Registration.NERDIUM_ORE_DEEPSLATE_ITEM.get());

        tag(Tags.Items.INGOTS)
                .add(Registration.NERDIUM_INGOT.get());

        tag(Registration.NERDIUM_ORE_ITEM)
                .add(Registration.NERDIUM_ORE_OVERWORLD_ITEM.get())
                .add(Registration.NERDIUM_ORE_DEEPSLATE_ITEM.get());

    }

    @Override
    public String getName() {
        return "jaaiom Tags";
    }
}