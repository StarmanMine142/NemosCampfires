package com.nemonotfound.nemoscampfires.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.nemonotfound.nemoscampfires.entity.CustomCampfireBlockEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.CampfireBlock;

@Environment(value = EnvType.CLIENT)
public class CustomCampfireBlockEntityRenderer implements BlockEntityRenderer<CustomCampfireBlockEntity> {

    private final ItemRenderer itemRenderer;

    public CustomCampfireBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.itemRenderer = context.getItemRenderer();
    }

    public void render(CustomCampfireBlockEntity customCampfireBlockEntity, float f, PoseStack poseStack, MultiBufferSource multiBufferSource, int i, int j) {
        Direction direction = customCampfireBlockEntity.getBlockState().getValue(CampfireBlock.FACING);
        NonNullList<ItemStack> campfireItems = customCampfireBlockEntity.getItems();
        int blockPos = (int)customCampfireBlockEntity.getBlockPos().asLong();

        for (int l = 0; l < campfireItems.size(); l++) {
            ItemStack itemStack = campfireItems.get(l);

            if (itemStack != ItemStack.EMPTY) {
                renderItem(customCampfireBlockEntity, poseStack, multiBufferSource, i, j, l, direction, itemStack, blockPos);
            }
        }
    }

    private void renderItem(CustomCampfireBlockEntity customCampfireBlockEntity, PoseStack poseStack, MultiBufferSource multiBufferSource, int i, int j, int l, Direction direction, ItemStack itemStack, int blockPos) {
        poseStack.pushPose();
        poseStack.translate(0.5F, 0.44921875F, 0.5F);
        Direction direction2 = Direction.from2DDataValue((l + direction.get2DDataValue()) % 4);
        float g = -direction2.toYRot();
        poseStack.mulPose(Axis.YP.rotationDegrees(g));
        poseStack.mulPose(Axis.XP.rotationDegrees(90.0F));
        poseStack.translate(-0.3125F, -0.3125F, 0.0F);
        poseStack.scale(0.375F, 0.375F, 0.375F);
        this.itemRenderer.renderStatic(itemStack, ItemDisplayContext.FIXED, i, j, poseStack, multiBufferSource, customCampfireBlockEntity.getLevel(), blockPos + l);
        poseStack.popPose();
    }

}
