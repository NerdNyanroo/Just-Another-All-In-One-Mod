package com.nerdnyanroo.jaaiom.datagen;


import com.nerdnyanroo.jaaiom.jaaiom;
import com.nerdnyanroo.jaaiom.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class jBlockTags extends BlockTagsProvider {

    public jBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, jaaiom.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.NERDIUM_ORE_OVERWORLD.get())
                .add(Registration.NERDIUM_ORE_DEEPSLATE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.NERDIUM_ORE_OVERWORLD.get())
                .add(Registration.NERDIUM_ORE_DEEPSLATE.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.NERDIUM_ORE_OVERWORLD.get())
                .add(Registration.NERDIUM_ORE_DEEPSLATE.get());

        tag(Registration.NERDIUM_ORE)
                .add(Registration.NERDIUM_ORE_OVERWORLD.get())
                .add(Registration.NERDIUM_ORE_DEEPSLATE.get());

    }
    @Override
    public String getName() {
        return "jaaiom Tags";
    }
}

