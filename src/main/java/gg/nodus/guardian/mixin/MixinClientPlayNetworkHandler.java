package gg.nodus.guardian.mixin;

import net.minecraft.client.network.ClientPlayNetworkHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ClientPlayNetworkHandler.class)
public class MixinClientPlayNetworkHandler {

    /**
     * LMFAO
     */
    @ModifyVariable(method = "acknowledge", at = @At("HEAD"), argsOnly = true, index = 2)
    public boolean acknowledge(boolean value) {
        return false;
    }

}
