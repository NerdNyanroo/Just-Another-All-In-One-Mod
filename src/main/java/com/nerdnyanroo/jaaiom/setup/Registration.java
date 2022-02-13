package com.nerdnyanroo.jaaiom.setup;

import com.nerdnyanroo.jaaiom.jaaiom;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.nerdnyanroo.jaaiom.jaaiom.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

    public static final RegistryObject<Block> NERDIUM_ORE_OVERWORLD = BLOCKS.register("nerdium_ore_overworld", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> NERDIUM_ORE_OVERWORLD_ITEM = fromBlock(NERDIUM_ORE_OVERWORLD);
    public static final RegistryObject<Block> NERDIUM_ORE_DEEPSLATE = BLOCKS.register("nerdium_ore_deepslate", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> NERDIUM_ORE_DEEPSLATE_ITEM = fromBlock(NERDIUM_ORE_DEEPSLATE);
    public static final RegistryObject<Item> RAW_NERDIUM_CHUNK = ITEMS.register("raw_nerdium_chunk", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> NERDIUM_INGOT = ITEMS.register("nerdium_ingot", () -> new Item(ITEM_PROPERTIES));

    public static final Tags.IOptionalNamedTag<Block> NERDIUM_ORE = BlockTags.createOptional(new ResourceLocation(jaaiom.MODID, "nerdium_ore"));
    public static final Tags.IOptionalNamedTag<Item> NERDIUM_ORE_ITEM = ItemTags.createOptional(new ResourceLocation(jaaiom.MODID, "nerdium_ore"));

    // Conveniance function: Take a RegistryObject<Block> and make a corresponding RegistryObject<Item> from it
    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}