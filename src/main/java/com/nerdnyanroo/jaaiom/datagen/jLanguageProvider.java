package com.nerdnyanroo.jaaiom.datagen;


import com.nerdnyanroo.jaaiom.setup.Registration;
import com.nerdnyanroo.jaaiom.jaaiom;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.nerdnyanroo.jaaiom.setup.ModSetup.TAB_NAME;

public class jLanguageProvider extends LanguageProvider {

    public jLanguageProvider(DataGenerator gen, String locale) {
        super(gen, jaaiom.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Just Another All In One Mod");
        add(Registration.NERDIUM_ORE_OVERWORLD.get(), "Nerdium ore");
        add(Registration.NERDIUM_ORE_DEEPSLATE.get(), "Deepslate Nerdium ore");
        add(Registration.NERDIUM_INGOT.get(), "Nerdium Ingot");
        add(Registration.RAW_NERDIUM_CHUNK.get(), "Raw Nerdium Chunk");
    }
}