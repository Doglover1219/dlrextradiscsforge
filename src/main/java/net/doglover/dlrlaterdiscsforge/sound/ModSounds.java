package net.doglover.dlrlaterdiscsforge.sound;

import net.doglover.dlrlaterdiscsforge.DlrLaterDiscsForge;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DlrLaterDiscsForge.MOD_ID);

    public static final RegistryObject<SoundEvent> MUSIC_DISC_CREATOR = registerSoundEvents("music_disc_creator");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CREATOR_MUSIC_BOX = registerSoundEvents("music_disc_creator_music_box");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_PRECIPICE = registerSoundEvents("music_disc_precipice");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_TEARS = registerSoundEvents("music_disc_tears");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_LAVA_CHICKEN = registerSoundEvents("music_disc_lava_chicken");

    public static final RegistryObject<SoundEvent> MUSIC_DISC_ALL_DISC = registerSoundEvents("music_disc_all_disc");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(
                new ResourceLocation(DlrLaterDiscsForge.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
