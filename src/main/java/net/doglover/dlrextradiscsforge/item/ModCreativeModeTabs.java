package net.doglover.dlrextradiscsforge.item;

import net.doglover.dlrextradiscsforge.DlrExtraDiscsForge;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DlrExtraDiscsForge.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EXTRADISCS_TAB = CREATIVE_MODE_TABS.register("extradiscs_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLANK_MUSIC_DISC.get()))
                    .title(Component.translatable("creativetab.extradiscs_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Items.MUSIC_DISC_13);
                        pOutput.accept(Items.MUSIC_DISC_CAT);
                        pOutput.accept(Items.MUSIC_DISC_BLOCKS);
                        pOutput.accept(Items.MUSIC_DISC_CHIRP);
                        pOutput.accept(Items.MUSIC_DISC_FAR);
                        pOutput.accept(Items.MUSIC_DISC_MALL);
                        pOutput.accept(Items.MUSIC_DISC_MELLOHI);
                        pOutput.accept(Items.MUSIC_DISC_STAL);
                        pOutput.accept(Items.MUSIC_DISC_STRAD);
                        pOutput.accept(Items.MUSIC_DISC_WARD);
                        pOutput.accept(Items.MUSIC_DISC_11);
                        pOutput.accept(Items.MUSIC_DISC_WAIT);
                        pOutput.accept(Items.MUSIC_DISC_OTHERSIDE);
                        pOutput.accept(Items.MUSIC_DISC_5);
                        pOutput.accept(Items.MUSIC_DISC_PIGSTEP);
                        pOutput.accept(Items.MUSIC_DISC_RELIC);

                        pOutput.accept(ModItems.MUSIC_DISC_CREATOR.get());
                        pOutput.accept(ModItems.MUSIC_DISC_CREATOR_MUSIC_BOX.get());
                        pOutput.accept(ModItems.MUSIC_DISC_PRECIPICE.get());
                        pOutput.accept(ModItems.MUSIC_DISC_TEARS.get());
                        pOutput.accept(ModItems.MUSIC_DISC_LAVA_CHICKEN.get());

                        pOutput.accept(ModItems.BLANK_MUSIC_DISC.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
