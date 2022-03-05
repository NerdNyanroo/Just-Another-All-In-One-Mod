package com.nerdnyanroo.jaaiom.datagen;

import com.nerdnyanroo.jaaiom.setup.Registration;
import net.minecraft.data.DataGenerator;

public class jLootTables extends BaseLootTableProvider {

    public jLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        lootTables.put(Registration.NERDIUM_ORE_OVERWORLD.get(), createSilkTouchTable("nerdium_ore_overworld", Registration.NERDIUM_ORE_OVERWORLD.get(), Registration.RAW_NERDIUM_CHUNK.get(), 1, 3));
        lootTables.put(Registration.NERDIUM_ORE_DEEPSLATE.get(), createSilkTouchTable("nerdium_ore_deepslate", Registration.NERDIUM_ORE_DEEPSLATE.get(), Registration.RAW_NERDIUM_CHUNK.get(), 1, 3));
    }
}
