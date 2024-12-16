package millenniumambiguity.nomoresingleplayerlatency;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingKnockBackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static millenniumambiguity.nomoresingleplayerlatency.Knockback.livingKnockback;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class KnockbackEvent {

    @SubscribeEvent
    public static void onLivingKnockback(LivingKnockBackEvent event) {

        // Call common code.
        livingKnockback(event.getEntity(), event.getStrength(), event.getRatioX(), event.getRatioZ());

        // Skip default knockback.
        event.setCanceled(true);
    }
}
