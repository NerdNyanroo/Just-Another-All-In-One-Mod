package com.nerdnyanroo.jaaiom.datagen;

import com.nerdnyanroo.jaaiom.setup.Registration;
import com.nerdnyanroo.jaaiom.jaaiom;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class jBlockStates extends BlockStateProvider {

    public jBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, jaaiom.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.NERDIUM_ORE_DEEPSLATE.get());
        simpleBlock(Registration.NERDIUM_ORE_OVERWORLD.get());
    }
}

