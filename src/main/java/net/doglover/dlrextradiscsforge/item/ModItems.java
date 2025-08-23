package net.doglover.dlrextradiscsforge.item;

import net.doglover.dlrextradiscsforge.DlrExtraDiscsForge;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DlrExtraDiscsForge.MOD_ID);

    public static final RegistryObject<Item> BLANK_MUSIC_DISC = ITEMS.register("blank_music_disc",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}