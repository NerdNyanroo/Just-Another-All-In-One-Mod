package com.nerdnyanroo.jaaiom.datagen;

import com.nerdnyanroo.jaaiom.jaaiom;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = jaaiom.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new jRecipes(generator));
            generator.addProvider(new jLootTables(generator));
            jBlockTags blockTags = new jBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new jItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new jBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new jItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new jLanguageProvider(generator, "en_us"));
        }
    }
}