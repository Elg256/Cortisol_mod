package net.tech.cortisolmod.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.client.event.ScreenEvent;

public class CortisolOverlayLayer<T extends LivingEntity,M extends EntityModel<T>> extends RenderLayer<T,M> {
    public CortisolOverlayLayer(RenderLayerParent<T, M> pRenderer) {
        super(pRenderer);
    }
    private static final ResourceLocation OVERLAY = new ResourceLocation("cortisolmod:textures/entity/cortisol_overlay.png");

    @Override
    public void render(PoseStack pPoseStack, MultiBufferSource buffer, int pPackedLight, T entity, float pLimbSwing, float pLimbSwingAmount, float pPartialTick, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {

        if (!entity.getPersistentData().getBoolean("cortisol_mob")) return;

        //VertexConsumer consumer = buffer.getBuffer(RenderType.entityTranslucent(OVERLAY));

//        this.getParentModel().renderToBuffer(
//                pPoseStack,
//                consumer,
//                pPackedLight,
//                OverlayTexture.NO_OVERLAY,
//                1f, 0.2f, 0.2f, 0.6f // rouge transparent
//        );
    }
}
