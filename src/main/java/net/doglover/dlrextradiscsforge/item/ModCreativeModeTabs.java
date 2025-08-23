package net.doglover.dlrextradiscsforge.item;

import net.doglover.dlrextradiscsforge.DlrExtraDiscsForge;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
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
                        pOutput.accept(ModItems.BLANK_MUSIC_DISC.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
