package net.doglover.dlrlaterdiscsforge.item;

import net.doglover.dlrlaterdiscsforge.DlrLaterDiscsForge;
import net.doglover.dlrlaterdiscsforge.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DlrLaterDiscsForge.MOD_ID);

    public static final RegistryObject<Item> BLANK_MUSIC_DISC = ITEMS.register("blank_music_disc",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MUSIC_DISC_CREATOR = ITEMS.register("music_disc_creator",
            () -> new RecordItem(12, ModSounds.MUSIC_DISC_CREATOR, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3520));
    public static final RegistryObject<Item> MUSIC_DISC_CREATOR_MUSIC_BOX = ITEMS.register("music_disc_creator_music_box",
            () -> new RecordItem(11, ModSounds.MUSIC_DISC_CREATOR_MUSIC_BOX, new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 1460));
    public static final RegistryObject<Item> MUSIC_DISC_PRECIPICE = ITEMS.register("music_disc_precipice",
            () -> new RecordItem(13, ModSounds.MUSIC_DISC_PRECIPICE, new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 5980));
    public static final RegistryObject<Item> MUSIC_DISC_TEARS = ITEMS.register("music_disc_tears",
            () -> new RecordItem(10, ModSounds.MUSIC_DISC_TEARS, new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 3500));
    public static final RegistryObject<Item> MUSIC_DISC_LAVA_CHICKEN = ITEMS.register("music_disc_lava_chicken",
            () -> new RecordItem(9, ModSounds.MUSIC_DISC_LAVA_CHICKEN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2700));

    public static final RegistryObject<Item> MUSIC_DISC_ALL_DISC = ITEMS.register("music_disc_all_disc",
            () -> new RecordItem(15, ModSounds.MUSIC_DISC_ALL_DISC, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6900));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}